import java.util.*;
public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] c=new int[a.length+b.length];                     //resultant array                 
        int i=0;                           
        int j=0;
        int k=0;
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){                   
                c[k]=a[i];                   
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        
        while(i<a.length){                   //incase elements of array a are still left over
            c[k]=a[i];
            i++;
            k++;
        }
        
        while(j<b.length){                  //incase elements of array b are still left over
            c[k]=b[j];
            j++;
            k++;
        }
        
        return c;
      }
    
      public static void print(int[] arr){                     //printing the sorted array
        for(int i = 0 ; i < arr.length; i++){             
          System.out.println(arr[i]);
        }
      }
      public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
          a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
          b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
      }
}
