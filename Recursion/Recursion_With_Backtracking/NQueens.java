import java.util.*;
public class NQueens {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] chess=new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf+".");                                  //printing the answer
            return;
        }
        
        for(int col=0;col<chess.length;col++){
            if(isQueenSafe(chess,row,col)==true){                        //to check if queen is safe to place
                chess[row][col]=1;                                       //marking the queen as placed
                printNQueens(chess,qsf+row+"-"+col+", ",row+1);
                chess[row][col]=0;                                        //marking the queen as unplaced while backtracking
            }
        }
    }
    
    public static boolean isQueenSafe(int[][] chess,int r,int c){
        //vertical
        for(int i=r-1;i>=0;i--){
            if(chess[i][c]==1){
                return false;
            }
        }
        
        //top left diagonal
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        //top right diagonal
        for(int i=r-1,j=c+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        return true;
    }
}
