

package ARRAY;

public class printMax_ELement_of_Matrix_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find maximum element in a matrix
//		i/p int[][] a= {{1,2,3},
//				{4,23,5},
//				{5,4,7}};
//		o/p : 23;
		
		
		int[][] a= {{1,2,3},
				{4,23,5},
				{5,4,7}};
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
			
		}
		System.out.println(max);
		
	}

}
