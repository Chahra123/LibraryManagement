package Entity;

import Exception.BookException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author chahrazed.benazaiez
 */
public class BookLibrary {
private String name; 
private BookList bookList; 
private Map<Student, BookList> studentBooksTaken; 

    public BookLibrary(String nom) 
    {
        this.name = nom;
        bookList = new BookList();
        studentBooksTaken = new HashMap<>();
    }
    
    public void addBook(Book b)
    throws BookException
    {
        bookList.addBook(b);
    }
    public void deleteBook(Book b) 
    throws BookException
    {
        bookList.deleteBook(b);
    }
    public void borrowBook(Student s,Book b)
    throws BookException
    {
        BookList list = studentBooksTaken.get(s);
        if(list==null)
        {
            list = new BookList();
        }
        this.deleteBook(b);
        list.addBook(b);
        studentBooksTaken.put(s, list);
    }
    public void returnBook(Student s , Book b) 
            throws BookException{
        BookList list = studentBooksTaken.get(s);
        list.deleteBook(b);
        this.addBook(b);
        studentBooksTaken.put(s, list);
        
    }
    public List<Book> selectBookSelonCritere(Critere c){
        ArrayList<Book> list = new ArrayList<>();
        for(Book v:bookList.getBooks())
        {
            if(c.estSatisfaitPar(v))
                list.add(v);
        }
        return list;
    }
    public Set<Student> allStudentRenters()
    {
        return studentBooksTaken.keySet();
    }
    public Collection<BookList> collectionVoituresLouees(){
        return studentBooksTaken.values();
    }
    public void displayBooksWithTheirsDepartments(){
        for(Map.Entry<Student,BookList> mp:studentBooksTaken.entrySet())
        {
            System.out.println("Student : "+mp.getKey().toString());
            System.out.println("Books' list:");
            mp.getValue().affiche();
        }
    }
    public Map<Student, BookList> triIsbnAscendant(){
        TreeMap<Student, BookList> tre = new TreeMap<>(new StudentComparatorById()); 
        tre.putAll(studentBooksTaken);
        return tre;
    
    }
    
     public Map<Student, BookList> triCodeCroissant2(){
        TreeMap<Student, BookList> tre = new TreeMap<>((o1,o2)
                ->o1.getId()-o2.getId()); 
        tre.putAll(studentBooksTaken);
        return tre;
    
    }
    public Map<Student, BookList> triNomCroissant(){
        TreeMap<Student, BookList> tre = new TreeMap<>(); //Comparable (key)-- student
        tre.putAll(studentBooksTaken);
        return tre;
    }
   }