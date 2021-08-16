import java.util.*;
import java.io.*;

public class SpreadOfInfection {
    static class Edge {
        int src;
        int nbr;
  
        Edge(int src, int nbr) {
           this.src = src;
           this.nbr = nbr;
        }
     }
  
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
           graph[i] = new ArrayList<>();
        }
  
        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
           String[] parts = br.readLine().split(" ");
           int v1 = Integer.parseInt(parts[0]);
           int v2 = Integer.parseInt(parts[1]);
           graph[v1].add(new Edge(v1, v2));
           graph[v2].add(new Edge(v2, v1));
        }
  
        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        
        infection(graph,src,t);
     }
     
     public static void infection(ArrayList<Edge>[] graph,int src,int t){
         
         boolean[] vis=new boolean[graph.length];
         Queue<Integer> q=new ArrayDeque<>();
         
         q.add(src);
         int c=0;
         int lev=0;
         
         while(q.size()>0){
             int count=q.size();
             lev++;
             
             while(count-->0){
                 int rem=q.remove();
                 
                 if(vis[rem]==true){
                     continue;
                 }
                 
                 c++;
                 vis[rem]=true;
                 
                 for(Edge ne:graph[rem]){
                     if(vis[ne.nbr]==false){
                         q.add(ne.nbr);
                     }
                 }
             }
              
              if(lev==t){
                  System.out.println(c);
                  break;
              }
             
         }
     }
}
