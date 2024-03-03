import java.util.Scanner;

public class CompteBancaire {
    private String proprietaire;
    private double solde;
    private int numero;
    private static int nbrecomptes = 0;
    private Scanner scanner; // Declaring Scanner as an instance variable

    public CompteBancaire(String proprietaire) {
        this.proprietaire = proprietaire;
        solde = 0;
        numero = nbrecomptes++;
        scanner = new Scanner(System.in); // Initializing Scanner in the constructor
    }

    public double getSolde() {
        return solde;
    }
    public String getProprietaire(){
        return proprietaire;
    }

    public int getNumero() {
        return numero;
    }

    public static int getNbcomptes() {
        return nbrecomptes;
    }

    public void setSolde(double s) {
        solde = s;
    }

    public String toString() {
        String s = "nom: ";
        s += proprietaire + "\n";
        s += "num = " + numero + "\n";
        s += "solde = " + solde + "\n";
        return s;
    }

    public boolean retirer() {
        System.out.println("Somme a retirer: ");
        double s = scanner.nextDouble();
        if (s > solde) {
            System.out.println("Solde Insuffisant");
            return false;
        }
        solde -= s;
        return true;
    }

    public void verser() {
        System.out.println("Somme a verser: ");
        double s = scanner.nextDouble();
        solde += s;
    }

    public boolean virer(CompteBancaire cb) {
        System.out.println("Somme a virer: ");
        double s = scanner.nextDouble();
        if (s > solde) {
            System.out.println("Solde Insuffisant");
            return false;
        }
        solde -= s;
        cb.verser();
        return true;
    }

    public char menuCompteBancaire() {
        char choix;
        System.out.println("-----------------MENU------------------");
        System.out.println("c:-----------------Consulter------------------");
        System.out.println("v:-----------------Verser------------------");
        System.out.println("r:-----------------Retirer------------------");
        System.out.println("q:-----------------Quitter------------------");
        choix = scanner.next().charAt(0);
        return choix;
    }

    public void operation() {
        char choix = '0';
        while ((choix = menuCompteBancaire()) != 'q') {
            switch (choix) {
                case 'c':
                    System.out.println(this);
                    break;
                case 'v':
                    verser();
                    break;
                case 'r':
                    retirer();
                    break;
                default:
                    System.out.println("Ressayer avec une commande valable");
            }
        }
        scanner.close(); // Close Scanner when done
    }
}


