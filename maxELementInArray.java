package ARRAY;

public class maxELementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to find max element in an array.
//		i/p : int[] a={1,4,2,5,7,5,8,9};
//		o/p : 9
		int[] a = { 1, 4, 2, 5, 7, 5, 8, 9 };
		int max = a[0];// 1
		for (int i = 0; i < a.length; i++) {// 0<8 1<8 2<8 3<8 4<8 5<8 6<8 7<8
			if (max < a[i]) {// 1<1 1<4 4<2 4<5 5<7 7<5 7<8 8<9
				max = a[i];// 1 // 4 // 5 // 7 // 8 // 9
			}
		}
		System.out.println(max); // 9

	}

}
