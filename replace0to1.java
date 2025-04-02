package ARRAY;

public class replace0to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Replace all 0s to 1s in an array
//		i/p :
//		int[] a={1,0,1,0,1,0,1,0};
//		o/p :
//		1 1 1 1 1 1 1 1 
		int []a= {1,0,1,0,1,0,1,0};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		for(int i= 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}


	}

}
