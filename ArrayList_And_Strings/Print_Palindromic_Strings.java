import java.util.*;
public class Print_Palindromic_Strings {
    public static void solution(String str){
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        String ss=str.substring(i,j);                   //Finds all possible substrings of a string
		        if(isPalindromic(ss)==true){                    
		            System.out.println(ss);
		        }
		    }
		}
	}
	
	public static boolean isPalindromic(String s){             //To check if the string is palindromic or not
	    int i=0;
	    int j=s.length()-1;
	    while(i<j){
	        char ch1=s.charAt(i);
	        char ch2=s.charAt(j);
	        if(ch1==ch2){
	            i++;
	            j--;
	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	}
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
