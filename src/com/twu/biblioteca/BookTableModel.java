package com.twu.biblioteca;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.BookList;

import javax.swing.table.AbstractTableModel;

/**
 * Created by zyongliu on 16/8/11.
 */
public class BookTableModel extends AbstractTableModel {
    private String[] tableHeads = new String[] {
            "ID", "Name", "Author", "Publish Time"
    };

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book book = (Book)ProductionList.getProduction(productions.get(rowIndex));
        switch(columnIndex) {
            case 0: return book.getId();
            case 1: return book.getName();
            case 2: return book.getAuthorName();
            case 3: return book.getYear();
            default: return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        return tableHeads[column];
    }
}
