public class doublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // head and tail
    public Node head;
    public Node tail;
    public int size;

    // constructor
    public doublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insert at first
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        // agar LL empty hai toh---> head and tail dono ko newNode pe point karna hoga
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        // size update
        size++;
    }

    // insert at last
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        // agar LL empty hai toh---> head and tail dono ko newNode pe point karna hoga
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        // size update
        size++;
    }

    // insert at index
    public void insertAtIndex(int pos, int data) {
        if(pos<1 || pos>size+1){
            System.out.println("Invalid index");
            return;
        }
        if (pos == 1) {
            insertAtFirst(data);
            return;
        }
        if (pos == size + 1) {
            insertAtLast(data);
            return;
        }
        Node newNode = new Node(data);
         Node temp = head;
        for (int i = 1; i < pos - 2; i++) {
            temp = temp.next;
        }
         Node preNode=temp;
         Node nextNode=temp.next;
         Node currentNode=newNode;

        // linking
        currentNode.prev=preNode;
        preNode.next=currentNode;
        currentNode.next=nextNode;
        nextNode.prev=currentNode;
        size++;
        
    }
/// searching
    public void search(int data) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element not found");
    }




    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
  // deleting at first
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            size=0;
            return;
        } 
            head = head.next;
            head.prev = null;
        
        size--;
    }

    // deleting at last
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            size=0;
            return;
        } 
            tail = tail.prev;
            tail.next = null;
        
        size--;
    }
    public static void main(String[] args) {
        doublyLinkedList mylist = new doublyLinkedList();
        mylist.insertAtFirst(10);
        mylist.insertAtLast(20);
        mylist.insertAtIndex(2, 15);
        mylist.print(); // Output: 10->15->20->
        mylist.search(15); // Output: Element found at position: 2
        mylist.search(25); // Output: Element not found
        mylist.deleteAtFirst();
        mylist.print(); // Output: 15->20->
        mylist.deleteAtLast();
        mylist.print(); // Output: 15->
        mylist.deleteAtLast();
        mylist.print(); // Output: Linked list is empty
        mylist.deleteAtFirst(); // Output: Linked list is empty
    }

}