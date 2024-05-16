import java.util.Scanner;

public class Ex1b {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a x and y value to swap");
     int x = sc. nextInt();
     int y = sc. nextInt();
     System.out.println("Before Swapping of x and y is "+ x + ", "+ y);
    //  int temp = x;
    //  x = y;
    //  y = temp;
    x = x + y;
    y = x - y;
    x = x - y;
     System.out.println("After Swapping of x and y is "+ x + ", "+ y);
    }
}
