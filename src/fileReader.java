import java.io.*;
import java.util.*;

public class fileReader {

    private String filePath;




    public static String readFileToString (String filePath) throws IOException {

        //Create an instance of File Class that takes the argument "filePath"
        File file1 = new File(filePath);
        //Instance of FileReader is already create above assign "fileReader" value of
        FileReader fileReader = new FileReader(file1);
        //Instance of BufferedReader is already create above assign "bufferedReader" value of
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //Loop to read file
        String line = bufferedReader.readLine();
            while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
            }
        return line;
    }

    public static HashMap readFileToHashMap (String filePath){

    }

}
