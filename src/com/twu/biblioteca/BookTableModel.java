package com.twu.biblioteca;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.BookList;

import javax.swing.table.AbstractTableModel;

/**
 * Created by zyongliu on 16/8/11.
 */
public class BookTableModel extends AbstractTableModel {
    private java.util.List<String> books;
    private String[] tableHeads = new String[] {
            "ID", "Name", "Author", "Publish Time"
    };

    @Override
    public int getRowCount() {
        return books.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        return tableHeads[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book book = BookList.getBook(books.get(rowIndex));
        switch(columnIndex) {
            case 0: return book.getId();
            case 1: return book.getName();
            case 2: return book.getAuthorName();
            case 3: return book.getPublishYear();
            default: return null;
        }
    }

    public void setBooks( java.util.List<String> books ) {
        if( books == null )
            throw new IllegalArgumentException("The book list cannot be null");
        this.books = books;
        fireTableDataChanged();
    }

    public void addRow( String bookID ) {
        if( BookList.getBook(bookID) == null )
            throw new RuntimeException("Add fails");
        BookList.returnBook(bookID);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }

    public void deleteRow( int rowIndex ) {
        BookList.checkoutBook(books.get(rowIndex));
        fireTableRowsDeleted(getColumnCount(),getColumnCount());
    }

    public void deleteRow( Book book ) {
        BookList.checkoutBook(book.getId());
        fireTableRowsDeleted(getColumnCount(),getColumnCount());
    }
}
