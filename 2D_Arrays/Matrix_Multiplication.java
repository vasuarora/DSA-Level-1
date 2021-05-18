import java.util.*;
public class Matrix_Multiplication {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int[][] a1=new int[r1][c1];
        
        for(int i=0;i<a1.length;i++){                            //Matrix 1 input
            for(int j=0;j<a1[0].length;j++){
                a1[i][j]=scn.nextInt();
            }
        }
        
        int r2=scn.nextInt();
        int c2=scn.nextInt();
        int[][] a2=new int[r2][c2];
        for(int i=0;i<a2.length;i++){                             //Matrix 2 input
            for(int j=0;j<a2[0].length;j++){
                a2[i][j]=scn.nextInt();
            }
        }
        
        if(c1!=r2){                                               //To check whether multiplication is possible or not
            System.out.println("Invalid input");
            return;
        }
        
        int[][] a3=new int[r1][c2];                                             
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    a3[i][j]+=a1[i][k]*a2[k][j];
                }
            }
        }
        
        for(int i=0;i<a3.length;i++){                               //Displaying Matrix 3
            for(int j=0;j<a3[0].length;j++){
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
     }
}
