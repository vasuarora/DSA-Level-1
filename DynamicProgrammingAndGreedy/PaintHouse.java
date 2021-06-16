import java.util.*;
public class PaintHouse {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[][] arr=new int[n][3];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int or=arr[0][0];                    //cost of 1st house painted in red
        int ob=arr[0][1];                    //cost of 1st house painted in blue
        int og=arr[0][2];                    //cost of 1st house painted in green
        
        for(int i=1;i<arr.length;i++){
            int nr=arr[i][0]+Math.min(ob,og);                //minimum cost of painting such that ith house is painted with red        
            int nb=arr[i][1]+Math.min(or,og);                //minimum cost of painting such that ith house is painted with blue
            int ng=arr[i][2]+Math.min(ob,or);                //minimum cost of painting such that ith house is painted with green
            
            or=nr;
            og=ng;
            ob=nb;
            
        }
        
        int min=Math.min(or,Math.min(ob,og));                 //overall minimum cost
        System.out.println(min);
    }
}
