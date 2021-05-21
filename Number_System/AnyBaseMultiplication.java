import java.util.*;
public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getProduct(b, n1, n2);
        System.out.println(d);
     }
    
     public static int getProduct(int b, int n1, int n2){
         int p=1;
         int s=0;
         while(n2!=0){
             int d2=n2%10;                           //last digit of n2
             n2=n2/10;
             int t=prodSingleDigit(b,n1,d2);              //Function to multiply last digit of n2 with all the digits of n1
             s=add(b,s,t*p);                              //Adding all the mutiplications with single digits
             p=p*10;
         }
         return s;
     }
     
     public static int prodSingleDigit(int b,int n1,int d2){             
         int ans=0;
         int pow=1;
         int c=0;
         while(n1>0 || c>0){
             int d1=n1%10;
             n1=n1/10;
             
             int mult=(d2*d1)+c;
             int s=mult%b;
             c=mult/b;
             ans=ans+s*pow;
             pow=pow*10;
         }
         return ans;
     }
     
     public static int add(int b,int n1,int n2){
         int c=0;
         int ans=0;
         int pow=1;
           
         while(n1!=0 || n2!=0 || c!=0){
             int d1=n1%10;
             int d2=n2%10;
             n1=n1/10;
             n2=n2/10;
               
             int s=d1+d2+c;
             int sum=s%b;
             c=s/b;
               
             ans=ans+sum*pow;
             pow=pow*10;
           }
         return ans;
     }
}
