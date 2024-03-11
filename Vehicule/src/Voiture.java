public class Voiture extends Vehicule {
    private int nombrePlaces;

    public Voiture(String matricule, int nombrePlaces) {
        super(matricule);
        this.nombrePlaces = nombrePlaces;
    }

    @Override
    public String toString() {
        return "Type: Voiture, " + super.toString() + ", Nombre de places: " + nombrePlaces;
    }
}