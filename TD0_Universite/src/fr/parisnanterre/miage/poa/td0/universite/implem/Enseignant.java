package fr.parisnanterre.miage.poa.td0.universite.implem;

import fr.parisnanterre.miage.poa.td0.universite.api.IPersonnel;

import java.util.Date;

public class Enseignant extends Personnel implements IPersonnel {
    private Date recutementDate;
    private double salaire;

    public Enseignant(String nom, String prenom, String numSecu) {
        super(nom, prenom, numSecu);

    }

    public Enseignant(String nom, String prenom, String numSecu, Date recrutementDate, double salaire) {
        super(nom, prenom, numSecu);
        this.recutementDate = recutementDate;
        this.salaire = salaire;
    }

    public Date getRecutementDate() {
        return recutementDate;
    }

    public void setRecutementDate(Date recutementDate) {
        this.recutementDate = recutementDate;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Enseignant{" + super.toString() +
                "recutementDate=" + recutementDate +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public String nom() {
        return getNom();
    }

    @Override
    public String prenom() {
        return getPrenom();
    }

    @Override
    public String numero() {
        return getNumSecu();
    }
}
