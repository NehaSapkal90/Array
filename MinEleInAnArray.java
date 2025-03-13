package ARRAY;

public class MinEleInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to find min element in an array.
//		i/p : int[] a={1,4,2,5,7,5,8,9};
//		o/p : 1
		
		int[] a={1,4,2,5,7,5,8,9};
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);


	}

}
