package fr.parisnanterre.miage.poa.td0.universite.implem;

public class Etudiant extends Personnel {
    private double bourse;

    public Etudiant(String nom, String prenom, String numSecu, double bourse) {
        super(nom, prenom, numSecu);
        this.bourse = bourse;
    }

    public double getBourse() {
        return bourse;
    }

    public void setBourse(double bourse) {
        this.bourse = bourse;
    }

    @Override
    public String toString() {
        return "Etudiant{" + super.toString() +
                "bourse=" + bourse +
                '}';
    }
}
