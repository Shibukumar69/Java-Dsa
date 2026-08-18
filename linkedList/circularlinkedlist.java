import java.util.*;

//singley circular linked list
public class circularlinkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // constructor
    public circularlinkedlist() {
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
            tail.next = head; // circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // circular link
        }
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        // agar LL empty hai toh---> head and tail dono ko newNode pe point karna hoga
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // circular link
        }
        size++;
    }

    // insert at position
    public void insertAtIndex(int pos, int data) {
        if (pos < 1 || pos > size+1) {
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
        Node prevNode = head;
        for (int i = 1; i <= pos - 2; i++) {
            prevNode = prevNode.next;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }  

    // print circular linked list
    public void print() {
        if (head == null) {
            System.out.println("Circular linked list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    //seach in circular linked list
    public boolean search(int target) {
        if (head == null) {
            System.out.println("Circular linked list is empty");
            return false;
        }
        Node temp = head;
        do {
            if (temp.data == target) {
                System.out.println("Element found: " + target);
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Element not found: " + target);
        return false;
    } 

    // delete head node
     public void deletefirst(){
        // if ll is empty
        if(head==null){
            System.out.println("Circular linked list is empty");
            return;
        }
        // if ll has only one node
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        else{
            head=head.next;
            tail.next=head;
            size--;
        }   
     }

     // delete last node
     public void deletelast(){
        // if ll is empty
        if(head==null){
            System.out.println("Circular linked list is empty");
            return;
        }
        // if ll has only one node
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        else{
            Node temp=head;
            for(int i=1;i<=size-2;i++){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
        }   
     }
     // delete at position
     public void deleteAtIndex(int pos){
        if (pos < 1 || pos > size+1) {
            System.out.println("Invalid index");
            return;
        }
        if (pos == 1) {
            deletefirst();
            return;
        }
        if (pos == size) {
            deletelast();
            return;
        }
        Node prevNode = head;
        for (int i = 1; i <= pos - 2; i++) {
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size--;
     }












    // main funcction
    public static void main(String[] args) {
        circularlinkedlist cll = new circularlinkedlist();
        cll.insertAtFirst(10);
        cll.insertAtFirst(20);
        cll.insertAtLast(30);
        cll.insertAtIndex(2, 25);
        cll.print(); // Output: 20->25->10->30->
    }

}
