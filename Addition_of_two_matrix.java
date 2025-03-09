package ARRAY;

public class Addition_of_two_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to print the addition of two matrices.
//		i/p :
//		int[][] a={{1,2,3},
//			   {4,5,6},
//			   {7,8,9}};
//
//		int[][] b={{1,2,3},
//			   {4,5,6},
//			   {7,8,9}};

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int [][]c=new int[a.length][b.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {	
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
