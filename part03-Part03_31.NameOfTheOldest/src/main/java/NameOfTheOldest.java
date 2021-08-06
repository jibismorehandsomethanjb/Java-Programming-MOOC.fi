
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(",");
        int oldest = 0;
        String oldName = "";
        
        while (!input.equals("")) {
            if (Integer.valueOf(array[1]) > oldest) {
                oldest = Integer.valueOf(array[1]);
                oldName = array[0];
            }
            input = scanner.nextLine();
            array = input.split(",");
        }
        System.out.println("Name of the oldest: " + oldName);

    }
}
