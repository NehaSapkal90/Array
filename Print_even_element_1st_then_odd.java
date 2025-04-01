package ARRAY;

public class Print_even_element_1st_then_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to separate even and odd numbers of an given array of integers. Put all even numbers first, and 
//		then oddnumbers.
//		i/p : int[] a={5,3,12,3,7,5,34,6,78,9}; 
//		o/p :
//		12 
//		34 
//		6 
//		78 
//		5 
//		3 
//		3 
//		7 
//		5 
//		9 

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] b=new int[a.length];

		int index=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]+ " ");
		}
	}

}
