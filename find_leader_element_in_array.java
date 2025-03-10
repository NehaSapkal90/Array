package ARRAY;

public class find_leader_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to print all the LEADERS in thearray.
//		Note: An element is leader if it is greater than all the elements to its right side

		int[] a = { 1, 15, 13, 4, 5 };
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}

	}

}

