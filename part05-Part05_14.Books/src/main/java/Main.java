
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<String> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            String bookYear = scanner.nextLine();
            int publicationYear = Integer.valueOf(bookYear);
            
            String bookInfo = name + ", " + bookYear;
            if (!bookList.contains(bookInfo)) {
                bookList.add(bookInfo);
                
                Book book = new Book(name, publicationYear);
                books.add(book);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
