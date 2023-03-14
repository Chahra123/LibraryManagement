package Entity;

import java.util.Comparator;

/**
 *
 * @author chahrazed.benazaiez
 */

public class StudentComparatorById implements Comparator<Student>{

    //Redefine the compare(T o1, T o2) method
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o2.getId();
    }
    
}
