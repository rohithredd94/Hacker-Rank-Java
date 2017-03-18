import java.util.*;
import java.text.*;

public class currencies1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nformat = NumberFormat.getInstance();
        nformat.setMaximumFractionDigits(2);
        
        Currency currency = Currency.getInstance("INR");
        nformat.setCurrency(currency);
        
        Locale.setDefault(Locale.US);
        System.out.println("US: " + nformat.getCurrencyInstance().format(payment));
        
        //Locale.setDefault(new Locale("en","IN"));
        System.out.println("India: Rs." + nformat.format(payment));
        
        Locale.setDefault(Locale.CHINA);
        System.out.println("China: " + nformat.getCurrencyInstance().format(payment));
        
        Locale.setDefault(Locale.FRANCE);
        System.out.println("France: " + nformat.getCurrencyInstance().format(payment));
 
    }
}