import java.util.*;

public class Ex2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.println("Enter 0 or negative number to exit");
            number = sc.nextInt();
            if(number > 0) {
                sum += number;
            }
        } while(number > 0);
        System.out.println("The sum of Positive number is " + sum);
        
    }
}
