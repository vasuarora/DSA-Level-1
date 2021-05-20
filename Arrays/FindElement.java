import java.util.*;
public class FindElement {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int ans=find(arr,d);
        System.out.println(ans);
     }
     
     public static int find(int[] arr,int d){
         for(int i=0;i<arr.length;i++){
             if(arr[i]==d){                                 //to check the presence of element
                 return i;                                //element found
             }
         }
         return -1;                                       //if element not found
     }
}
