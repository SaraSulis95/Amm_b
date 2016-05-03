/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.modelli.classi;

import java.util.ArrayList;

/**
 *
 * @author sara
 */
public class SaldoFactory {
    
     private static SaldoFactory singleton;

    public static SaldoFactory getInstance() {
        if (singleton == null) {
            singleton = new SaldoFactory();
        }
        return singleton;
    }

    
    private final ArrayList<Saldo> listaSaldi = new ArrayList<>();
        
    public SaldoFactory (){
      
    
        // tutti i conti del sistema  
        Saldo saldo_1 = new Saldo();
        saldo_1.setSaldoTot(255);
        saldo_1.setIdSaldo(0);
        listaSaldi.add(saldo_1);
        Saldo saldo_2 = new Saldo();
        saldo_2.setSaldoTot(200);
        saldo_2.setIdSaldo(2);
        listaSaldi.add(saldo_2);
        Saldo saldo_3 = new Saldo();
        saldo_3.setSaldoTot(100);
        saldo_3.setIdSaldo(3);
        listaSaldi.add(saldo_3);
        Saldo saldo_4 = new Saldo();
        saldo_4.setSaldoTot(1000);
        saldo_4.setIdSaldo(4);
        listaSaldi.add(saldo_4);
        Saldo saldo_5 = new Saldo();
        saldo_5.setSaldoTot(500.66);
        saldo_5.setIdSaldo(5);
        listaSaldi.add(saldo_5);
        Saldo saldo_6 = new Saldo();
        saldo_6.setSaldoTot(256);
        saldo_6.setIdSaldo(6);
        listaSaldi.add(saldo_6);
    }
    
    //restituisce i saldi
    public ArrayList <Saldo> getSaldolist()
       {
                    return listaSaldi;
       }
       
        //restituisce il saldo in base all'id
        public Saldo getSaldo(int idSaldo)
        {
            for(Saldo u : listaSaldi)
            {
                if(u.idSaldo == idSaldo)
                return u;
        }
        
        return null;
    }
   
}
