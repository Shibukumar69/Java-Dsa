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
}