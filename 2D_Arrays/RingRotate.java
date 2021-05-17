import java.util.*;
public class RingRotate {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();
        
        shellRotate(arr,s,r);
        display(arr);
    }
    
    public static void shellRotate(int[][] arr,int s,int r){
        
        int[] a1=fill1dArray(arr,s);
        
        rotate(a1,r);
        
        fill2dArray(a1,s,arr);
    }
    
    public static int[] fill1dArray(int[][]arr,int s){
        int rs=s-1;
        int re=arr.length-s;
        int cs=s-1;
        int ce=arr[0].length-s;
        int idx=0;
        
        int tne=2*(re-rs)+2*(ce-cs);
        int[] a1=new int[tne];
        
        for(int i=rs,j=cs;i<=re;i++){
            a1[idx]=arr[i][j];
            idx++;
        }
        cs++;
        
        for(int i=re,j=cs;j<=ce;j++){
            a1[idx]=arr[i][j];
            idx++;
        }
        re--;
        
        for(int i=re,j=ce;i>=rs;i--){
            a1[idx]=arr[i][j];
            idx++;
        }
        ce--;
        
        for(int i=rs,j=ce;j>=cs;j--){
            a1[idx]=arr[i][j];
            idx++;
        }
        rs++;
        
        return a1;
        
    }
    
    public static void rotate(int[] a1,int r){
        r=r%a1.length;
        if(r<0){
            r=r+a1.length;
        }
        
        reverse(a1,0,a1.length-1-r);
        
        reverse(a1,a1.length-r,a1.length-1);
        
        reverse(a1,0,a1.length-1);
        
    }
    
    public static void reverse(int[] a1,int i,int j){
        while(i<j){
            int temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
            i++;
            j--;
        }
    }
    
    public static void fill2dArray(int[] a1,int s,int[][] arr){
        int rs=s-1;
        int re=arr.length-s;
        int cs=s-1;
        int ce=arr[0].length-s;
        int idx=0;
        
        int tne=2*(re-rs)+2*(ce-cs);
        
        for(int i=rs,j=cs;i<=re;i++){
            arr[i][j]=a1[idx];
            idx++;
        }
        cs++;
        
        for(int i=re,j=cs;j<=ce;j++){
            arr[i][j]=a1[idx];
            idx++;
        }
        re--;
        
        for(int i=re,j=ce;i>=rs;i--){
            arr[i][j]=a1[idx];
            idx++;
        }
        ce--;
        
        for(int i=rs,j=ce;j>=cs;j--){
            arr[i][j]=a1[idx];
            idx++;
        }
        rs++;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
