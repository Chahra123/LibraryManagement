package librarymanagement.Entity;

/**
 *
 * @author chahrazed.benazaiez
 */
public class Book {
    private int isbn;
    private String name,author;
    private int nbPages;

    public Book(int isbn, String name, String author, int nbPages) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.nbPages = nbPages;
    }

    public Book() {
    }

    public int getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", name=" + name + ", author=" + author + ", nbPages=" + nbPages + '}';
    }
  
}
