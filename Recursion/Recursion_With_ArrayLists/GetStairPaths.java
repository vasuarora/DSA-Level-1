import java.util.*;
public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> a=getStairPaths(n);
        System.out.println(a);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> ab=new ArrayList<>();
            ab.add("");
            return ab;                                                    //Returning an arraylist with an element of size 0
        }
        
        if(n<0){
            ArrayList<String> ab=new ArrayList<>();
            return ab;                                                    //Returning an empty arraylist
        }
        
        ArrayList<String> nm1=getStairPaths(n-1);                         
        ArrayList<String> nm2=getStairPaths(n-2);
        ArrayList<String> nm3=getStairPaths(n-3);
        ArrayList<String> ans=new ArrayList<>();                         //Creating an answer arraylist
        
        
        for(int i=0;i<nm1.size();i++){
            ans.add(1+nm1.get(i));
        }
        
        for(int i=0;i<nm2.size();i++){
            ans.add(2+nm2.get(i));
        }
        
        for(int i=0;i<nm3.size();i++){
            ans.add(3+nm3.get(i));
        }
        
        return ans;
    }
}
