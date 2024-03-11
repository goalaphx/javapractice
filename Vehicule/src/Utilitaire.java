public class Utilitaire extends Vehicule {
    private double volumeCharge;
    
    public Utilitaire(String matricule, double volumeCharge) {
        super(matricule);
        this.volumeCharge = volumeCharge;
    }
    
    @Override
    public String toString() {
        return "Type: Utilitaire, " + super.toString() + ", Volume de charge: " + volumeCharge;
    }
}
    