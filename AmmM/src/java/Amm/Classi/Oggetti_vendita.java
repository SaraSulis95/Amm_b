/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.Classi;

/**
 *
 * @author sara
 */
public class Oggetti_vendita {

    static void add(Oggetti_vendita current) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 public String nome;
    public int idOggetto;
    public String url;
    public int quantita;
    public int prezzo;
    public String categoria;
    
    
    //costruttore
    public Oggetti_vendita(){
    }
    
    //metodi
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdoggetto(){
        return idOggetto;
    }
    
    public void setIdoggetto(int idOggetto){
        this.idOggetto=idOggetto;
    }
    
    public String getUrl(){
        return "url";
    }
    
     public void setUrl(String url){
        this.url= url;
    }
    
    public int getQuantita(){
        return quantita;
    }
    
     public void setQuantita(int quantita){
        this.quantita=quantita;
    }
     
    public int getPrezzo(){
        return prezzo;
    }
    
     public void setPrezzo(int prezzo){
        this.prezzo=prezzo;
    }
     
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}
