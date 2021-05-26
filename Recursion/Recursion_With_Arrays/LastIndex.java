import java.util.*;
public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        int ans=lastIndex(arr,0,x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){                                    //base case
            return -1;
        }
        
        int li=lastIndex(arr,idx+1,x);                        //recursive call to next index
        if(li!=-1){
            return li;
        }
        else if(arr[idx]==x){
            return idx;
        }
        else{
            return -1;
        }
    }
}
