import java.util.*;
public class FirstAndLastIndex {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int[] arr = new int[n];
         for (int i =0;i < arr.length;i++) {
               arr[i] = scn.nextInt();
         }
         int d=scn.nextInt();
         
         int lo=0;
         int hi=arr.length-1;
         int fi=-1;
         int li=-1;
         while(lo<=hi){
             int mid=(lo+hi)/2;
             if(arr[mid]==d){
                 fi=mid;
                 hi=mid-1;
             }
             else if(d<arr[mid]){
                 hi=mid-1;
             }
             else if(d>arr[mid]){
                 lo=mid+1;
             }
         }
         
         int l=0;
         int h=arr.length-1;
         while(l<=h){
             int mid=(l+h)/2;
             if(arr[mid]==d){
                 li=mid;
                 l=mid+1;
             }
             else if(d<arr[mid]){
                 h=mid-1;
             }
             else if(d>arr[mid]){
                 l=mid+1;
             }
         }
         System.out.println(fi);
         System.out.println(li);
     }
}
