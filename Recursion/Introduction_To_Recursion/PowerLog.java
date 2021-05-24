import java.util.*;
public class PowerLog {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==0){                           //base case
            return 1;
        }
        int xnb2=power(x,n/2);              //power of x to the power n/2(recursive call)
        int xn=xnb2*xnb2;                  //power of x to the power n;
        if(n%2!=0){                        //To handle cases with odd power
            xn=x*xn;
        }
        return xn;
    }
}
