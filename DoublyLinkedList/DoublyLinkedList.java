public class DoublyLinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    // Node class to represent a single node in the list
    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    // Add a new node to the beginning of the list
    public void AddFirst(T someNewValue) {
        Node<T> newNode = new Node<T>(someNewValue);

        // If the list is empty, set head and tail to the new node
        if (IsEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, add the new node to the beginning of the list
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    // Add a new node to the end of the list
    public void AddLast(T someNewValue) {
        Node<T> newNode = new Node<T>(someNewValue);

        // If the list is empty, set head and tail to the new node
        if (IsEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, add the new node to the end of the list
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Remove the first node from the list
    public void DeleteFirst() throws Exception {
        if (IsEmpty()) {
            throw new Exception("List is empty");
        }

        // If there is only one node, set head and tail to null
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            // Otherwise, remove the first node and update head
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public Node<T> getHead() 
    {
        return head;
    }
    
    // Remove the last node from the list
    public void DeleteLast() throws Exception {
        if (IsEmpty()) {
            throw new Exception("List is empty");
        }

        // If there is only one node, set head and tail to null
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            // Otherwise, remove the last node and update tail
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    // Remove the first node with the given value from the list
    public void Delete(T value) {
        if (IsEmpty()) {
            return;
        }

        Node<T> curr = head;
        while (curr != null) {
            if (curr.value.equals(value)) {
                Delete(curr);
                break;
            }
            curr = curr.next;
        }
    }

    // Remove the given node from the list
    public void Delete(Node<T> node) {
        if (IsEmpty()) {
            return;
        }

        // If the given node is the head, remove the head
        if (node == head) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

        // If the given node is the tail, remove the tail
        if (node == tail) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        // Otherwise, remove the node by updating its neighbors
        if (node != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }
    }

    // Reverse the order of the nodes in the list
    public void Reverse() {
        Node<T> curr = head;
        Node<T> prev = null;

        while (curr != null) {
            // Swap the next and prev pointers of the current node
            Node<T> next = curr.next;
            curr.next = prev;
            curr.prev = next;

            // Move to the next node
            prev = curr;
            curr = next;
        }

        // Swap the head and tail pointers
        Node<T> temp = head;
        head = tail;
        tail = temp;
    }

    // Check if the list is empty
    public boolean IsEmpty() {
        return size == 0;
    }

    // Clear the list
    public void Clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Print the values of all nodes in the list
    public void Print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
