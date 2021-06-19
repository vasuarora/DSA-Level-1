import java.util.*;
import java.io.*;
public class InfixConversions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        
        Stack<String> pre=new Stack<>();
        Stack<String> post=new Stack<>();
        Stack<Character> optr=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            
            if((c>='0' && c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z')){
                pre.push(c+"");
                post.push(c+"");
            }
            
            else if(c=='('){
                optr.push(c);
            }
            
            else if(c==')'){
                while(optr.peek()!='('){
                    char op=optr.pop();
                    String prev2=pre.pop();
                    String prev1=pre.pop();
                    String preans=op+prev1+prev2;
                    pre.push(preans);
                    
                    String postv2=post.pop();
                    String postv1=post.pop();
                    String postans=postv1+postv2+op;
                    post.push(postans);
                }
                optr.pop();
            }
            
            else if(c=='+' || c=='-' || c=='*' || c=='/'){
                while(optr.size()>0 && optr.peek()!='(' && precedence(optr.peek())>=precedence(c)){
                    char op=optr.pop();
                    String prev2=pre.pop();
                    String prev1=pre.pop();
                    String preans=op+prev1+prev2;
                    pre.push(preans);
                    
                    String postv2=post.pop();
                    String postv1=post.pop();
                    String postans=postv1+postv2+op;
                    post.push(postans);
                }
                
                optr.push(c);
            }
        }
        
        while(optr.size()>0){
            char op=optr.pop();
            String prev2=pre.pop();
            String prev1=pre.pop();
            String preans=op+prev1+prev2;
            pre.push(preans);
                    
            String postv2=post.pop();
            String postv1=post.pop();
            String postans=postv1+postv2+op;
            post.push(postans);
        }
        
        System.out.println(post.pop());
        System.out.println(pre.pop());
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
}
