package fr.parisnanterre.miage.poa.td0.shapes;

public abstract class Shape3D extends Shape {

    public abstract double volume();

    public abstract void translate (int dx, int dy);

    @Override
    public double surface() {
        return 0;
    }
}
