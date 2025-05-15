package algo.sorting;

/**
 * Sort an array containing integers in ascending order
 * (arranged from smallest to largest) using the insertion sort algorithm.
 *
 *
 * Total tidskomplexitet: O(n^2)
 */
public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] unsorted) {
		int n = unsorted.length;
		for(int i = 1; i < n; i++) { //O(n)
			int key = unsorted[i];
			int j = i-1;
			while(j>=0 && unsorted[j]>key) { //O(n)
				unsorted[j+1] = unsorted[j];
				j = j-1;
			}
			unsorted[j+1] = key; //O(1)
		}
		return unsorted;
	}	
}