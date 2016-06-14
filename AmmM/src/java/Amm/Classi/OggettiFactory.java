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
     ArrayList<Oggetti_vendita> lista = new ArrayList <Oggetti_vendita>();
     public ArrayList<Oggetti_vendita> getCrea(int idOggetto) throws SQLException{

    try {
            String db = "jdbc:derby://localhost:1527/ammdb";
            Connection conn = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore"); 
            String query = "INSERT INTO oggetto (id_oggetto,nome, url, "
                + "prezzo, quantita, id_venditore, id_saldo)"+"VALUES(?,?,?,?,?,?)";
        
             PreparedStatement stmt = conn.prepareStatement(query);
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
                lista.add(oggetto);

            stmt.close();
            conn.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(OggettiFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    
        return lista;
        }
     public ArrayList<Oggetti_vendita> getrecuperaOggetto(String text)
    {
        ArrayList<Oggetti_vendita> lista_b = new ArrayList <Oggetti_vendita>();
        
        try
        {
            Connection conn_b = DriverManager.getConnection(connectionString, "Saradb", "HomeDecore" );
            String query = "select *" +
                           "from oggetto " + 
                           "where oggetto.nome LIKE ?";         
            PreparedStatement stmt = conn_b.prepareStatement(query);
            // Assegna dati
            text = "%"+text+"%";
            stmt.setString(1, text);
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Oggetti_vendita current = new Oggetti_vendita();
                current.setIdoggetto(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setPrezzo(res.getInt("prezzo"));
                current.setPrezzo(res.getInt("quantita"));
                current.setUrl (res.getString("url"));
                lista_b.add(current);
            }
            
            stmt.close();
            conn_b.close();
        }
        catch(SQLException e)
        {}
        
        return lista_b;
    }
    
    
 public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
    }
     

