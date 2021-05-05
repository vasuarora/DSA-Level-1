import java.util.*;
public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int op=1;
        int inv=0;
        
        while(n!=0){
            int od=n%10;
            int p=(int)Math.pow(10,od-1);
            inv=inv+op*p;
            op++;
            n=n/10;
        }
        System.out.println(inv);
     }
}
