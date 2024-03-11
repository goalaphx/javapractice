public class Vehicule {
    private String matricule;
    private String nomEmploye;
    private EtatVehicule etat;

    public enum EtatVehicule {
        EN_SERVICE,
        EN_PANNE,
        EN_ENTRETIEN
    }
    
    public Vehicule(String matricule) {
        this.matricule = matricule;
        this.nomEmploye = null; // Aucun employé affecté initialement
        this.etat = EtatVehicule.EN_SERVICE; // État par défaut : en service
    }

    public void affecter(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }



    public String toString() {
        return "Matricule: " + matricule + ", Employé: " + (nomEmploye != null ? nomEmploye : "Non affecté") + ", État: " + etat;
    }
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public EtatVehicule getEtat() {
        return etat;
    }

    public void setEtat(EtatVehicule etat) {
        this.etat = etat;
    }
}

  
    

