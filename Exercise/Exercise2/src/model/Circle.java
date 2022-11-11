package model;

public class Circle extends Shape {
    private double radius;

    private static String color = "blue";


    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * this.radius*2;
    }

    @Override
    public void printInfo() {
        System.out.println(" ====== Circle Information ====== ");
        System.out.println("Circle Area : " + (int)this.calculateArea());
        System.out.println("Circle Perimeter : " + (int)this.calculatePerimeter());

    }


}
