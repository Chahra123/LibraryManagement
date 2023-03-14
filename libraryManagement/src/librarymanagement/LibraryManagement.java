/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Entity.Book;
import Entity.BookLibrary;
import Entity.Student;
import Entity.StudentComparatorById;
import Exception.BookException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author chahrazed.benazaiez & nour.hariz
 */
public class LibraryManagement extends Application {
    
    private double x = 0;
    private double y = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        root.setOnMousePressed((MouseEvent event) ->{
            
            x = event.getSceneX();
            y = event.getSceneY();
            
        });
        
        root.setOnMouseDragged((MouseEvent event) ->{
           
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
            
        });
        
        stage.initStyle(StageStyle.TRANSPARENT);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIATION OF ENTITIES:
        //STUDENTS
        Student st1 = new Student(1,"Chahrazed","Ben Azaiez","Female");
        Student st2 = new Student(3,"Cherif","Ben Azaiez","Male");
        Student st3 = new Student(0,"Nour","Hariz","Female");
        Student st4 = new Student(11,"Sana","Ben Fadhel","Female");
        //BOOKS
        BookLibrary lib = new BookLibrary("ESPRIT_LIB");
        Book b1=new Book("title1","Victor Hugo","FANTASY");
        Book b2=new Book("title2","Molière","ACTION");
        Book b3=new Book("title3","Stendhal","HORROR");
        Book b4=new Book("title4","Victor Hugo","ROMANCE");
        Book b5=new Book("title5","Victor Hugo","ACTION");
 
        List<Student> students = new ArrayList<Student>();
        students.add(st4);
        students.add(st2);
        students.add(st3);
        students.add(st1);
        
        //Sort the list in ascending order by lastname
        Collections.sort(students);
        
        //Sort students' List by name        
        Collections.sort(students, new StudentComparatorById());
        
        //Display the list:
        students.forEach(student -> System.out.println(student));
        //_____________________________________________________________
        try{
            lib.addBook(b1);
        }
        catch(BookException e)
        {
            System.out.println(e);
        }
        
        try{
            lib.addBook(b2);
        }
        catch(BookException e)
        {
            System.out.println(e);
        }
        try{
            lib.addBook(b1);
        }
        catch(BookException e)
        {
            System.out.println(e);
        }
        try{
            lib.addBook(b3);
        }
        catch(BookException e)
        {
            System.out.println(e);
        }
        try{
            lib.addBook(b4);
        }
        catch(BookException e)
        {
            System.out.println(e);
        }
        try{
            lib.addBook(b5);
        }
        catch(BookException e)
        {
            System.out.println(e);
        }
        
        try{
            lib.borrowBook(st1, b5);
        }
        catch(BookException ex)
        {
            System.out.println(ex);
        }
        /*Create a new list of books that satisfy a certain criterion, 
        specifically that the author of the book is "Victor Hugo".*/
        List<Book> li2 = lib.selectBookSelonCritere(b-> b.getGenre().equals("ACTION"));
        //Display the list "li2"
        System.out.println("Books that the author = 'Victor Hugo':\n");
        li2.stream().forEach(System.out::println);
        //_____________________________________________________________________________________
        ArrayList<Book> listeb = new ArrayList<>();
        listeb.add(b1);
        listeb.add(b2);
        listeb.add(b3);
        listeb.add(b4);
        listeb.add(b5);
        
        listeb.stream().filter(e-> e.getAuthor().equals("Molière")).forEach(e-> System.out.println(e));
        
        launch(args);
    }
    
}
