package Namith;

import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class SumNtural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number= in.nextInt();
        int sum = NaturalNum(number);
        System.out.println(sum);
    }

    private static int NaturalNum(int number) {
        int sum=0;
        for(int i=1;i<number;i++){
            sum+=i;

        }
        return sum;
    }
}
