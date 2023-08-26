import java.util.Scanner;

public class PrimeNumber {

    static String isprime(int n){
        int c=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){

                 c++;
            }
           
        }
        return c==2? "Prime Number":"Not Prime Number";
    }
    //Prime number:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt(); 
        System.out.println(isprime(n));

    }
}
