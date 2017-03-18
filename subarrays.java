import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subarrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr= new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i=1; i <= n; i++){
            for(int j=0; j < (n-i+1); j++){
                sum = 0;
                for(int k=0; k < i; k++){
                    sum += arr[j+k];
                }
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}