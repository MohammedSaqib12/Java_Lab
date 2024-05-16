import java.io.*;

public class Ex11a {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a file operation example.");
            writer.close();
            System.out.println("File created and written successfully.");

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) 
  {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
