package model;

public class Desk {

    String brand;
    String placeOfManufacture;
    String color;
    String type;
    String material;
    String shape;
    double length;
    double weight;
    double height;

    public Desk(String brand, String placeOfManufacture, String color, String material) {
        this.brand = brand;
        this.placeOfManufacture = placeOfManufacture;
        this.color = color;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printDeskInfo(){
        System.out.println("Desk Brand :" + this.brand +" "+ "manufacturer:"+ this.placeOfManufacture);
    }
}
