import java.util.Scanner;

public class NthFabonacci {
    //Find the Nth Term of the Fibonacci Series 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aterm to find that num from fabonacci series");
        int n = sc.nextInt();

        int n1 = 0 , n2=1 , n3=0;
        if(n==0){
            System.out.println(n1);
        }
        else if(n==1){
            System.out.println(n2);
        }
        else {
            System.out.print(n1 + " " +n2);
            for(int i=2; i<n; i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(n3+ " ");
            }
        }
    }
}
