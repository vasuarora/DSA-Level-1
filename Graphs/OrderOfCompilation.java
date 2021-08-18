import java.util.*;
import java.io.*;

public class OrderOfCompilation {
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
        }
  
        top_sort(graph);
     }
     
     public static void top_sort(ArrayList<Edge>[] graph){
         boolean[] vis=new boolean[graph.length];
         Stack<Integer> st=new Stack<>();
         
         for(int i=0;i<graph.length;i++){
             if(vis[i]==false){
                 dfs(graph,vis,st,i);
             }
         }
         
         while(st.size()>0){
             System.out.println(st.pop());
         }
     }
     
     public static void dfs(ArrayList<Edge>[] graph,boolean[] vis,Stack<Integer> st,int src){
         vis[src]=true;
         
         for(Edge ne:graph[src]){
             if(vis[ne.nbr]==false){
                 dfs(graph,vis,st,ne.nbr);
             }
         }
         
         st.push(src);
     }
}
