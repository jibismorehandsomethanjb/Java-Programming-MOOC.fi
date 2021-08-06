
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        int index = 0;
        while (!(input.equals("")) && index < list.length) {
            for (String list1 : list) {
                if (list1.contains("av")) {
                    System.out.println(list1);
                    index++;
                }
            }
            input = scanner.nextLine();
            list = input.split(" ");
            index = 0;
        }
    }
}
