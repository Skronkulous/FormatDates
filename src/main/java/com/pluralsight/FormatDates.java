package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        getDates();
    }
    public static void getDates(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(dtf));
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(localDate.format(dtf2));
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM dd, yyyy");
        System.out.println(localDate.format(dtf3));
        System.out.println(localDate.getDayOfWeek() + ", " + localDate.format(dtf3) + " " + localTime.getHour() + ":" + localTime.getMinute());
    }
}
