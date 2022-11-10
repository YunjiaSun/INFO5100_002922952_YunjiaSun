package model;

public class Lipstick {

    String brand;
    String placeOfManufacture;
    String color;
    String type;
    String material;
    String shape;
    double length;
    double height;

    public Lipstick(String brand, String placeOfManufacture, String color) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void printLipstickInfo(){
        System.out.println("Lipstick Brand :" + this.brand +" "+ "manufacturer:"+ this.placeOfManufacture);
    }
}
