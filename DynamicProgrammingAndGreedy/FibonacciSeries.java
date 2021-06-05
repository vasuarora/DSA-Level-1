import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] dp=new int[n+1];
        
        dp[0]=0;                             //storing fibonacci of 0 in the dp array
        dp[1]=1;                             //storing fibonacci of 1 in the dp array
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];                  //storing the fibonacci of ith number in the dp array           
        }
        
        System.out.println(dp[n]);               //printing the fibonacci of the given number
     }
}
