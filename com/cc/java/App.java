package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        //zwei Objekte erzeugen

        // Cat --> Referenztyp (Klasse aus dem das Objekt gebildet wird)
        // cat1 --> Referenzvariable (hält die Adresse zum Objekt (im RAM bzw. Heap))
        Cat cat1 = new Cat(); // Instanziierung >> Objekt
        System.out.println(cat1); // Adresse des Objekts
 
        Cat cat2 = new Cat();
        System.out.println(cat2);
        


    }

   

}

