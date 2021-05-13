import java.util.*;
public class BarChart {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        for(int i=max;i>0;i--){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=i){
                    System.out.print("*	");
                }
                else{
                    System.out.print("	");
                }
            }
            System.out.println();
        }
     }
}
