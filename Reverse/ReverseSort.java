import java.util.Arrays;

enum OS {
    Windows, Linux, MacOS, MSDOS
}

class Computer implements Comparable<Computer>{
    //fields 
    public Long RAM;
    public String CPU;
    public OS os;

    @Override
    public String toString() {
        return "\nRam = " + RAM +", CPU = " + CPU +", OS = " + os;
    }

    //needs to return 0 if this == o
    //                -1 if this < o
    //                +1 if thsi > o
    @Override
    public int compareTo(Computer o) {
        return this.CPU.compareTo(o.CPU);
    }
}

public class ReverseSort {

    public static void main(String[] args) {
        // Test bubble reverse sort
        String[] names = {"Alice", "Charlie", "Bravo", "Zelda"};
        BubbleReverseSort(names);
        System.out.println(Arrays.toString(names));

        // Test selection reverse sort
        String[] names2 = {"Alice", "Charlie", "Bravo", "Zelda"};
        SelectionReverseSort(names2);
        System.out.println(Arrays.toString(names2));

        // Test merge reverse sort
        String[] names3 = {"Alice", "Charlie", "Bravo", "Zelda"};
        MergeReverseSort(names3);
        System.out.println(Arrays.toString(names3));

        // Test quick reverse sort
        String[] names4 = {"Alice", "Charlie", "Bravo", "Zelda"};
        QuickReverseSort(names4);
        System.out.println(Arrays.toString(names4));
    }

    /**
     * Sorts an array of strings in reverse using the bubble sort algorithm.
     * @param arr The array of strings to be sorted.
     */
    public static void BubbleReverseSort(String[] arr) {
        long count = 0;
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // Compare adjacent elements and swap them if they're in the wrong order
                if (arr[i - 1].compareTo(arr[i]) < 0) {
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
                count++;
            }
            n--;
        } while (swapped);
        System.out.println("Number of comparisons performed: " + count);
    }

    /**
     * Sorts an array of strings in reverse using the selection sort algorithm.
     * @param arr The array of strings to be sorted.
     */
    public static void SelectionReverseSort(String[] arr) 
    {
        long count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            // Find the index of the minimum element in the unsorted part of the array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j].compareTo(arr[min_idx]) > 0) 
                {
                    min_idx = j;
                }
                count++;
            }
            // Swap the found minimum element with the first element
            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Number of comparisons performed: " + count);
    }}

   
    // Sorts an array of strings in reverse using the merge sort algorithm.
    // @param
