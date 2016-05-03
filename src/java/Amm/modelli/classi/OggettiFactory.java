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
public class OggettiFactory {
    
    /*restituisce sempre lo stesso,
    basta fare la chiamata all'oggetto statico*/
    private static OggettiFactory singleton;

    public static OggettiFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettiFactory();
        }
        return singleton;
    }
    
    private final ArrayList<Oggetti_vendita> listaOggetti = new ArrayList<>();
        
    public OggettiFactory (){
      
    
        // tutti gli oggetti del sistema  
        Oggetti_vendita oggetto_1 = new Oggetti_vendita();
        oggetto_1.setNome("Cuscino");
        oggetto_1.setIdoggetto(25);
        oggetto_1.setUrl(5246);
        oggetto_1.setQuantita(2);
        oggetto_1.setCategoria("Soggiorno");
        listaOggetti.add(oggetto_1);
         Oggetti_vendita oggetto_2 = new Oggetti_vendita();
        oggetto_2.setNome("Scattola");
        oggetto_2.setIdoggetto(53);
        oggetto_2.setUrl(546);
        oggetto_2.setQuantita(2);
        oggetto_2.setCategoria("Cucina");
        listaOggetti.add(oggetto_2);
        Oggetti_vendita oggetto_3 = new Oggetti_vendita();
        oggetto_3.setNome("Lampada");
        oggetto_3.setIdoggetto(98);
        oggetto_3.setUrl(5846);
        oggetto_3.setQuantita(5);
        oggetto_1.setCategoria("Bagno");
        listaOggetti.add(oggetto_3);
        
    }
        
        //metodo che restituisce la lista con gli oggetti del sistema
        
       public ArrayList <Oggetti_vendita> getOggettilist()
       {
                    return listaOggetti;
       }
      
        //resituisce l'oggetto in base all'id 
        public Oggetti_vendita getOggetto(int idOggetto)
        {
            for(Oggetti_vendita u : listaOggetti)
            {
                if(u.idOggetto == idOggetto)
                return u;
        }
        
        return null;
    }
        
        //resituisce l'oggetto in base ala categoria
        public Oggetti_vendita getCategoria(String categoria)
        {
            for(Oggetti_vendita u : listaOggetti)
            {
                if(u.categoria.equals(categoria))
                return u;
        }
        
        return null;
    }
   
         
}

