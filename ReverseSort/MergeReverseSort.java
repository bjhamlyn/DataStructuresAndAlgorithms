public class MergeReverseSort {
    public static void MergeReverseSort(String[] arr){
        long count = 0;
        String[] tmp = new String[arr.length];
        MergeReverseSortHelper(arr, 0, arr.length-1, tmp, count);
        System.out.println("Number of comparisons: " + count);
    }
    
    public static void MergeReverseSortHelper(String[] arr, int start, int end, String[] tmp, long count){
        if(start < end){
            int mid = (start + end) / 2;
            MergeReverseSortHelper(arr, start, mid, tmp, count);
            MergeReverseSortHelper(arr, mid+1, end, tmp, count);
            MergeReverse(arr, start, mid, end, tmp, count);
        }
    }
    
    public static void MergeReverse(String[] arr, int start, int mid, int end, String[] tmp, long count){
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
    
}
