import java.util.Scanner;

public class LeapYear {
    //Leap year or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year");
        int year = sc.nextInt(); 
        if(year%400==0 || year%4==0&& year%100!=0){
            System.out.println("Leap Year..........");
        }
        else{
            System.out.println("Not Leap Year............");
        }

    }
}
