import java.util.*;

public class Ex2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();

        // upper half diamond

        for(int row = 1; row <= n; row++ ){
            // print space
            for(int col = 1; col <= n - row; col++){
                System.out.print(" " + " "); 
            }
            // print space
            for(int col = 1; col <= (2 * row - 1); col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // lower half diamond

        for(int row = n - 1; row >= 1; row-- ){
            // print space
            for(int col = 1; col <= n - row; col++){
                System.out.print(" " + " "); 
            }
            // print space
            for(int col = 1; col <= (2 * row - 1); col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
