package Java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime {
    public DateAndTime() {
    }

    public static void main(String[] args) {
        // 08 05 2015 passed month, day, year as int
        //get the day from passed ints, i.e. Monday
        Calendar rightNow = Calendar.getInstance();
//        public final void set(int year,
//        int month,
//        int date)
        Scanner in = new Scanner(System.in);
//        String[] tokens = in.nextLine().split(" ");
        String[] tokens = "06 30 2022".split(" ");
        int month = Integer.parseInt(tokens[0]);
        int day = Integer.parseInt(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
//        rightNow.set(year, month, day);
        rightNow.set(Calendar.MONTH, month-1); //January is 0
        rightNow.set(Calendar.YEAR, year);
        rightNow.set(Calendar.DAY_OF_MONTH, day);
        System.out.println(rightNow.get(rightNow.DAY_OF_WEEK)); // 1 is Sunday
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
        String dayOfWeek = dateFormat.format(rightNow.getTime());
        System.out.println(dayOfWeek.toUpperCase());

//        System.out.println(month);


    }

}
