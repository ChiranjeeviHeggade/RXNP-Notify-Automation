package com.automation.pages;
import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class date_selection {

    public static void main(String[] args)
    {

    }

    public String date()
    {
          String daystoadd="2";
        Instant instant = Instant.now();//Instant add = i.plus(2, ChronoUnit.HOURS);
        Instant newdate = instant.plus(Long.parseLong(daystoadd), ChronoUnit.DAYS);
        return newdate.toString();
    }
    public String sevendays()
    {
        String daystoadd="7";
        Instant instant = Instant.now();//Instant add = i.plus(2, ChronoUnit.HOURS);
        Instant newdate = instant.plus(Long.parseLong(daystoadd), ChronoUnit.DAYS);
        return newdate.toString();
    }

    public String date1()
    {
        String daystoremove="2";
        Instant instant = Instant.now();//Instant add = i.plus(2, ChronoUnit.HOURS);
        //Instant newdate = instant.plus(Long.parseLong(daystoadd), ChronoUnit.DAYS);
        Instant newdate = instant.minus(Long.parseLong(daystoremove), ChronoUnit.DAYS);
        return newdate.toString();
    }
    public String todayDate()
    {
        Instant instant = Instant.now();
        return instant.toString();
    }
    public String elevendays()
    {
        String daystoremove="11";
        Instant instant = Instant.now();//Instant add = i.plus(2, ChronoUnit.HOURS);
        //Instant newdate = instant.plus(Long.parseLong(daystoadd), ChronoUnit.DAYS);
        Instant newdate = instant.minus(Long.parseLong(daystoremove), ChronoUnit.DAYS);
        return newdate.toString();
    }


    }

