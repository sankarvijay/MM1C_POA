package com.shapes;

public abstract class Shape {
    private String nom;

    public abstract double surface();

    public Shape(String nom) {
        this.nom = nom;
    }
    public Shape(){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
