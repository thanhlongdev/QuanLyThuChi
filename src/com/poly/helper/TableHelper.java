package com.poly.helper;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class TableHelper extends AbstractCellEditor
        implements TableCellRenderer, TableCellEditor, ActionListener {

    JTable table;
    JButton renderButton;
    String text;
    ImageIcon icon = new ImageIcon(getClass().getResource("/com/poly/icon/delete.png"));

    public TableHelper(JTable table, int column, ActionListener actionListener) {
        super();
        this.table = table;
        renderButton = new JButton();
        renderButton.setIcon(icon);
        renderButton.addActionListener(actionListener);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(column).setCellRenderer(this);
        columnModel.getColumn(column).setCellEditor(this);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//            if (hasFocus) {
//                renderButton.setForeground(table.getForeground());
//                renderButton.setBackground(UIManager.getColor("Button.background"));
//            } else if (isSelected) {
//                renderButton.setForeground(table.getSelectionForeground());
//                renderButton.setBackground(table.getSelectionBackground());
//            } else {
//                renderButton.setForeground(table.getForeground());
//                renderButton.setBackground(UIManager.getColor("Button.background"));
//            }
        renderButton.setBackground(Color.WHITE);
        renderButton.setOpaque(false);
        renderButton.setBorderPainted(false);
        renderButton.setFocusPainted(false);
        renderButton.setContentAreaFilled(false);
        renderButton.setText((value == null) ? "" : value.toString());
        return renderButton;
    }

    @Override
    public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column) {
        text = (value == null) ? "" : value.toString();
        renderButton.setText(text);
        return renderButton;
    }

    @Override
    public Object getCellEditorValue() {
        return text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
