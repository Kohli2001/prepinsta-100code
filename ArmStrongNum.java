import java.util.Scanner;

public class ArmStrongNum {

    static int power(int exp, int base){

        int pow=1;
        for(int i=1; i<=exp; i++){
            pow=pow*base;
        }
        return pow;
    }

    static int Digitcount(int n){
        int r=0, c=0;
        while(n!=0){
            r=n%10;
            c++;
            n=n/10;
        }
        return c;
    }

    //Armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Armstrong num");
        int n = sc.nextInt();
        int m = n;

        int r =0 , exp=Digitcount(n), sum=0;
        while(n!=0){
            
            r=n%10;
            sum=sum+power(exp,r);
            n=n/10;
        }
        System.out.println(sum==m? "Armstrong" :"Not Armstrong");

    }
}
