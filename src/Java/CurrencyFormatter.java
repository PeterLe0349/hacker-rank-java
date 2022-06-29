package Java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
//    US: formattedPayment
//    India: formattedPayment
//    China: formattedPayment
//    France: formattedPayment
    //Given a double, format the number into the above countries' currency
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double dub = in.nextDouble();
        NumberFormat d = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat i = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        //India doesn't have a locale
        //India currency symbol showing instead of Rs. for hacker rank
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        //set decimal format to add comma per 3 digits
        System.out.println("US: " +d.format(dub));
        System.out.println("India: Rs."+ decimalFormat.format(dub));
        System.out.println("China: " + c.format(dub));
        System.out.println("France: " + f.format(dub));



    }
}
