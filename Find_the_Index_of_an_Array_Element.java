package Array_Variation;

public class Find_the_Index_of_an_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Problem Statement: Given an array of N integers and a specific value, find the index of that value in the array. If the value is not found, return -1.
//				Input:
//				N = 6
//				arr[] = {3, 7, 1, 9, 5, 4}
//				value = 9
//				Output:
//				Index of the value: 3

		int arr[] = { 3, 7, 1, 9, 5, 4 };
		int value = 9;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==value) {
				System.out.println("Index of the value: "+i);
			}
		}

	}

}
