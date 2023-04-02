public class SelectionSort 
{

    public static void main(String[] args) {
        int[] numbers = {18, 7, 25, 90, 11, 15, 62, 53};
            //create a method to sort the values

    }
public static void SelectionSort(int[] arr)
{
        for(int start = 0; start<=arr.length-2; start++)
        {
            //find the index of the smallest value starting with position 0
            int hand = start;
            for(int i = start+1; 1< arr.length; i++) 
            {
                if (arr[i]<arr[hand])
                {
                    hand = i;
                }
            }
            //when you get here, the hand contains the index of the smallest value
            //swap element at location 0 with element at lcation hand
            int tmp = arr[0];
            arr[start] = arr[hand];
            arr[hand] = tmp;
        }


        //find the index of the smallest value starting with position 0
        int hand = 0;
        for(int i = 1;i < arr.length; i++) 
        {
            if (arr[i]<arr[hand])
            {
                hand = i;
            }
        }
        //when you get here, the hand contains the index of the smallest value
        //swap element at location 0 with element at lcation hand

}


}


