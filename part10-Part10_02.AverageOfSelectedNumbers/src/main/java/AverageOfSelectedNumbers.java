
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            list.add(input);
        }
        double averagePositive = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        
        double averageNegative = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if(input.equals("p")){
            System.out.println("Average of the Positive numbers: " + averagePositive);
        }else{
            System.out.println("Average of the negative numbers: " + averageNegative);
        }
    }
}
