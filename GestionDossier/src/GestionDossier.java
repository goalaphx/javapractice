import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GestionDossier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choix;

        do {
            // Affichage du menu
            System.out.println("\nMenu :");
            System.out.println("1. Créer un fichier");
            System.out.println("2. Supprimer un fichier");
            System.out.println("3. Créer un répertoire");
            System.out.println("4. Supprimer un répertoire");
            System.out.println("5. Lister le contenu d'un répertoire");
            System.out.println("6. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextLine();

            // Traitement du choix
            switch (choix) {
                case "1":
                    System.out.print("Nom du fichier à créer : ");
                    String nomFichier = scanner.nextLine();
                    creerFichier(nomFichier);
                    break;
                case "2":
                    System.out.print("Nom du fichier à supprimer : ");
                    String nomFichierSupp = scanner.nextLine();
                    supprimerFichier(nomFichierSupp);
                    break;
                case "3":
                    System.out.print("Nom du répertoire à créer : ");
                    String nomRepertoire = scanner.nextLine();
                    creerRepertoire(nomRepertoire);
                    break;
                case "4":
                    System.out.print("Nom du répertoire à supprimer : ");
                    String nomRepertoireSupp = scanner.nextLine();
                    supprimerRepertoire(nomRepertoireSupp);
                    break;
                case "5":
                    System.out.print("Nom du répertoire à lister : ");
                    String nomRepertoireListe = scanner.nextLine();
                    listerContenuRepertoire(nomRepertoireListe);
                    break;
                case "6":
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (!choix.equals("6"));

        scanner.close();
    }

    // Méthode pour créer un fichier
    public static void creerFichier(String nomFichier) {
        File fichier = new File(nomFichier);

        try {
            if (fichier.createNewFile()) {
                System.out.println("Fichier créé avec succès : " + nomFichier);
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la création du fichier.");
            e.printStackTrace();
        }
    }

    // Méthode pour supprimer un fichier
    public static void supprimerFichier(String nomFichier) {
        File fichier = new File(nomFichier);

        if (fichier.exists() && fichier.isFile()) {
            if (fichier.delete()) {
                System.out.println("Fichier supprimé avec succès : " + nomFichier);
            } else {
                System.out.println("Impossible de supprimer le fichier.");
            }
        } else {
            System.out.println("Le fichier spécifié n'existe pas.");
        }
    }

    // Méthode pour créer un répertoire
    public static void creerRepertoire(String nomRepertoire) {
        File repertoire = new File(nomRepertoire);

        if (!repertoire.exists()) {
            if (repertoire.mkdir()) {
                System.out.println("Répertoire créé avec succès : " + nomRepertoire);
            } else {
                System.out.println("Impossible de créer le répertoire.");
            }
        } else {
            System.out.println("Le répertoire existe déjà.");
        }
    }

    // Méthode pour supprimer un répertoire
    public static void supprimerRepertoire(String nomRepertoire) {
        File repertoire = new File(nomRepertoire);

        if (repertoire.exists() && repertoire.isDirectory()) {
            if (repertoire.delete()) {
                System.out.println("Répertoire supprimé avec succès : " + nomRepertoire);
            } else {
                System.out.println("Impossible de supprimer le répertoire.");
            }
        } else {
            System.out.println("Le répertoire spécifié n'existe pas.");
        }
    }

    // Méthode pour lister le contenu d'un répertoire
    public static void listerContenuRepertoire(String nomRepertoire) {
        File repertoire = new File(nomRepertoire);

        if (repertoire.exists() && repertoire.isDirectory()) {
            File[] contenu = repertoire.listFiles();
            if (contenu != null && contenu.length > 0) {
                System.out.println("Contenu du répertoire " + nomRepertoire + ":");
                for (File fichier : contenu) {
                    System.out.println(fichier.getName());
                }
            } else {
                System.out.println("Le répertoire est vide.");
            }
        } else {
            System.out.println("Le répertoire spécifié n'existe pas.");
        }
    }
}
