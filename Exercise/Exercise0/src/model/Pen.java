package model;

public class Pen {

    String brand;
    String color;
    String type;
    String material;
    String shape;
    boolean isWork;
    double weight;
    double height;

    public Pen(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printPenInfo(){
        System.out.println("Pen Brand :" + this.brand +" "+ "Type:"+ this.type);
    }
}
