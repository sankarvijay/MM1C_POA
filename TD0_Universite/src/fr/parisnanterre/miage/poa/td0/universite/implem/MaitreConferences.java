package fr.parisnanterre.miage.poa.td0.universite.implem;

public class MaitreConferences extends EnseignantPermanent {

    protected MaitreConferences(String nom, String prenom, String numSecu, String domaineRecherche) {
        super(nom, prenom, numSecu, domaineRecherche);
    }

    @Override
    public String toString() {
        return "MaitreConferences{" + super.toString() + "}";
    }
}
