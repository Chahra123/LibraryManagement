/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author chahrazed.benazaiez & nour.hariz
 */
public class Book {
    private int isbn;
    private final String title;
    private final String author;
    private final String genre;
    private String image;
    private Date date;
    
    public Book(String title, String author, String genre, String image, Date date){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.image = image;
        this.date = date;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
@Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.isbn;
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return this.isbn == other.isbn;
    }

    @Override
    public String toString() {
        return "availableBooks{" + "title=" + title + ", author=" + author + ", genre=" + genre + ", image=" + image + ", date=" + date + '}';
    }
    
    
}
