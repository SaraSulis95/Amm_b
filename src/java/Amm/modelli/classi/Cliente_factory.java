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
public class Cliente_factory {
    /*restituisce sempre lo stesso,
    basta fare la chiamata all'oggetto statico*/
    private static Cliente_factory singleton;

    public static Cliente_factory getInstance() {
        if (singleton == null) {
            singleton = new Cliente_factory();
        }
        return singleton;
    }
    
    private ArrayList<Utenti_cliente> listaClienti = new ArrayList<Utenti_cliente>();
        
    public Cliente_factory (){
      
    
        // Clienti      
        Utenti_cliente cliente_1 = new Utenti_cliente();
        cliente_1.setUsername("Adele65");
        cliente_1.setPassword("tfg");
        cliente_1.setId(0);
        listaClienti.add(cliente_1);
        Utenti_cliente cliente_2 = new Utenti_cliente();
        cliente_2.setUsername("Paolo84");
        cliente_2.setPassword("tfggt");
        cliente_2.setId(2);
        listaClienti.add(cliente_2);
        Utenti_cliente cliente_3 = new Utenti_cliente();
        cliente_3.setUsername("Claudio84");
        cliente_3.setPassword("tfgtkg");
        cliente_3.setId(3);
        listaClienti.add(cliente_3);
    }
        
        //metodo che restituisce la lista con i clienti
        
       public ArrayList <Utenti_cliente> getClientilist()
       {
                    return listaClienti;
       }
       
        //restituisce il cliente
        public Utenti_cliente getCliente(int id)
        {
            for(Utenti_cliente u : listaClienti)
            {
                if(u.id == id)
                return u;
        }
        
        return null;
    }
   
         
}

