/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.modelli.classi;

import java.util.ArrayList;

/**
 *
 * @author Sara
 crea la lista degli utenti a tempo di esecuzione */
public class Venditore_factory {
    /*restituisce sempre lo stesso,
    basta fare la chiamata all'oggetto statico*/
    private static Venditore_factory singleton;

    public static Venditore_factory getInstance() {
        if (singleton == null) {
            singleton = new Venditore_factory();
        }
        return singleton;
    }
    
    private final ArrayList<Utenti_venditori> listaVenditori = new ArrayList<>();
        
    public Venditore_factory (){
      
    
        // Venditori      
        Utenti_venditori venditore_1 = new Utenti_venditori();
        venditore_1.setUsername("Sara52");
        venditore_1.setPassword("abcd");
        venditore_1.setId(4);
        listaVenditori.add(venditore_1);
        Utenti_venditori venditore_2 = new Utenti_venditori();
        venditore_2.setUsername("Alessandro86");
        venditore_2.setPassword("abcde");
        venditore_2.setId(5);
        listaVenditori.add(venditore_2);
        Utenti_venditori venditore_3 = new Utenti_venditori();
        venditore_3.setUsername("Vittoria1995");
        venditore_3.setPassword("abcdef");
        venditore_3.setId(6);
        listaVenditori.add(venditore_3);
    }
        
        //metodo che restituisce la lista
        
       public ArrayList <Utenti_venditori> getVenditorilist()
       {
                    return listaVenditori;
       }
          
        
        public Utenti_venditori getVenditore(int id)
        {
            for(Utenti_venditori u : listaVenditori)
            {
                if(u.id == id)
                return u;
        }
        
        return null;
    }
   
         
}
