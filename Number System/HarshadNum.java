import java.util.Scanner;

public class HarshadNum {
    // Harshad number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Harshad Number");
        int n = sc.nextInt(); 
        int m=n;
        int r=0, sum=0;
        while(n!=0){
            r=n%10;
            sum+=r;
            n=n/10;

        }
          System.out.println(m%sum==0?"Harshad Number":"Not Harshad Number");
        }

       
    }
