import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)*";
        /* The \s+ matches one or more whitespace characters (spaces, tabs, newlines - tabs appear in some of the tests), \1 matches whatever was matched by the first group in parentheses (\w+) and the \b matches a word boundary. The ()* then groups the expression and allows it to repeat zero or more times.
To explain why the word boundary assertions (\b) are in there, it's to avoid finding repeated words in eg, lotto to roll over (to to isn't a repeat) or the then prime minister (neither is the the).
However, because the * at the end of \b(\w+)(\s+\w\b)* means the second group can match zero times, we do too many replacements (each of lotto, to, roll, over in my first example will be replaced with themselves). It'd be better to use + there so that only repeated words match.
Similarly, the second \b always either comes before a space (if the word repeats again and we see \s+) or as the very last thing matched. The word boundaries before the spaces don't need asserted, so we can in fact move the \b to the end: \b(\w+)(\s+\1)+\b, or, quoted and escaped, "\\b(\\w+)(\\s+\\1)+\\b".
This site provides english language explanations of regexes you can play with: */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                //m.group()-is the group and m.group(1) is to replace the group with the first word of the group
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
