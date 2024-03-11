public class Main {
    public static void main(String[] args) {
        // Vérifier qu'au moins un mot est passé en argument
        if (args.length < 2) {
            System.out.println("Usage: java Main <mot à chercher> <mots à insérer...>");
            return;
        }

        // Création d'un nouveau dictionnaire
        Dico d = new Dico();

        // Récupérer le mot à chercher
        String motAChercher = args[0];

        // Insérer les mots suivants dans le dictionnaire
        for (int i = 1; i < args.length; i++) {
            Dico.inserer(d, args[i]);
        }

        // Vérifier si le mot à chercher est présent dans le dictionnaire
        boolean existe = Dico.existe(d, motAChercher);
        if (existe) {
            System.out.println("Le mot '" + motAChercher + "' existe dans le dictionnaire.");
        } else {
            System.out.println("Le mot '" + motAChercher + "' n'existe pas dans le dictionnaire.");
        }
    }
}