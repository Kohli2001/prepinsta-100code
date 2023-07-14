import java.util.Scanner;
class Question2{
    public static void main(String[] args) {

        //to find Prime number
        System.out.println("enter a number");
        Scanner sc  = new Scanner(System.in);

        int num = sc.nextInt();
        
        if(num<2){
            System.out.println("The given number is a not Prime number");
        }
        for(int i=2; i<num; i++ ){
            if (num % i == 0)
             {
                System.out.println("The given number is a Prime number");
        }

        
    }
}
}