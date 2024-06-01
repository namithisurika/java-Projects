package Namith;
//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;
public class ProductAndSum {
    public static void main(String[] args) {
        int sum=0;
        int product=1;
        int digit;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Integer number");
        int number = in.nextInt();

        while(number>0){
            digit=number%10;
            sum+=digit;
            product *= digit;
            number /= 10;
        }
        System.out.println(sum);
        System.out.println(product);


    }
    }




















