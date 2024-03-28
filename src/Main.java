import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = null;



        List<String> readInLines = new ArrayList<>();

        FileReader readFile = new FileReader("random.csv");
        BufferedReader read = new BufferedReader(readFile);
        String row = null;
        while ((row = read.readLine()) != null){
            System.out.println(row);
        }





        }
    }
