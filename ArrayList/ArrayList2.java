public class ArrayList2 {
    //data -using fields
    private String[] arr; // will store our data
    private int count; //will store the current number of values that have been entered into the array
    
    //actions, behavior - methods
    public void Add(String newValue)//O(n) - (worst case scenario) but average is O(1)
    {
        if(count == arr.length)//if the array is full
        {
            Resize();//O(n)
        }
        arr[count] = newValue;//we can assuem thearray has space
        count++;
    }

    public void Resize()//O(n)
    {
        //create a new array twice the size of arr - the old arary
        String[] tmp = new String[2* arr.length];

        //copy the values from arr into tmp
        for(int i = 0; i < count; i++)
        {
            tmp[i] = arr[i]; 
        }

        //redirect arr -> tmp
        arr = tmp;
    }

    public boolean IsEmpty()//O(1)
    {
        return count == 0;
    }

    public int getCount()//O(1)
    {
        return count;
    }
    
    public void Clear()//O(1)
    {
        count = 0;
    }

    public int getCapacity()//O(1)
    {
        return arr.length;
    }

    public void AddBack(String newValue) //O(n)
    {
        Add(newValue);
    }

    public void AddFirst(String newValue) //O(1)
    {
        Insert(newValue, 0);
    }

    public boolean isFull() //O(1)
    {
        return count == arr.length;
    }

    public void Insert(String newValue, int index) //O(n)
        //sanity check for index
    {
        if(index > count || index < 0)
        {
            throw new IndexOutOfBoundsException("Invalid Index, valid values are from 0 to " + count);
        }
        for(int i = count-1; i >= index; i--) 
        {
            arr[i + 1] = arr[i];

        }
        arr[index] = newValue;
        count++;
    }
    public void DeleteLast() //O(1)
    {
        if(IsEmpty())//if the list/array is already "empty"
        {
            throw new IndexOutOfBoundsException("You can't delete from an empty list");
        }
        count--;
    }

    //constructors (ctors)
    public ArrayList2() //O(1)
    {
        arr = new String[4];
    }
}
