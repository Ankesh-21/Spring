package org.example;

public class Dev {
    public Computer comp;
    public Dev(){
        System.out.println("I am a Developer");
    }
    public Computer getComp(){
        return this.comp;
    }
    public void setComp(Computer comp){
        this.comp = comp;
    }
    public void build(){
        System.out.println("Building Something...");
        comp.compile();
    }
}
