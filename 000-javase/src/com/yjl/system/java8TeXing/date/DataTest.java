package com.yjl.system.java8TeXing.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class DataTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


        /* 8新特性 */
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(String.format("%s",now));

        SimpleDateFormat formatt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = formatt.parse("2099-02-15");
            System.out.println("parse:"+parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
