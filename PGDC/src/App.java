import java.util.Scanner;

public class App {

    public static int pgcdRecursif(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return pgcdRecursif(y, x % y);
        }
    }

    public static int pgcdIteratif(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les deux nombres
        System.out.print("Entrez le premier nombre : ");
        int x = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int y = scanner.nextInt();

        // Calculer le PGCD de manière récursive
        int resultatRecursif = pgcdRecursif(x, y);
        System.out.println("Le PGCD de " + x + " et " + y + " en utilisant la méthode récursive est " + resultatRecursif);

        // Calculer le PGCD de manière itérative
        int resultatIteratif = pgcdIteratif(x, y);
        System.out.println("Le PGCD de " + x + " et " + y + " en utilisant la méthode itérative est " + resultatIteratif);

        scanner.close();
    }
}
