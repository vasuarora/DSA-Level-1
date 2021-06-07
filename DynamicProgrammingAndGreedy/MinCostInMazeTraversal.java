import java.util.*;
public class MinCostInMazeTraversal {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int cost=maze_tab(arr,n,m);
        System.out.println(cost);
    }
    
    public static int maze_tab(int[][] arr,int n,int m){
        int[][] dp=new int[n][m];                         //creating the dp array
        
        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==n-1 && j==m-1){
                    dp[i][j]=arr[i][j];                         //cost of last cell
                }
                else if(i==n-1){
                    dp[i][j]=dp[i][j+1]+arr[i][j];                
                }
                else if(j==m-1){
                    dp[i][j]=dp[i+1][j]+arr[i][j];             
                }
                
                else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];           //minimum cost to travel from i,j cell to n-1,m-1 cell
                }
            }
        }
        
        return dp[0][0];             //returning the minimum cost to travel from 0,0 cell to n-1,m-1 cell
    }
}
