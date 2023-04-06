/**
 * Test
 */
public class Test {

    public static void main(String[] args) 
    {
        Node<Integer> Node1 = new Node<Integer>(10);
        Node<Integer> Node2 = new Node<Integer>(20);
        Node<Integer> Node3 = new Node<Integer>(30);

        //chain the nodes Node1 -> Node2 -> Node3
        Node1.next = Node2;
        Node2.next = Node3;
        

        System.out.println(Node1.value);//node 1's value

        System.out.println(Node2.value);//node 2's value
        System.out.println(Node1.next.value);//node 2's value

        System.out.println(Node3.value);//Node 3's value
        System.out.println(Node1.next.next.value);//Node 3's value

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.AddFirst(10);
        list.AddFirst(20);
        list.AddFirst(30);
        list.AddFirst(40);
        /*try
        {
            list.Print();
            list.DeleteFirst();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }*/

        list.Print();
        list.Reverse();
        list.Print();
        list.Reverse();
        list.Print();
        
    }
}