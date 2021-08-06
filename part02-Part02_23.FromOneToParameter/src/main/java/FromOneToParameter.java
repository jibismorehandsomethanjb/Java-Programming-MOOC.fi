import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfTimes = scan.nextInt();
        printUntilNumber(numOfTimes);
    }
    
    public static void printUntilNumber(int numOfTimes) {
        for (int i = 1; i <= numOfTimes; i++) {
            System.out.println(i);
        }
    }
}
