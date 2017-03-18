import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] sarray = A.toCharArray();
        int n=A.length();
        int left = 0;
        int right = n-1;
        int flag=0;
            for(int i=0; i<= (n/2 - 1);i++)
                if(sarray[left+i] == sarray[right-i]){
                    continue;
                }
                else{
                    flag = 1;
                    break;
                }
       
        if(flag == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
    }
}