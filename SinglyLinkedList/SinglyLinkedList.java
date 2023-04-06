public class SinglyLinkedList<T> 
{
    //data
    Node<T> head;


    //methods
    //add first O(1)
    public void AddFirst(T someNewValue)
    {
        //1 create a new node
        Node<T> n1 = new Node<T>(someNewValue);

        //2 link the new node to point to the head node
        n1.next = head;
        
        //3 move the head node to the new node
        head = n1;

    }
    //print method
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

    //AddLast O(n)
    public void AddLast(T SomeNewValue)
    {
        if(head == null)//hte list is empty
        {
            AddFirst(SomeNewValue);
        }
        else
        {
        //create a new node
        Node<T> n1 = new Node<T>(SomeNewValue);
        

        //traverse the list, to find the last node
        Node<T> finger = head;
        while(finger.next != null)
        {
            finger = finger.next;
        }

        //link in the new node lastNode.next = new node
        finger.next = n1;
        }
    }
    //DeleteFirst O(1)
    public void DeleteFirst() throws Exception
    {
        if(IsEmpty())
        {
            throw new Exception("You can't delete from an empty list"); 
        }
        head = head.next;
    }

    //DeleteLast O(n)
    public void DeleteLast() throws Exception
    {
        if(head == null)//the list is empty
        {
            throw new Exception("You can't delete from an empty list"); 
        }

        else if(head.next == null)
        {
            Clear();//head = null:
        }
        else
        {
            Node<T> finger = head;
        
            //traverse the list until we get the to the next to last node
            while(finger.next.next != null)
            {
                finger = finger.next.next;//as long as the second to last node is not elpty, move forward
            }

            //break the link to the last edge
            finger.next = null;
        }
    }

    //Clear O(1)
    public void Clear()
    {
        head = null;
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

    public void Reverse()
    {
        Node<T> finger = head;

        head = null;
        while(finger != null)
        {
            AddFirst(finger.value);
            finger = finger.next;
        }
    }

    public boolean ContainsCycle()
    {
        Node<T> slow, fast;
        slow = fast = head;

        while (slow != null && fast!= null & fast.next != null && fast!= slow)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //when you get here either fast == slow || slow == fast
        if(fast == null)
        {
            return false;
        }
        else //we assume that fast == slow
        {
            return true;
        }

    }

    //ctor(s)
}
