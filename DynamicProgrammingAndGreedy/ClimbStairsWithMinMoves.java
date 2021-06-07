import java.util.*;
public class ClimbStairsWithMinMoves {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();                 //jumps array
        }
        
        int[] dp=new int[n+1];                  //creating the dp array
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
                dp[i]=min+1;                        //number of minimum moves to jump from ith to nth stair
            }
        }
        
        if(dp[0]==Integer.MAX_VALUE){
            System.out.println("null");            //no moves to climb from 0 to nth stair
        }
        else{
            System.out.println(dp[0]);             //minimum number of moves to climb from 0 to nth stair
        }
    }
}
