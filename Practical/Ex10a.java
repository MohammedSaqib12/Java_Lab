import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex10a {
    public static void main(String[] args) {
        String fname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        fname = sc.nextLine();

        String line = null;

        try {
            FileReader reader = new FileReader(fname);
            BufferedReader br = new BufferedReader(reader);
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
