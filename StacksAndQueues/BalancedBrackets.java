import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            
            else if(c==')'){
                boolean a=bracket(st,'(');
                if(a==false){
                    System.out.println(a);
                    return;
                }
            }
            
            else if(c==']'){
                boolean a=bracket(st,'[');
                if(a==false){
                    System.out.println(a);
                    return;
                }
            }
            
            else if(c=='}'){
                boolean a=bracket(st,'{');
                if(a==false){
                    System.out.println(a);
                    return;
                }
            }
        }
        if(st.size()==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
    public static boolean bracket(Stack<Character> st,char c){
        if(st.size()==0){
            return false;
        }
        else if(st.peek()!=c){
            return false;
        }
        else{
            st.pop();
            return true;
        }
    }
}
