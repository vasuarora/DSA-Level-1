import java.util.*;
public class digitsOfANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        int temp=n;
        while(temp!=0){                        //To count number of digits
            count++;
            temp=temp/10;
        }
        
        int p=(int)Math.pow(10,count-1);
        while(p!=0){
            int rem=n/p;
            System.out.println(rem);
            n=n%p;
            p=p/10;
        }
       }
}
