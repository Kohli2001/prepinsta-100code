import java.util.Scanner;

public class AutomorphicNum {
    // Automorphic numbe

    static int isPerfectSq(int n){
        for(int i=1; i<=n; i++){
            if(n==i*i){
                return 1;
            }
            
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Automorphic Number");
        int n = sc.nextInt(); 

        int r=0 , x=0;
        while(isPerfectSq(n)!=0){

            r=n%10;
            n=n/10;

        }
        System.out.println(r);
        // if(r==isPerfectSq(n)){
        //     System.out.println("Automorphic Number");
        // }
        // else{
        //     System.out.println("Not ");
        // }



    }
}
