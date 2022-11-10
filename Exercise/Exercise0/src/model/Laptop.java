package model;

public class Laptop {
    String brand;
    String color;
    String placeOfManufacture;
    boolean isTurnedOn;
    double price;
    double size;
    double height;
    double weight;
    Keyboard keyboard;

    static class Keyboard{
        String language = "English";
        short numberOfKey;


    }

    static class Software{
        String appName;
        short numberOfApp;
    }

    public Laptop(String brand, String color, String placeOfManufacture) {
        this.brand = brand;
        this.color = color;
        this.placeOfManufacture = placeOfManufacture;
        keyboard = new Keyboard();
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

    public void printLaptopInfo(){
        System.out.println("Laptop Brand :" + this.brand +" "+ "Keyboard Language:" + this.keyboard.language);
    }
}
