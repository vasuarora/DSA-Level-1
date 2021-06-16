import java.util.*;
public class DuplicateBrackets {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){                               //pushing the bracket in stack
                st.push(c);
            }
            else if(c==')'){
                if(st.peek()=='('){                          //this means there is no content between the bracket pair
                    System.out.println("true");             //hence it is a duplicate bracket pair
                    return;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();                          //popping out the content
                    }
                    st.pop();                            //popping out the bracket
                }
            }
            else{
                st.push(c);                             //pushing the content in stack
            }
        }
        
        System.out.println("false");
    }
}
