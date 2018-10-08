package fr.parisnanterre.miage.poa.td0.universite.implem;

public abstract class Personnel {
    private String nom, prenom, numSecu;

    protected Personnel(String nom, String prenom, String numSecu) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecu = numSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numSecu='" + numSecu + '\'' +
                '}';
    }
}
