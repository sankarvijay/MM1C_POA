package batiment.model.visiteur;

import batiment.modele.base.*;

public class VisiteurComptage implements Visiteur {

    int cpt;

    public VisiteurComptage() {
        this.cpt = 0;
    }

    @Override
    public void visit(Truc t) {

    }

    @Override
    public void visit(Bureau b) {
        cpt++;
        for(Truc t:b.trucs){
            t.accept(this);
        }

    }

    @Override
    public void visit(CollectionDeLivres c) {

    }

    @Override
    public void visit(GardeRobe g) {

    }

    @Override
    public void visit(Lamp l) {
        cpt++;
    }

    @Override
    public void visit(Piece p) {
        for(Truc t:p.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Lit l) {
        cpt++;
    }

    @Override
    public void visit(Univers u) {
        for(Piece p : u.pieces){
            p.accept(this);
        }
    }

    @Override
    public void visit(Vetement v) {

    }

    @Override
    public Object value() {
        //boxing and unboxing
        return cpt;
    }
}
