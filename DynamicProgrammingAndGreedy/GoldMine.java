import java.util.*;
public class GoldMine {
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
        
        int ans=gold_tab(arr,n,m);
        System.out.println(ans);
    }
    
    public static int gold_tab(int[][] arr,int n,int m){
        int[][] dp=new int[n][m];                          //creating the dp array
        
        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(j==m-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==0){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==n-1){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else{
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));            //maximum gold that can be dug from i,j cell
                }
            }
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            if(dp[i][0]>max){
                max=dp[i][0];                       
            }
        }
        
        return max;
    }
}
