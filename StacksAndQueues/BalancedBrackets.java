import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            
            if(c=='(' || c=='[' || c=='{'){             //pushing the opening brackets in stack
                st.push(c);
            }
            
            else if(c==')'){
                boolean a=bracket(st,'(');             //checking if the closing bracket matches with its opening bracket pair
                if(a==false){
                    System.out.println(a);
                    return;
                }
            }
            
            else if(c==']'){
                boolean a=bracket(st,'[');            //checking if the closing bracket matches with its opening bracket pair
                if(a==false){
                    System.out.println(a);
                    return;
                }
            }
            
            else if(c=='}'){
                boolean a=bracket(st,'{');              //checking if the closing bracket matches with its opening bracket pair
                if(a==false){
                    System.out.println(a);
                    return;
                }
            }
        }
        if(st.size()==0){                               //if the size of stack is zero,it means there is no extra opening bracket
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
    public static boolean bracket(Stack<Character> st,char c){
        if(st.size()==0){                             //if the size of stack is zero,it means there is an extra closing bracket
            return false;
        }
        else if(st.peek()!=c){
            return false;
        }
        else{
            st.pop();                                 //popping out the bracket from stack
            return true;
        }
    }
}
