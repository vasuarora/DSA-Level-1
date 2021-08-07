import java.util.*;
import java.io.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        HashMap<Integer,Boolean> hm=new HashMap<>();
        
        for(int val:arr){
            hm.put(val,true);
        }
        
        for(int val:arr){
            if(hm.containsKey(val-1)){
                hm.put(val,false);
            }
        }
        
        int max=0;
        int mval=0;
        
        for(int val:arr){
            if(hm.containsKey(val)==true && hm.get(val)==true){
                int len=1;
                
                while(hm.containsKey(val+len)){
                    len++;
                }
                
                if(len>max){
                    max=len;
                    mval=val;
                }
                hm.remove(val);
            }
        }
        
        for(int i=0;i<max;i++){
            System.out.println(mval+i);
        }
     }
}
