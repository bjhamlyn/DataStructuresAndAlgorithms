/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        double[] numbers2 = {3, 8, 25, 26, 32, 50, 67, 75, 81};
        System.out.println( BinarySearch2(numbers2, 55));
        System.out.println( BinarySearch2(numbers2, 75));
    }


public static int BinarySearch2(double[] arr, double key)
{
  
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
    }
}