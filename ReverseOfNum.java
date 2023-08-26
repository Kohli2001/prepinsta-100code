import java.util.Scanner;

public class ReverseOfNum {
    //Reverse of a number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Digit to find sum");
        int n = sc.nextInt();
        int r=0 , rev=0;
        while(n!=0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println("Reverse of number is: " +rev);
    }
}
