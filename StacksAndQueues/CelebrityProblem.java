import java.util.*;
import java.io.*;
public class CelebrityProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        int i=0;
        int j=arr[0].length-1;
        
        while(i<j){
            if(arr[i][j]==1){                 
                i++;                      //i is not a celebrity
            }
            else{
                j--;                      //j is not a celebrity
            }
        }
        
        int pot=i;                                      //potential celebrity
        for(int k=0;k<arr.length;k++){
            if(k!=pot && arr[k][pot]!=1){                 //checking if potential celebrity is known by everyone
                System.out.println("none");               //no celebrity
                return;
            }
        }
        
        for(int k=0;k<arr[0].length;k++){
            if(k!=pot && arr[pot][k]!=0){                //checking if potential celebrity does not know any4
                System.out.println("none");              //no celebrity
                return;
            }
        }
        
        System.out.println(pot);                       //printing the index of celebrity
    }
}

