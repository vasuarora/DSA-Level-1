import java.util.*;
import java.io.*;
public class InfixEvaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        
        Stack<Character> optr=new Stack<>();
        Stack<Integer> opnd=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isDigit(c)){
                opnd.push(c-'0');
            }
            
            else if(c=='('){
                optr.push(c);
            }
            
            else if(c==')'){
                while(optr.peek()!='('){
                    char op=optr.pop();
                    int v2=opnd.pop();
                    int v1=opnd.pop();
                    
                    int ans=solve(v1,v2,op);
                    opnd.push(ans);
                }
                optr.pop();
            }
            
            else if(c=='+' || c=='-' || c=='*' || c=='/'){
                while(optr.size()>0 && optr.peek()!='(' && precedence(c)<=precedence(optr.peek())){
                    char op=optr.pop();
                    int v2=opnd.pop();
                    int v1=opnd.pop();
                    
                    int ans=solve(v1,v2,op);
                    opnd.push(ans);
                }
                optr.push(c);
            }
        }
        
        while(optr.size()>0){
            char op=optr.pop();
            int v2=opnd.pop();
            int v1=opnd.pop();
                    
            int ans=solve(v1,v2,op);
            opnd.push(ans);
        }
        
        System.out.println(opnd.pop());
     }
     
     public static int precedence(char optor){
        if(optor=='+' || optor=='-'){
            return 1;
        }
        
        else if(optor=='*' || optor=='/'){
            return 2;
        }
        
        else{
            return 0;
        }
     }
     
     public static int solve(int v1,int v2,char optor){
        if(optor=='+'){
            return v1+v2;
        }
        
        else if(optor=='-'){
            return v1-v2;
        }
        
        else if(optor=='*'){
            return v1*v2;
        }
        
        else{
            return v1/v2;
        }
     }
}
