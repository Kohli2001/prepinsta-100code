import java.util.Scanner;

public class SumOfNatural {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
         int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum og natural number upto" +n+ " :" +sum);
    }
    
}
