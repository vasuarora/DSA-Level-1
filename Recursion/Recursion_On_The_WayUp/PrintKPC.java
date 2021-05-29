import java.util.*;
public class PrintKPC {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printKPC(str,"");
    }

    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};         //Keypad codes
    
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);                       //printing the answer
            return;
        } 
        char ch=str.charAt(0);                            //extracting the first character of string
        String ros=str.substring(1);                      //fetching the remaining string
        
        String codesch=codes[ch-'0'];                     //Converting string number to integer by subtracting ascii code of string '0'
                                                          //so as to access the array codes using index number
        for(int i=0;i<codesch.length();i++){
            printKPC(ros,asf+codesch.charAt(i));
        }
        
    }
}
