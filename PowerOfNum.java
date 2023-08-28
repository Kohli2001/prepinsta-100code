import java.util.Scanner;

public class PowerOfNum {
    //Power of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a exp to find power ");
        int exp = sc.nextInt();
        System.out.println("Enter a base to find power ");
        int base = sc.nextInt();

        int power=1;
        for(int i =1; i<=exp; i++){
            power*=base;
        }
        System.out.println(power);
    }
}
