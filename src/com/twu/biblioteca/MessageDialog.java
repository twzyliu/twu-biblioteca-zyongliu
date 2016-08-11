package com.twu.biblioteca;

import javax.swing.*;

/**
 * Created by zyongliu on 16/8/11.
 */
public class MessageDialog {
    public static void showMessageDialog( Object message, int messageType ) {
        JOptionPane.showMessageDialog(null, message, "System Message", messageType);
    }
}
