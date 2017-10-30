
public class SelectionSort implements SortingAlgorithm {
	//swap smallest element in the array with the first
	public void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int smallest = smallest(a, i);
			swap(a, smallest, i);
		}
	}
	
	//find smallest element in array
	public int smallest(int[] a, int start) {
		int smallest = start;
		for(int i = start + 1; i < a.length; i++) {
			if(a[i] < a[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}
	
	public void swap(int[] a, int smallest, int i) {
		int temp = a[smallest];
		a[smallest] = a[i];
		a[i] = temp;
	}
}
