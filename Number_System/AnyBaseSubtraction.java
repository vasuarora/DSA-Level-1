import java.util.*;
public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);
     }
    
     public static int getDifference(int b, int n1, int n2){
         int ans=0;
         int pow=1;
         int d=0;
         
         while(n2!=0){
             int d1=n1%10;                  //extracting last digit of n1
             int d2=n2%10;                  //extracting last digit of n2
             
             n1=n1/10;                      
             n2=n2/10;
             
             d2=d2+d;
             int diff=0;
             
             if(d2>=d1){
                 diff=d2-d1;
                 d=0;
             }
             else{
                 diff=d2+b-d1;                 //taking a borrow as d1>d2
                 d=-1;
             }
             
             ans=ans+diff*pow;
             pow=pow*10;
         }
         return ans;
     }
}
