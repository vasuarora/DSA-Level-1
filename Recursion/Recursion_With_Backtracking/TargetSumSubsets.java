import java.util.*;
public class TargetSumSubsets {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int tar=scn.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+".");                    //printing the subset
            }
            return;
        }
        
        if(sos>tar){
            return;
        }
        
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);          //an element is included
        printTargetSumSubsets(arr,idx+1,set,sos,tar);                                 //an element is not included
    }
}
