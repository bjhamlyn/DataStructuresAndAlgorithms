public class Searching {

    public static void main(String[] args) {
        double[] numbers = {10, 7, 5, 20, 17, 3};
        System.out.println( SequentialSearch(numbers, 11));
        System.out.println( SequentialSearch(numbers, 7.5) );//expect 1 - second element
    }

    //returns 
    // - the index of key inside the arr if found
    // - -1 if not found

    public static int BinarySearch(double[] arr, double key)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) 
        {
            int mid = (start+end)/2; //find the middle index
            if (arr[mid] == key)
            //success We found it!
            {
                return mid;
            }
            else if(key > arr[mid]) //key is larger than middle value
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        //you only get here when start > end
        //this means that the key of not inside the array
        return -1;
    }
    // key is being searched inside the array arr , and the index is returned (if found, -1 otherwise)
    public static int SequentialSearch(double[] arr, double key)// (Big Oh(n))
    {
    // traverse the array
    // for(initial; how long to update)
    for( int i = 0; i < arr.length; i++)
    {
        //check if the elemnt at position 5 is the same as the key
        if(arr[i] == key){
            return i;
        }

    }
    // you only get here is the key was not found
    return -1;
}
}
