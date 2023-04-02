enum OS {Windows, Linux, MacOS, MSDOS}

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

public class Sorting {

    public static void main(String[] args) {
        Integer[] numbers = {18, 7, 25, 90, 11, 15, 62, 53, 11};
        QuickSort(numbers); 
        DisplayArray(numbers);

        String[] names = {"Alice", "Charlie", "Bravo", "Zelda"};
        //QuickSort (names)
        DisplayArray(names);
    
        Computer[] machines = new Computer[5];//creates an array of 5 computers
        machines[0] = new Computer();
        machines[0].CPU = "Ryzen";
        machines[0].RAM = 32_000_000_000L;
        machines[0].os = OS.Linux;

        machines[1] = new Computer();
        machines[1].CPU = "Crater Lake";
        machines[1].RAM = 16_000_000_000L;
        machines[1].os = OS.Windows;

        machines[2] = new Computer();
        machines[2].CPU = "M2";
        machines[2].RAM = 32_000_000_000L;
        machines[2].os = OS.MacOS;

        machines[3] = new Computer();
        machines[3].CPU = "Ryzen";
        machines[3].RAM = 16_000_000_000L;
        machines[3].os = OS.Windows;

        machines[4] = new Computer();
        machines[4].CPU = "Commodore";
        machines[4].RAM = 16_000_000L;
        machines[4].os = OS.MSDOS;
   
        QuickSort(machines);
        DisplayArray(machines);

        //compare sorting
        int size = 5_000;
        int[] arr1 = new int[size]; //used for MergeSort
        Integer[] arr2 = new Integer[size];//used for all other (generic)
        Integer[] arr3 = new Integer[size];
        Integer[] arr4 = new Integer[size];

        PopulateArraysRandom(arr1, arr2, arr3, arr4);
        
        long startTime = System.currentTimeMillis();
        BubbleSort3(arr2);
        long stopTime =  System.currentTimeMillis();
        System.out.println("\nBubble took " + (stopTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        SelectionSort(arr4); 
        stopTime =  System.currentTimeMillis();
        System.out.println("Selection took " + (stopTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        MergeSort(arr1);
        stopTime =  System.currentTimeMillis();
        System.out.println("Merge took " + (stopTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        QuickSort(arr3);
        stopTime =  System.currentTimeMillis();
        System.out.println("Quick took " + (stopTime - startTime) + " ms");

    }

    public static void PopulateArraysRandom(int[] arr1, Integer[] arr2, Integer[] arr3, Integer[] arr4)
    {
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = arr2[i] = arr3[i] = arr4[i] = (int) (Math.random()*arr1.length);//i - increase; // 
        }

        //arr1[arr1.length/2] = arr2[arr1.length/2] = arr3[arr1.length/2] = arr4[arr1.length/2] = arr1.length+10; //almost sorted
    }

    public static <T extends Comparable<T>> void QuickSort(T[] arr)
    {
        QuickSortHelper(arr, 0, arr.length-1);   
    }

    public static <T extends Comparable<T>> void QuickSortHelper(T[] arr, int start, int end)
    {
        if(start<end)//only need to do work if there are at least two elements in the current slice
        {
            int q = Partition(arr, start, end);
            QuickSortHelper(arr, start, q-1);//recursively sort the first "half" (ideally)
            QuickSortHelper(arr, q+1, end);//recursively sort the second "half" (ideally)
        }
    }

    public static <T extends Comparable<T>> int Partition(T[] arr, int start, int end)
    {
        int i = start-1;
        T pivot = arr[end];

        for(int j = start; j<=end-1; j++)
        {
            if(arr[j].compareTo(pivot)<=0){
                i++;
                //swap elements at position i and j
                T tmp = arr[i]; 
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        i++;
        //swap elements with position i with pivot
        //we already have this -     pivot = arr[end];
        arr[end] = arr[i];
        arr[i] = pivot;

        //return the new postion for pivot
        return i;
    }
        
public static void MergeSort(int[] arr)
{
    int[] tmp = new int[arr.length];
    MergeSortHelper(arr, 0, arr.length-1,tmp);
}

    public static void MergeSortHelper(int[] arr, int start, int end, int[] tmp) //O(n log n)
    {
        if(start < end) //if the slice has at least two elements
        {
            int mid = (start + end)/2; //divide
            MergeSortHelper(arr, start, mid, tmp);//conquer the first half
            MergeSortHelper(arr, mid+1, end, tmp);//conquer the second half
            Merge(arr, start, mid, end, tmp);//combine / merge the two halves
        }
    }

    public static void Merge(int[] arr, int start, int mid, int end, int[] tmp)//O(n)
    {
        int i = start;
        int j = mid+1;
        int k = start;

        while(i <= mid && j <=end)//as long as i is inside its window, and same for j
        {
            if(arr[i]<arr[j]) //left value is smaller
            {
                tmp[k] = arr[i];
                i++;
                k++;
            }
            else//the right value is smaller
            {
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<= mid )//copy left over for i
        {
            tmp[k] = arr[i];
            i++;
            k++;
        }

        while(j<= end )//copy left over for j
        {
            tmp[k] = arr[j];
            j++;
            k++;
        }

        //copy values back into arr
        for(int v = start; v<=end; v++)
        {
            arr[v] = tmp[v];
        }
    }

    public static <T extends Comparable<T>> void SelectionSort(T[] arr)
    {
         for(int start =0; start<=arr.length-2; start++)
         {
               //find the index of smallest value starting with position 0/start
               int hand = start;
               for(int i = start+ 1; i< arr.length; i++)
               {
                   if(arr[i].compareTo(arr[hand]) < 0)
                   {
                       hand = i;
                   }
               }
               //when you get here hand contains the index of min
               //swap element at location 0/start with element at location hand
               T tmp = arr[start];
               arr[start] = arr[hand];
               arr[hand] = tmp;
         }
    } 
    public static <TYPE extends Comparable<TYPE>> void BubbleSort(TYPE[] arr){//O(n^2)
        for(int time =1; time<=arr.length-1; time++)//repeat enough times to sort the arr
        {
            for(int i=0; i<= arr.length-2;i++)
            {
                if(arr[i].compareTo( arr[i+1])>0)//swap the values arr[i] and arr[i+1]
                {
                    TYPE tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }

    public static <T extends Comparable<T> > void BubbleSort2(T[] arr){
        for(int time =0; time<=arr.length-2; time++)//repeat enough times to sort the arr
        {
            for(int i=0; i<= arr.length-2 - time;i++)
            {
                if(arr[i].compareTo(arr[i+1])>0)//swap the values arr[i] and arr[i+1]
                {
                    T tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }

    public static <T extends Comparable> void BubbleSort3(T[] arr){
        for(int time =0; time<=arr.length-2; time++)//repeat enough times to sort the arr
        {
            boolean anySwaps = false;
            for(int i=0; i<= arr.length-2 - time;i++) //the run
            {
                if(arr[i].compareTo(arr[i+1]) > 0)//swap the values arr[i] and arr[i+1]
                {
                    anySwaps = true;
                    T tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
            if(anySwaps == false)//if no swaps were made this run
            {
                break;
            }
        }
    }

    public static <T> void DisplayArray(T[] arr){
        //for(int  val  : arr)
        //{
        //    System.out.print(val + ", ");
        //}

        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+", ");
        }
    }

/*     public static void DisplayArray(String[] arr){
        //for(int  val  : arr)
        //{
        //    System.out.print(val + ", ");
        //}

        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+", ");
        }
    } */
}}
