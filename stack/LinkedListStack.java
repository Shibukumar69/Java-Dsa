import java.util.*;

class LinkedListStack {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class myStack {
        Node head;
        int len;

        public void push(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

            len++;
        }

        public int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int popped = head.data;
            head = head.next;
            len--;

            return popped;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.data;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            return len;
        }

        public void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        LinkedListStack obj = new LinkedListStack();

        myStack stack = obj.new myStack();

        stack.push(10);
        stack.push(20);
        stack.push(80);
        stack.push(79);
        stack.push(84);
        stack.push(832);

        System.out.println("Stack:");
        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        System.out.println("After Pop:");
        stack.display();

        System.out.println("Size: " + stack.size());

        System.out.println("Empty: " + stack.isEmpty());
    }
}