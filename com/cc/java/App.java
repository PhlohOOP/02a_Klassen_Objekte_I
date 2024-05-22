package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Cat --> Referenztyp (Klasse aus dem das Objekt gebildet wird)
        // cat1 --> Referenzvariable (hält die Adresse zum Objekt (im RAM bzw. Heap))

        Cat cat1 = new Cat(); // Instanziierung >> Objekt
        output("Blick von aussen: " + cat1); // Adresse des Objekts
        output("Blick von innen: " + cat1.getInstanceVar());

        output("---------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVar());
        
    }
    // statische Methode die in der Klasse ausgeführt wird
    public static void output(String outputStr){
        System.out.println(outputStr);
   }

}

