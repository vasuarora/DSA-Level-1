import java.util.*;
public class MaxSumNonAdjacentElements {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int oinc=arr[0];
        int oexc=0;
        
        for(int i=1;i<arr.length;i++){
            int ninc=arr[i]+oexc;
            int nexc=Math.max(oinc,oexc);
            
            oinc=ninc;
            oexc=nexc;
        }
        
        int max=Math.max(oinc,oexc);
        System.out.println(max);
    }
}
