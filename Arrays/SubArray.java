import java.util.*;
public class SubArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        for(int i=0;i<n;i++){                                    //to get starting element of subarray
            for(int j=i;j<n;j++){                               //to get last element of subarray
                for(int k=i;k<=j;k++){                          //to print from first to last element of subarray       
                    System.out.print(arr[k]+"	");
                }
                System.out.println();
            }
        }
     }
}
