package com.mycompany._ra6_pt11_3_matveinikitamartinezisel;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * Classe Empresa
 *
 * @author Nikita i Isel
 */
public class Empresa {

    /*Declaració d'atributs*/
    private Map<String, Treballador> treballadors;
    
    /**
     * Constructor de la classe
     */
    public Empresa() {
        this.treballadors = new HashMap<>();
    }
    
    /**
     * Mètode addTreballador per efegir un treballador amb la seva key(DNI) en el
     * HashMap de treballadors.
     * 
     * @param dni
     * @param treballador 
     */
    public void addTreballador(String dni, Treballador treballador){
        /*Comprovem que el DNI que introduïm no es troba en ús*/
        if (!treballadors.containsKey(dni)) {
            treballadors.put(dni, treballador);
            System.out.println("Treballador afegit correctament.");
        } 
        /*Si ho està, no l'afegim*/
        else {
            System.out.println("ERROR: No pots afegir aquest trebellador, el "
                    + "DNI ja es troba sota un altre treballador.");
        }
    }
    
    /**
     * Mètode edatMitjanaTreballadors per poder treure l'edat mitjana dels 
     * treballadors
     * 
     * @return l'edat mitjana dels treballadors
     */
    public double edatMitjanaTreballadors(){
        /*Comprovem que la llista no estigui buida*/
        if (treballadors.isEmpty()){ return 0; }
        
        /*Declaració de variables a utilitzar*/
        ArrayList<Treballador> llistaTreballadors = new ArrayList<>(treballadors.values());
        int sumaEdats = 0;

        /*Estructura FOR-EACH per passar per tots els treballadors i conseguir 
        la seva edat*/
        for (Treballador t : llistaTreballadors) {
            sumaEdats += t.getEdat();
        }
        
        /*Declarem una variable per calcular i guardar l'edat mitjana*/
        double mitjana = (double) sumaEdats / treballadors.size();
        
        /*Retornem l'edat mtijana*/
        return mitjana;
    }
    
    /**
     * Mètode trebarTreballadorsPerAltura per veure quants treballadors són més 
     * alts que l'altura que es passa com a paràmetres.
     * 
     * @param alturaMinima
     * @return el nombre de treballadors més alts que l'altura especifcada
     */
    public int trobarTreballadorsPerAltura(double alturaMinima){
        /*Declaració de variables*/
       ArrayList<Treballador> llistaTreballadors = new ArrayList<>(treballadors.values());
       int treballadorsAlts = 0;
       
       /*Estructura FOR-EACH per pasar per cadascun dels treballador i veure quants
       són més alts que l'altura especificada*/
       for(Treballador t: llistaTreballadors){
           if(t.getAltura() > alturaMinima){
               treballadorsAlts++;
           }
       }
       
       /*Retornem el nombre de treballadors*/
       return treballadorsAlts;
    }
}