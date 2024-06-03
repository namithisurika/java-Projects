package Namith;
//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number!=0) {
            String CheckNum = EvenOdd(number);
            System.out.println(CheckNum);
        }else System.out.println("Please enter correct number");
    }
    public static String EvenOdd(int number){
        if (number%2==0) {
            return "Even";
        }
        return "Odd";}


}
