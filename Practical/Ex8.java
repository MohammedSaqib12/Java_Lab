import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {
    public static void main(String[] args) {
        // arithmetic exception

        try {
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic Exception Caught: "+ e.getMessage());
        }
        // Array index out of bound exception

        try {
            int arr[] = new int[5];
            int value = arr[10];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: "+ e.getMessage());
        }

        // Null Pointer exception

        try {
            String str = null;
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught: "+ e.getMessage());
        }

        // IO exception

        try {
            FileReader reader = new FileReader("non-existense.txt");
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("IO Exception Caught: "+ e.getMessage());
        }

        // Number Format exception

        try {
            String str = "abc";
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception Caught: "+ e.getMessage());
        }

        // Class Not Found exception

        try {
            Class.forName("non-existance-class");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found Exception Caught: "+ e.getMessage());
        }

    }
}
