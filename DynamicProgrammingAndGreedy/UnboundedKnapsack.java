import java.util.*;
public class UnboundedKnapsack {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] val=new int[n];
        
        for(int i=0;i<val.length;i++){              //value array
            val[i]=scn.nextInt();
        }
        
        int[] wts=new int[n];
        
        for(int i=0;i<wts.length;i++){           //weights array
            wts[i]=scn.nextInt();
        }
        
        int cap=scn.nextInt();
        int[] dp=new int[cap+1];              //creating the dp array
        dp[0]=0;
        
        for(int i=1;i<dp.length;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(i>=wts[j]){
                    int rem_cap=i-wts[j];                   //remaining capacity
                    int rem_val=dp[rem_cap];                //remaining value 
                    int tval=rem_val+val[j];                //total value
                    if(tval>max){
                        max=tval;
                    }
                }
            }
            dp[i]=max;
        }
        System.out.println(dp[cap]);                       //printing the maximum value in the bag
    }
}
