import java.util.Arrays;

public class BubbleReverseSort {
    public static void main(String[] args) {
        String[] names = {"Alice", "Charlie", "Bravo", "Zelda"};
        BubbleReverseSort(names);
        System.out.println(Arrays.toString(names));
    }

    public static void BubbleReverseSort(String[] arr) {
        long count = 0;//count the number of comparisons performed
        for(int time = 0; time < arr.length-1; time++) {
            boolean anySwaps = false;
            for(int i = 0; i < arr.length-1-time; i++) {
                //increment every time a new comparison is made
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
        //display the number of comparisons performed
        System.out.println("Number of comparisons performed: " + count);
    }
}
