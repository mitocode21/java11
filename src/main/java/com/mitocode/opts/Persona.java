package com.mitocode.opts;

public class Persona{
    
    private int id;
    private String nombre;

    public Persona(){
        
    }

    public Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.setId(id);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.setNombre(nombre);
    }
}