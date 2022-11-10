package model;

public class Car {


    String color;
    String modelName;
    String manufacturer;
    String year;
    int numberOfDoors;
    int numberOfCylinders;
    double powerOutputInHorsePower;
    double price;

    public Car(String color, String modelName, String manufacturer) {
        this.color = color;
        this.modelName = modelName;
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void printCarInfo(){
        System.out.println("Car modelName :" + this.modelName +" "+ "Color :"+ this.color);
    }
}
