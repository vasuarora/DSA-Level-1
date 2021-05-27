import java.util.*;
public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> a=gss(str);
        System.out.println(a);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> ab=new ArrayList<>();
            ab.add("");                                      //Returning an arraylist with an element of size 0
            return ab;
        }
        
        char ch=str.charAt(0);                               //Extractiong the first character of string
        String ros=str.substring(1);                         //Extracting rest of the string
        ArrayList<String> rans=gss(ros);                     
        ArrayList<String> ans=new ArrayList<>();             //Creating an answer arraylist
        
        for(int i=0;i<rans.size();i++){
            ans.add(rans.get(i));
        }
        
        for(int i=0;i<rans.size();i++){
            ans.add(ch+rans.get(i));                           
        }
        return ans;
    }
}
