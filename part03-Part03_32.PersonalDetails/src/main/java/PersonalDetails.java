
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(",");
        int sum = 0;
        int count = 0;
        
        String longestName = "";
        
        while (!input.equals("")) {
            if (array[0].length() > longestName.length()) {
                longestName = array[0];
            }
            sum += Integer.valueOf(array[1]);
            count++;
            
            input = scanner.nextLine();
            array = input.split(",");
        }
        double avg = 1.0 * sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}