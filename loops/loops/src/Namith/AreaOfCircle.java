package Namith;
import java.util.Scanner;
//Area Of Circle Java Program

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        double radius = in.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("radious "+radius+" of Circle has "+area+" Area");
    }
}