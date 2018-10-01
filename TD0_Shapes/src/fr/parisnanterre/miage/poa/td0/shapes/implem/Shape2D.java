package fr.parisnanterre.miage.poa.td0.shapes.implem;

import fr.parisnanterre.miage.poa.td0.shapes.api.Mesureable2D;
import fr.parisnanterre.miage.poa.td0.shapes.api.Translatable2D;

public abstract class Shape2D implements Translatable2D, Mesureable2D {

    private Point2D refPoint;

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    @Override
    public Point2D getRefPoint(){
        return refPoint;
    }

    @Override
    public abstract double perimeter();

    @Override
    public abstract double surface();

    @Override
    public void translate(double dx, double dy) {
        refPoint.setX(refPoint.getX()+dx);
        refPoint.setY(refPoint.getY()+dy);

    }
}
