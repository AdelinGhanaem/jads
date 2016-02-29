package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/25/16.
 */
public class SomeForm{
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;

    public SomeForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("KUR!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setContentPane(new SomeForm().panel1);
        f.setSize(400,400);
        f.setVisible(true);

        new SomeForm();

    }
}
