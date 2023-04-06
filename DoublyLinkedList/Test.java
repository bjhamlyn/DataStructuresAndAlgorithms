public class Test {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        // Add nodes to the beginning and end of the list
        list.AddFirst(10);
        list.AddFirst(20);
        list.AddLast(30);

        // Print the values of all nodes in the list
        list.Print();  // output: 20 10 30

        // Delete nodes with the given value and the given node
        list.Delete(10);
        list.Delete(list.getHead());
        list.DeleteLast();

        // Print the values of all nodes in the list
        list.Print();  // output: 

        // Add nodes to the beginning and end of the list
        list.AddFirst(40);
        list.AddLast(50);

        // Reverse the order of the nodes in the list
        list.Reverse();

        // Print the values of all nodes in the list
        list.Print();  // output: 50 40

        // Clear the list
        list.Clear();

        // Print the values of all nodes in the list
        list.Print();  // output: 
    }
}
