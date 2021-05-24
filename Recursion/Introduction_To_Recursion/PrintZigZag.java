import java.util.*;
public class PrintZigZag {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){                   //base case
            return;
        }
        
        System.out.print(n+" ");              //preorder printing
        pzz(n-1);
        System.out.print(n+" ");              //inorder printing
        pzz(n-1);
        System.out.print(n+" ");              //postorder printing
    }
}
