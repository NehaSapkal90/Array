package ARRAY;

public class removeduplicateprint_unique_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to remove the duplicate elements of a given array and return the new length of the array
//				i/p : int[] a = {2,1,5,4,3,2,1,6,4,2};
//				o/p : new length of array : 6
		int[] a = { 2, 1, 5, 4, 3, 2, 1, 6, 4, 2 };
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			int cnt=0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}       
			if(cnt==0)
			{
				count++;
			}
		}
		System.out.println("new length of array : "+count);

	}

}
