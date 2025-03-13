package ARRAY;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		implement insertion Sort.
//		i/p : int[] a= {33,5,3,4,44,56,88,13,55,67};
//		o/p : 3 4 5 13 33 44 55 56 67 88 
		int[] a= {33,5,3,4,44,56,88,13,55,67};
		
		for(int i=0; i<a.length; i++)
		{
			int j=i;
			int temp=a[i];
			while( j>0&&a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		
		}

	}

}
