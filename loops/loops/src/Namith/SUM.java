package Namith;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum=0;
        while(true){
            System.out.println("enter the number");
            int number = in.nextInt();
            sum+=number;
            if(number==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
