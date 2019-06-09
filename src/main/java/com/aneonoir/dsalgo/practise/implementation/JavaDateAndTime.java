package com.aneonoir.dsalgo.practise.implementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateAndTime {

    public static String getDay(String day, String month, String year) {
        Date parse = null;
        String arr[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        try {
            parse = new SimpleDateFormat("MM dd yyyy").parse(month + " " + day + " " + year);
        } catch (Exception e) {
            //
        }
        Calendar cal = Calendar.getInstance();

        cal.setTime(parse);
        return arr[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}