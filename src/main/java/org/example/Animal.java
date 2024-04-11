package org.example;

public class Animal {

    private String nombre;
    private String genero;
    private double peso;
    public Animal pareja;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;   }


    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}