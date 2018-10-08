package fr.parisnanterre.miage.poa.td0.universite.implem;

import java.util.Date;

public class Biatoss extends Personnel {

    private Date embauche;
    private boolean contratFin;
    private double salaire;

    protected Biatoss(String nom, String prenom, String numSecu, double salaire) {
        super(nom, prenom, numSecu);
        this.salaire = salaire;
    }

    public Date getEmbauche() {
        return embauche;
    }

    public void setEmbauche(Date embauche) {
        this.embauche = embauche;
    }

    public boolean isContratFin() {
        return contratFin;
    }

    public void setContratFin(boolean contratFin) {
        this.contratFin = contratFin;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Biatoss{" + super.toString() +
                "embauche=" + embauche +
                ", contratFin=" + contratFin +
                ", salaire=" + salaire +
                '}';
    }
}
