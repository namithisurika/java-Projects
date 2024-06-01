package Namith;

public class ArmStrong {
    public static void main(String[] args) {
        int count=0;
        int number=1;
        int digit;
        int digit2;
        for(int i=1;i<1000;i++) {
            number = i;
            while (number > 0) {
                digit = number % 10;
                count++;
                number /= 10;
            }
            while (count>0){
                digit2 = i%10;
                count--;
            }
        }
    }
}
