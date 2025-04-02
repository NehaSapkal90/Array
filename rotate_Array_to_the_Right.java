package ARRAY;

public class rotate_Array_to_the_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a  program to implement Right shift of array element
//		i/p :int[] a= {3,4,5,2,3,6,7,4};
//		o/p :4 3 4 5 2 3 6 7
		
		int[] a= {3,4,5,2,3,6,7,4};
		int temp=a[a.length-1];
		for(int i=a.length-1; i>0; i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
