package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Session {
    String name;
    ArrayList<Student> students;
    ArrayList<FullTime> fullTimeStudents;
    ArrayList<PartTime> partTimeStudents;


    public Session(String name){
        this.name = name;
        students = new ArrayList<Student>();
        fullTimeStudents = new ArrayList<FullTime>();
        partTimeStudents = new ArrayList<PartTime>();
    }


    //generate quiz for each student
    public void Quiz(){
        for (Student s : students){
            s.setQuizScore();
            s.calculatedAverage();
        }
    }

    //creat full-time student
    public FullTime newFullTimeStudent(String name, String ID){
        FullTime fullTimeStudent = new FullTime(name,ID);
        fullTimeStudents.add(fullTimeStudent);
        fullTimeStudent.setExamScore();
        students.add(fullTimeStudent);
        return fullTimeStudent;
    }

    //creat part-time student
    public PartTime newPartTimeStudent(String name, String ID){
        PartTime partTimeStudent = new PartTime(name,ID);
        partTimeStudents.add(partTimeStudent);
        students.add(partTimeStudent);
        return partTimeStudent;
    }


    //print session info
    public void printSessionInfo(){
        System.out.println(" ========================= Session Information ========================= ");
        System.out.println("Session : " + this.name );
        System.out.println(" ========================= WholeStudent Information ========================= ");
        Collections.sort(students, (s1, s2) -> s2.getQuizAverage() - s1.getQuizAverage());
        for (Student s : students){
            s.printStudentsInfo();
        }
        System.out.println(" ========================= FullTimeStudent Exam Scores ========================= ");
        for (FullTime s : fullTimeStudents){
            s.printFullTimeStudentsInfo();
        }
        System.out.println(" ========================= PartTimeStudent Name & ID ========================= ");
        for (PartTime s : partTimeStudents){
            s.printPartTimeStudentsInfo();
        }


    }



}
