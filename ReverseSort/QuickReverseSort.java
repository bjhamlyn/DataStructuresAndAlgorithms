public class QuickReverseSort {
    public static void QuickReverseSort(String[] arr) {
        long count = 0; // initialize the comparison count
        QuickReverseSortHelper(arr, 0, arr.length - 1, count);
        System.out.println("\nNumber of comparisons: " + count);
    }
    
    public static void QuickReverseSortHelper(String[] arr, int start, int end, long count) {
        if (start < end) { // only need to do work if there are at least two elements in the current slice
            int q = ReversePartition(arr, start, end, count);
            QuickReverseSortHelper(arr, start, q - 1, count); // recursively sort the first "half" (ideally)
            QuickReverseSortHelper(arr, q + 1, end, count); // recursively sort the second "half" (ideally)
        }
    }
    
    public static int ReversePartition(String[] arr, int start, int end, long count) {
        int i = start - 1;
        String pivot = arr[end];
    
        for (int j = start; j <= end - 1; j++) {
            if (arr[j].compareTo(pivot) >= 0) {
                i++;
                // swap elements at position i and j
                String tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            count++; // increment the comparison count
        }
        i++;
        // swap elements with position i with pivot
        arr[end] = arr[i];
        arr[i] = pivot;
    
        // return the new postion for pivot
        return i;
    }
     
}
