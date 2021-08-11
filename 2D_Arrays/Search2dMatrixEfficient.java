import java.util.*;
import java.io.*;

public class Search2dMatrixEfficient {
    public static boolean search(int[][]matrix,int target) {
        
        int r=searchRow(matrix,target);
        
        if(r==-1){
            return false;
        }
        
        boolean isFound=binarySearch(matrix,target,r);
        
        return isFound;
    }
    
    public static boolean binarySearch(int[][] matrix,int target,int r){
        int lo=0;
        int hi=matrix[0].length-1;
        
        while(lo<hi){
            int mid=(lo+hi)/2;
            
            if(target==matrix[r][mid]){
                return true;
            }
            
            else if(target>matrix[r][mid]){
                lo=mid+1;
            }
            
            else{
                hi=mid-1;
            }
        }
        
        return false;
    }
    
    public static int searchRow(int[][] matrix,int target){
        int lo=0; 
        int hi=matrix.length-1;
        int lc=matrix[0].length-1;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            if(target>=matrix[mid][0] && target<=matrix[mid][lc]){
                return mid;
            }
            
            else if(target>matrix[mid][0]){
                lo=mid+1;
            }
            
            else if(matrix[mid][0]>target){
                hi=mid-1;
            }
        }
        
        return -1;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][]matrix = new int[m][n];

        for(int i=0; i < m;i++) {
            for(int j=0; j < n;j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        boolean isFound = search(matrix,target);
        System.out.println(isFound);

    }
}
