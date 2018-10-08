package fr.parisnanterre.miage.poa.td0.universite.implem;

public class Secretaire extends Biatoss {

    protected Secretaire(String nom, String prenom, String numSecu, double salaire) {
        super(nom, prenom, numSecu, salaire);
    }

    @Override
    public String toString() {
        return "Secretaire{" + super.toString() + "}";
    }
}
