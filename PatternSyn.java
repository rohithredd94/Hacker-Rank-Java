import java.util.Scanner;
import java.util.regex.*;

public class PatternSyn
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
          try{
              Pattern r = Pattern.compile(pattern);
          }
          catch(PatternSyntaxException e){
              System.err.println(e.getDescription());
              System.out.println("Invalid");
              continue;
            //System.exit(1);
          }
          System.out.println("Valid");
      }
   }
}
