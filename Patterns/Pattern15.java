import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n/2;
        int st=1;
        int count=1;
        for(int i=1;i<=n;i++){
            int cval=count;
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++){
                System.out.print(cval+"\t");
                if(k<=st/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            System.out.println();
            if(i<=n/2){
                sp--;
                st+=2;
                count++;
            }
            else{
                sp++;
                st-=2;
                count--;
            }
        }

    }
}
