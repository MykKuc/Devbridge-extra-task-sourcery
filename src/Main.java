
import java.io.*;

public class Main {

    /* I probably need Regex for this one. */

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            while(bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
