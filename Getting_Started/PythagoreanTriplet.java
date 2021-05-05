import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        boolean ist=false;
        
        if(a*a==b*b+c*c){
          ist=true;
        }
        else if(b*b==a*a+c*c){
          ist=true;
        }
        else if(c*c==b*b+a*a){
          ist=true;
        }
        System.out.println(ist);
     }
    
}
