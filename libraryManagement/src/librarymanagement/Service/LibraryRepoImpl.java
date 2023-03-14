package librarymanagement.Service;

import java.util.HashMap;
import librarymanagement.Entity.Book;
import librarymanagement.Entity.Department;

/**
 *
 * @author chahrazed.benazaiez
 */
public class LibraryRepoImpl implements LibraryRepo{
    HashMap<Book, Department> bookList = new HashMap<>();

    @Override
    public void addBookToDepartment(Book b, Department d) {
        bookList.put(b,d);
    }

    @Override
    public void deleteBook(Book b) {
        bookList.remove(b);
    }

    @Override
    public void displayBooksWithTheirsDepartments() {
         for(Book b: bookList.keySet())
        {
            System.out.println(b.toString());
            
            Department dep=bookList.get(b);
            
            System.out.println(dep.toString());
        }
    }

    @Override
    public void displayAllBooks() {
        for(Book b: bookList.keySet())
        {
            System.out.println(b.toString());
        }
    }

    @Override
    public void displayAllDepartments() {
        for(Book b: bookList.keySet())
        {           
            Department dep=bookList.get(b);           
            System.out.println(dep.toString());
        }
    }

    @Override
    public void afficherDepartement(Book b) {
        if(bookList.containsKey(b))
        {
            System.out.println(bookList.get(b).toString());
        }
    }

    @Override
    public boolean searchBook(Book b) {
        return bookList.containsKey(b);
    }

    @Override
    public boolean searchDepartment(Department d) {
        return bookList.containsValue(d);
    }
    
    
}
