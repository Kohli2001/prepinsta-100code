public class FriendlyPair {

    static int factSum(int n){
        int sum=0;
        for(int i=1; i<=n-1 ; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
         int n=30, n2=140;

         int sum1= factSum(n);
         int sum2 = factSum(n2);
       
         System.out.println(sum1);
    }
    
}
