import java.util.*;
public class PrintIncreasingDecreasing {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){                         //base case
            return;
        }
        System.out.println(n);
        pdi(n-1);                        //recursive call
        System.out.println(n);
    }
}
