import java.io.*;
import java.util.*;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a value: ");
            int a = sc.nextInt();
            System.out.println("Enter a value: ");
            int b = sc.nextInt();
            int result = a / b;
            System.err.println("The result of " + a + "/" + b
  + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Caught: " 
  + e.getMessage());
        }

        try {
            int array[] = {1, 2, 3, 4, 5};
            System.out.println("Enter a position between 0 and 4: ");
            int pos = sc.nextInt();
            int value = array[pos];
            System.out.println("Value at position " + pos + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: " + e.getMessage());
        }
        try {
            System.out.println("Enter any string: ");
            String str = sc.next();
            int length = str.length();
            System.out.println("Length of a String is: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught: " + e.getMessage());
        }

        try {
            System.out.println("Enter file name: ");
            String file = sc.nextLine();
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line = bufferedReader.readLine();
            System.out.println("File content is: " + line);
        } catch (IOException e) {
            System.out.println("IOException Caught: " + e.getMessage());
        }

        try {
            System.out.println("Enter a number: ");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println("You Entered number is: " + 
  num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Caught: " + e.getMessage());
        }
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException Caught: " + e.getMessage());
        }

        sc.close();
    }
}
