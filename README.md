Activitat proposada pel professorat de l'asignatura de programació:
Volem guardar les dades personals dels treballadors en un programa informàtic utilitzant el
DNI com a identificador.
  - Crea la classe Treballador amb 3 atributs: nom, edat i alçada.
  - Crea la classe Empresa que tingui un atribut 'treballadors' de tipus HashMap i que
    guardi les dades de tots els treballadors utilitzant el DNI com a identificador.
    - Crea un mètode que calculi la mitjana d'edat dels treballadors.
    - Crea una mètode que trobi els treballadors amb una alçada superior a l'especificada.
    - Fes un mètode que comprovi si una clau està lliure i, en cas afirmatiu, afegeix un nou treballador.
  - Des del main realitza algunes proves de funcionament.

Ampliació: què passaria si dues persones tinguessin el mateix DNI? Planteja una solució per a que l’estructura
HashMap definida anteriorment ho permeti i justifica la teva decisió. Pista: collections.

Resolució de l'ampliació:
En el cas de vulguem hi hagi més d’un treballador (objecte treballador) per clau (dni), el que tindrem de retornar llavors serà un conjunt de treballadors. 
Per fer-ho, podem fer que el valor retornat per la clau sigui una col·lecció d’objectes treballador en comptes d’un sol objecte treballador, per tant, l’atribut 
de la classe Empresa referent al hash map quedaria de la següent manera:

private Map<String, Collection<Treballador>> treballadors;

Aquesta collection també podria ser qualsevol col·lecció com un ArrayList:

private Map<String, ArrayList<Treballador>> treballadors;

Ara bé, això suposa que s’hauria de desenvolupar alguna manera per entrar dins d’aquesta col·lecció i afegir  o eliminar el treballador d’aquesta. 
A més a més, s’hauria de comprovar si es que a la col·lecció no estem afegint treballadors repetits fent ús, per exemple tindre un mètode  que faci 
ús del mètode equals per veure si són iguals.

private boolean equals(Treballador t){
     return this.name.equals(t.getName()) && this.edat.equals(t.getEdat()) && this.altura.equals(t.getAltura());
}

