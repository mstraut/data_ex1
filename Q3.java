/**
 * 
 */
package a1;


import static org.junit.Assert.*;

public class Q3 {

	// Return the number of ways to choose a subset of k distinct elements from a set of n elements
	public static int C(int n, int k) {
		// checks for the boundaries for k, 0<k<n
		if (k <= 0 || k >= n) {
			return 1;
			//else, it returns: (n, k) = (n - 1, k - 1) + (n - 1, k) for 0 < k < n
		} else {
			int totalNK = C(n - 1, k - 1) + C(n - 1, k);
			return totalNK;
		}

	}

	public static void main(String[] args) {
		System.out.println("Testing...");
		assertEquals(C(14, 3), 364);
		assertEquals(C(14, 11), 364);
		assertEquals(C(18, 8), 43758);
		System.out.println("Success!");

	}

}