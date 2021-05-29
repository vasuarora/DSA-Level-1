import java.util.*;
public class PrintStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);                         //printing stair paths
            return;
        }
        
        if(n<0){
            return;
        }
        
        printStairPaths(n-1,path+"1");                       //recursive call for n-1 steps
        printStairPaths(n-2,path+"2");                       //recursive call for n-2 steps
        printStairPaths(n-3,path+"3");                       //recursive call for n-3 steps
    }
}
