package ARRAY;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Remove duplicate element from an array
//		i/p :
//		int[] a= {1,2,3,2,3};
//		o/p
//		1 2 3 
		
		int[] a= {1,2,3,2,3};
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
				System.out.print(a[i]+ " ");
			}
		}
	

	}

}
