package fr.parisnanterre.miage.poa.td0.shapes.implem;

public class Point2D {
    private double x,y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    @Override
    public String toString() {
        return String.format("(%d, %d)", getX(), getY());
    }
}
