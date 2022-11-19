package model;

public class Square extends Shape{
    public double side;
    public static String color = "pink";

    public Square(double side){
        this.side = side;
    }

    public static String getColor() {
        return color;
    }

    @Override
    public double calculateArea() {
        return this.side*4;
    }

    @Override
    public double calculatePerimeter() {
        return this.side * this.side ;
    }

    @Override
    public void printInfo() {
        System.out.println(" ====== Square Information ====== ");
        System.out.println("Square Area : " + (int)this.calculateArea());
        System.out.println("Square Perimeter : " + (int)this.calculatePerimeter());
        System.out.println("Square Color : " + getColor());

    }

}
