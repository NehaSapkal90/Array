package ARRAY;

public class COPY_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Copy one array into another array
		int[] a={1,2,3,4,5,6,7,8};
		int index=0;
		int b[]=new int [a.length];
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		

	}

}
