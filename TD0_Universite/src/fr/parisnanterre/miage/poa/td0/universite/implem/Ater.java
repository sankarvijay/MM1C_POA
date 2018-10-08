package fr.parisnanterre.miage.poa.td0.universite.implem;

import java.util.Date;

public class Ater extends EnseignantTemporaire {

    public Ater(String nom, String prenom, String numSecu, Date depart) {
        super(nom, prenom, numSecu, depart);
    }

    @Override
    public String toString() {
        return "Ater{" + super.toString() + "}";
    }
}
