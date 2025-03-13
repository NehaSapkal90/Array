package ARRAY;

public class Interleaving_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s1[] = { 'a', 'b', 'c' };// s1[3]
		char s2[] = { 'x', 'y', 'z' };
		
		char c[]=new char[s1.length+s2.length];
		int index=0;
		for(int i=0; i<s1.length||i<s2.length; i++) {
			if(i<s1.length) {
				c[index++]=s1[i];
			}
			if(i<s2.length) {
				c[index++]=s2[i];
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+ " ");
		}
		

	}

}
