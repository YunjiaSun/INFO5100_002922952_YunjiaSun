package ui;

import model.Shape;
import model.Circle;
import model.Square;
import model.Rectangle;
import model.Triangle;


public class Main {
    public static void main(String[] args){

        //create a new shape-square and print information of it
        Shape square = new Square(5);
        square.printInfo();

        //create a new shape-circle and print information of it
        Shape circle = new Circle(2);
        circle.printInfo();

        //create a new shape-rectangle and print information of it
        Shape rectangle = new Rectangle(8,6);
        rectangle.printInfo();

        //create a new shape-triangle and print information of it
        Shape triangle = new Triangle(8,7,9);
        triangle.printInfo();
    }
}
