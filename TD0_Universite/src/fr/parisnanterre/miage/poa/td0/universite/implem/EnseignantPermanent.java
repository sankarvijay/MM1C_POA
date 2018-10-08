package fr.parisnanterre.miage.poa.td0.universite.implem;

public abstract class EnseignantPermanent extends Enseignant {
    private String domaineRecherche;

    public EnseignantPermanent(String nom, String prenom, String numSecu, String domaineRecherche) {
        super(nom, prenom, numSecu);
        this.domaineRecherche = domaineRecherche;
    }

    public String getDomaineRecherche() {
        return domaineRecherche;
    }

    public void setDomaineRecherche(String domaineRecherche) {
        this.domaineRecherche = domaineRecherche;
    }

    @Override
    public String toString() {
        return "EnseignantPermanent{" + super.toString() +
                "domaineRecherche='" + domaineRecherche + '\'' +
                '}';
    }
}
