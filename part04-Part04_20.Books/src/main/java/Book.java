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
    private String title;
    private String pages;
    private String year;
    
    public Book (String bookTitle, String pageCount, String publicYear) {
        title = bookTitle;
        pages = pageCount;
        year = publicYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return (title + ", " + pages + " pages, " + year);
    }
}
