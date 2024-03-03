public class HanoiPiles {

    public static void Deplacer(Pile a, Pile b){
        double Itemtomove = a.depiler();
        b.empiler(Itemtomove);
    }
    public static void Hanoi (int n, Pile x, Pile y, Pile z){
        if(n==1){
            Deplacer(x, y);
        }
        else{
            Hanoi(n-1,x,z,x);
            Deplacer(x,y);
            Hanoi(n-1,z,y,z);
        }

    }
    public static void main(String[] args) {
        Pile A = new Pile("A");
        Pile B = new Pile("B");
        Pile C = new Pile("C");
        A.empiler(1);
        A.empiler(2);
        A.empiler(3);
        A.empiler(4);
        A.empiler(5);
        Hanoi(3, A, B, C);
        System.out.println(A.contenu);
        System.out.println(B.contenu);
        System.out.println(C.contenu);
    }
    
}
