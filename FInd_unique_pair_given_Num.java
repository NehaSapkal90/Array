
package ARRAY;

public class FInd_unique_pair_given_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	)Write a program to Find unique Pair Of Integers in Array whose Sum is Given Number. Given array 
//	: [2, 4, 3, 5, 6, -2, 4, 7, 8, 9]
//	Given sum : 7
//	Integer numbers, whose sum is equal to value : (
		int a[]= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
			int ele= 7;
		
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
		int b[]=new int[count];
		int index=0;
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
				b[index++]=a[i];
			}
		}
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i]+b[j]==ele)
				{
					System.out.println(b[i]+ " "+b[j]);
				}
			}
		}

	}

}
