package Namith;
//Area Of Triangle
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base  of triangle ?");
        float base = in.nextFloat();
        System.out.println("Enter the height  of triangle ?");
        float height = in.nextFloat();
        float Area=((float) 1 /2)*base*height;
        System.out.println(base+" of base ,"+height+" Of height of triangle has "+Area+" of area");
    }
}
