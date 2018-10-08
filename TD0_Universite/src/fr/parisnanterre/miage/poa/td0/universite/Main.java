package fr.parisnanterre.miage.poa.td0.universite;

import fr.parisnanterre.miage.poa.td0.universite.implem.Doctorant;
import fr.parisnanterre.miage.poa.td0.universite.implem.Personnel;

public class Main {

    public static void main(String[] args) {
        Personnel p1 = new Doctorant("Sankar", "Vijay", "123456789", 400.00);
        System.out.println(p1.toString());
    }
}

