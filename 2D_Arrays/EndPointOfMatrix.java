import java.util.*;
public class EndPointOfMatrix {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=scn.nextInt();
            }
        }
        
        int dir=0;
        int i=0;
        int j=0;
        while(true){
            dir=(a[i][j]+dir)%4;                  //Changing direction after every occurence of 1    
            
            if(dir==0){
                j++;
            }
            
            else if(dir==1){
                i++;
            }
            
            else if(dir==2){
                j--;
            }
            
            else if(dir==3){
                i--;
            }
            
            //Conditions to terminate if i and j are out of matrix
            if(i<0){     
                i++;
                break;
            }
            
            else if(j<0){
                j++;
                break;
            }
            
            else if(i==a.length){
                i--;
                break;
            }
            
            else if(j==a[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
