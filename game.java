import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class game {
    
    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;
        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int k=0; k<t ; k++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = scan.nextInt();
            }
            boolean result = isSolvable(m, arr, 0);
            if(result){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}