
public class QuickSort implements SortingAlgorithm {
	public void sort(int[] a) {
		int high = a.length - 1;
		//pass in array length and starting point
		quickSort(a, 0, high);
    }
	
    public void quickSort(int a[], int low, int high) {
        int i = low;
        	int j = high;
        //pivot middle
        int pivot = a[(low + high) / 2];
 
        while (i <= j) {
        		//if value is smaller than pivot, go to next
            while (a[i] < pivot) {
            	i++;
            }
            //vice versa, if value is greater go to the next
            //starts from bottom
            while (a[j] > pivot) {
                j--;
            }
            
            //compare two lists and switch if the numbers in the right side of the list is greater than the one in the left
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        
        //repeat respective sides
        if (low < j) {
            quickSort(a, low, j);
        }
        if (i < high) {
            quickSort(a, i, high);
        }
    }
	
	public void swap(int[] a, int smallest, int i) {
		int temp = a[smallest];
		a[smallest] = a[i];
		a[i] = temp;
	}
}
