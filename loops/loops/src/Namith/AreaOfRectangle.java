package Namith;
import java.util.Scanner;
//Area Of Rectangle Program
public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter the width  of rectangle ?");
        double width = in.nextDouble();
        System.out.println("Enter the height  of rectangle ?");
        double height = in.nextDouble();
        double area=width*height;
        System.out.println(width+ " width of and"+height+" height of rectangle has "+area+" of area" );
    }
}
