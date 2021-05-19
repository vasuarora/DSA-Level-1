import java.util.*;
public class SaddlePrice {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scn.nextInt();
            }
        }
        
        for(int i=0;i<a.length;i++){
            int svj=0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]<a[i][svj]){
                    svj=j;
                }
            }
            
            boolean flag=true;
            for(int k=0;k<a.length;k++){
                if(a[k][svj]>a[i][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(a[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
