package com.cc.java;

public class Cat {

    // public String name; // kann von außen gesehen und beschrieben werden (public vs private)
    // Encapsulation
    private String name;
    private String furColor;
    private int age;


    // Konstruktor (Custom Constructor)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public void setName(String name){

        if (checkPermission()) {
            this.name = name;   
        } else {
        }
    }

    public void setFurColor(String furColor){

        if (checkPermission()) {
           this.furColor = furColor;   
        } else {            
        }
    }

    public void setAge(int age){
        if (checkPermission()) {
            this.age = age;   
        } else {            
        }
    }

    public String getName(){

        if (checkPermission()) {
            return name;   
        } else {
            return "Sorry, no permission";
        }
    }

    public String getFurColor(){
        if (checkPermission()) {
            return furColor;   
        } else {
            return "Sorry, no permission";
        }
    }

    public int getAge(){
        if (checkPermission()) {
            return age;   
        } else {
            return 401;
        }
    }


    // Adresse der Objektinstanz vom Typ Cat
    public Cat getInstanceVar(){
        return this;
    }

    private boolean checkPermission(){
        return true;
    }
    // this --> Instanzvariable
    // public void sayHi(){
    //     System.out.println("Blick von innen: " + this);
    // }
    //public void sayHi(){
    //App.output("Blick von innen: " + this);
    // }
}
