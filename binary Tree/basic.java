import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
      this.val=val;
    }
}
 public class basic{
 public static void main(String args[]){
    Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    Node f=new Node(6);
    Node g=new Node(7);
    Node h=new Node(8);
    Node i=new Node(9);
    Node j=new Node(10);
    a.left=b;
    a.right=c;
    b.left=d;
    b.right=e;
    c.left=f;
    c.right=g;
    d.left=h;
    d.right=i;
    e.left=j;
    display(a);
    System.out.println();
    System.out.println("size of the tree is "+size(a));
    System.out.println("sum of the tree is "+sum(a));
    System.out.println("product of the tree is "+product(a));
    System.out.println("maximum value of the tree is "+max(a));
  }

  // disply the tree in preorder traversal
  private static void display(Node root){
    if(root==null){
      return;
    }
    System.out.print(root.val+" ");
    display(root.left); // left node print krne k bad right node pr print krna hoga
    display(root.right); // right node print krne k bad left node pr print krna hoga
  }

  // size of the tree
    private static int size(Node root){
        if(root==null){
            return 0;
        }
        int leftSize=size(root.left);
        int rightSize=size(root.right);
        return leftSize+rightSize+1;
    }
    // sum of the tree
    private static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.val;
    }

    // product of the tree
    private static int product(Node root){
        if(root==null){
            return 1;
        }
        int leftProduct=product(root.left);
        int rightProduct=product(root.right);
        return leftProduct*rightProduct*root.val;
    }
    // maximum value of the tree
    private static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
       return Math.max(root.val,Math.max(max(root.left),max(root.right)));
     }
}