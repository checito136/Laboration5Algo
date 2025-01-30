package algo.sorting;

import java.util.Random;

/**
 * Simple class to help create Arrays containing Integer values.
 */
public class NumberCreator {
	/**
	 * Create an Array of integers. If values are not randomized they will repeat the number patterns
	 * lowerBound - uppBound incremented by one for each new number.
	 *
	 * @param n amount of integers
	 * @param lowerBound lowest possible value (inclusive)
	 * @param upperBound highest possible value (inclusive)
	 * @param random true if values should be randomized and false if they should have a repeated pattern
	 * @return array of integers
	 */
	public static int[] createNumberArray(int n, int lowerBound, int upperBound, boolean random) {
		int[] numberList = new int[n];

		if(random) {
			Random rand = new Random();
			for(int i = 0; i < n; i ++) {
				numberList[i] = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
			}
		}
		else {
			for(int i = 0, j = lowerBound; i < n; i ++) {
				numberList[i] = j++;
				if(j > upperBound) {
					j = lowerBound;
				}
			}
		}
		return numberList;
	}
}