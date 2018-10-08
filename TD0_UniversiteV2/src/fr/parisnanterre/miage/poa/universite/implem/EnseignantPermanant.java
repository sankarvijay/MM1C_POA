package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IEnseignant;
import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanent;

import java.util.Date;

public class EnseignantPermanant extends Enseignant implements IEnseignantPermanent {
    private String domaineRecherche;

    public EnseignantPermanant(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, String domaineRecherche) {
        super(nom, prenom, numeroSecu, dateRecrutement, salaire);
        this.domaineRecherche = domaineRecherche;
    }

    public String domaineRecherche() {
        return domaineRecherche;
    }

    @Override
    public String toString() {
        return String.format("Enseignant %s, domaine : %s", super.toString(), domaineRecherche);
    }
}
