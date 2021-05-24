import java.util.*;
public class PowerLinear {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==0){                        //base case
            return 1;
        }
        
        int xnm1=power(x,n-1);            //power of x to the power n-1(recursive call)
        int xn=x*xnm1;                    //power of x to the power n
        return xn;
        
    }
}
