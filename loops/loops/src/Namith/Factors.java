package Namith;

import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find factors");
        int number = in.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
}
