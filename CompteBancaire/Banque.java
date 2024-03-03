import java.util.Scanner;

public class Banque {
    CompteBancaire comptes[];
    int nbreComptes;
    int nbreMax;
    public static Scanner scanner = new Scanner(System.in);

    public Banque(int nbre) {
        nbreMax = nbre;
        comptes = new CompteBancaire[nbre];
        nbreComptes = 0;
    }

    public void creercompte() {
        if (nbreComptes >= nbreMax)
            System.out.println("Impossible car Max atteind");
        else {
            comptes[nbreComptes++] = new CompteBancaire(null);
        }
    }

    public void creercompte(String nom) {
        if (nbreComptes >= nbreMax)
            System.out.println("Impossible car Max atteind");
        else {
            comptes[nbreComptes++] = new CompteBancaire(nom);
        }
    
    }

    public String toString() {
        String desc = "";
        for (int i = 0; i < nbreComptes; i++)
            desc += comptes[i].toString() + "\n";
        return desc;
    }

    public char menuBanque() {
        char choix;
        System.out.println("-----------------MENU------------------");
        System.out.println("a:-----------------Liste------------------");
        System.out.println("c:-----------------Creer------------------");
        System.out.println("o:-----------------Operations------------------");
        System.out.println("q:-----------------Quitter------------------");
        choix = scanner.next().charAt(0);
        return choix;
    }

    public void operationBanque() {
        char choix;
        while ((choix = menuBanque()) != 'q') {
            switch (choix) {
                case 'a':
                    System.out.println(this);
                    break;
                case 'o':
                    int i = chercher();
                    if (i == -1) {
                        System.out.println("Compte Introuvable");
                        break;
                    }
                    comptes[i].operation();
                    break;
            }
        }
    }

    public int chercher() {
        int choix = ' ';
        int i = 1;
        Scanner x = new Scanner(System.in);
        System.out.println("1:par Numero 2:par nom");
        choix = x.next().charAt(0);
        switch (choix) {
            case '1':
                System.out.println("Numero");
                int num = x.nextInt();
                for (i = 0; i < nbreComptes; i++) {
                    if (comptes[i].getNumero() == num)
                        return i;
                }
                break;
            case '2':
                System.out.println("Nom");
                String nom = x.next();
                for (i = 0; i < nbreComptes; i++) {
                    if (comptes[i].getProprietaire().equals(nom))
                        return i;
                }
                break;
        }
        return (-1);
    }

    public void operationmenu() {
        char choix = '0';
        while ((choix = menuBanque()) != 'q') {
            switch (choix) {
                case 'a':
                    System.out.println(this);
                    break;
                case 'c':
                System.out.println("Entrez le nom du propriétaire du compte:");
                String nomProprietaire = scanner.next();
                creercompte(nomProprietaire);
                    break;
                case 'o':
                    operationBanque();
                    break;
                default:
                    System.out.println("Ressayer avec une commande valable");
            }
        }
        // scanner.close(); // Don't close Scanner here
    }

    public static void main(String[] args) {
        Banque BaridBANK = new Banque(5);
        BaridBANK.operationmenu(); // Call operation() instead of menuBanque()
    }
}
