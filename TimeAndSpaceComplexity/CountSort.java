import java.util.*;
public class CountSort {
    public static void countSort(int[] arr, int min, int max) {
        int range=max-min+1;
        int[] a=new int[range];
        
        for(int i=0;i<arr.length;i++){
            a[arr[i]-min]++;                          //crating an array of count of elements
        }
        
        int[] psa=new int[a.length];
        psa[0]=a[0];
        for(int i=1;i<a.length;i++){
            psa[i]=a[i]+psa[i-1];                    //prefix sum array
        }
        
        int[] ans=new int[arr.length];                //creating the answer array
        for(int i=arr.length-1;i>=0;i--){
            int idx=psa[arr[i]-min]-1;
            ans[idx]=arr[i];
            psa[arr[i]-min]--;
        }
        
        for(int i=0;i<arr.length;i++){                 //copying ans array to original array
            arr[i]=ans[i];
        }
     
    }
  
    public static void print(int[] arr) {                            //printing the array
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }
    }
  
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
        max = Math.max(max, arr[i]);                           //maximum element of array
        min = Math.min(min, arr[i]);                           //minimum element of array
      }
      countSort(arr,min,max);
      print(arr);
    }
}
