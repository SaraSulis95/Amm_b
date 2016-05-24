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
public class OggettiFactory {
    
    String connectionString;
    
    
 /*restituisce sempre lo stesso,
    basta fare la chiamata all'oggetto statico*/
    private static OggettiFactory singleton;

    public static OggettiFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettiFactory();
        }
        return singleton;
    }
    public OggettiFactory(){
    }
    private String nome;
    private int prezzo;
    private int quantita;
    private String url;
    private int id_saldo;
    private int id_venditore;
    private int id_oggetto;
    private String sql;
    
        
    public Oggetti_vendita getOggetto(String nome, int prezzo, int quantita, int url)
    {

        try {
            String db = "jdbc:derby://localhost:1527/ammdb";
            //String dbpath = "jdbc:derby:" + this.getServletContext().getAttribute("db");
            Connection conn = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore");
            // Si mettono dei punti di domanda al posto dei valori
            String sql2 = "select * from oggetto where "
                    + "nome = ? and prezzo = ? + quantita = ? + url = ?";
            // Si crea un prepared statement
            PreparedStatement stmt = conn.prepareStatement(sql2);
            // Si associano valori e posizioni di placeholder
            stmt.setString(1, nome);
            stmt.setInt(2, prezzo);
            stmt.setInt(3, quantita);
            stmt.setInt(4, url);

            ResultSet set = stmt.executeQuery();

            if (set.next()) {
                Oggetti_vendita oggetto = new Oggetti_vendita();
                oggetto.nome = set.getString("nome");
                oggetto.prezzo = set.getInt(prezzo);
                oggetto.quantita = set.getInt(quantita);
                oggetto.url = set.getString(url);

                stmt.close();
                conn.close();
                return oggetto;
            }

        } catch (SQLException e) {

            Logger.getLogger(OggettiFactory.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }
     public Oggetti_vendita getCrea(int idOggetto) throws SQLException{

    try {
            String db = "jdbc:derby://localhost:1527/ammdb";
            //String dbpath = "jdbc:derby:" + this.getServletContext().getAttribute("db");
            Connection conn = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore");
            Statement stmt = conn.createStatement();
            String sql1;
            sql1 = "INSERT INTO oggetto (id_oggetto,nome, url, "
                + "prezzo, quantita, id_venditore, id_saldo)"+"VALUES(?,?,?,?,?,?)";
        
             PreparedStatement stmt = conn.prepareStatement(sql1);
            // Si associano valori e posizioni di placeholder
            stmt.setInt(1, id_oggetto);
            stmt.setString(2, nome);
            stmt.setInt(3, prezzo);
            stmt.setInt(4, quantita);
            stmt.setString(5, url);
            stmt.setInt(6, id_venditore);
            stmt.setInt(7, id_saldo);
            
            ResultSet set = stmt.executeQuery();
            if (set.next()) {
                Oggetti_vendita oggetto = new Oggetti_vendita();
                oggetto.nome = set.getString("nome");
                oggetto.prezzo = set.getInt(prezzo);
                oggetto.quantita = set.getInt(quantita);
                oggetto.url = set.getString("url");

            stmt.close();
            conn.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(OggettiFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    
        return Oggetti_vendita;
        }
 public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
    }
     

