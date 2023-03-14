package Entity;

import java.util.Objects;

/**
 *
 * @author chahrazed.benazaiez
 */
public class Student implements Comparable<Student>{
    int id;
    String firstName,lastName;
    String genre;
    String image;

    public Student(int id, String firstName, String lastName, String genre) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public Student(int id, String firstName, String lastName, String genre, String image) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.image = image;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImage(String image) {
        this.image = image;
    }

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
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.lastName, other.lastName);
    }
    public int compareTo(Student o) {
        return this.lastName.compareTo(o.lastName);
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", genre=" + genre + '}';
    }    
}
