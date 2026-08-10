 import java.util.*;
public class singlyLinkedList {

    // node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail
    public Node head;
    public Node tail;
    public int size;

    // constructor
    public singlyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        // agar LL empty hai toh---> head and tail dono ko newNode pe point karna hoga
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        // size update
        size++;

    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        // agar LL empty hai toh---> head and tail dono ko newNode pe point karna hoga
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        // size update
        size++;
    }

    public void insertAtIndex(int index, int data) {
        if(index<0 || index>size){
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if (index == size) {
            insertAtLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node prev = head;
        for (int i = 0; i <= index - 2; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        // size update
        size++;
    }

    //printing the linked list
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

    // get the size of linked list
    public int getSize() {
        return size;
    }

    //isEmpty
    public boolean isEmpty() {
        return size == 0;
    }
    //clear the linked list
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    // searching in linked list
    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // finding the index of target in linked list
     public int findPostion(int target){
        Node temp=head;
        int position=1;
        while(temp!=null){
            if(temp.data==target){
                return position;
            } else{
                temp=temp.next;
                position++;
            }
        }
        return -1;
     }

     // update the value of a node at a specific index
     public void updateAtIndex(int position, int newData) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        for (int i = 0; i <=position-1; i++) {
            temp = temp.next;
        }
        temp.data = newData;
    }    

    // delete head node
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;
        size--;
        // agar head null ho jaye toh tail ko bhi null kar dena chahiye
        if (head == null) {
            tail = null;
        }
    }
     // delete tail node
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head==tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
      for (int i = 1; i <= size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // delete node at a specific index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size+1) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 1) {
            deleteAtFirst();
            return;
        }
        if (index == size ) {
            deleteAtLast();
            return;
        }
        Node prev = head;
        for (int i = 0; i <= index - 2; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }
    public static void main(String[] args) {
        singlyLinkedList mylist = new singlyLinkedList();
        if (mylist.isEmpty()) {
            System.out.println("Linked list is empty");}

        mylist.insertAtFirst(2);
        mylist.print();
    
        mylist.insertAtFirst(1);
         mylist.print();

        mylist.insertAtLast(3);
         mylist.print();

        mylist.insertAtLast(4);
         mylist.print();
        mylist.insertAtIndex(2, 5);
        mylist.print();
        System.out.println("Size of linked list: " + mylist.getSize());
        System.out.println("Is linked list empty? " + mylist.isEmpty());
        // mylist.clear();
        // System.out.println("After clearing the linked list:");
        // mylist.print();
        mylist.print();
        System.out.println("Searching for 3 in linked list: " + mylist.search(3)); 
        System.out.println("Searching for 3 in linked list: " + mylist.findPostion(3));
        System.out.println("Searching for 6 in linked list: " + mylist.findPostion(6));
    }

}
