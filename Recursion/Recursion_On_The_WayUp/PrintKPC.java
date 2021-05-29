import java.util.*;
public class PrintKPC {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printKPC(str,"");
    }

    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        String codesch=codes[ch-'0'];
        
        for(int i=0;i<codesch.length();i++){
            printKPC(ros,asf+codesch.charAt(i));
        }
        
    }
}
