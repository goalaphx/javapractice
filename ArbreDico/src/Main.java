public class Main {
    public static void main(String[] args) {
        // Création d'un nouveau dictionnaire
        Dico d = new Dico();

        // Insérer quelques mots dans le dictionnaire
        Dico.inserer(d, "dog");
        Dico.inserer(d, "fish");
        Dico.inserer(d, "bird");

        // Mot à rechercher (premier argument passé en ligne de commande)
        String motAChercher = args[0];

        // Vérifier si le mot à chercher est présent dans le dictionnaire
        boolean existe = Dico.existe(d, motAChercher);
        if (existe) {
            System.out.println("Le mot '" + motAChercher + "' existe dans le dictionnaire.");
        } else {
            System.out.println("Le mot '" + motAChercher + "' n'existe pas dans le dictionnaire.");
        }
    }
}
