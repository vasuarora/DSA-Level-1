import java.io.*;
import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int t1id=scn.nextInt();           //tower-1 id
        int t2id=scn.nextInt();           //tower-2 id
        int t3id=scn.nextInt();           //tower-3 id
        toh(n,t1id,t2id,t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){                                                    //base case
            return;
        }
        toh(n-1,t1id,t3id,t2id);                               //transfer n-1 disks from tower 1 to tower 3 using tower 2 as helper
        System.out.println(n+"["+t1id+" -> "+t2id+"]");        //tranfer nth disk from tower 1 to tower 2
        toh(n-1,t3id,t2id,t1id);                               //transfer cd n-1 disks from tower 3 to tower 2 using tower 1 as helper
    }
}
