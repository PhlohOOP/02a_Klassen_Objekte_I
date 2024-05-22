package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        //zwei Objekte erzeugen

        // Cat --> Referenztyp (Klasse aus dem das Objekt gebildet wird)
        // cat1 --> Referenzvariable (hält die Adresse zum Objekt (im RAM bzw. Heap))
        Cat cat1 = new Cat(); // Instanziierung >> Objekt
        System.out.println("Blick von aussen: " + cat1); // Adresse des Objekts
        cat1.sayHi();
        System.out.println("---------------------");
        Cat cat2 = new Cat();
        System.out.println("Blick von aussen: " + cat2);
        cat2.sayHi();
        
        output("hi");

    }

    public static void output(String outputStr){
        System.out.println(outputStr);
   }

}

