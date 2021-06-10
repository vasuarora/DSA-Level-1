import java.util.*;
import java.io.*;
public class CountABC_Subsequences {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        
        int oa=0;
        int ob=0;
        int oc=0;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                oa=2*oa+1;
            }
            
            else if(str.charAt(i)=='b'){
                ob=2*ob+oa;
            }
            
            if(str.charAt(i)=='c'){
                oc=2*oc+ob;
            }
        }
        System.out.println(oc);
    }
}
