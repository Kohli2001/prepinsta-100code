package codePreArrays;

public class QNo3 {
	static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//Find Second Smallest Element in an Array 
	public static void main(String[] args) {
		int[] arr= {12,3,45445,677,842,89};
		
		sort(arr);
		System.out.println("Second smallest element in array "+arr[1]);
		
	}

}
