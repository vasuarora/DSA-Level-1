import java.util.*;
import java.io.*;

public class MedianPriorityQueue {
    public static class MPQueue {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;
    
        public MPQueue() {
          left = new PriorityQueue<>(Collections.reverseOrder());
          right = new PriorityQueue<>();
        }
    
        public void add(int val) {
          if(left.size()==0){
              right.add(val);
          }
          
          else if(val<left.peek()){
              left.add(val);
          }
          
          else{
              right.add(val);
          }
          
          if(left.size()-right.size()>1){
              right.add(left.remove());
          }
          
          else if(right.size()-left.size()>1){
              left.add(right.remove());
          }
        }
    
        public int remove() {
            if(left.size()+right.size()==0){
                System.out.println("Underflow");
                return -1;
            }
            
            if(left.size()>=right.size()){
                return left.remove();
            }
            
            else{
                return right.remove();
            }
        }
    
        public int peek() {
            if(left.size()+right.size()==0){
                System.out.println("Underflow");
                return -1;
            }
            
            if(left.size()>=right.size()){
                return left.peek();
            }
            
            else{
                return right.peek();
            }
        }
    
        public int size() {
          return left.size()+right.size();
        }
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MPQueue qu = new MPQueue();
    
        String str = br.readLine();
        while (str.equals("quit") == false) {
          if (str.startsWith("add")) {
            int val = Integer.parseInt(str.split(" ")[1]);
            qu.add(val);
          } else if (str.startsWith("remove")) {
            int val = qu.remove();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("peek")) {
            int val = qu.peek();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("size")) {
            System.out.println(qu.size());
          }
          str = br.readLine();
        }
      }
}
