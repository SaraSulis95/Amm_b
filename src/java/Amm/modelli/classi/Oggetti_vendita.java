/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.modelli.classi;

/**
 *
 * @author sara
 */
public class Oggetti_vendita {
    public String nome;
    public int idOggetto;
    public int url;
    public int quantita;
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
    
    public int getUrl(){
        return url;
    }
    
     public void setUrl(int url){
        this.url=url;
    }
    
    public int getQuantita(){
        return quantita;
    }
    
     public void setQuantita(int quantita){
        this.quantita=quantita;
    }
     
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}
