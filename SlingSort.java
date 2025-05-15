package algo.sorting;
import java.util.*;
import java.util.Arrays;



/**
 * Sort an array containing integers in ascending order
 * (arranged from smallest to largest) using the Sling sort algorithm.
 * This array will be sorted: {2, 4, 1, 4}
 *
 *                 {2, 4, 1, 4}
 *                 {1, 2, 4, 4}
 *
 *                 Total time complexity: O(n)
 *
 */
public class SlingSort implements Sort {

	@Override
	public int[] sort(int[] array) {
		int n = array.length; //O(1)
		int m = 0; //O(1)

		for (int i = 0; i < n; i++) { //O(n)
			m = Math.max(m, array[i]);
		}

		int[] countArray = new int[m + 1];

		for (int i = 0; i < n; i++) { //O(n)
			countArray[array[i]]++;
		}

		for (int i = 1; i <= m; i++) { //O(n)
			countArray[i] += countArray[i - 1];
		}

		int[] outputArray = new int[n];

		for (int i = n - 1; i >= 0; i--) { //O(n)
			outputArray[countArray[array[i]] - 1] = array[i];
			countArray[array[i]]--;
		}

		return outputArray;
	}

	public static void main(String[] args) {
		int[] inputArray = {2, 4, 1, 4};
		SlingSort slingSort = new SlingSort();
		int[] outputArray = slingSort.sort(inputArray); //O(n)

		for (int i = 0; i < outputArray.length; i++) { //O(n)
			System.out.print(outputArray[i] + " ");
		}
	}
}
