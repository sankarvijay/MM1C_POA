package fr.parisnanterre.miage.poa.td0.universite.implem;

public class Professeur extends EnseignantPermanent {

    protected Professeur(String nom, String prenom, String numSecu, String domaineRecherche) {
        super(nom, prenom, numSecu, domaineRecherche);
    }

    @Override
    public String toString() {
        return "Professeur{" + super.toString() + "}";
    }
}
