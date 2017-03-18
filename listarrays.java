import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class listarrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d,temp = 0;
        //List<int[]> list = new ArrayList<int[]>();
        ArrayList<ArrayList<int[]>> al1 = new ArrayList<ArrayList<int[]>>();
        for(int i=0; i < n; i++){
            d = scan.nextInt();
            ArrayList al = new ArrayList();
            al.clear();
            for(int j=0; j<d; j++){
                temp = scan.nextInt();
                al.add(temp);
            }
            al1.add(al);
            
        }
        int q = scan.nextInt();
        int n1,n2;
        
        for(int i=0; i<q; i++){
            //System.out.println(i);
            n1 = scan.nextInt();
            n2 = scan.nextInt();
            try{
                System.out.println(al1.get(n1-1).get(n2-1));
            }
            catch(IndexOutOfBoundsException exception){
            System.out.println("ERROR!");
        }
        }
        //System.out.println(al1);
    }
}