//for this assignment, I removed some of the code from class that was not relevant to this 
//homework assignment such as the information about computers, or the array of integers

import java.util.Arrays;

public class ReverseSorting {
    public static void BubbleReverseSort(String[] arr) {
        // Sort an array of Strings using the bubble sort algorithm in reverse order
        long count = 0;
        for(int time = 0; time < arr.length-1; time++) {
            boolean anySwaps = false;
            for(int i = 0; i < arr.length-1-time; i++) {
                // compare elements in reverse order
                if(arr[i].compareTo(arr[i+1]) < 0) { 
                    anySwaps = true; 
                    String tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
                count++;
            }
            if(!anySwaps) {
                break;
            }
        }
        // display the number of comparisons performed
        System.out.println("Bubble sort comparisons: " + count);
    }

    public static void MergeReverseSort(String[] arr){
        // Sort an array of Strings using the merge sort algorithm in reverse order
        long count = 0;
        String[] tmp = new String[arr.length];
        MergeReverseSortHelper(arr, 0, arr.length-1, tmp, count);
        // display the number of comparisons performed
        System.out.println("Merge sort comparisons: " + count);
    }

    private static void MergeReverseSortHelper(String[] arr, int start, int end, String[] tmp, long count){
        if(start < end){
            int mid = (start + end) / 2;
            MergeReverseSortHelper(arr, start, mid, tmp, count);
            MergeReverseSortHelper(arr, mid+1, end, tmp, count);
            MergeReverse(arr, start, mid, end, tmp, count);
        }
    }

    private static void MergeReverse(String[] arr, int start, int mid, int end, String[] tmp, long count){
        // merge two sorted arrays into a single sorted array in reverse order
        int i = start;
        int j = mid+1;
        int k = start;
        while(i <= mid && j <= end){
            if(arr[i].compareTo(arr[j]) > 0){
                tmp[k++] = arr[i++];
            }
            else{
                tmp[k++] = arr[j++];
            }
            count++;
        }
        while(i <= mid){
            tmp[k++] = arr[i++];
        }
        while(j <= end){
            tmp[k++] = arr[j++];
        }
        for(i = start; i <= end; i++){
            arr[i] = tmp[i];
        }
    }

    public static void QuickReverseSort(String[] arr) {
        // Sort an array of Strings using the quick sort algorithm in reverse order
        long count = 0;
        QuickReverseSortHelper(arr, 0, arr.length - 1, count);
        // display the number of comparisons performed
        System.out.println("Quick sort comparisons: " + count);
    }

    private static void QuickReverseSortHelper(String[] arr, int start, int end, long count) {
        if (start < end) {
            int q = ReversePartition(arr, start, end, count);
            QuickReverseSortHelper(arr, start, q - 1, count);
            QuickReverseSortHelper(arr, q + 1, end, count);
        }
    }

    private static int ReversePartition(String[] arr, int start, int end, long count) {
        // partition an array in reverse order
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
