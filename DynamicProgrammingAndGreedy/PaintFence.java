import java.util.*;
public class PaintFence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        int os=k;
        int od=k*(k-1);
        int total=os+od;
        
        for(int i=3;i<=n;i++){
            os=od;
            od=total*(k-1);
            total=os+od;
        }
        
        System.out.println(total);
    }
}
