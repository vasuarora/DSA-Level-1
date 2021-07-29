import java.io.*;
import java.util.*;

public class LargestBSTSubtree {
    public static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data, Node left, Node right) {
          this.data = data;
          this.left = left;
          this.right = right;
        }
      }
    
      public static class Pair {
        Node node;
        int state;
    
        Pair(Node node, int state) {
          this.node = node;
          this.state = state;
        }
      }
    
      public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
    
        Stack<Pair> st = new Stack<>();
        st.push(rtp);
    
        int idx = 0;
        while (st.size() > 0) {
          Pair top = st.peek();
          if (top.state == 1) {
            idx++;
            if (arr[idx] != null) {
              top.node.left = new Node(arr[idx], null, null);
              Pair lp = new Pair(top.node.left, 1);
              st.push(lp);
            } else {
              top.node.left = null;
            }
    
            top.state++;
          } else if (top.state == 2) {
            idx++;
            if (arr[idx] != null) {
              top.node.right = new Node(arr[idx], null, null);
              Pair rp = new Pair(top.node.right, 1);
              st.push(rp);
            } else {
              top.node.right = null;
            }
    
            top.state++;
          } else {
            st.pop();
          }
        }
    
        return root;
      }
      
      public static class LBSTpair{
          int max;
          int min;
          Boolean isbst;
          int size;         //largest bst subtree size
          Node node;        //largest bst subtree node
          
          LBSTpair(){
              
          }
          
          LBSTpair(int max,int min,boolean isbst,int size,Node node){
              this.max=max;
              this.min=min;
              this.isbst=isbst;
              this.size=size;
              this.node=node;
          }
      }
      
      public static LBSTpair helper(Node node){
          if(node==null){
              return new LBSTpair(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0,null);
          }
          
          LBSTpair lp=helper(node.left);
          LBSTpair rp=helper(node.right);
          
          int max=Math.max(Math.max(lp.max,rp.max),node.data);
          int min=Math.min(Math.min(lp.min,rp.min),node.data);
          boolean isbst=lp.isbst && rp.isbst && lp.max<node.data && rp.min>node.data;
          
          int size=0;
          Node lbn=null;
          
          if(isbst==true){
              size=lp.size+rp.size+1;
              lbn=node;
          }
          
          else{
              if(lp.size>rp.size){
                  size=lp.size;
                  lbn=lp.node;
              }
              
              else{
                  size=rp.size;
                  lbn=rp.node;
              }
          }
          
          return new LBSTpair(max,min,isbst,size,lbn);
      }
      
      public static void largestbst(Node node){
          LBSTpair rp=helper(node);
          
          System.out.println(rp.node.data+"@"+rp.size);
      }
    
      public static void display(Node node) {
        if (node == null) {
          return;
        }
    
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);
    
        display(node.left);
        display(node.right);
      }
      
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
          if (values[i].equals("n") == false) {
            arr[i] = Integer.parseInt(values[i]);
          } else {
            arr[i] = null;
          }
        }
    
        Node root = construct(arr);
        largestbst(root);
        
      }
}
