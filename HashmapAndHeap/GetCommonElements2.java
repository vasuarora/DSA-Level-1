import java.util.*;
import java.io.*;

public class GetCommonElements2 {
   
public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int[] a1=new int[n1];
    
    for(int i=0;i<a1.length;i++){
        a1[i]=scn.nextInt();
    }
    
    int n2=scn.nextInt();
    int[] a2=new int[n2];
    
    for(int i=0;i<a2.length;i++){
        a2[i]=scn.nextInt();
    }
    
    HashMap<Integer,Integer> hm=new HashMap<>();
    
    for(int i=0;i<a1.length;i++){
        if(hm.containsKey(a1[i])){
            int val=hm.get(a1[i]);
            hm.put(a1[i],val+1);
        }
        
        else{
            hm.put(a1[i],1);
        }
    }
    
    for(int i=0;i<a2.length;i++){
        if(hm.containsKey(a2[i])){
            int val=hm.get(a2[i]);
            if(val==0){
                hm.remove(a2[i]);
            }
            else{
                System.out.println(a2[i]);
                hm.put(a2[i],val-1);
            }
        }
    }
 }
}
