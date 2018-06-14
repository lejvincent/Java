package Class1;

import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Etudiant eleve1 = new Etudiant("vincent", "lejeune", 27, "malissard", "homme");
        Etudiant eleve2 = new Etudiant("Ghis", "Chalas", 30, "valence", "homme");
        Etudiant eleve3 = new Etudiant("vincent", "lejeune", 27, "malissard", "homme");
        System.out.println(eleve1.firstName + eleve1.lastName + eleve1.age + eleve1.address + eleve1.gender + eleve1.isStudent());
        System.out.println(eleve2);
        System.out.println(eleve1.equals(eleve2));
        System.out.println(eleve1.equals(eleve3));
    }

}