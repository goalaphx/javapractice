import java.io.File;

public class GestionDossier {



    // Méthode pour créer un dossier
    public static void creerDossier(String nomDossier) {
        File dossier = new File(nomDossier);

        // Vérifier si le dossier n'existe pas déjà
        if (!dossier.exists()) {
            dossier.mkdir(); // Créer le dossier
            System.out.println("Dossier cree avec succes: " + nomDossier);
        } else {
            System.out.println("Le dossier existe deja.");
        }
    }

    // Méthode pour afficher le contenu d'un dossier
    public static void afficherContenuDossier(String nomDossier) {
        File dossier = new File(nomDossier);
        
        // Vérifier si le dossier existe
        if (dossier.exists() && dossier.isDirectory()) {
            File[] contenu = dossier.listFiles();
            if (contenu != null && contenu.length > 0) {
                System.out.println("Contenu du dossier " + nomDossier + ":");
                for (File fichier : contenu) {
                    System.out.println(fichier.getName());
                }
            } else {
                System.out.println("Le dossier est vide.");
            }
        } else {
            System.out.println("Le dossier specifie n'existe pas.");
        }
    }

    // Méthode pour supprimer un dossier
    public static void supprimerDossier(String nomDossier) {
        File dossier = new File(nomDossier);
        
        // Vérifier si le dossier existe
        if (dossier.exists() && dossier.isDirectory()) {
            if (dossier.delete()) {
                System.out.println("Dossier supprime avec succes: " + nomDossier);
            } else {
                System.out.println("Impossible de supprimer le dossier.");
            }
        } else {
            System.out.println("Le dossier specifie n'existe pas.");
        }
    }
    public static void main(String[] args) {
        // Nom du dossier à créer
        String nomDossier = "NewFolder";

        // Test de création du dossier
        creerDossier(nomDossier);

        // Test d'affichage du contenu du dossier
        afficherContenuDossier(nomDossier);

        // Test de suppression du dossier
        //supprimerDossier(nomDossier);
    }
}
