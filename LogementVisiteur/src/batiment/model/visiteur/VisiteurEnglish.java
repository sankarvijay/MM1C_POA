package batiment.model.visiteur;

import batiment.modele.base.*;

public class VisiteurEnglish implements Visiteur {
    @Override
    public void visit(Truc t) {

    }

    @Override
    public void visit(Bureau b) {
        System.out.println("I am a Desk");
        for(Truc t : b.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres c) {
        System.out.println("I am a collection of "+c.nbLivres+" books");
    }

    @Override
    public void visit(GardeRobe g) {
        System.out.println("I am a wardrobe");
        for(Vetement v : g.vetements){
            g.accept(this);
        }
    }

    @Override
    public void visit(Lamp l) {
        System.out.println("I am a Lamp");

    }

    @Override
    public void visit(Piece p) {
        System.out.println("I am a room ");
        for(Truc t : p.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Lit l) {
        System.out.println("I am a bed ");


    }

    @Override
    public void visit(Univers u) {
        System.out.println("I am a Universe ");
        for(Piece p : u.pieces){
            p.accept(this);
        }
    }

    @Override
    public void visit(Vetement v) {
        System.out.println("I am a Dress ");
    }

    @Override
    public Object value() {
        return null;
    }
}
