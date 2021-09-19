package dynamic_subjtable;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableCellEditor extends DefaultCellEditor {

    private DefaultTableModel model;

    public TableCellEditor() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        Component com = super.getTableCellEditorComponent(jtable, o, bln, i, i1);
        if (o instanceof DefaultTableModel) {
            model = (DefaultTableModel) o;
            JTable tbl = new TableCustom(model);
            tbl.setBackground(com.getBackground());
            initHeaderWidth(tbl);
            autoRowHeight(tbl);
            return tbl;
        } else {
            return com;
        }
    }

    @Override
    public Object getCellEditorValue() {
        //  pass this model to cell render
        return model;
    }

    private void initHeaderWidth(JTable table) {
        for (int i = 0; i < table.getColumnCount(); i++) {
            Object obj = table.getValueAt(0, i);
            if (obj instanceof Header) {
                Header header = (Header) table.getValueAt(0, i);
                if (header.getWidth() >= 0) {
                    table.getColumnModel().getColumn(i).setPreferredWidth(header.getWidth());
                }
            }
        }
    }

    public void autoRowHeight(JTable table) {
        for (int row = 0; row < table.getRowCount(); row++) {
            int height = table.getRowHeight();
            for (int col = 0; col < table.getColumnCount(); col++) {
                Component comp = table.prepareRenderer(table.getCellRenderer(row, col), row, col);
                if (comp.getPreferredSize().height > height) {
                    height = comp.getPreferredSize().height;
                }
            }
            table.setRowHeight(row, height);
        }
    }
}
