package ui;

import model.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        //create a new shape-square and print information of it
        Shape square = new Square(5);
        square.printInfo();

        //square serialization
        try{
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/square.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(square);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");

        }catch (IOException i){
            i.printStackTrace();
        }

        //square deserialization
        Shape square1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/square.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            square1 = (Shape) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){

            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){

            System.out.println("Square class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Square Class");
        square1.printInfo();



        //create a new shape-circle and print information of it
        Shape circle = new Circle(2);
        circle.printInfo();

        //circle serialization
        try{
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/circle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(circle);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");

        }catch (IOException i){
            i.printStackTrace();
        }

        //circle deserialization
        Shape circle1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/circle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            circle1 = (Shape) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Circle class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Circle Class");
        circle1.printInfo();




        //create a new shape-rectangle and print information of it
        Shape rectangle = new Rectangle(8,6);
        rectangle.printInfo();

        //rectangle serialization
        try{
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rectangle);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");

        }catch (IOException i){
            i.printStackTrace();
        }

        //rectangle deserialization
        Shape rectangle1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            rectangle1 = (Shape) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Circle class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Circle Class");
        rectangle1.printInfo();




        //create a new shape-triangle and print information of it
        Shape triangle = new Triangle(8,7,9);
        triangle.printInfo();

        //triangle serialization
        try{
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/triangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(triangle);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");

        }catch (IOException i){
            i.printStackTrace();
        }

        //triangle deserialization
        Shape triangle1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/Users/summer/workspace/INFO5100_002922952_Yunjia Sun/Exercise/Exercise3/src/serialization/triangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            triangle1 = (Shape) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Circle class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Circle Class");
        triangle1.printInfo();
    }
}
