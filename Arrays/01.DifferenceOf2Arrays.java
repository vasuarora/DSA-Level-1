import java.util.*;
public class 01.DifferenceOf2Arrays {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] a1=new int[n1];
        
        for(int i=0;i<n1;i++){
            a1[i]=scn.nextInt();
        }
        
        int n2=scn.nextInt();
        int[] a2=new int[n2];
        
        for(int i=0;i<n2;i++){
            a2[i]=scn.nextInt();
        }
        
        int[] a3=new int[n2];                  //length of difference array
        
        int i=a1.length-1;
        int j=a2.length-1;
        int k=a3.length-1;
        int c=0;
        while(k>=0){
            int d=0;
            int val=i>=0?a1[i]:0;
            if(a2[j]+c-val>=0){
                d=a2[j]+c-val;
                c=0;
            }
            else{
                d=a2[j]+c+10-val;
                c=-1;
            }
            a3[k]=d;
            i--;
            j--;
            k--;
        }
        
        int idx=0;
        while(idx<a3.length){
            if(a3[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        
        while(idx<a3.length){
            System.out.println(a3[idx]);
            idx++;
        }
        
     }
}
