import java.util.Scanner;

 
    public void envers(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)  return;
        envers();
        System.out.println();
        sc.close();
        return;
        
    }
    public void main(String[] args) {
        envers();
    }
    
