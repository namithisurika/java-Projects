package Namith;

import java.util.Scanner;

//Power In Java
public class PowerJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        double number = in.nextDouble();
        System.out.println("Enter the power");
        int power= in.nextInt();
        double answer=1;
        for(int i=0;i<power;i++){
           answer*=number;

        }
        System.out.println(answer);
    }
}
