import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Question1{

    public static void main(String[] args) {
        //1) code to find positive and negative number //

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Entered number is POSITIVE");
        }

        else if(num==0){
                
            System.out.println("Entered number is Zero");
            
        }
        else{
            System.out.println("Entered number is NEGATIVE");
        }



    }
    
}