import java.util.Scanner;
class Question2{
    public static void main(String[] args) {

        //to find Prime number
        while(true){

       
        System.out.println("enter a number");
        Scanner sc  = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count+=1;
            }
        }
         if(count==2){
                System.out.println("Prime number");
            
            }
            else{
                System.out.println("Not prime");
            }


    }
}
}





















        // if(num%1==0 && num%num==0){
        // for(int i=2; i<=2; i++){
            
        // }
        //    System.out.println("prime number");
        // }
        // else if(num>2){
        //     System.out.println("not prime ");
    
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // boolean isPrime = true;

        // if (number <= 2) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= number / 2; i++) {
        //         if (number % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }

        // if (isPrime) {
        //     System.out.println(number + " is a prime number.");
        // } else {
        //     System.out.println(number + " is not a prime number.");
        // }
        
