import java.util.Scanner;

public class PerfectSq {
    //Perfect Square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check perfect sq.");
        int n = sc.nextInt(); 
        int c=0;
        for(int i=1; i<=n; i++){
            if(n==i*i){
                c++;
            }
        }
       System.out.println(c==1?"Perfect Square":"Not Perfect Sq.");
    }
}
