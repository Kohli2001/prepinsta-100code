import java.util.Scanner;

public class GreatestNumber {
    //Greatest of two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second  number");
        int n2 = sc.nextInt();  

        System.out.println(n1>n2? "Greatest Number is "+n1 :"Greatest Number is " +n2);
    }
}
