package de.its.lf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lorenz
 */
public class GUI_Main extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Main
     */
    public GUI_Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txf_eingabe = new javax.swing.JTextField();
        bt_tolowercase = new javax.swing.JButton();
        bt_touppercase = new javax.swing.JButton();
        bt_towin98 = new javax.swing.JButton();
        lbl_ausgabe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bitte geben Sie hier den eingegebenen Text ein:");

        bt_tolowercase.setText("In Kleinbuchstaben konvertieren");
        bt_tolowercase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tolowercaseActionPerformed(evt);
            }
        });

        bt_touppercase.setText("in Großbuchstaben formatieren");
        bt_touppercase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_touppercaseActionPerformed(evt);
            }
        });

        bt_towin98.setText("zu Win98 konvertieren");
        bt_towin98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_towin98ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ausgabe:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txf_eingabe)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_tolowercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_touppercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_towin98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_ausgabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txf_eingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_tolowercase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_touppercase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_towin98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ausgabe)
                    .addComponent(jLabel2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_tolowercaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tolowercaseActionPerformed
        // TODO add your handling code here:
        String eingabe;
        String ausgabe;
        Convert aendern = new Convert();
        eingabe = txf_eingabe.getText(); //auslesen des Textfeldes
        ausgabe = aendern.tolowercase(eingabe); //aufrufen der Methode tolowercase des objekts aender der Klasse Convert
        lbl_ausgabe.setText(ausgabe); //label setzen mit der Ausgabe

    }//GEN-LAST:event_bt_tolowercaseActionPerformed

    private void bt_touppercaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_touppercaseActionPerformed
        // TODO add your handling code here:
        String eingabe;
        String ausgabe;
        Convert aendern = new Convert();
        eingabe = txf_eingabe.getText();
        ausgabe = aendern.touppercase(eingabe);
        lbl_ausgabe.setText(ausgabe);
    }//GEN-LAST:event_bt_touppercaseActionPerformed

    private void bt_towin98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_towin98ActionPerformed
        // TODO add your handling code here:
        String eingabe;
        String ausgabe;
        Convert aendern = new Convert();
        eingabe = txf_eingabe.getText();
        ausgabe = aendern.towin98(eingabe);
        lbl_ausgabe.setText(ausgabe);
    }//GEN-LAST:event_bt_towin98ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_tolowercase;
    private javax.swing.JButton bt_touppercase;
    private javax.swing.JButton bt_towin98;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_ausgabe;
    private javax.swing.JTextField txf_eingabe;
    // End of variables declaration//GEN-END:variables
}