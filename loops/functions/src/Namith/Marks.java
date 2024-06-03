package Namith;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double marks = in.nextDouble();
        String grade = grade(marks);
        System.out.println(grade);
    }
    public static String grade(double mark){
        if(mark>90)return "AA";
        else if (mark>80) return "AB";
        else if (mark>70) return "BB";
        else if (mark>60) return "BC";
        else if (mark>50) return "CD";
        else if (mark>40) return "DD";
        return "Fail";

        }
    }

