import java.util.*;
import java.io.*;
public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] vis=new boolean[n][m];
        floodfill(arr, 0, 0, "",vis);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][] vis) {
        if(sr==maze.length-1 && sc==maze[0].length-1){
            System.out.println(asf);                           //printing the paths
            return;
        }
        
        else if(sr>=maze.length || sc>=maze[0].length || sr<0 || sc<0 ||maze[sr][sc]==1 || vis[sr][sc]==true){
            return;
        }
        
        vis[sr][sc]=true;                                   //marking the cell as visited
        
        floodfill(maze,sr-1,sc,asf+"t",vis);                //top
        floodfill(maze,sr,sc-1,asf+"l",vis);                //left
        floodfill(maze,sr+1,sc,asf+"d",vis);                //down
        floodfill(maze,sr,sc+1,asf+"r",vis);                //right
        
        vis[sr][sc]=false;                                 //marking the cell unvisited while backtracking
    }
}
