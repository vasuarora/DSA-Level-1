import java.util.*;
public class GetKPC {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> a=getKPC(str);
        System.out.println(a);
    }
    
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};               //Key codes

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> ab=new ArrayList<>();
            ab.add("");                                   //Returning an arraylist with an element of size 0
            return ab;
        }
        
        char ch=str.charAt(0);                               //Extracting first character of string
        String ros=str.substring(1);                         //Extracting the remaining string
        ArrayList<String> rans=getKPC(ros);
        ArrayList<String> ans=new ArrayList<>();             //Creating an answer arraylist
        
        String codesch=codes[ch-'0'];                        //Converting string number to integer by subtracting ascii code of string '0'
                                                             //so as to access the array codes using index number
        for(int i=0;i<codesch.length();i++){
            for(int j=0;j<rans.size();j++){
                ans.add(codesch.charAt(i)+rans.get(j));
            }
        }
        return ans;
    }
}
