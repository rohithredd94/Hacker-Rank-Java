import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tagextract{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      
      while(testCases>0){
         String line = in.nextLine();
         int count=0;
         //String pattern = "<(.+?)>([^<>]+)</\\1>";
         /* There are two capture groups in this expression. They are surrounded by ( and ) the first is in the opening tag the second is the content between the opening and closing tag. so group(2) gets the content of that capture group. Also of note is the \1 in the closing tag. This is called a backreference and it has to match what was in the first capture group which is the opening tag. So for < B > text < / B > group(1) == "B", group(2) == "text" and \1 has to be == to group on in the closing tag to make sure its < / B > and not something like < / I >. spaces added so that html tags aren't suppressed by editor*/
         String pattern = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
         /*The first group <(.+)\> will match one or more character in between <> the second group ([^\<\>]+) will contain any character which does not include < > the third group <\/\1\> will contain any chracters in between < > or it will repeat the first group again. */
         Pattern r = Pattern.compile(pattern);
         Matcher m = r.matcher(line);
         while(m.find()) {
             
                 System.out.println(m.group(2));
             count++;
             
         }
         if(count == 0){
             System.out.println("None");
         }
         testCases--;
      }
   }
}
