package Namith;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class MAX {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int max=0;
        while(true){
            System.out.println("Enter the integer");
            int number= in.nextInt();
            if(number>max){
                max=number;
            }
            if(number==0){
                System.out.println(max);
                break;
            }
        }
    }
}
