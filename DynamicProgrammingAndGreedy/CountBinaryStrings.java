import java.util.*;
public class CountBinaryStrings {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int oo=1;               
        int oz=1;
        
        for(int i=2;i<=n;i++){
            int nz=oo;                  //numbers ending with zero with no consecutive 0's
            int no=oo+oz;               //numbers ending with one with no consecutive 0's
            
            oz=nz;
            oo=no;
        }
        
        int total=oo+oz;                     //total numbers with no consecutive 0's
        System.out.println(total);
     }
}
