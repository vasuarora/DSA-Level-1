import java.util.*;
public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {
        if(str.length()==0){
            System.out.println(asf);                      //printing the encoding 
            return;
        }
        
        char ch=str.charAt(0);               
        if(ch=='0'){                             //checking if the 1st character of string is 0
            return;                              //no encoding can be produced for a number starting with 0
        }
        
        String ros=str.substring(1);                    //remaining string
        char enc=(char)(ch-'0'+'a'-1);                  //encoding for corresponding single digit number
        
        printEncodings(ros,asf+enc);
        
        if(str.length()>=2){                          //to find encoding for corresponding double digit number
            int tp=str.charAt(0)-'0';                 //tens place
            int up=str.charAt(1)-'0';                 //ones place
            int val=tp*10+up;                         //creating that double digit number from string
            
            if(val>=10 && val<=26){                    //to check if the double digit number lies between a valid range of characters
                String ros2=str.substring(2);
                char enc2=(char)(val-1+'a');
                printEncodings(ros2,asf+enc2);
            }
        }
    }
}
