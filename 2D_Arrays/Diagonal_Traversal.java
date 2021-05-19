import java.util.*;
public class Diagonal_Traversal {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scn.nextInt();
            }
        }
        
        for(int g=0;g<a.length;g++){                          //to get start point of diagonal
            for(int i=0,j=g;j<a[0].length;i++,j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
