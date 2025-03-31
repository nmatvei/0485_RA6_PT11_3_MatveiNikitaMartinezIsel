package com.mycompany._ra6_pt11_3_matveinikitamartinezisel;

/**
 * Classe Treballador
 *
 * @author Nikita i Isel
 */
public class Treballador {

    /*Declaració de variables i atribusts*/
    private String nom;
    private int edat;
    private double altura;
    private static final String NOM_DEFAULT = "";
    private static final int EDAT_DEFAULT = 18;
    private static final double ALTURA_DEFAULT = 1.75;

    /**
     * Constructor per defecte que truca al constructor parametritzat
     */
    public Treballador() {
        this(NOM_DEFAULT, EDAT_DEFAULT, ALTURA_DEFAULT);
    }

    /**
     * Constructor parametritzat
     *
     * @param nom
     * @param edat
     * @param altura
     */
    public Treballador(String nom, int edat, double altura) {
        this.nom = nom;
        this.edat = edat;
        this.altura = altura;
    }

    /**
     * Mètode GET per conseguir el nom del treballador
     *
     * @return nom del treballador
     */
    public String getNom() {
        return nom;
    }

    /**
     * Mètode GET per conseguir l'edat del treballador
     *
     * @return edat del treballador
     */
    public int getEdat() {
        return edat;
    }

    /**
     * Mètode GET per conseguir l'altura del treballador
     *
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Mètode SET per canviar el nom del treballador
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mètode SET per canviar l'edat del treballador
     *
     * @param edat
     */
    public void setEdat(int edat) {
        this.edat = edat;
    }

    /**
     * Mètode SET per canviar l'altura del treballador
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Mètode sobrescrit toString per dir totes les dades del treballador
     *
     * @return tota la informació del treballador
     */
    @Override
    public String toString() {
        String informacioTreballador = "Informació del treballador:" + "\nNom: "
                + nom + "\nEdat: " + edat + "\nAltura: " + altura;
        return informacioTreballador;
    }
}