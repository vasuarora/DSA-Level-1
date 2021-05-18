import java.util.*;
public class StateOfWakanda_1 {
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
        
        for(int j=0;j<m;j++){
            if(j%2==0){                                             //for even column traversals
                for(int i=0;i<n;i++){
                    System.out.println(arr[i][j]);
                }
            }
            else{                                                   //for odd column traversals
                for(int i=arr.length-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
     }
}
