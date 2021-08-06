
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {
            while (scanFile.hasNextLine()) {
                list.add(scanFile.nextLine());
            }
            
            System.out.println("Search for?");
            String search = scanner.nextLine();
            
            if (list.contains(search)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }
        
        catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}
