package com.shapes;

public class Rectangle extends Shape2D {

    private double length,width;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double l, double w) {
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
