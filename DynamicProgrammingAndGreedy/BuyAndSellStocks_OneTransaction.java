import java.util.*;
public class BuyAndSellStocks_OneTransaction {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int min=Integer.MAX_VALUE;
        int max=0;
        int cp=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
            cp=arr[i]-min;
            
            if(cp>max){
                max=cp;
            }
        }
        
        System.out.println(max);
    }
}
