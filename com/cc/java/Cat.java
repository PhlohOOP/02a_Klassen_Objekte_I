package com.cc.java;

public class Cat {

    public String name;
    public String furColor;
    public int age;


    // Konstruktor (Custom Constructor)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    // Adresse der Objektinstanz vom Typ Cat
    public Cat getInstanceVar(){
        return this;
    }

    // this --> Instanzvariable
    // public void sayHi(){
    //     System.out.println("Blick von innen: " + this);
    // }
    //public void sayHi(){
    //App.output("Blick von innen: " + this);
    // }
}
