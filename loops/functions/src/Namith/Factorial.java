package Namith;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer of factorial number");
        int number = in.nextInt();
        int factorial = factorial(number);
        System.out.println(number+"! = "+factorial);
    }

    private static int factorial(int number) {
        int factoNum=1;
        for(int i = number; i>0; i--){
            factoNum*=i;
        }
        return factoNum;
    }
}

