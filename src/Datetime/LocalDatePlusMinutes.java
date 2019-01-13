package Datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDatePlusMinutes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        date = date.plusMinutes(1); // DOES NOT COMPILE
    }
}
