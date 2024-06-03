package Namith;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=sum(num1,num2);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
