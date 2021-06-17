import java.util.*;
import java.io.*;
public class StockSpan {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        int[] span = solve(a);
        display(span);
     }
    
     public static int[] solve(int[] arr){
       int[] nge=new int[arr.length];
       Stack<Integer> st=new Stack<>();
       
       nge[0]=1;
       st.push(0);
       for(int i=1;i<arr.length;i++){
           while(st.size()!=0 && arr[st.peek()]<arr[i]){
               st.pop();
           }
           
           if(st.size()==0){
               nge[i]=i+1;
           }
           
           else{
               nge[i]=i-st.peek();
           }
           
           st.push(i);
       }
       return nge;
     }
}
