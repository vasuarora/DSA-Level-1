import java.util.*;
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        
        int a1=baseToDec(n,sourceBase);
        int a2=DectoBase(a1,destBase);
        System.out.println(a2);
     }   
     
     public static int baseToDec(int n,int b){
         int ans=0;
         int pow=1;
         while(n!=0){
             int rem=n%10;
             n=n/10;
             ans=ans+rem*pow;
             pow=pow*b;
         }
         return ans;
     }
     
     public static int DectoBase(int n,int b){
         int ans=0;
         int pow=1;
         while(n!=0){
             int rem=n%b;
             n=n/b;
             ans=ans+rem*pow;
             pow=pow*10;
         }
         return ans;
     }
}
