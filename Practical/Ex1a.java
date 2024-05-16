import java.util.Scanner;
// sum of digits

public class Ex1a {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number between 0 to 1000");
     int number = sc.nextInt();   
     int sum = 0;
     int remaining_number = number;
     while(remaining_number!=0) {
        int digit = remaining_number%10;
        sum += digit;
        remaining_number /= 10;
     }
     System.out.println("The sum of digits is "+sum);
    }
}