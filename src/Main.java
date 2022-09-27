import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    /* I probably need Regex for this one. Regular expressions.*/

    public static void main(String[] args) {


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            ArrayList<String> allLinesFromInputFile = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                allLinesFromInputFile.add(line);
            }
            bufferedReader.close();

            for (int i = 0; i < allLinesFromInputFile.size(); i++) {
                String str = allLinesFromInputFile.get(i);
                str = str.replaceAll("[^0-9]+", " ");
                String[] arrayOfStringNumbers = str.trim().split(" ");
                int[] arrayOfIntegers = new int[arrayOfStringNumbers.length];
                for (int y = 0; y < arrayOfStringNumbers.length; y++) {
                    arrayOfIntegers[y] = Integer.parseInt(arrayOfStringNumbers[y]);
                }

                for (int numberFromArray : arrayOfIntegers){
                    if(numberFromArray >= 10){
                        System.out.println(allLinesFromInputFile.get(i));
                        break;
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
