package FileManagment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        System.out.println("File metadata for: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");

        Date lastModifiedDate = new Date(file.lastModified());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(lastModifiedDate);
        System.out.println("Last Modified Date: " + formattedDate);

        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println("Is Readable: " + file.canRead());
        System.out.println("Is Writable: " + file.canWrite());
    }
}