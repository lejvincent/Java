package Class2;

public class Main {

    public static void main(String[] args) {

        String tableNoms[][] = {{"Vincent", "Ghis", "Remi", "Damien"},{"Lejeune", "Chalas", "Tabardel", "Thibaut"}};

        for (int a = 0; a < tableNoms.length; a++) {

            for (int b = 0; b < tableNoms.length; b++) {

                    System.out.println(tableNoms[a][b]);

            }
        }
    }
}
