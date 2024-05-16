import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex10b {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            int flag;

            while((line = br.readLine())!=null) {
                String words[] = line.split(" ");
                for(String word : words){
                    flag = 0;
                    for(int j = 0; j<word.length(); j++){
                        char ch = word.charAt(j);

                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                            flag = 1;
                        }
                    }
                    if(flag == 1) {
                        System.out.println(word);
                    }
                }
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
