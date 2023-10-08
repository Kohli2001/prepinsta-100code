package codePreArrays;

public class Qno7 {
	//Finding the Longest Palindrome in an Array 
	static boolean isPalindrome(int n) {
		int m=n;
		int rev=0 ,r=0 , c=0;
		while(n!=0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(rev==m) {
			c++;
		}
		return c==1;

	}
	public static void main(String[] args) {
		int[] arr= {8373, 212,2002,303};
		
		for(int i=0 ; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		boolean count= true;
		for(int ele: arr) {
			
			count = isPalindrome(ele);
			
		if(count==true) {
			
			System.out.println(ele);
			break;
			
		}
	}
		
	}

}
