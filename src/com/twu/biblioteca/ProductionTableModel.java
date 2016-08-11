package com.twu.biblioteca;

import com.twu.biblioteca.Domain.ProductionList;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by zyongliu on 16/8/11.
 */
public class ProductionTableModel extends AbstractTableModel {
    protected List<String> productions;

    @Override
    public int getRowCount() {
        return productions.size();
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    public void setProductions(List<String> productions) {
        if( productions == null )
            throw new IllegalArgumentException("The production list cannot be null");
        this.productions = productions;
        fireTableDataChanged();
    }

    public void addRow( String productionID ) {
        if( ProductionList.getProduction(productionID) == null )
            throw new RuntimeException("Add fails");
        ProductionList.returnProduction(productionID);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }

    public void deleteRow( int rowIndex ) {
        ProductionList.checkoutProduction(productions.get(rowIndex));
        fireTableRowsDeleted(getColumnCount(),getColumnCount());
    }
}
