import java.util.Scanner;

public class GreatestAmongThree {
    //Greatest of the Three numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second  number");
        int n2 = sc.nextInt(); 
        System.out.println("Enter the Third number");
        int n3 = sc.nextInt();

        if(n1>=n2 && n1>=n3){
            System.out.println("Greatest Number is " +n1);

        }
        else if(n2>=n3){
            System.out.println("Greatest number is " +n2);
        }
        else{
            System.out.println("Greatest number is "+n3);
        }

    }
}
