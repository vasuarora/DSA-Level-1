import java.util.*;
public class RingRotate {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();
        
        shellRotate(arr,s,r);
        display(arr);
    }
    
    public static void shellRotate(int [][] arr,int s,int r){
        int[] a=fill1dArray(arr,s);        //fill shell elements in 1d array
        
        rotateArray(a,r);                  //rotate the array
        
        fill2dArray(arr,a,s);              //fill the rotated 1d array in 2d array
    }
    
    public static int[] fill1dArray(int[][] arr,int s){
        int rs=s-1;
        int cs=s-1;
        int re=arr.length-s;
        int ce=arr[0].length-s;
        
        int tne=2*(re-rs)+2*(ce-cs);    //total number of elements
        int idx=0;
        
        int[] a=new int[tne];
        
         //left wall
        for(int i=rs,j=cs;i<=re;i++){
            a[idx]=arr[i][j];
            idx++;
        }
        cs++;
        
        //bottom wall
        for(int i=re,j=cs;j<=ce;j++){
            a[idx]=arr[i][j];
            idx++;
        }
        re--;
        
        //right wall
        for(int i=re,j=ce;i>=rs;i--){
            a[idx]=arr[i][j];
            idx++;
        }
        ce--;
        
        //top wall
        for(int i=rs,j=ce;j>=cs;j--){
            a[idx]=arr[i][j];
            idx++;
        }
        rs++;
        
        return a;
    }
    
    public static void rotateArray(int[] a,int r){
        r=r%a.length;
        
        if(r<0){
            r=r+a.length;
        }
        
        reverse(a,0,a.length-r-1);              //first half reversal
        
        reverse(a,a.length-r,a.length-1);       //second half reversal
        
        reverse(a,0,a.length-1);                //whole array reverse
    }
    
    public static void reverse(int[] a,int i,int j){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    
    public static void fill2dArray(int[][] arr,int[] a,int s){
        int rs=s-1;
        int cs=s-1;
        int re=arr.length-s;
        int ce=arr[0].length-s;
        int tne=2*(re-rs)+2*(ce-cs);    //total number of elements
        int idx=0;
        
        
         //left wall
        for(int i=rs,j=cs;i<=re;i++){
            arr[i][j]=a[idx];
            idx++;
        }
        cs++;
        
        //bottom wall
        for(int i=re,j=cs;j<=ce;j++){
            arr[i][j]=a[idx];
            idx++;
        }
        re--;
        
        //right wall
        for(int i=re,j=ce;i>=rs;i--){
            arr[i][j]=a[idx];
            idx++;
        }
        ce--;
        
        //top wall
        for(int i=rs,j=ce;j>=cs;j--){
            arr[i][j]=a[idx];
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