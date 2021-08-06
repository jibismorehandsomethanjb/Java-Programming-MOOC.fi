/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book (String authorName, String bookTitle, int pagesCount) {
        author = authorName;
        name = bookTitle;
        pages = pagesCount;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPages() {
        return pages;
    }
    
    @Override
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}
