import java.util.Scanner;

public class Ex1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3;

        System.out.println("Fibonacci Series:");
        System.out.print(f1 + " " + f2 + " ");
        
        for( int i = 3; i<=terms; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}
