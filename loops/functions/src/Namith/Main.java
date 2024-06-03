//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Namith;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num1= in.nextInt();
      int num2= in.nextInt();
      int num3= in.nextInt();
      int max=Max(num1,num2,num3);
      int min=Min(num1,num2,num3);
      System.out.println("Maximim number is "+max+" and minimum number is "+min);
    }
    public static int Max(int a,int b,int c){
        return  Math.max(a,Math.max(b,c));

    }
    public static int Min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));

    }
}