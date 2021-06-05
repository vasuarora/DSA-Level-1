import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] dp=new int[n+1];
        
        dp[0]=0;                             //fibonacci of 0
        dp[1]=1;                             //fibonacci of 1
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];                  //storing the fibonacci of ith number in dp array           
        }
        
        System.out.println(dp[n]);               //printing the fibonacci of the given number
     }
}
