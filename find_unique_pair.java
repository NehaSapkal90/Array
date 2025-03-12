package ARRAY;

public class find_unique_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Number of unique pairsin an array. Give nan array of N elements, that ask isto find all the unique pairs that can be 
//		formed using the elements of a given array.
//		Examples: Input: arr[] = {1, 2, 1}
//		Output: 4
//		(1, 1), (1, 2), (2, 1), (2, 2) are the only possible pairs.
		int a[] = {1, 2, 1};
		
		int cnt =0;
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				cnt++;
			}
		}
		int b[]=new int[cnt];
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}
	}

}
