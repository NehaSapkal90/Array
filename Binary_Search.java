package ARRAY;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method

//		Write a program to perform binary search.
//		 i/p: int[] a={23,45,67,88,90};
//		    int num=90;
//
//		o/p:  found at index 4

		int[] a = { 23, 45, 67, 88, 90 };
		int num = 90;
		int start = 0;
		int end = a.length - 1;

		int mid = (start + end) / 2;
		while (start <= end) {
			if (num < a[mid]) {
				end = mid - 1;
			} else if (num == a[mid]) {
				System.out.println("found at index " + mid);
				break;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		if (start > end) {
			System.out.println("index not found");
		}
	}

}
