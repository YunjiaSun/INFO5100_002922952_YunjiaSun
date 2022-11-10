package model;

public class Phone {

    String brand;
    String color;
    String type;
    int yearOfProduction;
    boolean isWork;
    double focalLengthOfLens;
    double price;
    double weight;

    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("Phone Brand :" + this.brand +" "+ "Price:"+ this.price);
    }
}
