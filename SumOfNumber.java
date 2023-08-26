import java.util.Scanner;

public class SumOfNumber {
    //Sum of numbers in a given range
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range number");
        int n = sc.nextInt(); 
        System.out.println("Enter last range");
        int n2 = sc.nextInt();
        int sum=0;
        for(int i=n; i<=n2; i++){
            sum+=i;

        }
        System.out.println("sum of numbers between" +n+ "to "+n2+ "is:" +sum);


    }
}
