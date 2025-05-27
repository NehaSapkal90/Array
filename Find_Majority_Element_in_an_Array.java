package Array_Variation;

public class Find_Majority_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to find the majority element (an element that appears more than n/2 times) 
//		in an integer array.
//		Input: 
//		     int[] a = {3, 3, 4, 2, 4, 4, 2, 4};
//		Output:
//		     Majority Element: 4
		
		int[] a = {3, 3, 4, 2, 4, 4, 2, 4};
		
		int max=0;
		int ch=0;
		for(int i=0; i<a.length; i++) {
			int cnt=0;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					cnt++;
				}
			}
			
			if(cnt==0) {
				int count=0;
				for(int j=0; j<a.length; j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				if(count>max) {
					max=count;
					ch=a[i];
				}
			
		}
			System.out.println(a[0]);
		}
		

	}

}
