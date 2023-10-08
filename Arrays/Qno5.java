package codePreArrays;

public class Qno5 {
	
	static void sortAcen(int[] arr) {
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
	static void sortdecen(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	//Sort first half in ascending order and second half in descending :
	public static void main(String[] args) {
		
		int[] arr= {12,13,44,55,2,87};
		
		  int n= arr.length/2;
		  for(int i=0 ; i<arr.length/2; i++) {
			  sortAcen(arr);
		  }
		  
		
		sortAcen(arr);
		for(int ele: arr) {
			System.out.println(ele);
		}
//		System.out.println("========= Decending=====================");
//		sortdecen(arr);
//		for(int ele:arr) {
//			System.out.println(ele);
//		}
		
	}
}
