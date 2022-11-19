package model;

public class Triangle extends Shape{
    private double side1,side2,side3;
    private static String color = "pink";

    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    //Helen's formula Area = Square root of√s(s - a)(s - b)(s - c)
    @Override
    public double calculateArea() {
        double p = (this.side1 + this.side2+ this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    @Override
    public double calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public void printInfo() {
        System.out.println(" ====== Triangle Information ====== ");
        System.out.println("Triangle Area : " + (int)this.calculateArea());
        System.out.println("Triangle Perimeter : " + (int)this.calculatePerimeter());

    }

}
