import java.util.*;
public class SumOf2Arrays {
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
        
        int max=a1.length;
        if(a2.length>max){
            max=a2.length;
        }
        
        int[] a3=new int[max];
        
        int i=a1.length-1;
        int j=a2.length-1;
        int k=a3.length-1;
        int c=0;
        
        while(k>=0){
            int s=c;
            if(i>=0){
                s+=a1[i];
            }
            if(j>=0){
                s+=a2[j];
            }
            int sum=s%10;
            c=s/10;
            a3[k]=sum;
            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.println(c);
        }
        for(int l=0;l<a3.length;l++){
            System.out.println(a3[l]);
        }
     }
}
