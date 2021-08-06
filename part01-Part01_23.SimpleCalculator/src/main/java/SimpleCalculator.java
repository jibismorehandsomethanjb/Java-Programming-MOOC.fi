
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sumPlus = first + second;
        int sumMinus = first - second;
        int sumMultiply = first * second;
        double sumDivide = first * 1.0 / second;
                
        System.out.println(first + " + " + second + " = " + sumPlus);
        System.out.println(first + " - " + second + " = " + sumMinus);
        System.out.println(first + " * " + second + " = " + sumMultiply);
        System.out.println(first + " / " + second + " = " + sumDivide);

    }
}