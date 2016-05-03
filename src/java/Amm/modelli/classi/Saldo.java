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
public class Saldo {
    public double saldoTot;
    public int idSaldo;
    
    public double getSaldoTot(){
        return saldoTot;
    }
    
    public void setSaldoTot(double saldoTot){
            this.saldoTot= saldoTot;
    }
    
    public int getIdSaldo(){
        return idSaldo;
    }
    
    public void setIdSaldo(int idSaldo){
        this.idSaldo=idSaldo;
    }
    
}
