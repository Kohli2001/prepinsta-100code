import java.util.Scanner;

public class PerfectNum {

    static int isfactors(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
              sum=sum+i;
            }
            
        }
        return sum;  
    }
    //Perfect number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Strong Number");
        int n = sc.nextInt(), m=n;
       
        if(isfactors(n)==n){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
      





        
    }
    
}
