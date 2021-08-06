
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String inputid = scanner.nextLine();
            if (inputid.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String inputname = scanner.nextLine();
            if (inputname.equals("")) {
                break;
            }
            Item item = new Item(inputid, inputname);
            if (items.contains(item)) {
                continue;
            } else {
                items.add(item);
            }            
        }
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item.getId() + ": " + item.getName());
        }

    }
}
