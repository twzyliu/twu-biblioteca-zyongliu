package com.twu.biblioteca;

import javax.swing.*;
import java.awt.*;

public class BibliotecaApp extends JFrame{
    public BibliotecaApp() {
        initComponents();
        initEventListeners();
    }

    private void initComponents() {
        setTitle("Biblioteca - Library Management System");
        setSize(800,600);

        Container contentPane = getContentPane();

        setJMenuBar(new Menus());

        JLabel welcomeLabel = new JLabel("Welcome to the Biblioteca System! choose \"List Books\" on the top to see the available book list.");

        contentPane.add(welcomeLabel);
    }

    private void initEventListeners() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BibliotecaApp().setVisible(true);
            }
        });
    }
}
