import java.util.*;
import java.io.*;

public class MergeKSortedList {
    public static class pair implements Comparable<pair>{
        int val;
        int li;
        int di;
        
        pair(){
            
        }
        
        pair(int val,int li,int di){
            this.val=val;
            this.li=li;
            this.di=di;
        }
        
        public int compareTo(pair o){
            return this.val-o.val;
        }
    }
    
    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
       ArrayList<Integer> rv = new ArrayList<>();
       
       PriorityQueue<pair> pq=new PriorityQueue<>();
       
       for(int i=0;i<lists.size();i++){
           pq.add(new pair(lists.get(i).get(0),i,0));
       }
       
       while(pq.size()>0){
           pair rem=pq.remove();
           rv.add(rem.val);
           rem.di++;
           
           if(rem.di<lists.get(rem.li).size()){
             rem.val=lists.get(rem.li).get(rem.di);
             pq.add(rem);
           }
       }
 
       return rv;
    }
 
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int k = Integer.parseInt(br.readLine());
       ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
       for(int i = 0; i < k; i++){
          ArrayList<Integer> list = new ArrayList<>();
 
          int n = Integer.parseInt(br.readLine());
          String[] elements = br.readLine().split(" ");
          for(int j = 0; j < n; j++){
             list.add(Integer.parseInt(elements[j]));
          }
 
          lists.add(list);
       }
 
       ArrayList<Integer> mlist = mergeKSortedLists(lists);
       for(int val: mlist){
          System.out.print(val + " ");
       }
       System.out.println();
    }
}
