package ARRAY;

public class EVEN_ODD_POSITIVE_NEGATIVE_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find even, odd, positive, negative elements in an array

		int[] a = { 11, 22, 33, 44, 55, 66, -77, 88 };
		int count = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even Count  " + even);
		System.out.println("Odd Count " + odd);
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				pos++;
			} else {
				neg++;
			}
		}
		System.out.println("Positive Count " + pos);
		System.out.println("Negative Count " + neg);

	}

}
