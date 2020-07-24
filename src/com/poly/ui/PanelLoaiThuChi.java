/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ui;

import com.poly.dao.LoaiChiDAO;
import com.poly.dao.LoaiThuDAO;
import com.poly.helper.TableHelper;
import com.poly.model.LoaiChi;
import com.poly.model.LoaiThu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author THANHLONG
 */
public class PanelLoaiThuChi extends javax.swing.JPanel {

    /**
     * Creates new form PanelLoaiThuChi
     */
    public static PanelLoaiThuChi reloadPanel;

    public PanelLoaiThuChi() {
        reloadPanel = this;
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnChi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLoaiChi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnThu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaithu = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("  QUẢN LÝ LOẠI THU / CHI");
        jLabel1.setPreferredSize(new java.awt.Dimension(228, 70));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(995, 50));

        btnChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/add.png"))); // NOI18N
        btnChi.setText("THÊM LOẠI CHI");
        btnChi.setPreferredSize(new java.awt.Dimension(160, 25));
        btnChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(btnChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        tblLoaiChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Loại", "Tên Loại Chi", "Xoá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiChi.setShowVerticalLines(false);
        tblLoaiChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiChiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLoaiChi);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("LOẠI CHI", jPanel2);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(995, 50));

        btnThu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/add.png"))); // NOI18N
        btnThu.setText("THÊM LOẠI THU");
        btnThu.setPreferredSize(new java.awt.Dimension(160, 25));
        btnThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(btnThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        tblLoaithu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Loại", "Tên Loại Thu", "Xoá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaithu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaithuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaithu);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("LOẠI THU", jPanel1);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiActionPerformed
        new FrameThemLoaiChi(null).setVisible(true);
    }//GEN-LAST:event_btnChiActionPerformed

    private void btnThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuActionPerformed
        new FrameThemLoaiThu(null).setVisible(true);
    }//GEN-LAST:event_btnThuActionPerformed

    private void tblLoaiChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiChiMouseClicked
        if (evt.getClickCount() == 2) {
            new FrameThemLoaiChi(listLoaiChi.get(tblLoaiChi.getSelectedRow())).setVisible(true);
        }
    }//GEN-LAST:event_tblLoaiChiMouseClicked

    private void tblLoaithuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaithuMouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println(evt.getClickCount());
            new FrameThemLoaiThu(listLoaiThu.get(tblLoaithu.getSelectedRow())).setVisible(true);
        }
    }//GEN-LAST:event_tblLoaithuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChi;
    private javax.swing.JButton btnThu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLoaiChi;
    private javax.swing.JTable tblLoaithu;
    // End of variables declaration//GEN-END:variables

    List<LoaiThu> listLoaiThu = new ArrayList<>();
    List<LoaiChi> listLoaiChi = new ArrayList<>();

    private void init() {
        loadAll();
    }

    private void TableUI(JTable table) {
        table.setRowHeight(25);
        TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    private void loadAll() {
        loadLoaiChi();
        loadLoaiThu();
    }

    public void loadLoaiThu() {
        if (!listLoaiThu.isEmpty()) {
            listLoaiThu.clear();
        }
        listLoaiThu = new LoaiThuDAO().getListLoaiThu();
        fillToTableLoaiThu();
    }

    private void fillToTableLoaiThu() {
        if (listLoaiThu != null) {
            DefaultTableModel model = (DefaultTableModel) tblLoaithu.getModel();
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá ?", "Waring", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(choose == JOptionPane.YES_OPTION){
                        //Delete method
                    }
                }
            };
            tblLoaithu.getColumnModel().getColumn(3).setCellRenderer(new TableHelper(tblLoaithu, 3, actionListener));
            model.setRowCount(0);
            int count = 0;
            for (LoaiThu x : listLoaiThu) {
                Object[] row = new Object[]{
                    ++count,
                    x.getMaloaithu(),
                    x.getTenloaithu()};
                model.addRow(row);
            }
        }
        TableUI(tblLoaithu);
    }

    public void loadLoaiChi() {
        if (!listLoaiChi.isEmpty()) {
            listLoaiChi.clear();
        }
        listLoaiChi = new LoaiChiDAO().getListLoaiChi();
        fillToTableLoaiChi();
    }

    private void fillToTableLoaiChi() {
        if (listLoaiChi != null) {
            DefaultTableModel model = (DefaultTableModel) tblLoaiChi.getModel();
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int choose = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá ?", "Waring", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(choose == JOptionPane.YES_OPTION){
                        //Delete method
                    }
                }
            };
            tblLoaiChi.getColumnModel().getColumn(3).setCellRenderer(new TableHelper(tblLoaiChi, 3, actionListener));
            model.setRowCount(0);
            int count = 0;
            for (LoaiChi x : listLoaiChi) {
                Object[] row = new Object[]{
                    ++count,
                    x.getMaloaichi(),
                    x.getTenloai()};
                model.addRow(row);
            }
        }
        TableUI(tblLoaiChi);
    }
}
