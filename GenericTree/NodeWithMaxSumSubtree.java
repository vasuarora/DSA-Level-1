import java.util.*;
import java.io.*;

public class NodeWithMaxSumSubtree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
      }
    
      public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
          str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
    
        for (Node child : node.children) {
          display(child);
        }
      }
    
      public static Node construct(int[] arr) {
        Node root = null;
    
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == -1) {
            st.pop();
          } else {
            Node t = new Node();
            t.data = arr[i];
    
            if (st.size() > 0) {
              st.peek().children.add(t);
            } else {
              root = t;
            }
    
            st.push(t);
          }
        }
    
        return root;
      }
      
      public static class Pair{
          int ms;
          Node msn;
      }
      
      public static void mss(Node node){
          Pair gp=new Pair();
          gp.ms=Integer.MIN_VALUE;
          gp.msn=null;
          
          MaxSumSubtree(node,gp);
          
          System.out.println(gp.msn.data+"@"+gp.ms);
      }
      
      public static int MaxSumSubtree(Node node,Pair gp){
          int sum=0;
          for(Node child:node.children){
              int cs=MaxSumSubtree(child,gp);
              sum+=cs;
          }
          
          sum+=node.data;
          
          if(sum>gp.ms){
              gp.ms=sum;
              gp.msn=node;
          }
          
          return sum;
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
          arr[i] = Integer.parseInt(values[i]);
        }
    
        Node root = construct(arr);
        mss(root);
      }
}
