import java.util.*;
import java.io.*;

public class NumberOfIslands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];
  
        for (int i = 0; i < arr.length; i++) {
           String parts = br.readLine();
           for (int j = 0; j < arr[0].length; j++) {
              arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
           }
        }
        
        boolean[][] vis=new boolean[n][m];
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0 && vis[i][j]==false){
                    count++;
                    islands(i,j,vis,arr);
                }
            }
        }
        
        System.out.println(count);
     }
     
     public static void islands(int sr,int sc,boolean[][] vis,int[][] arr){
         
         if(sr<0 || sc<0 || sr>arr.length-1 || sc>arr[0].length-1 || vis[sr][sc]==true || arr[sr][sc]==1){
             return;
         }
         
         vis[sr][sc]=true;
         
         islands(sr-1,sc,vis,arr);
         islands(sr,sc-1,vis,arr);
         islands(sr+1,sc,vis,arr);
         islands(sr,sc+1,vis,arr);
     }
}
