import java.util.*;
import java.io.*;

public class HighestFrequencyCharacter {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int val=hm.get(ch);
                hm.put(ch,val+1);
            }
            
            else{
                hm.put(ch,1);
            }
        }
        
        char hfc='.';
        int mf=0;
        
        for(int i=0;i<str.length();i++){
            char key=str.charAt(i);
            int val=hm.get(key);
            
            if(val>mf){
                mf=val;
                hfc=key;
            }
        }
        
        System.out.println(hfc);
    }
}
