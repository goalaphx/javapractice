import java.util.Scanner;

public class CompteCourant  extends CompteBancaire {
    private double seuil;
    public CompteCourant(String proprietaire,double seuil){
        super(proprietaire);
        Scanner sc = new Scanner(System.in);
        System.out.println("Seuil Negatif= ");
        seuil = sc.nextDouble();
        
    }
    public String toString (){
        String st = super.toString(); //appel de la fonction membre de la classe parente
       st += "Seuil: "+ seuil + "\n";
       return st;
    }    
    
    public boolean retirer(){
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Somme a Retirer");
        s = sc.nextDouble();
        if(s> getSolde() + seuil){
        System.out.println("solde insuffisant");
        sc.close();
        return false;}
        else{
        setSolde(getSolde() - s);
        sc.close();
        return true;
        }
        

    }
}
