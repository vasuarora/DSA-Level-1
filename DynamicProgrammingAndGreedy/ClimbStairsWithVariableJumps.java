import java.util.*;
public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();              //jumps array
        }
        
        int[] dp=new int[n+1];                //creating the dp array
        dp[n]=1;            
        
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=arr[i] && i+j<dp.length;j++){
                dp[i]+=dp[i+j];                            //number of ways to climb from ith stair to nth stair
            }
        }
        
        System.out.println(dp[0]);           //number of ways to climb from 0 to nth stair
    }
}
