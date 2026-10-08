import java.util.*;
public class main{
    
   static class mystack{
    // Stack implementation using array
     private int[] arr;
     private int top;
     private int capacity;
    // Constructor to initialize stack
    public mystack(int capacity){
         this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
     }
     // push method to add an element to the stack
     public void push(int data){
            if(top == capacity - 1){
                System.out.println("Stack is full");
                return;
            }
             top++;
            arr[top] = data;
     }
     // pop method to remove an element from the stack
     public void pop(){
            if(top == -1){
                System.out.println("Stack is empty");
                return;
            }
             top--;
     }
        // peek method to get the top element of the stack
        public int peek(){
                if(top == -1){
                    System.out.println("Stack is empty");
                    return -1;
                }
                return arr[top];
   }
   
        // isEmpty method to check if the stack is empty
        public boolean isEmpty(){
                if(top == -1){
                    return true;
                } else{
                    return false;
                }
        }
        // size method to get the number of elements in the stack
        public int size(){
                return top + 1;
        }
     
    }
    public static void main(String[] args){
        mystack stack = new mystack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        stack.pop();
        System.out.println("Top element after pop is: " + stack.peek());
        System.out.println("Stack size after pop is: " + stack.size());
    }
}