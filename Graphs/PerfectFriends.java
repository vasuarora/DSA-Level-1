import java.util.*;
import java.io.*;

public class PerfectFriends {
    static int count=0;
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      ArrayList<Integer>[] graph=new ArrayList[n];
      
      for(int i=0;i<n;i++){
          graph[i]=new ArrayList<>();
      }
      
      while(k-->0){
          String input=br.readLine();
          
          String[] arr=input.split(" ");
          
          int u=Integer.parseInt(arr[0]);
          int v=Integer.parseInt(arr[1]);
          
          graph[u].add(v);
          graph[v].add(u);
      }
      
      
      boolean[] vis=new boolean[graph.length];
      
      ArrayList<Integer> a=new ArrayList<>();
      for(int i=0;i<graph.length;i++){
          if(vis[i]==false){
              count=0;
              isConnected(graph,i,vis);
              a.add(count);
          }
      }
      
      int ways=0;
      
      for(int i=0;i<a.size();i++){
          for(int j=i+1;j<a.size();j++){
              ways+=a.get(i)*a.get(j);
          }
      }
      
      System.out.println(ways);
   }
   
   public static void isConnected(ArrayList<Integer>[] graph,int src,boolean[] vis){
       
       count++;
       
       vis[src]=true;
       
       for(int n:graph[src]){
           if(vis[n]==false){
               isConnected(graph,n,vis);
           }
           
       }
   }
}
