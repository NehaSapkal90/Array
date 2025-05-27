package Array_Variation;

public class Find_the_Second_Smallest_Element_in_an_Array {

	public static void main(String[] args) {
	
//		 Given an array of integers, find the second smallest element.
//		 Input:
//		 arr[] = {5, 2, 8, 3, 9, 1}
//		 Output:
//		 Second smallest element: 2
		
		int arr[] = {5, 2, 8, 3, 9, 1};
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print("Second smallest element: ");
		int min1=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=min&&arr[i]<min1) {
				min1=arr[i];
			}
		}
		System.out.println(min1);

	}

}
