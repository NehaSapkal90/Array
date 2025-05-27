package Array_Variation;

public class Create_an_Array_of_Squares_of_Given_Array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to create an array of the squares of the elements in the given array.
//		Input: 
//		    int[] a = {1, 2, 3, 4};
//		Output:
//		    Squared Array: [1, 4, 9, 16]
		
		int[] a = {1, 2, 3, 4};
		int squre=0;
		System.out.print("Squared Array: [");
		for(int i=0; i<a.length; i++) {
			squre=a[i]*a[i];
			System.out.print(squre);
			if(i<a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

}
