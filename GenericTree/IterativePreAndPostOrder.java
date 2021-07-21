import java.util.*;
import java.io.*;

public class IterativePreAndPostOrder {
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
          Node node;
          int state;
          
          Pair(){
              
          }
          
          Pair(Node node,int state){
              this.node=node;
              this.state=state;
          }
      }
    
      public static void IterativePreandPostOrder(Node root) {
        Stack<Pair> st=new Stack<>();
        Pair rp=new Pair(root,-1);
        st.push(rp);
        
        StringBuilder pre=new StringBuilder("");
        StringBuilder post=new StringBuilder("");
        
        while(st.size()>0){
            Pair top=st.peek();
            Node tn=top.node;
            int ts=top.state;
            
            if(ts==-1){
                pre.append(tn.data+" ");
                top.state++;
            }
            
            else if(ts>=0 && ts<tn.children.size()){
                Node child=tn.children.get(ts);
                st.push(new Pair(child,-1));
                top.state++;
            }
            
            else if(ts==tn.children.size()){
                post.append(tn.data+" ");
                st.pop();
            }
        }
        
        System.out.println(pre);
        System.out.println(post);
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
        IterativePreandPostOrder(root);
      }
}
