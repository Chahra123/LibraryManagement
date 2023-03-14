/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.Service;

import librarymanagement.Entity.Book;
import librarymanagement.Entity.Department;

/**
 *
 * @author chahrazed.benazaiez
 */
interface LibraryRepo {
public void addBookToDepartment(Book b,Department d);
public void deleteBook(Book b);
public void displayBooksWithTheirsDepartments();
public void displayAllBooks();
public void displayAllDepartments();
public void afficherDepartement(Book b);
public boolean searchBook(Book b);
public boolean searchDepartment(Department d);
}
