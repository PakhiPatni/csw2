package FileManagment;
import java.io.File;
import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        System.out.println("Contents of directory " + directory.getAbsolutePath() + ":");
        listFilesAndSubdirectories(directory, 0);
    }

    private static void listFilesAndSubdirectories(File directory, int depth) {
        File[] filesAndDirectories = directory.listFiles();
        if (filesAndDirectories != null) {
            for (File file : filesAndDirectories) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("  ");
                }
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    listFilesAndSubdirectories(file, depth + 1);
                }
            }
        }
    }
}
