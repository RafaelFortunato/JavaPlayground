package Datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2014, 6, 21);
        LocalTime time = LocalTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(f.format(dateTime));
//        System.out.println(f.format(date)); // java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: ClockHourOfAmPm
        System.out.println(f.format(time));

        System.out.println("OK");

        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");


        ArrayList<String> ages = new ArrayList<>();
        ages.add(""+4);
        ages.add(null);
        for (String age : ages)
            System.out.print(age);
    }
}
