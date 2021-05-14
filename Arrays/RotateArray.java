import java.util.*;
import java.io.*;
public class RotateArray {
    public static void rotate(int[] a, int k) {
        k=k%a.length;
        
        if(k<0){
            k=k+a.length;
        }
        reverse(a,0,a.length-1-k);
        
        reverse(a,a.length-k,a.length-1);
        
        reverse(a,0,a.length-1);

   }
   
   public static void reverse(int[] a,int i,int j){
       while(i<=j){
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           i++;
           j--;
       }
   }
   
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
             ar[i] = s.nextInt();
        }
        rotate(ar, k);
        for (int v : ar)
             System.out.print(v + " ");
   }
}
