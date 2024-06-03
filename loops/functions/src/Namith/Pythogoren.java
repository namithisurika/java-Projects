package Namith;

import java.util.Scanner;

public class Pythogoren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        String checkPythogeron = CheckPythogeron(num1,num2,num3);
        System.out.println(checkPythogeron);
    }

    private static String CheckPythogeron(int num1, int num2, int num3) {
    int max= Math.max(num1,Math.max(num2,num3));
    int newNum=0;
    int AddNum=0;
    if(num1==max){
        newNum=(num1*num1);
         AddNum=(num2*num2)+(num3*num3);


    }
    else if(num2==max){
        newNum=num2*num2;
        AddNum=(num1*num1)+(num3*num3);


    }
    else if(num3==max){
         newNum=num3*num3;
         AddNum=num2*num2+num1*num1;


    } if(newNum==AddNum){
            return "This is pithogeros Triangle";
        }return "not pythogerus triangle";


    }
}
