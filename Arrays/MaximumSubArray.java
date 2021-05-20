import java.util.*;
public class MaximumSubArray {
    public static int maxSum(int[] arr) {
        int cs=arr[0];                                //current sum
        int ms=arr[0];                               //maximum sum
        for(int i=0;i<arr.length;i++){
            if(cs<0){
                cs=arr[i];
            }
            else{
                cs+=arr[i];
            }
            if(cs>ms){
                ms=cs;
            }
        }
        return ms;
        
  }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }

        System.out.println(maxSum(arr));
        
   }
}
