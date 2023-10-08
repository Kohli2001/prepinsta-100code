package codePreArrays;

public class Qno1 {
	
	static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		//Find Largest element in an array
		
		int [] arr= {12,22,33,4,78,12};
		
		sort(arr);
		
		System.out.println("Largest element of given array "+arr[arr.length-1]);
		
	}

}
