package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadfileQ4 {

	public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file); 

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
       
    }

    public static void main(String[] args) {
        String fileName = "Nature.txt"; 

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace(); 
            System.out.println("Error: " + e.getClass().getSimpleName() + " caught!");
        }

        System.out.println("Program ends.");
    }
}
