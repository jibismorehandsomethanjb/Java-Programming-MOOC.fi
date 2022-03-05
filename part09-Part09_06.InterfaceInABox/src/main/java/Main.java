
public class Main {

    public static void main(String[] args) throws Exception {
        // test your classes here
        Box box = new Box(20);
        Book book = new Book("Horstman", "Core Java",1.0);
        box.add(book);
        System.out.println(box.weight());
        System.out.println(box);
    }

}
