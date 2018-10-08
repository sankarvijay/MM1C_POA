package fr.parisnanterre.miage.poa.td0.universite.implem;

import java.util.Date;

public class EnseignantTemporaire extends Enseignant {
    private Date depart;

    public EnseignantTemporaire(String nom, String prenom, String numSecu, Date depart) {
        super(nom, prenom, numSecu);
        this.depart = depart;
    }

    public Date getDepart() {
        return depart;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "EnseignantTemporaire{" + super.toString() +
                "depart=" + depart +
                '}';
    }
}
