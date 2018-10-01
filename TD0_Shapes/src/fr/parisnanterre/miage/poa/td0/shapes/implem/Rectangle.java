package fr.parisnanterre.miage.poa.td0.shapes.implem;

import fr.parisnanterre.miage.poa.td0.shapes.Shape2D;

public class Rectangle extends Shape2D {

    private double length,width;


    public Rectangle(double l, double w, Point2D refPoint) {
        super(refPoint);
        this.length = l;
        this.width = w;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.length,2));
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double surface() {
        return this.width * this.length;
    }
}
