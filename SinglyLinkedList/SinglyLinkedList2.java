public class SinglyLinkedList2<T> 
{
    //data
    Node<T> head;
    Node<T> tail;


    //methods
    //add first O(1)
    public void AddFirst(T someNewValue)
    {
        //1 create a new node
        Node<T> n1 = new Node<T>(someNewValue);

        if(IsEmpty())
        {
            tail = n1;
        }
        
        //2 link the new node to point to the head node
        n1.next = head;
        
        //3 move the head node to the new node
        head = n1;

    }
    //print method O(n)
    public void Print()
    {
        System.out.print("\n head ");
        Node<T> finger = head;
        while(finger != null)
        {
            System.out.print(" -> " + finger.value);//display the value
            finger = finger.next;//move finger to the right (next node)
        }
    }

    //AddLast O(1)
    public void AddLast(T SomeNewValue)
    {
        if(IsEmpty())
        {
            AddFirst(SomeNewValue);//this will also add set the head
        }
        else
        {
            //1 create a new node
            Node<T> n1 = new Node<T>(SomeNewValue);
            //link it to the new list

            tail.next = n1;

            //move the tail
            tail = n1;
        }
    }
    //DeleteFirst O(1)
    public void DeleteFirst() throws Exception
    {
        if(IsEmpty())
        {
            throw new Exception("You can't delete from an empty list"); 
        }
        else if(head.next == null)//there is exactly one element in the list
        {
            head = tail = null;//head = null; tail = null;
        }

        else 
        {
            head = head.next;
        }       
    }

    //DeleteLast 
    public void DeleteLast() throws Exception
    {
        if(head == null)//the list is empty
        {
            throw new Exception("You can't delete from an empty list"); 
        }

        else if(head.next == null)
        {
            Clear();//head = null;//tail = null
        }
        else
        {
            Node<T> finger = head;
            //traverse the list until we get the to the next to last node
            while(finger.next.next != null)
            {
                finger = finger.next;//,ove the finger from one node to the next
                tail = finger;
            }

            //break the link to the last edge
            finger.next = null;
            tail = finger;
        }
    }

    //Clear O(1)
    public void Clear()
    {
        head = tail = null;
    }

    //IsEmpty O(1)
    public boolean IsEmpty()
    {
        /*
        if(head == null)
        {
            return true;
        }
        return false;
        */
        return head == null;
    }

    //ctor(s)
}
