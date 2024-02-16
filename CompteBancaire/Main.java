public class Main {
    public static void main(String[] args) {
        CompteBancaire cb = new CompteBancaire("Khalid");
        System.out.println(cb);
        System.out.println("Nbre Comptes =" + cb.getNbcomptes());
        cb.operation();
    }
}