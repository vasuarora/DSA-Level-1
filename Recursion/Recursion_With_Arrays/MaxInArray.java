import java.util.*;
public class MaxInArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans=maxOfArray(arr,0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1){                      //base case
            return arr[idx];
        }
        int max=maxOfArray(arr,idx+1);             //recursive call
        if(max>arr[idx]){                          
            return max;
        }
        else{
            return arr[idx];
        }
    }
}
