import java.util.Scanner;
//http://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax
public class Formout {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%1$-14s %2$03d \n",s1,x);
            }
            System.out.println("================================");

    }
}