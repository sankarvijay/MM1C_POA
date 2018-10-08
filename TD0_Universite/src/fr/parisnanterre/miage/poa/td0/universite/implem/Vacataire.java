package fr.parisnanterre.miage.poa.td0.universite.implem;

import java.util.Date;

public class Vacataire extends EnseignantTemporaire {

    public Vacataire(String nom, String prenom, String numSecu, Date depart) {
        super(nom, prenom, numSecu, depart);
    }

    @Override
    public String toString() {
        return "Vacataire{" + super.toString() + "}";
    }
}
