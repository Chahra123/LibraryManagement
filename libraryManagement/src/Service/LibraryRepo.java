/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Book;
import Entity.Department;

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
