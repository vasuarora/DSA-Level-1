import java.util.*;
public class CountEncodings {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        str="."+str;
        
        int[] dp=new int[str.length()];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<dp.length;i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            
            if(curr=='0' && prev=='0'){
                dp[i]=0;
            }
            
            else if(curr=='0'){
                if(prev=='1' || prev=='0'){
                    dp[i]=dp[i-2];
                }
            }
            
            else if(prev=='0'){
                dp[i]=dp[i-1];
            }
            
            else{
                dp[i]=dp[i-1];
                int val=(curr-'0')+(prev-'0')*10;
                if(val>=10 && val<=26){
                    dp[i]+=dp[i-2];
                }
            }
        }
        
        System.out.println(dp[str.length()-1]);
    }
}
