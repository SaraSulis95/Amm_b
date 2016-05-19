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
public class Utenti_cliente {
    
//attributi
    public String username;
    public String password;
    public int id;
    public int idSaldo;
    
    //costruttore
    public Utenti_cliente(){
    }

    //metodi
    public int getId(){
        return id;
    }

    
    public void setId (int id){
        this.id = id;
    }

   
    public String getUsername() {
        return username;
    }

   
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getidSaldo() {
        return idSaldo;
    }

   
    public void idSalso(int idSaldo) {
        this.idSaldo = idSaldo;
    }
}



