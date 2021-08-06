
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try {
        Scanner scanFile = new Scanner(Paths.get(file));
        while (scanFile.hasNextLine()) {
            String row = scanFile.nextLine();
            String[] input = row.split(",");
            String name = input[0];
            int year = Integer.valueOf(input[1]);
            if (year == 1) {
                System.out.println(name + ", age: " + year + " year");
            } else {
                System.out.println(name + ", age: " + year + " years");
            }
            
        }
        }
        
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}