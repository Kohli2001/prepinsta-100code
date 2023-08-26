import java.util.Scanner;

public class Palindrom {
    //Palindrome number:

    static int isReverse(int n ){
        int rev=0, r=0;
        while(n!=0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrom num");
        int n = sc.nextInt();
        if(isReverse(n)==n){
            System.out.println("Palindrom number");
        }
        else{
            System.out.println("Not Palindrom number");
        }
    }
}
