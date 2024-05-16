import java.util.Scanner;
// sum of digits

public class Ex1c {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number between 0 to 1000");
     int number = sc.nextInt();   
     
     if(isArmstrongNumber(number)){
        System.out.println(number + " is a Armstrong Number");
    } else {
         System.out.println(number + " is a not an Armstrong Number");
     }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while(number!=0) {
            int digit = number%10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }
}