package fr.parisnanterre.miage.poa.universite.implem;

public enum EchelonBourse {
    Zero, Un, Deux, Trois, Doctorant;

    public double montantBourse() {
        switch (this) {
            case Zero:
                return 100.0;
            case Un:
                return 100.0;
            case Deux:
                return 100.0;
            case Trois:
                return 100.0;
            case Doctorant:
                return 1500.0;
            default:
                return 0;
        }
    }
}
