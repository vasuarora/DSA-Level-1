import java.util.*;
public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> a=getMazePaths(1,1,n,m);
        System.out.println(a);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> ab=new ArrayList<>();                            
            ab.add("");                                               //Returning an arraylist with an element of size 0
            return ab;
        }
        
        if(sr>dr || sc>dc){
            ArrayList<String> ab=new ArrayList<>();
            return ab;                                                //Returning an empty arraylist
        }
        
        ArrayList<String> hpaths=getMazePaths(sr,sc+1,dr,dc);           //recursive call for horizontal paths
        ArrayList<String> vpaths=getMazePaths(sr+1,sc,dr,dc);           //recursive call for vertical paths
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<hpaths.size();i++){
            ans.add("h"+hpaths.get(i));
        }
        
        for(int i=0;i<vpaths.size();i++){
            ans.add("v"+vpaths.get(i));
        }
        
        return ans;
    }
}
