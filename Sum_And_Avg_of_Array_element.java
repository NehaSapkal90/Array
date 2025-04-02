package ARRAY;

public class Sum_And_Avg_of_Array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to calculate sum and average of array elements
//		i/p : int[] a= {1,2,3,4,5,6,7,8};
//		o/p :
//		36
//		4.0

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		float sum = 0;
		float count = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			count++;

		}
		System.out.println(sum);
		float avg = sum / count;
		System.out.println(avg);
	}

}
