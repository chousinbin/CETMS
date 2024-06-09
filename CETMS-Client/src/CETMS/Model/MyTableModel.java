package CETMS.Model;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class MyTableModel extends DefaultTableModel {
    private  Vector<Vector<Object>> date;
    private  Vector<Object> columns;

    public Vector<Vector<Object>> getDate() {
        return date;
    }

    public void setDate(Vector<Vector<Object>> date) {
        this.date = date;
    }

    public Vector<Object> getColumns() {
        return columns;
    }

    public void setColumns(Vector<Object> columns) {
        this.columns = columns;
    }
    //不可编辑
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
