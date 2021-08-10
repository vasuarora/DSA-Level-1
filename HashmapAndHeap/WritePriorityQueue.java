import java.util.*;
import java.io.*;

public class WritePriorityQueue {
    public static class PriorityQueue {
        ArrayList<Integer> data;
    
        public PriorityQueue() {
          data = new ArrayList<>();
        }
    
        public void add(int val) {
            data.add(val);
            upheapify(data.size()-1);
        }
        
        private void upheapify(int ci){
            int pi=(ci-1)/2;
            
            if(data.get(pi)>data.get(ci)){
                swap(pi,ci);
                upheapify(pi);
            }
        }
        
        private void swap(int i,int j){
            int i_val=data.get(i);
            int j_val=data.get(j);
            
            data.set(i,j_val);
            data.set(j,i_val);
        }
    
        public int remove() {
          if(data.size()==0){
              System.out.println("Underflow");
              return -1;
          }
          
          int fi=0;
          int li=data.size()-1;
          
          swap(fi,li);
          int val=data.remove(li);
          
          downheapify(0);
          
          return val;
        }
        
        private void downheapify(int pi){
            int hpi=pi;
            
            int lci=(2*pi)+1;
            int rci=(2*pi)+2;
            
            if(lci<data.size() && data.get(lci)<data.get(hpi)){
                hpi=lci;
            } 
            
            if(rci<data.size() && data.get(rci)<data.get(hpi)){
                hpi=rci;
            } 
            
            if(hpi!=pi){
                swap(hpi,pi);
                downheapify(hpi);
            }
        }
    
        public int peek() {
          if(data.size()==0){
              System.out.println("Underflow");
              return -1;
          }
          
          else{
              return data.get(0);
          }
        }
    
        public int size() {
          return data.size();
        }
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();
    
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
