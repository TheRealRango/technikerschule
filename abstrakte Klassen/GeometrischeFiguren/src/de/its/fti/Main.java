/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.fti;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author lorenz
 */
public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        // TODO code application logic here
        BasicLookAndFeel darcula = new DarculaLaf();
        UIManager.setLookAndFeel(darcula);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new GUI().setVisible(true);

            }

        });
    }

}
