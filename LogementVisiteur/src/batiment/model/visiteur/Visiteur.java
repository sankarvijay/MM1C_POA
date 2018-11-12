package batiment.model.visiteur;

import batiment.modele.base.*;

public interface Visiteur {
    void visit(Truc t);
    void visit(Bureau b);
    void visit(CollectionDeLivres c);
    void visit(GardeRobe g);
    void visit(Lamp l);
    void visit(Piece p);
    void visit(Lit l);
    void visit(Univers u);
    void visit(Vetement v);
    Object value();




}
