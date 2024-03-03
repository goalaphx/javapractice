import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pile {
    public int sommet;
    public ArrayList<Double> contenu;
    public String nomDescriptif;

    public Pile(String nomDescriptif) {
        this.nomDescriptif = nomDescriptif;
        this.sommet = -1;
        this.contenu = new ArrayList<Double>();
    }

    public void empiler(double x) {
        contenu.add(x);
        sommet++;
    }

    public double depiler() {
        if (sommet == -1) {
            throw new EmptyStackException();
        } else {
            double elementDepile = contenu.get(sommet);
            contenu.remove(sommet);
            sommet--;
            return elementDepile;
        }
    }

    public double sommet() {
        if (sommet == -1) {
            throw new EmptyStackException();
        } else {
            return contenu.get(sommet);
        }
    }

    public boolean estVide() {
        return sommet == -1;
    }

    public int taille() {
        return sommet + 1;
    }

   /*  public static void main(String[] args) {
        Pile pile = new Pile("MaPile");
        pile.empiler(1);
        pile.empiler(2);
        pile.empiler(3);
        pile.depiler();
        pile.depiler();
        System.out.println(pile.nomDescriptif);
        System.out.println(pile.contenu);
    }*/
}
