import java.util.*;
import java.io.*;
public class PrintPermutations {
    public static void solution(String str){
		int n=str.length();
		int f=factorial(n);                   //total number of permutations of the string
		for(int i=0;i<f;i++){
		    StringBuilder sb=new StringBuilder(str);
		    int temp=i;
		    for(int j=n;j>=1;j--){
		        int r=temp%j;
		        temp=temp/j;
		        
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		    } 
		    System.out.println();
		}
		
	}
	
	public static int factorial(int n){
	    int val=1;
	    
	    for(int i=2;i<=n;i++){
	        val*=i;
	    }
	    return val;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
