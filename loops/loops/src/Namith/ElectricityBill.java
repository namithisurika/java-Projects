package Namith;

import java.util.Scanner;

// calculate Electricity Bill
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
        System.out.println("Please enter the units");
        int units = in.nextInt();
        double bill;
        if(units==0){
                System.out.println("System terminated");
                break;
            }
        if(units<35 && units>0){
           bill=units*7;
            System.out.println("you are use "+units+ " number of units and your calculated bill is "+bill);
        }
        else if(units<50){
            bill=units*10;
            System.out.println("you are use "+units+ " number of units and your calculated bill is "+bill);
        }
        else if(units<70){
            bill=units*13;
            System.out.println("you are use "+units+ " number of units and your calculated bill is "+bill);
        }
        else if(units<90){
            bill=units*18;
            System.out.println("you are use "+units+ " number of units and your calculated bill is "+bill);
        }

        else
            System.out.println("Enter the correct units");


    }}
}
