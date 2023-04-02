public class SelectionReverseSort {
    public static void SelectionReverseSort(String[] arr){
        long count = 0;
        for(int start = 0; start <= arr.length-2; start++){
            int hand = start;
            for(int i = start+1; i < arr.length; i++){
                if(arr[i].compareTo(arr[hand]) > 0){
                    hand = i;
                }
                count++;
            }
            String tmp = arr[start];
            arr[start] = arr[hand];
            arr[hand] = tmp;
        }
        System.out.println("Number of comparisons: " + count);
    }
     
}
