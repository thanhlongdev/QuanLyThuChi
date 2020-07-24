/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author THANHLONG
 */
public class DateHelper {

    static SimpleDateFormat DATE_FORMATER;

    public static Date now() {
        return new Date();
    }

    //Chuyển Date thành String
    public static String toString(Date date) {
        DATE_FORMATER = new SimpleDateFormat("dd/MM/yyyy");
        return DATE_FORMATER.format(date);
    }

    public static String toStringFullDate(Date date) {
        DATE_FORMATER = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return DATE_FORMATER.format(date);
    }

    //Thêm 'int days' ngày theo thời gian nhập vào
    public static Date addDays(Date date, int days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    //Thêm  'int days' ngày từ ngày hiện tại
    public static Date add(int days) {
        Date now = DateHelper.now();
        now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
        return now;
    }
}
