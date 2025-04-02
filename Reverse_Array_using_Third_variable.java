package ARRAY;

public class Reverse_Array_using_Third_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {11,22,33,44,55};
		int start=0;
		int end= a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		

	}

}
