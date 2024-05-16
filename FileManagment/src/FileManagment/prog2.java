package FileManagment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog2 {

    public static void main(String[] args) {
        File file = new File("diary.txt");

        if (!file.exists()) {
            System.out.println("The diary file does not exist.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Contents of diary:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

/**
 * OUTPUT
 * 
 * Contents of diary:
 * 2024-07-06: Hello world lets code
 * 2024-07-06: Pakhi hehehehe :)
 */