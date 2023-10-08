package codePreArrays;

import java.util.Arrays;

public class Qno6 {
	
	static void CountFre(int[] arr) {
		 for (int i = 0; i < arr.length; i++) {
			 int c=1;
			 while(i<arr.length-1 && arr[i]==arr[i+1]) {
				 i++;
				 c++;
			 }
			 System.out.println(arr[i]+" " +c);
			 c++;
		 }
	}

	//Finding the frequency of elements in an array
	
	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 30, 10, 20};
		Arrays.sort(arr);
		CountFre(arr);
	
	}
}
