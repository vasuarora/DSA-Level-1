import java.util.*;
import java.io.*;
public class SubsetsOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int lim=(int)Math.pow(2,n);
        for(int i=0;i<lim;i++){
            String st="";
            int temp=i;
            for(int j=arr.length-1;j>=0;j--){
                int rem=temp%2;
                temp=temp/2;
                if(rem==0){
                    st='-'+"	"+st;
                }
                else{
                    st=arr[j]+"	"+st;
                }
            }
            System.out.println(st);
        }
     }
}
