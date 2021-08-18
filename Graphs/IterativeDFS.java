import java.util.*;
import java.io.*;

public class IterativeDFS {
    static class Edge {
        int src;
        int nbr;
  
        Edge(int src, int nbr) {
           this.src = src;
           this.nbr = nbr;
        }
     }
     
     public static class pair{
         int vtx;
         String psf;
         
         pair(){
             
         }
         
         pair(int vtx,String psf){
             this.vtx=vtx;
             this.psf=psf;
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
  
        dfs(graph,src);  
     }
     
     public static void dfs(ArrayList<Edge>[] graph,int src){
         Stack<pair> st=new Stack<>();
         boolean[] vis=new boolean[graph.length];
         st.push(new pair(src,src+""));
         
         while(st.size()>0){
             pair rem=st.pop();
             
             if(vis[rem.vtx]==true){
                 continue;
             }
             
             vis[rem.vtx]=true;
             
             System.out.println(rem.vtx+"@"+rem.psf);
             
             for(Edge ne:graph[rem.vtx]){
                 int nbr=ne.nbr;
                 
                 if(vis[nbr]==false){
                     st.push(new pair(nbr,rem.psf+nbr));
                 }
             }
         }
         
     }
}
