package model;

public class Camera {
    String brand;
    String placeOfProduction;
    String color;
    String type;
    String material;
    boolean isWaterProof;
    boolean focalLength;
    double size;
    double length;

    public Camera(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlaceOfProduction() {
        return placeOfProduction;
    }

    public void setPlaceOfProduction(String placeOfProduction) {
        this.placeOfProduction = placeOfProduction;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void printCameraInfo(){
        System.out.println("Camera Brand :" + this.brand +" "+ "Color :"+ this.color);
    }
}
