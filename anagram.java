import java.io.*;
import java.util.*;

public class anagram {
	static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] tempa = a.toCharArray();
        char[] tempb = b.toCharArray();
        char buff;
        int na = a.length();
        int nb = b.length();
        if(na != nb){
            return false;
        }
        for(int i=0;i<na;i++){
            for(int j=0;j< (na-1);j++){
                if(tempa[j] > tempa[j+1]){
                    buff = tempa[j];
                    tempa[j] = tempa[j+1];
                    tempa[j+1] = buff;
                }
                if(tempb[j] > tempb[j+1]){
                    buff = tempb[j];
                    tempb[j] = tempb[j+1];
                    tempb[j+1] = buff;
                }
            }
        }
        //System.out.println(tempa);
        //System.out.println(tempb);
        int flag = 0;
        for(int i=0;i<na;i++){
            if(tempa[i] == tempb[i]){
                continue;
            }
            else{
                flag = 1;
                break;
            }
        }
            
        if(flag == 0){
            return true;
        }
        else{
            return false;
        }
            
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
