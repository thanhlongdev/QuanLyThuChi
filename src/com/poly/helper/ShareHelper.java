/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.helper;

import com.poly.model.NguoiDung;

/**
 *
 * @author THANHLONG
 */
public class ShareHelper {
    public static NguoiDung nguoiDung = null;
    
    
    public static void logOut(){
        nguoiDung = null;
    }
}
