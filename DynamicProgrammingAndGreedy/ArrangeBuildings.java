import java.util.*;
public class ArrangeBuildings {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        long n=scn.nextInt();
        long os=1;
        long ob=1;
        
        for(int i=2;i<=n;i++){
            long ns=ob+os;                  //spaces
            long nb=os;                     //buildings
            
            os=ns;
            ob=nb;
        }
        
        long total=os+ob;                              //number of ways for one side
        System.out.println(total*total);              //total number of ways for both sides
     }
}
