package Array_Variation;

public class AddTwoMatricesoftheSameSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given two matrices of the same size, find their sum.
//		Input:
//		Matrix 1:
//		1 2 3
//		4 5 6
//		7 8 9
//
//		Matrix 2:
//		9 8 7
//		6 5 4
//		3 2 1
//		Output:
//		Resultant Matrix:
//		10 10 10
//		10 10 10
//		10
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		System.out.println("Resultant Matrix:");
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix2.length; j++) {
				System.out.print(matrix1[i][j]+matrix2[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
