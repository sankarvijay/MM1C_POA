package batiment;

import batiment.model.visiteur.Visiteur;
import batiment.model.visiteur.VisiteurComptage;
import batiment.modele.base.*;

public class Main {
    public static void main(String[] args){
        Truc l = new Lit();
        Piece p = new Piece("chambre");
        p.ajouter(l);
        Univers u = new Univers();
        u.ajouter(p);

        Bureau b = new Bureau();
        p.ajouter(b);
        Truc x = new Lamp();
        b.ajouter(x);

        //VisiteurFrancais v = new VisiteurFrancais();
       // Visiteur v = new VisiteurEnglish();
        Visiteur v = new VisiteurComptage();
        u.accept(v);
        System.out.println(v.value());
    }
}
