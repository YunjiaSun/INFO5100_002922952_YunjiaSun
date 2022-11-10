package model;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.random;

public class Student {

    String name;
    String ID;
    int[] quizScore;




    public Student(String name,String ID) {
        this.name = name;
        this.ID = ID;
        quizScore = new int[15];

    }

    //generate random quiz scores
    public int[] setQuizScore(){

         for (int i = 0; i < quizScore.length; i++){
             quizScore[i] = (int)(Math.random()*10);
         }

//         for (int i = 0; i < quizScore.length-1; i++){
//             for (int j = 0; j < quizScore.length -1 -i; j++){
//                 if (quizScore[j] > quizScore[j + 1]){
//                     int temp = quizScore[j];
//                     quizScore[j] = quizScore[j+1];
//                     quizScore[j+1] = temp;
//                 }
//             }
//         }
         return quizScore;
    }

    //calculated quiz average
    public int calculatedAverage(){

        int sum = 0;
        for (int i = 0; i < quizScore.length; i++){
            sum += quizScore[i];
        }
        return sum/15;
    }

    //get quiz average
    public int getQuizAverage(){
        return calculatedAverage();
    }

    //print student info
    public void printStudentsInfo(){
        System.out.println("Name:" + name +" "+ "ID:" + ID + " "
                           + "\n" +"Quiz Score:"+Arrays.toString(quizScore) + " "
                           + "Quiz Average:" + " " + calculatedAverage());
    }

}
