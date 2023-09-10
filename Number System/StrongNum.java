import java.util.Scanner;

public class StrongNum {

    static int fact(int n){
        int fac=1;
        for(int i=1; i<=n; i++){
            fac*=i;
        }
        return fac;

    }
    //Strong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Strong Number");
        int n = sc.nextInt();
        int m=n , r=0, sum=0;
        // System.out.println(fact(n));

        while(n!=0){
            r=n%10;
            sum=sum+fact(r);
            n=n/10;
        }
        if(sum==m){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }


    }
}
