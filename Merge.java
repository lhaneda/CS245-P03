
public class Merge implements SortingAlgorithm {
	public void sort(int[] a) {
        int high = a.length;
        mergesort(a, 0, high - 1);
    }

    private void mergesort(int[] a, int low, int high) {
        if (low < high) { //base
            int middle = low + (high - low) / 2;
            //keep splitting left side
            mergesort(a, low, middle);
            //keep taking right side
            mergesort(a, middle + 1, high);
            merge(a, low, middle, high);
        }
    }

    private void merge(int[] a, int low, int middle, int high) {
    		//copy all to a separate array
    		int[] b = new int[a.length];
        for (int i = low; i <= high; i++) {
            b[i] = a[i];
        }
        
        int i = low;
        int j = middle + 1;
        int k = low;
        //get the smallest elements of the arrays
        while (i <= middle && j <= high) {
            if (b[i] <= b[j]) {
                a[k] = b[i];
                i++;
            } else {
                a[k] = b[j];
                j++;
            }
            k++;
        }
        
        //copy the rest of the elements
        while (i <= middle) {
            a[k] = b[i];
            k++;
            i++;
        }
    }
}
