import java.util.*;
import java.io.*;

public class IsGraphBipartite {
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
        
        public static class pair{
            int vtx;
            int state;
            
            pair(){
                
            }
            
            pair(int vtx,int state){
                this.vtx=vtx;
                this.state=state;
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
  
        int[] vis=new int[graph.length];
        
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                boolean ans=isBipartite(graph,i,vis);
                
                if(ans==false){
                    System.out.println("false");
                    return;
                }
            }
            
        }
        
        System.out.println("true");
      
     }
     
     public static boolean isBipartite(ArrayList<Edge>[] graph,int src,int[] vis){
         
         Queue<pair> q=new ArrayDeque<>();
         
         q.add(new pair(src,1));
         
         while(q.size()>0){
             pair rem=q.remove();
             
             if(vis[rem.vtx]!=0){
                  if(vis[rem.vtx]!=rem.state){
                      return false;
                  }
                  
                  else{
                      continue;
                  }
             }
             
             vis[rem.vtx]=rem.state;
             
             for(Edge ne:graph[rem.vtx]){
                 int nbr=ne.nbr;
                 
                 if(vis[nbr]==0){
                     int st=(rem.state==1)?2:1;
                     q.add(new pair(nbr,st));
                 }
             }
         }
         
         return true;
     }
}
