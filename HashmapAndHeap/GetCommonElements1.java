import java.util.*;
import java.io.*;

public class GetCommonElements1 {
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
        
        HashSet<Integer> hm=new HashSet<>();
        
        for(int i=0;i<a1.length;i++){
            hm.add(a1[i]);
        }
        
        for(int i=0;i<a2.length;i++){
            if(hm.contains(a2[i])){
                System.out.println(a2[i]);
                hm.remove(a2[i]);
            }
        }
     }
}
