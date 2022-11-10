package model;

public class Student {
    String name;
    String ID;
    String major;
    String hairColor;
    int age;
    String gender;
    String nationality;
    boolean wearGlasses;

    public Student(String name, String ID, String major, int age) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printStudentInfo(){
        System.out.println("Student Name :" + this.name +" "+ "ID:"+ this.ID);
    }
}
