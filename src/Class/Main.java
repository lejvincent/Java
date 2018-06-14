package Class;

public class Main {

    public static void main(String[] args)
    {
        Etudiant moi = new Etudiant("Vincent", "Homme", 27);
        System.out.println(moi);
        System.out.println(moi.getName());
        System.out.println(moi.getSex());
        System.out.println(moi.getAge());
    }

}
