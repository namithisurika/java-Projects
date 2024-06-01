package Namith;

import java.util.Scanner;

//Calculate Discount Of Product
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(".....This is is discount calculate program.....");
            System.out.println("Enter the name of product?");
            String ProductName=in.next();
            System.out.println("enter the price of Product?");
            double ProductPrice=in.nextInt();
            if(ProductPrice==0||ProductName.equals("q")){
                System.out.println("Program terminated");
                break;
            }
            else if(ProductPrice<500&&ProductPrice>100){
                ProductPrice=ProductPrice-((ProductPrice*3)/100);
                System.out.println(ProductName+"-"+ProductPrice);
            }
            else if(ProductPrice<1000){
                ProductPrice=ProductPrice-((ProductPrice*4)/100);
                System.out.println(ProductName+"-"+ProductPrice);
            }
            else if(ProductPrice<2000){
                ProductPrice=ProductPrice-((ProductPrice*5)/100);
                System.out.println(ProductName+"-"+ProductPrice);
            }
            else if(ProductPrice<5000){
                ProductPrice=ProductPrice-((ProductPrice*8)/100);
                System.out.println(ProductName+"-"+ProductPrice);
            }
            else if(ProductPrice<10000){
                ProductPrice=ProductPrice-((ProductPrice*10)/100);
                System.out.println(ProductName+"-"+ProductPrice);
            }else if(ProductPrice>10000){
                ProductPrice=ProductPrice-((ProductPrice*15)/100);
                System.out.println(ProductName+"-"+ProductPrice);
            }
            else System.out.println("Please enter right product price");

        }


    }
}
