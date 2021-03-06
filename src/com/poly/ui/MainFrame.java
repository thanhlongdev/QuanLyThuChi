/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ui;

import com.poly.helper.ImageHelper;
import com.poly.helper.ShareHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class MainFrame extends javax.swing.JFrame {
    
    private JPanel chiJPanel;

    /**
     * Creates new form Main
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.openWelcome();
        init();
    }
    
    void openWelcome() {
        new ChaoJDialog(this, true).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlNguoidung = new javax.swing.JPanel();
        lblNguoidung = new javax.swing.JLabel();
        pnlLoaithuchi = new javax.swing.JPanel();
        lblLoaithuchi = new javax.swing.JLabel();
        pnlHoadonthu = new javax.swing.JPanel();
        lblHoadonthu = new javax.swing.JLabel();
        pnlHoadonchi = new javax.swing.JPanel();
        lblHoadonchi = new javax.swing.JLabel();
        pnlThongke = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTennguoidung = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblDongho = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        pnlHeader.setBackground(new java.awt.Color(102, 102, 102));
        pnlHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pnlHeader.setPreferredSize(new java.awt.Dimension(1219, 110));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("   QUẢN LÝ THU CHI");
        lblTitle.setPreferredSize(new java.awt.Dimension(332, 110));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 847, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlLeft.setBackground(new java.awt.Color(51, 51, 51));
        pnlLeft.setPreferredSize(new java.awt.Dimension(310, 500));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10);
        flowLayout1.setAlignOnBaseline(true);
        pnlLeft.setLayout(flowLayout1);

        lblNguoidung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNguoidung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNguoidung.setText("Quản Lý Người Dùng");
        lblNguoidung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNguoidungMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoidungLayout = new javax.swing.GroupLayout(pnlNguoidung);
        pnlNguoidung.setLayout(pnlNguoidungLayout);
        pnlNguoidungLayout.setHorizontalGroup(
            pnlNguoidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNguoidung, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pnlNguoidungLayout.setVerticalGroup(
            pnlNguoidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNguoidung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlLeft.add(pnlNguoidung);

        lblLoaithuchi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLoaithuchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoaithuchi.setText("Quản Lí Loại Thu/Chi");
        lblLoaithuchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoaithuchiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoaithuchiLayout = new javax.swing.GroupLayout(pnlLoaithuchi);
        pnlLoaithuchi.setLayout(pnlLoaithuchiLayout);
        pnlLoaithuchiLayout.setHorizontalGroup(
            pnlLoaithuchiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoaithuchi, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pnlLoaithuchiLayout.setVerticalGroup(
            pnlLoaithuchiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoaithuchi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlLeft.add(pnlLoaithuchi);

        lblHoadonthu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHoadonthu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoadonthu.setText("Hoá Đơn Thu");
        lblHoadonthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoadonthuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHoadonthuLayout = new javax.swing.GroupLayout(pnlHoadonthu);
        pnlHoadonthu.setLayout(pnlHoadonthuLayout);
        pnlHoadonthuLayout.setHorizontalGroup(
            pnlHoadonthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoadonthu, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pnlHoadonthuLayout.setVerticalGroup(
            pnlHoadonthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoadonthu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlLeft.add(pnlHoadonthu);

        lblHoadonchi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHoadonchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoadonchi.setText("Hoá Đơn Chi");
        lblHoadonchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoadonchiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHoadonchiLayout = new javax.swing.GroupLayout(pnlHoadonchi);
        pnlHoadonchi.setLayout(pnlHoadonchiLayout);
        pnlHoadonchiLayout.setHorizontalGroup(
            pnlHoadonchiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoadonchi, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pnlHoadonchiLayout.setVerticalGroup(
            pnlHoadonchiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoadonchi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlLeft.add(pnlHoadonchi);

        lblThongke.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongke.setText("Thống Kê");
        lblThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongkeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlThongkeLayout = new javax.swing.GroupLayout(pnlThongke);
        pnlThongke.setLayout(pnlThongkeLayout);
        pnlThongkeLayout.setHorizontalGroup(
            pnlThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongke, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pnlThongkeLayout.setVerticalGroup(
            pnlThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlLeft.add(pnlThongke);

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlFooter.setPreferredSize(new java.awt.Dimension(1219, 50));
        pnlFooter.setLayout(new javax.swing.BoxLayout(pnlFooter, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setPreferredSize(new java.awt.Dimension(609, 50));
        jPanel4.setLayout(null);

        lblTennguoidung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTennguoidung.setText("Người Dùng:");
        jPanel4.add(lblTennguoidung);
        lblTennguoidung.setBounds(0, 0, 461, 50);

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/exit.png"))); // NOI18N
        btnLogout.setText("  Đăng Xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogout);
        btnLogout.setBounds(442, 14, 160, 25);

        pnlFooter.add(jPanel4);

        lblDongho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDongho.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDongho.setText("Đồng Hồ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblDongho, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDongho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlFooter.add(jPanel7);

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlMain.setPreferredSize(new java.awt.Dimension(1000, 600));
        pnlMain.setLayout(new javax.swing.BoxLayout(pnlMain, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNguoidungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNguoidungMouseClicked
        loadJPanel(new PanelQLNguoiDung());
    }//GEN-LAST:event_lblNguoidungMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        ShareHelper.logOut();
        this.dispose();
        new LoginJdialog(this, true).setVisible(true);
        loadJPanel(new PanelHoaDonChi());
        this.setVisible(true);
        this.checkUser();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void lblLoaithuchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoaithuchiMouseClicked
        loadJPanel(new PanelLoaiThuChi());
    }//GEN-LAST:event_lblLoaithuchiMouseClicked

    private void lblHoadonchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoadonchiMouseClicked
        loadJPanel(new PanelHoaDonChi());
    }//GEN-LAST:event_lblHoadonchiMouseClicked

    private void lblHoadonthuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoadonthuMouseClicked
        loadJPanel(new PanelHoaDonThu());
    }//GEN-LAST:event_lblHoadonthuMouseClicked

    private void lblThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongkeMouseClicked
        if (ShareHelper.nguoiDung.getVaitro() == false) {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập chức năng này", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            loadJPanel(new PanelThongKe());
        }
    }//GEN-LAST:event_lblThongkeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblDongho;
    private javax.swing.JLabel lblHoadonchi;
    private javax.swing.JLabel lblHoadonthu;
    private javax.swing.JLabel lblLoaithuchi;
    private javax.swing.JLabel lblNguoidung;
    private javax.swing.JLabel lblTennguoidung;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHoadonchi;
    private javax.swing.JPanel pnlHoadonthu;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLoaithuchi;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlNguoidung;
    private javax.swing.JPanel pnlThongke;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("QUẢN LÝ THU CHI");
        this.setIconImage(ImageHelper.IMAGE);
        this.setResizable(false);
        new LoginJdialog(this, true).setVisible(true);
        checkUser();
        time();
        loadJPanel(new PanelQLNguoiDung());
    }
    
    private void time() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                        lblDongho.setText(format.format(new Date()) + "  ");
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
    
    private void loadJPanel(JPanel newPanel) {
        pnlMain.removeAll();
        pnlMain.add(newPanel);
        pnlMain.updateUI();
    }
    
    private void checkUser() {
        String roleUser = "Người Dùng: ";
        if (ShareHelper.nguoiDung.getVaitro()) {
            roleUser = "Quản Trị Viên: ";
        }
        lblTennguoidung.setText("  " + roleUser + ShareHelper.nguoiDung.getHoten());
    }
}
