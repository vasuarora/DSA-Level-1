import java.util.*;
public class CoinChangeCombinations {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int amt=scn.nextInt();
        
        int ans=coin_change(arr,amt);
        System.out.println(ans);
    }
    
    public static int coin_change(int[] arr,int amt){
        int[] dp=new int[amt+1];
        dp[0]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<dp.length;j++){
                int rem_amt=j-arr[i];
                if(rem_amt>=0){
                    dp[j]+=dp[rem_amt];
                }
            }
        }
        return dp[amt];
    }
}
