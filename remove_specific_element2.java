package ARRAY;

public class remove_specific_element2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to remove a specific element from anarray
//		i/p :
//		int[] a= {33,7,90,20,5,50,78,40};
//				int ele=78;
//		o/p :
//		33 7 90 20 5 50 40 
//		 

		int[] a = { 33, 7, 90, 20, 5, 50, 78, 40 };
		int ele = 78;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				count++;
			}
		}
		int b[] = new int[a.length - count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (ele != a[i]) {
				b[index++] = a[i];
			}
		}
		for (int num : b) {
			System.out.print(num + " ");
		}

	}

}
