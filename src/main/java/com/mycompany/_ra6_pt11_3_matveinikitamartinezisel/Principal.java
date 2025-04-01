package com.mycompany._ra6_pt11_3_matveinikitamartinezisel;

/**
 * Script on es desmostra el funcionament de la Classe Empresa que treballa amb
 * objectes de la classe Treballador.
 *
 * @author Nikita i Isel
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("DEMOSTRACIÓ DE LES COLECCIONS");
        System.out.println("Primerament, anem a veure la classe treballador");
        System.out.println("La classe treballador ens permet instànciar objectes"
                + "amb atributs 3 atributs: nom, edat i altura");
        System.out.println("\nPer veure això, podem instànciar 3 objectes i veure"
                + " la seva informació");
        Treballador treballador1 = new Treballador("Ana", 24, 1.59);
        System.out.println("\n" + treballador1.toString());
        
        Treballador treballador2 = new Treballador("Joan", 47, 1.84);
        System.out.println("\n" + treballador2.toString());
        
        Treballador treballador3 = new Treballador("Maria", 32, 1.75);
        System.out.println("\n" + treballador3.toString());
        
        System.out.println("\nAra, veurem el funcionament de la classe Empresa");
        Empresa empresa = new Empresa();
        System.out.println("La classe Empresa té com a atribut un HashMap on:");
        System.out.println("\n\t- La clau (key) és el DNI del treballador");
        System.out.println("\n\t- El valor (valor) que retorna és el objecte "
                + "treballador");
        System.out.println("\nEls mètodes de la classe Empresa ens permeten:");
        
        System.out.println("\nAfegir un treballador amb el seu DNI i l'objecte");
        empresa.addTreballador("12345678X", treballador1);
        empresa.addTreballador("87654321Y", treballador2);
        empresa.addTreballador("11223344Z", treballador3);
        
        System.out.println("\n(si tratem d'afegir un treballador amb el mateix DNI, "
                + "no ens deixarà.)");
        empresa.addTreballador("12345678X", new Treballador("Albert", 41, 1.89));
        
        System.out.println("\nPodem calcular l'edat mtijana dels treballadors "
                + "que tinguem, que en el nostre cas és de: " + 
                empresa.edatMitjanaTreballadors() + " anys");
        
        System.out.println("\nBuscar el nombre de treballadors que siguin més alts"
                + " d'una determianda altura, per exemple, aquest és el nombre de "
                + "treballador que són més alts de 1.60: " 
                + empresa.trobarTreballadorsPerAltura(1.60));
    }
}
