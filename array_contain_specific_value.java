package ARRAY;

public class array_contain_specific_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to test if an array contains a specificvalue
//		i/p :
//		int[] a= {33,7,90,20,5,50,40};
//				int ele=7;
//		o/p
//		found
		
		int[] a= {33,7,90,20,5,50,40};
		int ele=7;
		int  count=0;
		for(int i=0; i<a.length; i++) {
			if(ele==a[i]) {
				count++;
			}
		}
		if(count!=0) {
			System.out.println("found");
		}else{
			System.out.println("not found");
		}
	}

}
