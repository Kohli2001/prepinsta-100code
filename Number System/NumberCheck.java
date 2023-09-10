
import java.util.Scanner;
class NumberCheck{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("positive number!........");
        }
        else if(n<0){
            System.out.println("Negative number!.......");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Undefined number.....");
        }
        
    }
}