package Entity;

/**
 *
 * @author chahrazed.benazaiez
 */
/*Une interface fonctionnelle est une interface qui ne possède qu'une seule méthode 
abstraite et qui peut donc être utilisée comme type d'une expression lambda ou d'une référence de méthode.*/
@FunctionalInterface
public interface Critere 
{
  boolean estSatisfaitPar(Book b);  
}
