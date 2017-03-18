import java.util.*;
import java.text.*;

public class currencies {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat nformat = NumberFormat.getInstance();
        nformat.setMaximumFractionDigits(2);
        Currency currency = Currency.getInstance("USD");
        nformat.setCurrency(currency);
        System.out.println("US: $" + nformat.format(payment));
        
        currency = Currency.getInstance("INR");
        nformat.setCurrency(currency);
        System.out.println("India: Rs." + nformat.format(payment));
        
        currency = Currency.getInstance("CNY");
        nformat.setCurrency(currency);
        System.out.println("China: ￥" + nformat.format(payment));
        
        Locale.setDefault(Locale.FRANCE);
        System.out.println("France: " + nformat.getCurrencyInstance().format(payment));
 
    }
}