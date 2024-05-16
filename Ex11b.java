import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex11b {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int flag;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" "); 
                for (String word : words) {
                    flag = 0; 
                    for (int j = 0; j < word.length(); j++) {
                        char ch = word.charAt(j); 
                        
                        if (ch == 'a' || ch == 'e' || ch == 
    'i' || ch == 'o' || ch == 'u') {
                            flag = 1; 
                        }
                    }

                    if (flag == 1) {
                        System.out.println(word);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " +
  e.getMessage());
        }
    }
}
