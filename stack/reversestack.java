import java.util.*;
public class reversestack {
   public static void main(String[] args){
      Deque<Integer> st = new ArrayDeque<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5); 
    System.out.println("Original stack: " + st);
     reverseStack(st);
     System.out.println("Reversed stack: " + st);
   }

    public static void reverseStack(Deque<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }
    public static void insertAtBottom(Deque<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, data);
        st.push(top);
    }

}
