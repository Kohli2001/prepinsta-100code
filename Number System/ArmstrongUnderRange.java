import java.util.Scanner;

public class ArmstrongUnderRange {
    //Armstrong number in a given range :

    static int power(int exp, int base){
        int pow=1;
        for(int i=1; i<=exp; i++){
            pow*=base;
        }
        return base;
    }

    static int countDigit(int n){
        int r=0, c=0;
        while(n!=0){
            r=n%10;
            c++;
            n=n/10;

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range");
        int r1 = sc.nextInt();
        System.out.println("Enter upper range");
        int r2 = sc.nextInt();

        
        for(int i=r1; i<=r2; i++){
        int r=0,  sum=0 , m, exp ;
            exp=countDigit(i);
            m=i;

             while(m!=0){

                r=m%10;
                sum+=power(exp, r);
                m/=10;
        }
        if(sum==m){
            System.out.println(m +" ");
        }
    }
       
        

    }
   
}
