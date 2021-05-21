import java.util.*;
public class RotateANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int temp=n;
        
        while(temp!=0){                  //Counting number of Digits
            count++;
            temp=temp/10;
        }
        
        k=k%count;                      //if k is greater than number of digits
        
        if(k<0){                       //to perform left shift instead of right
            k=k+count;
        }
        
        int p=(int)Math.pow(10,k);
        int s=(int)Math.pow(10,count-k);
        int rem=n%p;
        int q=n/p;
        int ans=rem*s+q;
        System.out.println(ans);
     }
    
}
