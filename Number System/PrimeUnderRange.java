import java.util.Scanner;

public class PrimeUnderRange {

      //Prime number within a given range

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
        System.out.println("Enter starting range  ");
        int r1= sc.nextInt();
        System.out.println("Enter ending range ");
        int r2 = sc.nextInt();
        System.out.println("==============================");
        for(int i=r1; i<=r2; i++){

            if(isPrime(i)){
               System.out.print(i+ " ");
            }
             
        }
       

    }
    }
   

