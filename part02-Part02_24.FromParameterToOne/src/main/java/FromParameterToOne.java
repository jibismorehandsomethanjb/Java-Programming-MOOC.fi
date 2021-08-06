
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startValue = scan.nextInt();
        printFromNumberToOne(startValue);
    }
    
    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
