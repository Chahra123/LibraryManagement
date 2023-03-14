
package Entity;

import java.util.Objects;

/**
 *
 * @author chahrazed.benazaiez
 */
public class Department {
    private int identifiant;
    private String nom;

    public Department(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public Department() {
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" + "identifiant=" + identifiant + ", nom=" + nom + '}';
    }

    @Override
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
        final Department other = (Department) obj;
        if (this.identifiant != other.identifiant) {
            return false;
        }
        return Objects.equals(this.nom, other.nom);
    }
    
    
    
}

