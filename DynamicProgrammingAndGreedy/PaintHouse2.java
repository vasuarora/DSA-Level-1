import java.util.*;
public class PaintHouse2 {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        int[][] arr=new int[n][k];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int[][] dp=new int[n][k];
        
        int om=Integer.MAX_VALUE;
        int osm=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            int nm=Integer.MAX_VALUE;
            int nsm=Integer.MAX_VALUE;
            
            for(int j=0;j<arr[0].length;j++){
                if(i==0){
                    dp[i][j]=arr[i][j];
                }
                else if(dp[i-1][j]==om){
                    dp[i][j]=arr[i][j]+osm;
                }
                else{
                    dp[i][j]=arr[i][j]+om;
                }
                
                if(dp[i][j]<nm){
                    nsm=nm;
                    nm=dp[i][j];
                }
                else if(dp[i][j]<nsm){
                    nsm=dp[i][j];
                }
            }
            
            om=nm;
            osm=nsm;
        }
        
        System.out.println(om);
    }
}
