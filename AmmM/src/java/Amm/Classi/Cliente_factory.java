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
public class Cliente_factory {

    String connectionString;
    /*restituisce sempre lo stesso,
    basta fare la chiamata all'oggetto statico*/
    private static Cliente_factory singleton;

    public static Cliente_factory getInstance() {
        if (singleton == null) {
            singleton = new Cliente_factory();
        }
        return singleton;
    }

    public Cliente_factory() {
    }

    /*//metodo che restituisce la lista con i clienti
    public ArrayList<Utenti_cliente> getClientilist() {
        return listaClienti;
    }*/

    //restituisce il cliente
    public Utenti_cliente getCliente(String username, String password) {

        try {
            String db = "jdbc:derby://localhost:1527/ammdb";
            //String dbpath = "jdbc:derby:" + this.getServletContext().getAttribute("db");
            Connection conn = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore");
            // Si mettono dei punti di domanda al posto dei valori
            String sql = "select * from clienti where "
                    + "username = ? and password = ? ";
            // Si crea un prepared statement
            PreparedStatement stmt = conn.prepareStatement(sql);
// Si associano valori e posizioni di placeholder
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet set = stmt.executeQuery();

            if (set.next()) {
                Utenti_cliente cliente = new Utenti_cliente();
                cliente.username = set.getString("username");
                cliente.password = set.getString("password");

                stmt.close();
                conn.close();
                return cliente;
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
