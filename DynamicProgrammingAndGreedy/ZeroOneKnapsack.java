import java.util.*;
public class ZeroOneKnapsack {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] val=new int[n];
        
        for(int i=0;i<val.length;i++){
            val[i]=scn.nextInt();
        }
        
        int[] wts=new int[n];
        
        for(int i=0;i<wts.length;i++){
            wts[i]=scn.nextInt();
        }
        
        int cap=scn.nextInt();
        
        int[][] dp=new int[n+1][cap+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=0;
                }
                else if(j>=wts[i-1]){
                    int rcap=j-wts[i-1];
                    if(dp[i-1][rcap]+val[i-1]>dp[i-1][j]){
                        dp[i][j]=dp[i-1][rcap]+val[i-1];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
