
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        try {
            Scanner scanFile = new Scanner(Paths.get(file));
            while (scanFile.hasNextLine()) {
                list.add(Integer.valueOf(scanFile.nextLine()));
            }
            
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        }
        
        catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
