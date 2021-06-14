import java.util.*;
public class BuyAndSellStocks_InfiniteTransactions {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                ans+=arr[i]-arr[i-1];
            }
        }
        
        System.out.println(ans);
    }
}
