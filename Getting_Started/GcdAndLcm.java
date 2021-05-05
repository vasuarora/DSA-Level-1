import java.util.*;
public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int dividend=n1;
        int divisor=n2;
        while(dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        int gcd=divisor;
        System.out.println(gcd);
        int lcm=(n1*n2)/gcd;
        System.out.println(lcm);
     }
}
