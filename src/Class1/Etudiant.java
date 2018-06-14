package Class1;

import java.util.Objects;

public class Etudiant extends Personne {

    public Etudiant(String fName, String lName, int age, String mAddress, String sex) {
        super(fName, lName, age, mAddress, sex);
    }

    public boolean isStudent() {
        return true;
    }

    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == Etudiant.class)) {
            Etudiant e = (Etudiant)obj;
            return (e.getFirstName().equals(this.getFirstName()));
        }
        return false;
    }
}
