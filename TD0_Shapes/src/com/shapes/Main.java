package com.shapes;

public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3,6);
        System.out.println("Le perimetre du rectangle est de " +r1.perimeter());
        System.out.println("Test  2");

        System.out.println("Le perimetre du rectangle est de " +r1.surface());

        Point p1 = new Point(5,9);
        System.out.println("Le Point est sur l'origine " +p1.isOrigin());

    }
}
