import java.util.*;
public class GetMazePathsWithVariableJumps {
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
            ab.add("");                                              //Returning an arraylist with an element of size 0
            return ab;
        }
        
        
        ArrayList<String> ans=new ArrayList<>();                     //Creating an answer arraylist
        
        for(int i=1;sc+i<=dc;i++){
            ArrayList<String> hpaths=getMazePaths(sr,sc+i,dr,dc);             //recursive call for horizontal paths with variable jumps
            
            for(int j=0;j<hpaths.size();j++){
               ans.add("h"+i+hpaths.get(j)); 
            }
        }
        
        for(int i=1;sr+i<=dr;i++){
            ArrayList<String> vpaths=getMazePaths(sr+i,sc,dr,dc);           //recursive call for vertical paths with variable jumps
            
            for(int j=0;j<vpaths.size();j++){
               ans.add("v"+i+vpaths.get(j)); 
            }
        }
        
        for(int i=1;sr+i<=dr && sc+i<=dc;i++){
            ArrayList<String> dpaths=getMazePaths(sr+i,sc+i,dr,dc);          //recursive call for diagonal paths with variable jumps
            
            for(int j=0;j<dpaths.size();j++){
                ans.add("d"+i+dpaths.get(j)); 
            }
        }
        
        return ans;
    }
}
