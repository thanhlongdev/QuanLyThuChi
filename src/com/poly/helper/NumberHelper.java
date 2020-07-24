/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.helper;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author THANHLONG
 */
public class NumberHelper {

    public static String convertToPrice(int price) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi_VN", "vie"));
        currencyFormatter.setMaximumFractionDigits(0);
        return currencyFormatter.format(price).substring(1) + " đ";
    }
}
