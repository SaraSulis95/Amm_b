/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sara
 */
public class SaldoFactory {
    String connectionString;
    private static SaldoFactory singleton;

    public static SaldoFactory getInstance() {
        if (singleton == null) {
            singleton = new SaldoFactory();
        }
        return singleton;
    }
        
    public SaldoFactory (){   
    }
      
    
    public Saldo getSaldo (int idSaldo, int saldoTot)
    {

        try {
            String db = "jdbc:derby://localhost:1527/ammdb";
            //String dbpath = "jdbc:derby:" + this.getServletContext().getAttribute("db");
            Connection conn = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore");
            // Si mettono dei punti di domanda al posto dei valori
            String sql = "select * from saldo where "
                    + "id_saldo = ? saldoTot = ? ";
            // Si crea un prepared statement
            PreparedStatement stmt = conn.prepareStatement(sql);
            // Si associano valori e posizioni di placeholder
           
            stmt.setInt(1, idSaldo);
            stmt.setInt(2, saldoTot);
           
            ResultSet set = stmt.executeQuery();

            if (set.next()) {
                Saldo saldo = new Saldo();
                saldo.idSaldo = set.getInt(idSaldo);
                saldo.saldoTot = set.getInt(saldoTot);

                stmt.close();
                conn.close();
            }

        } catch (SQLException e) {

            Logger.getLogger(SaldoFactory.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
        
    
    //restituisce i saldi
    /*public ArrayList <Saldo> getSaldolist()
       {
                    return listaSaldi;
       }
       */
        //restituisce il saldo in base all'id
        /*public Saldo getSaldo(int idSaldo)
        {
            for(Saldo u : listaSaldi)
            {
                if(u.idSaldo == idSaldo)
                return u;
        }
        
        return null;
    }*/
    }

    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
   
}

