import java.util.Scanner;;
class Question3{
    public static void main(String[] args) {
        //to find Leap Year
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your year");

        int year = sc.nextInt();
        if(year%4==0 ||year%100==0 || year%400==0){
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("the given number is not leap year");
        }
    


    }
}