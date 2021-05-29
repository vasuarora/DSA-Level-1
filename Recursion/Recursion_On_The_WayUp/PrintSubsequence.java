import java.util.*;
public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printSS(str,"");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);                            //printing the subsequence
            return;
        }
        
        char ch=str.charAt(0);                                  //extracting the first character of the string
        String ros=str.substring(1);                            //fetching the remaining string
        printSS(ros,ans+ch);
        printSS(ros,ans);
    }
}
