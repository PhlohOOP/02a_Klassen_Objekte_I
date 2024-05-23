package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Cat --> Referenztyp (Klasse aus dem das Objekt gebildet wird)
        // cat1 --> Referenzvariable (hält die Adresse zum Objekt (im RAM bzw. Heap))

        Cat cat1 = new Cat("Grizabella", "White", 29); // Instanziierung >> Objekt
        output("Blick von aussen: " + cat1); // Adresse des Objekts
        output("Blick von innen: " + cat1.getInstanceVar());

        //Werte zuweisen (händisch) -> Custom Constructor is the way to go -_>
        // cat1.name = "Grizabella";
        // cat1.furColor = "White";
        // cat1.age = 29;

        //Werte ausgeben
        // output(); // --> Fehler und nicht undefined wie bei JS, da ein bereits definierter Typ erwartet wird (untypisiert <-> typisiert)
        // output(null); // null --> leere Objektreferenz (geht als einziges abgesehen vom akzeptierten Argument(hier wird String erwartet))
        // ## das hier erreicht nun die privaten Variablen nicht mehr in den Objekten - Getter benutzen
        // output(cat1.name);
        //output(cat1.furColor);
        //output(Integer.toString(cat1.age)); // Typkonvertierung // output(String.valueOf(cat1.age)); // kommt zum selben Ergebnis
        
        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));

        cat1.setFurColor("Checkered");
        output(cat1.getFurColor());

        output("---------------------");

        Cat cat2 = new Cat("Alonzo", "Grey", 35);
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVar());

        //Werte zuweisen (händisch)
        // cat2.name = "Alonzo";
        // cat2.furColor = "Grey";
        // cat2.age = 35;

        //Werte ausgeben
        // output(); // --> Fehler und nicht undefined wie bei JS, da ein bereits definierter Typ erwartet wird (untypisiert <-> typisiert)
        // output(null); // null --> leere Objektreferenz (geht als einziges abgesehen vom akzeptierten Argument(hier wird String erwartet))
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge())); // Typkonvertierung // output(String.valueOf(cat1.age)); // kommt zum selben Ergebnis

    }
    // statische Methode die in der Klasse ausgeführt wird
    public static void output(String outputStr){
        System.out.println(outputStr);
   }

}

