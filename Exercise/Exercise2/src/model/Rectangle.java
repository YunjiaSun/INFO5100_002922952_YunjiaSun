package model;

public class Rectangle extends Shape{

    public double length;
    public double width;


    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public void printInfo() {
        System.out.println(" ====== Rectangle Information ====== ");
        System.out.println("Rectangle Area : " + (int)this.calculateArea());
        System.out.println("Rectangle Perimeter : " + (int)this.calculatePerimeter());
    }


}
