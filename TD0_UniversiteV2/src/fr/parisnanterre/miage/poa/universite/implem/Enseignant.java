package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IEnseignant;

import java.util.Date;

public class Enseignant extends Personnel implements IEnseignant {
    private Date dateRecrutement;
    private double salaire;

    public Enseignant(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire) {
        super(nom, prenom, numeroSecu);
        this.dateRecrutement = dateRecrutement;
        this.salaire = salaire;
    }

    public Date dateRecrutement() {
        return dateRecrutement;
    }

    public double salaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return String.format("%s recrute le %s", super.toString(), dateRecrutement);
    }
}
