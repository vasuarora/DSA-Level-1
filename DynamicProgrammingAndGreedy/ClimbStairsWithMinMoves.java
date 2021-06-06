import java.util.*;
public class ClimbStairsWithMinMoves {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int[] dp=new int[n+1];
        dp[n]=0;
        
        for(int i=n-1;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i] && i+j<=n;j++){
                if(dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            if(min==Integer.MAX_VALUE){
                dp[i]=Integer.MAX_VALUE;
            }
            else{
                dp[i]=min+1;
            }
        }
        
        if(dp[0]==Integer.MAX_VALUE){
            System.out.println("null");
        }
        else{
            System.out.println(dp[0]);
        }
    }
}
