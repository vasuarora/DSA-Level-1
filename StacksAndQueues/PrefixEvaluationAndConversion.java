import java.util.*;
import java.io.*;
public class PrefixEvaluationAndConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        
        Stack<Integer> vs=new Stack<>();
        Stack<String> is=new Stack<>();
        Stack<String> ps=new Stack<>();
        
        for(int i=exp.length()-1;i>=0;i--){
           char c=exp.charAt(i);
            
            if(Character.isDigit(c)){
                vs.push(c-'0');
                is.push(c+"");
                ps.push(c+"");
            }
            
            else if(c=='+' || c=='-' || c=='*' || c=='/'){
                int vs1=vs.pop();
                int vs2=vs.pop();
                int ans=solve(vs1,vs2,c);
                vs.push(ans);
                
                String is1=is.pop();
                String is2=is.pop();
                String isa="("+is1+c+is2+")";
                is.push(isa);
                
                String ps1=ps.pop();
                String ps2=ps.pop();
                String psa=ps1+ps2+c;
                ps.push(psa);
            }
        
        }
        
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }
    
    public static int solve(int v1,int v2,char opr){
        if(opr=='+'){
            return v1+v2;
        }
        else if(opr=='-'){
            return v1-v2;
        }
        else if(opr=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
     }
}
