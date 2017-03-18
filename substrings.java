import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class substrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int n=sc.nextInt();
        String mins = S.substring(0,n);
        String maxs = S.substring(0,n);
        //String S1 = S;
        String S2;
        //System.out.println(S.length());
        for(int i=1; i<(S.length()-(n-1));i++){
            //System.out.println(i);
            S2 = S.substring(i,i+n);
            if(mins.compareTo(S2) <= 0){
                mins = S2;
            }
            if(maxs.compareTo(S2) >= 0){
                maxs = S2;
            }
            
        }
        System.out.println(maxs);
        System.out.println(mins);
    }
}