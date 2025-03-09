package ARRAY;

public class Basic_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		sort the array
//		i/p :
//		int[] a= {33,78,90,20,5,50,40};
//		o/p:
//		5 20 33 40 50 78 90 

		int[] a = { 33, 78, 90, 20, 5, 50, 40 };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
