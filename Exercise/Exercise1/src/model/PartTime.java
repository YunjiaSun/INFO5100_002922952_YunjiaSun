package model;

import java.util.Arrays;

public class PartTime extends Student{
    public PartTime(String name, String ID) {
        super(name, ID);
    }

    //print part time student info
    public void printPartTimeStudentsInfo(){
        System.out.println("Name:" + name + " " + "ID:" + ID );
    }
}
