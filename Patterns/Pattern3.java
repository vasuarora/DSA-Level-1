import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        int st=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int k=0;k<st;k++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
