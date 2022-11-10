package ui;

import model.FullTime;
import model.Session;
import model.Student;

public class Main {
    public static void main(String[] args) {

        //creat new Session
        Session Fall = new Session("Fall Semester");

        //creat full-time students
        Fall.newFullTimeStudent("Anna", "001");
        Fall.newFullTimeStudent("Summer", "002");
        Fall.newFullTimeStudent("Robin", "003");
        Fall.newFullTimeStudent("Tom", "004");
        Fall.newFullTimeStudent("Lily", "005");
        Fall.newFullTimeStudent("Rose", "006");
        Fall.newFullTimeStudent("Xin", "007");
        Fall.newFullTimeStudent("Jack", "008");
        Fall.newFullTimeStudent("Xiao", "009");
        Fall.newFullTimeStudent("Dee", "010");

        //creat part-time students
        Fall.newPartTimeStudent("Harry", "011");
        Fall.newPartTimeStudent("Wang", "012");
        Fall.newPartTimeStudent("Yang", "013");
        Fall.newPartTimeStudent("Linda", "014");
        Fall.newPartTimeStudent("Felix", "015");
        Fall.newPartTimeStudent("Qing", "016");
        Fall.newPartTimeStudent("Nova", "017");
        Fall.newPartTimeStudent("Piggy", "018");
        Fall.newPartTimeStudent("Amber", "019");
        Fall.newPartTimeStudent("Tony", "020");

        //creat quiz scores for each student
        Fall.Quiz();

        //print Info
        Fall.printSessionInfo();


    }
}
