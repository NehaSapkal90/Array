package Array_Variation;

public class Calculate_Cumulative_Sum_of_an_Array {
//	Write a program to calculate the cumulative sum of an integer array.
//	Input: 
//	    int[] a = {1, 2, 3, 4};
//	Output:
//	    Cumulative Sum: [1, 3, 6, 10]
//	Explanation:
//	1 2 3 4
//	1 = 1
//	1+2 = 3
//	1+2+3 = 6
//	1+2+3+4 = 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a = {1, 2, 3, 4};
		int sum=0;
		System.out.print("Cumulative sum: [");
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
			System.out.print(sum);
			if(i<a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

}
