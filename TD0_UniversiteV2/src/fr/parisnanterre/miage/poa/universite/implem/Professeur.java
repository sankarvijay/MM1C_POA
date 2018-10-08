package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanent;

import java.util.Date;

public class Professeur extends EnseignantPermanant {


    public Professeur(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, String domaineRecherche) {
        super(nom, prenom, numeroSecu, dateRecrutement, salaire, domaineRecherche);
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
