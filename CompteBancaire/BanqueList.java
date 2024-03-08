import java.util.ArrayList;
import java.util.Scanner;

public class BanqueList {
    ArrayList<CompteBancaire> comptes;
    int nbreMax;
    public static Scanner scanner = new Scanner(System.in);

    public BanqueList(int nbre) {
        comptes = new ArrayList<>(nbre);
        nbreMax = nbre;
    }

    public void creercompte() {
        if (comptes.size() >= nbreMax)
            System.out.println("Impossible car Max atteind");
        else {
            comptes.add(new CompteBancaire(null));
        }
    }

    public void creercompte(String nom) {
        if (comptes.size() >= nbreMax)
            System.out.println("Impossible car Max atteind");
        else {
            comptes.add(new CompteBancaire(nom));
        }
    }

    public String toString() {
        StringBuilder desc = new StringBuilder();
        for (CompteBancaire compte : comptes)
            desc.append(compte.toString()).append("\n");
        return desc.toString();
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
                    comptes.get(i).operation();
                    break;
            }
        }
    }

    public int chercher() {
        int choix = ' ';
        Scanner x = new Scanner(System.in);
        System.out.println("1:par Numero 2:par nom");
        choix = x.next().charAt(0);
        switch (choix) {
            case '1':
                System.out.println("Numero");
                int num = x.nextInt();
                for (int i = 0; i < comptes.size(); i++) {
                    if (comptes.get(i).getNumero() == num)
        
                        return i;
                }
                break;
            case '2':
                System.out.println("Nom");
                String nom = x.next();
                for (int i = 0; i < comptes.size(); i++) {
                    if (comptes.get(i).getProprietaire().equals(nom))
                    
                        return i;
                }
                break;
        }
        return -1;
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
    }

    public static void main(String[] args) {
        Banque BaridBANK = new Banque(5);
        BaridBANK.operationmenu();
    }
}
