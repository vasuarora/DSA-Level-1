import java.util.*;
public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int sr=0;
        int dr=arr.length-1;
        int sc=0;
        int dc=arr[0].length-1;
        int count=0;
        int tne=n*m;
        
        while(count<tne){
            for(int i=sr,j=sc;i<=dr && count<tne;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            sc++;
            
            for(int i=dr,j=sc;j<=dc && count<tne;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            dr--;
            
            for(int i=dr,j=dc;i>=sr && count<tne;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            dc--;
            
            for(int i=sr,j=dc;j>=sc && count<tne;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            sr++;
        }
    }
}
