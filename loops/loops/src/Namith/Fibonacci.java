package Namith;
//Fibonacci Series In Java Programs
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=0;
        int b=1;
        int sum=0;
        int i=1;
        System.out.println("Enter the index of fibonacci number?");
        int number = in.nextInt();
        if(number>1){
            while(number!=i){
                sum=a+b;
                a=b;
                b=sum;
                i++;

            }System.out.println("fibonacci number is "+sum);


        } else if (number==0) {
            System.out.println("fibonacci number is 0");
        } else if (number==1) {
            System.out.println("fibonacci number is 1");
        }



    }
}
