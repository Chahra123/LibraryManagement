package Entity;

/**
 *
 * @author chahrazed.benazaiez
 */
public class AuthorCriteria implements Critere{

    private String author;
    @Override
    public boolean estSatisfaitPar(Book b) {
        return b.getAuthor().equals(author);
    }
    
}
