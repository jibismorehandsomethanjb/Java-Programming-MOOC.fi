
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        int index = 0;
        while (!(input.equals("")) && index < list.length) {
            for (int i = 0; i < list.length ; i++) {
                System.out.println(list[i]);
                index++;
            }
            input = scanner.nextLine();
            list = input.split(" ");
            index = 0;
        }
        
    }
}
