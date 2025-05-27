package Array_Variation;

public class calculate_Mean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Given the marks of N students in an Array A, calculate the mean.
//		Note: If result is a Decimal Value, find it's floor Value.
//
//		Example 1:
//		Input:
//		N = 4 
//		A = { 56 , 67 , 30 , 79 }
//		Output:
//		58
//		Explanation:
//		56+67+30+79 = 232;  232/4 = 58.
//		So, the Output is 58.
//
//		Example 2:
//		Input:
//		N = 4 
//		A = { 78 , 89 , 67 , 76 }
//		Output:
//		77
//		Explanation:
//		78+89+67+76  = 310;  310/4 = 77.5 = 77.
//		So, the Output is 77.
		
		int [] a = { 78 , 89 , 67 , 76 };
		
		int count=0;
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			count++;
		}
		System.out.println(sum/count);

	}

}
