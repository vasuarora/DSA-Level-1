import java.util.*;
public class CoinChangePermutations {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int amt=scn.nextInt();
        
        int ans=permutation(arr,n,amt);
        System.out.println(ans);
    }
    
    public static int permutation(int[] arr,int n,int amt){
        int[] dp=new int[amt+1];                              //creating the dp array
        dp[0]=1;
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<arr.length;j++){
                int rem_amt=i-arr[j];
                if(rem_amt>=0){
                    dp[i]+=dp[rem_amt];
                }
            }
        }
        
        return dp[amt];
        
    }
}
