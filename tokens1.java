import java.io.*;
import java.util.*;

public class tokens1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] temps = s.toCharArray();
        //char s1 = 'p';
        int n = s.length();
        int count = 0;
        int left = 0;
        //System.out.println(n);
        for(int i=0;i<n;i++){
            if(temps[i] == ' ' || temps[i] == '!' || temps[i] == ',' || temps[i] == '?' || temps[i] == '.' || temps[i] == '_' || temps[i] == 39 || temps[i] == '@'){
                if(temps[i-1] == ' ' || temps[i-1] == '!' || temps[i-1] == ',' || temps[i-1] == '?' || temps[i-1] == '.' || temps[i-1] == '_' || temps[i-1] == 39 || temps[i-1] == '@'){
                    continue;
                }else{
 
                count++;
                //System.out.println(i);
                }
            }  
        }
        
        
        if(temps[n-1] == ' ' || temps[n-1] == '!' || temps[n-1] == ',' || temps[n-1] == '?' || temps[n-1] == '.' || temps[n-1] == '_' || temps[n-1] == 39 || temps[n-1] == '@'){
            
        }
        else{
            count++;
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            //System.out.println(i);
            if(temps[i] == ' ' || temps[i] == '!' || temps[i] == ',' || temps[i] == '?' || temps[i] == '.' || temps[i] == '_' || temps[i] == 39 || temps[i] == '@'){
                if(temps[i-1] == ' ' || temps[i-1] == '!' || temps[i-1] == ',' || temps[i-1] == '?' || temps[i-1] == '.' || temps[i-1] == '_' || temps[i-1] == 39 || temps[i-1] == '@'){
                    left = left + 1;
                    continue;
                    
                }else{
                    //System.out.println(left);
                    //System.out.println(i);
                System.out.println(new String(temps,left,i-left));
                
                left = i+1;
                
                }
            }  
        }
        int i=n-1;
        int flag=1;
        if(temps[i] == ' ' || temps[i] == '!' || temps[i] == ',' || temps[i] == '?' || temps[i] == '.' || temps[i] == '_' || temps[i] == 39 || temps[i] == '@'){
            
        }
        else{
            while(flag == 1){
                i = i -1;
                if(temps[i] == ' ' || temps[i] == '!' || temps[i] == ',' || temps[i] == '?' || temps[i] == '.' || temps[i] == '_' || temps[i] == 39 || temps[i] == '@'){
                    flag = 0;
                    left = i + 1;
                }
                else{
                    flag = 1;
                    
                }
            }
            
        }
        
        System.out.println(new String(temps,left,n-1-left));
        
        //System.out.println(left);
        scan.close();
    }
}
