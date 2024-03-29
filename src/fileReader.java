import java.io.*;
import java.util.*;

public class fileReader {

    private String filePath;

    public static String readFileToString(String filePath) throws IOException {

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

    public static List<String> readFileToList(String filePath) {
        //Create ListArray to store lines from the file
        List<String> readArray = new ArrayList<String>();

        try (
                //Create FileReader instance "fileReader" pass in file path variable
                FileReader fileReader = new FileReader(filePath);
                //Create BufferReader wrapper instance, pass in "fileReader" instance variable
                BufferedReader br = new BufferedReader(fileReader)) {
            //create string to take one line at a time in the loop
            String line = null;
            //Loop to read file. .readLine() is a method of BufferedReader to read file one line at a time
            while ((line = br.readLine()) != null) {
                readArray.add(line);
            }
        }
        //Catch Exception
        catch (FileNotFoundException e) {
            System.out.println("File Not found!");
            ;
        }
        //Catch Exception
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
        return readArray;
    }

    public static HashMap<String, String> readFileToHashMap(String filePath) {
        HashMap<String, String> fileHashMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String Line;
            while ((Line = br.readLine()) != null) {
                String[] values = Line.split(",");
                fileHashMap.put(values[0].trim(), values[1].trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return fileHashMap;
    }
}
