package Namith;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class AverageOfNNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avarage;
        while (true) {
            int number = in.nextInt();
            if (number == 0) {
                avarage = (double) sum / count;
                System.out.println(avarage);
                break;
            } else {
                sum += number;
                count++;
            }
        }
in.close();
    }
}
