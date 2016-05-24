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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sara
 */
public class Venditore_factory {
   String connectionString;
/*restituisce sempre lo stesso,
    basta fare la chiamata all'oggetto statico*/
    private static Venditore_factory singleton;

    public static Venditore_factory getInstance() {
        if (singleton == null) {
            singleton = new Venditore_factory();
        }
        return singleton;
    }
    
        
    public Venditore_factory (){
    } 
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public Utenti_venditori getVenditore (String username, String password)
    {
       
        try {
            String db = "jdbc:derby://localhost:1527/ammdb";
            //String dbpath = "jdbc:derby:" + this.getServletContext().getAttribute("db");
            Connection conn = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore");
            // Si mettono dei punti di domanda al posto dei valori
            String sql = "select * from venditore where "
                    + "username = ? and password = ? ";
            // Si crea un prepared statement
            PreparedStatement stmt = conn.prepareStatement(sql);
            // Si associano valori e posizioni di placeholder
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet set = stmt.executeQuery();

            if (set.next()) {
                Utenti_venditori venditore = new Utenti_venditori();
                venditore.username = set.getString("username");
                venditore.password = set.getString("password");

                stmt.close();
                conn.close();
                return venditore;
            }

        } catch (SQLException e) {

            Logger.getLogger(Cliente_factory.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }
   
    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

}

