package fr.parisnanterre.miage.poa.td0.universite.implem;

public class Doctorant extends Etudiant {

    private Doctorant(String nom, String prenom, String numSecu, double bourse) {
        super(nom, prenom, numSecu, bourse);
    }

    @Override
    public String toString() {
        return "Doctorant{" + super.toString() + "}";
    }
}
