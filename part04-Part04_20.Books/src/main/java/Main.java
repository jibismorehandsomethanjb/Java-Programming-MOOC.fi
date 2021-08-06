import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            String pages = scanner.nextLine();
            System.out.println("Publication year:");
            String year = scanner.nextLine();
            
            book.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        
        if (answer.equals("everything")) {
            for (Book i : book) {
                System.out.println(i.toString());
            }
        }
        
        if (answer.equals("name")) {
            for (Book i : book) {
                System.out.println(i.getTitle());
            }
        }

    }
}