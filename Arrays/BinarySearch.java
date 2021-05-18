import java.util.*;
public class BinarySearch {
    public static int search(int[] ar, int key) {
        int lo=0;
        int hi=ar.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;                       //middle index of array
            if(ar[mid]==key){
                return mid;
            }
            else if(key>ar[mid]){
                lo=mid+1;
            }
            else if(key<ar[mid]){
                hi=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int[] ar = new int[n];
         for (int i = 0; i < ar.length; i++) {
              ar[i] = s.nextInt();
         }
         int key = s.nextInt();
         System.out.println(search(ar, key));
    }
}
