package Namith;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String vote= ageCheck(age);
        System.out.println(vote);
    }
    public static String ageCheck(int number){
       if (number>=18){
           return "You are eligible to vote";
       }return "You are not eligible to vote";
    }
}
