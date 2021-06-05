import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        
        for(int i=1;i<dp.length;i++){
            if(i==1){                          
                dp[i]=dp[i-1];                         //no. of paths to climb 1 stair
            }
            
            else if(i==2){                     
                dp[i]=dp[i-1]+dp[i-2];                //no. of paths to climb 2 stairs
            }
            
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];           //no. of paths to climb i stairs
            }
        }
        
        System.out.println(dp[n]);                          //printing the count of paths to climb n stairs
    }
}
