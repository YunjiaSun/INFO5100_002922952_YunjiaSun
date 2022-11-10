package model;

public class Backpack {
    String brand;
    String color;
    String type;
    String material;
    boolean isWaterProof;
    double size;
    double length;
    int numberOfBags;
    int numberOfStraps;

    public Backpack(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }



    public boolean isWaterProof() {
        return isWaterProof;
    }

    public void setWaterProof(boolean waterProof) {
        isWaterProof = waterProof;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void printBackpackInfo(){
        System.out.println("Backpack Brand :" + this.brand +" "+ "Color :"+ this.color);
    }


}
