
public class Book implements Packable{
    private String bookName;
    private String author;
    private double weight;
    
    public Book(String author, String name, double weight){
        this.author = author;
        this.bookName = name;
        this.weight = weight;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.author + ": " + this.bookName;
    }
}
