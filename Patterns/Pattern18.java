import java.util.*;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        int st=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++){
                if(i<=n/2 && k>1 && k<st && i>1){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                st-=2;
                sp++;
            }
            else{
                st+=2;
                sp--;
            }
            System.out.println();
        }
     }
}
