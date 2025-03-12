package ARRAY;

public class FindFrequencyOfeachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to find frequency of character in a string
//		i/p :
//		String s1 = "aabbcc";
//		o/p :
//		a 2
//		b 2
//		c 2
		String s1 = "aabbcc";

		char ch = 0;
		for (int i = 0; i < s1.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				int count = 0;
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(i) == s1.charAt(j)) {
						count++;
					}
				}
				System.out.println(s1.charAt(i) + " " + count);

			}
		}

	}

}
