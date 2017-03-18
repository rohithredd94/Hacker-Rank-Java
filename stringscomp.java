import java.io.*;
import java.util.*;

public class stringscomp {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lena = A.length();
        int lenb = B.length();
        System.out.println(lena + lenb);
        int lexr = A.compareTo(B);
        if(lexr > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " +Character.toUpperCase(B.charAt(0)) + B.substring(1));
        
    }
}