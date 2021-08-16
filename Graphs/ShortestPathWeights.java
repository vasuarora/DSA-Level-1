import java.util.*;
import java.io.*;

public class ShortestPathWeights {
    static class Edge {
        int src;
        int nbr;
        int wt;
  
        Edge(int src, int nbr, int wt) {
           this.src = src;
           this.nbr = nbr;
           this.wt = wt;
        }
     }
     
     public static class pair implements Comparable<pair>{
         int vtx;
         String psf;
         int wsf;
         
         pair(){
             
         }
         
         pair(int vtx,String psf,int wsf){
             this.vtx=vtx;
             this.psf=psf;
             this.wsf=wsf;
         }
         
         public int compareTo(pair o){
             return this.wsf-o.wsf;
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
           int wt = Integer.parseInt(parts[2]);
           graph[v1].add(new Edge(v1, v2, wt));
           graph[v2].add(new Edge(v2, v1, wt));
        }
  
        int src = Integer.parseInt(br.readLine());
        dajikstra(graph,src);
     }
     
     public static void dajikstra(ArrayList<Edge>[] graph,int src){
         PriorityQueue<pair> pq=new PriorityQueue<>();
         
         boolean[] vis=new boolean[graph.length];
         
         pq.add(new pair(src,src+"",0));
         
         while(pq.size()>0){
             
             pair rem=pq.remove();
             
             if(vis[rem.vtx]==true){
                 continue;
             }
             
             vis[rem.vtx]=true;
             
             System.out.println(rem.vtx+" via "+rem.psf+" @ "+rem.wsf);
             
             for(Edge ne:graph[rem.vtx]){
                 int nbr=ne.nbr;
                 if(vis[nbr]==false){
                     pq.add(new pair(nbr,rem.psf+nbr,rem.wsf+ne.wt));
                 }
             }
         }
     }
}
