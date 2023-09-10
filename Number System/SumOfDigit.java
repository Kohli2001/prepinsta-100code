import java.util.Scanner;

public class SumOfDigit {
    //Sum of digits of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Digit to find sum");
        int num = sc.nextInt();
        int r=0 , sum=0;
        while(num!=0){
            r=num%10;
            sum+=r;
            num=num/10;
        }
        System.out.println(sum);
    }
}
