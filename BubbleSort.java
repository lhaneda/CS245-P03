
public class BubbleSort implements SortingAlgorithm {
	//keep pushing elements that are greater than the next to the bottom of the list
	public void sort(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {
					swap(a, j , j + 1);
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
