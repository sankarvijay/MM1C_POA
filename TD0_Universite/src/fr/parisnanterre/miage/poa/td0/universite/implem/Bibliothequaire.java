package fr.parisnanterre.miage.poa.td0.universite.implem;

public class Bibliothequaire extends Biatoss {

    protected Bibliothequaire(String nom, String prenom, String numSecu, double salaire) {
        super(nom, prenom, numSecu, salaire);
    }

    @Override
    public String toString() {
        return "Bibliothequaire{" + super.toString() + "}";
    }
}
