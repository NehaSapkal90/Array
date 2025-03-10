package ARRAY;

public class check_equality_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to test the equality of two arrays 
//		i/p :
//		int[] a= {1,2,3,4,5};
//				int[] b= {1,2,3,5,4};
//		o/p :- 
//		not same
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,5,4};
		int count=0;
		if(a.length==b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==b[i]) {
					count++;
				}
			}
			
		}
		if(count==a.length) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}

	}

}
