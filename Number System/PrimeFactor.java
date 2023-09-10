import java.util.Scanner;

public class PrimeFactor {
    //Finding Prime Factors of a number :

    static boolean isPrime(int n){
         int c=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                c++;
            }
        }
         return c==2?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Prime factors");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        int fac=0;
        for(int i=2; i<=n; i++){
            if(isPrime(n)==true){
                int x = n;
                while(x%i==0){
                    System.out.print(i + " ");
                    x /= i;
                 }
            }
        }
        System.out.println(fac);

       

    }
}
