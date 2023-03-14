package Entity;

import Exception.BookException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chahrazed.benazaiez
 */
public class BookList {
    private List<Book> books;
    
    public BookList(List<Book> books)
    {
      this.books = books;  
    }

    public BookList() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book b)
    throws BookException{
      if(!books.contains(b))
      {
         books.add(b);
      }
      else throw new BookException("Book exists!");
    }
    public void deleteBook(Book b) throws
    BookException{
        if(!books.contains(b))
        {
           books.remove(b);
        }
        else throw new BookException("Book does not exist!");

    }

    public int size(){
    return books.size();
    }
    public void affiche()
    {
     for(Book b: books)
     {
         System.out.println(b);
     }
    }
    
}
