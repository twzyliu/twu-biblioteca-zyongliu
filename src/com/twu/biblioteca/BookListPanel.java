package com.twu.biblioteca;

import com.twu.biblioteca.Domain.BookList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zyongliu on 16/8/11.
 */
public class BookListPanel extends JPanel{
    private JTable bookListTable;
    private BookTableModel bookTableModel;
    private JPanel buttonPanel;
    private JButton checkoutButton;
    private JButton returnButton;

    public BookListPanel() {
        initComponents();
        initEventListeners();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        //add book lists
        bookTableModel = new BookTableModel();
        bookTableModel.setBooks(BookList.getAvailableBooks());
        bookListTable = new JTable(bookTableModel);
        JScrollPane scrollPane = new JScrollPane(bookListTable);
        this.add(scrollPane);

        //add operation buttons: check out and return
        buttonPanel = new JPanel();
        checkoutButton = new JButton("check out");
        returnButton = new JButton("return");
        buttonPanel.add(checkoutButton);
        buttonPanel.add(returnButton);
        this.add(buttonPanel,BorderLayout.SOUTH);
    }

    private void initEventListeners() {
        //handle the checkout operation
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowIndex = bookListTable.getSelectedRow();
                bookTableModel.deleteRow(rowIndex);
                //System.out.println("the books size after checkout:" + BookList.getTotalCount());
            }
        });

        //handle the return operation
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JDialog returnDialog = new JDialog();
                returnDialog.setSize(400,150);
                returnDialog.setTitle("Return Book");

                JLabel bookNameLab = new JLabel("Input the ID of the book to return:");
                final JTextField bookIDTextField = new JTextField(20);
                JButton returnConfirmButton = new JButton("confirm to return the book");

                returnDialog.setLayout(new FlowLayout());
                returnDialog.add(bookNameLab);
                returnDialog.add(bookIDTextField);
                returnDialog.add(returnConfirmButton);
                returnDialog.setVisible(true);

                returnConfirmButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String id = bookIDTextField.getText();
                        bookTableModel.addRow(id);
                        //System.out.println("the books size after return:" + BookList.getTotalCount());
                        returnDialog.setVisible(false);
                    }
                });


            }
        });
    }

    public static void showBookList( Container contentPane ) {
        contentPane.removeAll();
        contentPane.add( new BookListPanel() );
        contentPane.repaint();
        contentPane.validate();
        contentPane.invalidate();
        contentPane.validate();
    }

}

