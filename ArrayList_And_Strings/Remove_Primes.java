import java.util.*;
public class Remove_Primes {
    public static void solution(ArrayList<Integer> al){
		Scanner scn=new Scanner(System.in);
		for(int i=al.size()-1;i>=0;i--){
		    int a=al.get(i);                        //Fetching an element from arraylist
		    if(isPrime(a)==true){
		        al.remove(i);                       //Removal of prime number from arraylist
		    }
		}
		
	}
	
	public static boolean isPrime(int a){                //To check if a number is prime
	    for(int i=2;i*i<=a;i++){
	        if(a%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}
}
