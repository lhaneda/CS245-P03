
public class InsertionSort implements SortingAlgorithm {
	public void sort(int[] a) {
		//iterate till the next element is less than the previous
		//once the conditions are met, keep on moving it forward till it is in the right place
		for (int i = 1; i < a.length; i++) {
            for(int j = i; j > 0 ; j--) {
                if(a[j] < a[j - 1]) {
                	swap(a, j, j - 1);
                }
            }
        }
	}
	
	public void swap(int[] a, int smallest, int i) {
		int temp = a[smallest];
		a[smallest] = a[i];
		a[i] = temp;
	}
}
