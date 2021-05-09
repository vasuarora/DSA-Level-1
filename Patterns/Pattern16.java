import java.util.*;
public class Pattern16 {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int st=1;
    int sp=2*n-3;
    for(int i=1;i<=n;i++){
        int count=1;
        for(int j=1;j<=st;j++){
            System.out.print(count+"\t");
            count++;
        }
        for(int k=1;k<=sp;k++){
            System.out.print("\t");
        }
        if(i==n){
            count--;
            st--;
        }
        for(int j=1;j<=st;j++){
            count--;
            System.out.print(count+"\t");
        }
        System.out.println();
        st++;
        sp-=2;
    }

 }
}
