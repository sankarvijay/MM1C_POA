import fr.parisnanterre.miage.poa.universite.api.IBoursier;
import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanent;
import fr.parisnanterre.miage.poa.universite.implem.Doctorant;
import fr.parisnanterre.miage.poa.universite.implem.Personnel;
import fr.parisnanterre.miage.poa.universite.implem.Professeur;

import java.util.Date;

import static fr.parisnanterre.miage.poa.universite.implem.EchelonBourse.Doctorant;


public class Main {
    public static void main(String[] args) {
        Personnel p1 = new Doctorant("Sankar", "Vijay", "123456789", Doctorant);
        System.out.println(p1);
        System.out.println(((IBoursier) p1).montantBourse());

        IEnseignantPermanent pro = new Professeur("Homps", "Marc", "93275376526342", new Date(), 4000.00, "Informatique et Mathématique");
        System.out.println(pro);

    }
}
