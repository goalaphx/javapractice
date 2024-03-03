import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez le premier entier (m) : ");
        int m = scanner.nextInt();
        
        System.out.println("Entrez le deuxième entier (n) : ");
        int n = scanner.nextInt();
        
        if (m < 0 || n < 0) {
            System.out.println("Veuillez entrer des entiers naturels (non négatifs).");
        } else {
            int produit = produitSansMultiplication(m, n);
            System.out.println("Produit de " + m + " et " + n + " = " + produit);
        }
        
        scanner.close();
    }

    public static int produitSansMultiplication(int m, int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return m;
        } else if (n < 0) {
            return -produitSansMultiplication(m, -n);
        } else {
            return m + produitSansMultiplication(m, n - 1);
        }
    }
}

