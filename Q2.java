/**
 * 
 */
package a1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q2 {

	// Return all sums that can be formed from subsets of elements in arr
	public static ArrayList<Integer> allSums(ArrayList<Integer> arr) {
		ArrayList<Integer> arrayListSum = new ArrayList<Integer>();
		int num = arr.size() - 1;
		// if arr isn't empty
		if (!arr.isEmpty()) {
			ArrayList<Integer> arrSublist = new ArrayList<Integer>(arr.subList(0, num)); // sublist of arr
			ArrayList<Integer> aLtemp = allSums(arrSublist); // aLtemp, created sending arrSublist into allSums
			arrayListSum.addAll(aLtemp); // values listed within aLtemp are added to arrayListSum
			int intEnd = arr.get(num); // last int in arr
			/*
			 * for loop, the next end integer is selected and added to the integer of each
			 * ArrayList item. Then added into arrayListSum as new ArrayList items
			 */
			for (int i = 0; i < aLtemp.size(); i++) {
				int temp = aLtemp.get(i); // current int in the ArrayList
				arrayListSum.add(temp + intEnd); // new sum is being added
			}
			// else, when arr is empty, 0 is added and arrayListSum returned
		} else {
			arrayListSum.add(0);
			return arrayListSum;
		}
		return arrayListSum;
	}

	public static void main(String[] args) {
		// https://www.baeldung.com/java-file-to-arraylist

		ArrayList<Integer> result = new ArrayList<Integer>(); // = Files.readAllLines(Paths.get("nums.txt"));
		try {
			BufferedReader br = new BufferedReader(new FileReader("nums.txt"));
			while (br.ready()) {
				int temp = Integer.parseInt(br.readLine());
				result.add(temp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		ArrayList<Integer> sums = allSums(result);
		System.out.println(sums);
		assertEquals(sums.size(), 8);
		assertEquals(sums.contains(0), true);
		assertEquals(sums.contains(1), true);
		assertEquals(sums.contains(2), true);
		assertEquals(sums.contains(4), true);
		assertEquals(sums.contains(3), true);
		assertEquals(sums.contains(5), true);
		assertEquals(sums.contains(6), true);
		assertEquals(sums.contains(7), true);
		System.out.println("Success!");
	}
}

