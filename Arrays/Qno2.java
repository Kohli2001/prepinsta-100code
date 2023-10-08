package codePreArrays;

public class Qno2 {

	static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
	}
	//Find Smallest Element in an Array
	public static void main(String[] args) {
		
		int[] arr= {23,9,3,4,222,2,0};
		sort(arr);
		
		System.out.println("smallest element in array:" +arr[0]);
		
	}
}
