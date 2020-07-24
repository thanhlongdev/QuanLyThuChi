/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.helper;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author THANHLONG
 */
public class ImageHelper {
    
    public static final Image IMAGE;

    static {
        IMAGE = new ImageIcon(ImageHelper.class.getResource("/com/poly/icon/bank.png")).getImage();
    }

    //Copy logo vào file chứa
    public static String saveLogo(String folder, File disFile) {
        String fileName = "unknown.jpg";
        File file = disFile;
        if (file != null) {
            File fileDir = new File(folder);
            //Check tồn tại
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            File newFile = new File(fileDir, file.getName());
            try {
                Path pathSource = Paths.get(file.getAbsolutePath());
                Path pathDestination = Paths.get(newFile.getAbsolutePath());
                Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
                fileName = file.getName();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        return fileName;
    }

    //Load logo
    public static ImageIcon loadLogo(String folder, String fileName) {
        File path = new File(folder, fileName);
        ImageIcon img = new ImageIcon(path.getAbsolutePath());
        Image newImg = img.getImage().getScaledInstance(174, 237, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }
}
