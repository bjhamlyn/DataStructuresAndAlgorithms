public class MergeSort 
{

    public static void main(String[] args) 
    {

    }

    public static void MergeSort(int[] arr)
    {
        int[] tmp = new int[arr.length];
        MergeSortHelper(arr, 0, arr.length-1, tmp);
    }

    public static void MergeSortHelper(int[] arr, int start, int end, int[] tmp)
    {
        if(start < end)  //the slide we're lookign at has at least tow elements
        {
            
            int mid = (start + end)/2; //divide
            MergeSortHelper(arr, start, mid, tmp); //conquer the first half
            MergeSortHelper(arr, mid+1, end, tmp); //conquer the second half
            Merge(arr, start, mid, end, tmp); //combine / merge the two halves
        }
    }

    public static void  Merge(int[] arr, int start, int mid, int end, int[] tmp)//O(n)
    {
        int i = start;
        int j = mid+1;
        int k = start;

        while(i<= mid && j <=end)// as long as i is inside its window and same for j
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

        while(i<= mid) // copy left over for i
        {
            tmp[k] = arr[i];
            i++;
            k++;
        }

        while(j<= end)//copy left over for j
        {
            tmp[k] = arr[j];
            j++;
            k++;
        }

        //copy the values back into arr
        for(int v = start; v<=end; v++)
        {
            arr[v] = tmp[v];
        }
    }

    public static void SelectionSort(int[] arr)
    {
        for(int start =0; start<=arr.length -2; start++)
        {
            //find the index of the smallest value starting with position 0/start
            int hand = start;
            for(int i = start+ 1; i< arr.length; i++)
            {
                if(arr[i]<arr[hand])
                {
                    hand = i;
                }
            }
            //when you get here, hand contains the index if min
            //swap element at lcoation 0/start with element at location hand
               int tmp = arr[start];
               arr[start] = arr[hand];
               arr[hand] = tmp;
        }
    }
    public static void BubbleSort(int[] arr){//O(n^2)
        for(int time =1; time<=arr.length-1; time++)//repeat enough times to sort the arr
        {
            for(int i=0; i<= arr.length-2;i++)
            {
                if(arr[i]>arr[i+1])//swap the values arr[i] and arr[i+1]
                {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }

    public static void BubbleSort2(int[] arr){
        for(int time =0; time<=arr.length-2; time++)//repeat enough times to sort the arr
        {
            for(int i=0; i<= arr.length-2 - time;i++)
            {
                if(arr[i]>arr[i+1])//swap the values arr[i] and arr[i+1]
                {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }
    public static void BubbleSort3(int[] arr){
        for(int time =0; time<=arr.length-2; time++)//repeat enough times to sort the arr
        {
            boolean anySwaps = false;
            for(int i=0; i<= arr.length-2 - time;i++) //the run
            {
                if(arr[i]>arr[i+1])//swap the values arr[i] and arr[i+1]
                {
                    anySwaps = true;
                    int tmp = arr[i];
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

    public static void DisplayArray(int[] arr){
        //for(int  val  : arr)
        //{
        //    System.out.print(val + ", ");
        //}

        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}   
