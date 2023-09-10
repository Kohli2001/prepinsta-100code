import java.util.Scanner;

public class AbundantNum {
    // Abundant number
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Abundant Number");
        int n = sc.nextInt();
        
         int i=1 , sum=0;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
            sum-=n;
            if(sum%)

        } 

    }

