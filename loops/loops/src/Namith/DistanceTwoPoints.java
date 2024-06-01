package Namith;

import java.util.Scanner;

//Calculate Distance Between Two Points
public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("....This is the distance calculate program.....");
        System.out.println("The points named as X1,X2,X3,X4");
        System.out.println("Enter the X1");
        double x1 = in.nextDouble();
        System.out.println("Enter the y1");
        double y1 = in.nextDouble();
        System.out.println("Enter the X2");
        double x2 = in.nextDouble();
        System.out.println("Enter the y2");
        double y2 = in.nextDouble();
        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(distance);
    }
}
