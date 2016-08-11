package com.twu.biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zyongliu on 16/8/11.
 */
public class Menus extends JMenuBar{
    private JMenuItem listBooksMenu;

    public Menus() {
        initComponents();
        initEventListeners();
    }

    private void initComponents() {
        listBooksMenu = new JMenuItem("List Books");
        add(listBooksMenu);
    }

    private void initEventListeners() {
        listBooksMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BookListPanel.showBookList( getRootPane().getContentPane() );
            }
        });

    }
}
