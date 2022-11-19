package ui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //case1
        System.out.println("-----Case1-----");
        ArrayList<String> data = new ArrayList<>();
        String a = "010-12398679";
        String b = "1109-12398679";
        data.add(a);
        data.add(b);

        String phoneRegex = ("^(\\d{3}-)\\d{8}$");

        for (String el : data) {
            if (el.matches(phoneRegex)) {
                System.out.println("Right!");
            } else
                System.out.println("Wrong!");
        }

        //case2
        System.out.println("-----Case2-----");
        String idRegex = ("\\d{14}[[0-9],0-9Xx]");
        System.out.println(Pattern.matches(idRegex, "50010319978651x"));
        System.out.println(Pattern.matches(idRegex, "a001031997865199"));

        //case3
        System.out.println("-----Case3-----");
        String passwordRegex = ("^[a-zA-Z]\\w{5,12}$");
        System.out.println(Pattern.matches(passwordRegex, "A6343787_3"));
        System.out.println(Pattern.matches(passwordRegex, "a00103199!"));

        //case4
        System.out.println("-----Case4-----");
        String wordRegex = "[TYHj]ello";
        System.out.println(Pattern.matches(wordRegex, "Hello"));
        System.out.println(Pattern.matches(wordRegex, "zello"));

        //case5
        System.out.println("-----Case5-----");
        String emailRegex = "^\\w+\\@[a-zA-Z]{5}+.com";
        System.out.println(Pattern.matches(emailRegex, "7a_@asdxc.com"));
        System.out.println(Pattern.matches(emailRegex, "789dd_@axxxxx.com"));




    }


}
