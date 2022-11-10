package model;

public class Chair {

    String brand;
    String placeOfManufacture;
    String color;
    String type;
    String material;
    String shape;
    double length;
    double weight;
    double height;

    public Chair(String brand, String placeOfManufacture, String color) {
        this.brand = brand;
        this.placeOfManufacture = placeOfManufacture;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printChairInfo(){
        System.out.println("Chair Brand :" + this.brand +" "+ "Color :"+ this.color);
    }
}
