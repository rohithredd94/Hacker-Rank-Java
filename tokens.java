import java.io.*;
import java.util.*;

public class tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] temps = s.toCharArray();
        //char s1 = 'p';
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            if(temps[i] == ' ' || temps[i] == '!' || temps[i] == ',' || temps[i] == '?' || temps[i] == '.'){
                count++;
                System.out.println(i);
            }
            if(temps[i] == '_' || temps[i] == 39 || temps[i] == '@'){
                count++;
                System.out.println(i);
            }
            
        }
        System.out.println(count);
        scan.close();
    }
}