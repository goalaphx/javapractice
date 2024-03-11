import java.util.ArrayList;

public class Flotte {
    private ArrayList<Vehicule> vehicules;

    public Flotte() {
        this.vehicules = new ArrayList<>();
    }

    public void ajouter(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    public Vehicule chercher(String critere) {
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getMatricule().equals(critere) || (vehicule.getNomEmploye() != null && vehicule.getNomEmploye().equals(critere))) {
                return vehicule;
            }
        }
        return null; // Return null if no vehicle found matching the criteria
    }

    public void lister() {
        for (Vehicule vehicule : vehicules) {
            System.out.println(vehicule.toString());
        }
    }
}
