package model;

import java.util.ArrayList;
import java.util.Arrays;

public class FullTime extends Student{


    int[] examScores;

    public FullTime(String name, String ID) {
        super(name, ID);
        examScores = new int[2];
    }

    //generate exam scores
    public int[] setExamScore(){

        for (int i = 0; i < examScores.length; i++){
            examScores[i] = (int)(Math.random()*100);
        }
        return examScores;
    }

    //print full time student info
    public void printFullTimeStudentsInfo(){
        System.out.println("Name:" + name + " " + "ID:" + ID + " " + "Exam Scores:"+Arrays.toString(examScores));
    }





}
