package de.its.fti;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JTabbedPane;
import javax.swing.ListModel;
import javax.swing.UIManager;

public class GUI extends javax.swing.JFrame {

    private ListeGeometrischeFiguren listegeometrischerFiguren = new ListeGeometrischeFiguren();

    /**
     * Creates new form GUI
     */
    public GUI() {

        initComponents();
        erzeugeDaten();
        updateListandQm();

    }
    DecimalFormat new_format = new DecimalFormat("#.## m²"); //neues Format definieren

    private void erzeugeDaten() {
        Rechteck rechteck1 = new Rechteck();
        rechteck1.setHoehe(10);
        rechteck1.setBreite(5);
        rechteck1.setFarbe(Color.white);
        rechteck1.setLinie(Linienart.VOLL);
        listegeometrischerFiguren.add(rechteck1);

        Kreis kreis1 = new Kreis();
        kreis1.setRadius(5);
        kreis1.setFarbe(Color.blue);
        kreis1.setLinie(Linienart.GEPUNKTET);
        listegeometrischerFiguren.add(kreis1);

        Dreieck dreieck1 = new Dreieck();
        dreieck1.setGrundlinie(15);
        dreieck1.setHoehe(10);
        dreieck1.setFarbe(Color.red);
        dreieck1.setLinie(Linienart.GESTRICHELT);
        listegeometrischerFiguren.add(dreieck1);

    }

    private void updateListandQm() {
        lstOverview.setListData(listegeometrischerFiguren.getGeometrischeFigur());
        lb_sumFlaecheninhalte.setText("Summe aller Flächeninhalte: " + String.valueOf(new_format.format(listegeometrischerFiguren.getFlaecheninhalte())));
    }

    private void updateQm() {
        lb_sumFlaecheninhalte.setText("Summe aller Flächeninhalte: " + String.valueOf(new_format.format(listegeometrischerFiguren.getFlaecheninhalte())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pnlOverview = new javax.swing.JPanel();
        scrpnOverview = new javax.swing.JScrollPane();
        lstOverview = new javax.swing.JList();
        lb_sumFlaecheninhalte = new javax.swing.JLabel();
        pnlDetail = new javax.swing.JPanel();
        tbpnDetail = new javax.swing.JTabbedPane();
        pnlRectangle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfRectangleLength = new javax.swing.JTextField();
        tfRectangleWidth = new javax.swing.JTextField();
        pnlTriangle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfTriangleBaseline = new javax.swing.JTextField();
        tfTriangleHeight = new javax.swing.JTextField();
        pnlCircle = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfCircleRadius = new javax.swing.JTextField();
        btnSelectColor = new javax.swing.JButton();
        pnlControl = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cb_linienart = new javax.swing.JComboBox<>();

        jLabel3.setText("jLabel3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlOverview.setBorder(javax.swing.BorderFactory.createTitledBorder("Übersicht"));

        lstOverview.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstOverview.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOverviewValueChanged(evt);
            }
        });
        scrpnOverview.setViewportView(lstOverview);

        lb_sumFlaecheninhalte.setText("lb_sumFlaecheninhalte");

        javax.swing.GroupLayout pnlOverviewLayout = new javax.swing.GroupLayout(pnlOverview);
        pnlOverview.setLayout(pnlOverviewLayout);
        pnlOverviewLayout.setHorizontalGroup(
            pnlOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrpnOverview, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(pnlOverviewLayout.createSequentialGroup()
                        .addComponent(lb_sumFlaecheninhalte)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlOverviewLayout.setVerticalGroup(
            pnlOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrpnOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_sumFlaecheninhalte)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnlDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jLabel1.setText("Länge");

        jLabel2.setText("Breite");

        javax.swing.GroupLayout pnlRectangleLayout = new javax.swing.GroupLayout(pnlRectangle);
        pnlRectangle.setLayout(pnlRectangleLayout);
        pnlRectangleLayout.setHorizontalGroup(
            pnlRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRectangleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRectangleWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(tfRectangleLength))
                .addContainerGap())
        );
        pnlRectangleLayout.setVerticalGroup(
            pnlRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRectangleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfRectangleLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfRectangleWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tbpnDetail.addTab("Rechteck", pnlRectangle);

        jLabel4.setText("Grundlinie");

        jLabel5.setText("Hoehe");

        javax.swing.GroupLayout pnlTriangleLayout = new javax.swing.GroupLayout(pnlTriangle);
        pnlTriangle.setLayout(pnlTriangleLayout);
        pnlTriangleLayout.setHorizontalGroup(
            pnlTriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTriangleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlTriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTriangleBaseline, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(tfTriangleHeight))
                .addContainerGap())
        );
        pnlTriangleLayout.setVerticalGroup(
            pnlTriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTriangleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlTriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTriangleBaseline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTriangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTriangleHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tbpnDetail.addTab("Dreieck", pnlTriangle);

        jLabel6.setText("Radius");

        javax.swing.GroupLayout pnlCircleLayout = new javax.swing.GroupLayout(pnlCircle);
        pnlCircle.setLayout(pnlCircleLayout);
        pnlCircleLayout.setHorizontalGroup(
            pnlCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCircleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(tfCircleRadius, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCircleLayout.setVerticalGroup(
            pnlCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCircleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCircleRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tbpnDetail.addTab("Kreis", pnlCircle);

        btnSelectColor.setText("Farbe");
        btnSelectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectColorActionPerformed(evt);
            }
        });

        pnlControl.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        btnAdd.setText("hinzufügen");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("ändern");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("löschen");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cb_linienart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VOLL", "GEPUNKTET", "GESTRICHELT" }));

        javax.swing.GroupLayout pnlDetailLayout = new javax.swing.GroupLayout(pnlDetail);
        pnlDetail.setLayout(pnlDetailLayout);
        pnlDetailLayout.setHorizontalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailLayout.createSequentialGroup()
                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlControl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbpnDetail))
                        .addContainerGap())
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailLayout.createSequentialGroup()
                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_linienart, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelectColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
        );
        pnlDetailLayout.setVerticalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelectColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_linienart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbpnDetail.getAccessibleContext().setAccessibleName("rechteck");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstOverviewValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOverviewValueChanged
        // TODO add your handling code here:
        GeometrischeFigur figur = (GeometrischeFigur) lstOverview.getSelectedValue();
        if (figur != null) {
            btnSelectColor.setBackground(figur.getFarbe());
            switch (figur.getLinie().toString()) {
                case "VOLL":
                    cb_linienart.setSelectedIndex(0);
                    break;
                case "GEPUNKTET":
                    cb_linienart.setSelectedIndex(1);
                    break;
                case "GESTRICHELT":
                    cb_linienart.setSelectedIndex(2);
                    break;
            }

            if (figur instanceof Rechteck) {
                tbpnDetail.setSelectedIndex(0);
                Rechteck rechteck = (Rechteck) figur;
                tfRectangleLength.setText("" + rechteck.getHoehe());
                tfRectangleWidth.setText("" + rechteck.getBreite());
            } else if (figur instanceof Kreis) {
                tbpnDetail.setSelectedIndex(2);
                Kreis kreis = (Kreis) (figur);
                tfCircleRadius.setText("" + kreis.getRadius());

            } else if (figur instanceof Dreieck) {
                tbpnDetail.setSelectedIndex(1);
                Dreieck dreieck = (Dreieck) figur;
                tfTriangleBaseline.setText("" + dreieck.getGrundlinie());
                tfTriangleHeight.setText("" + dreieck.getHoehe());
            }
        }
    }//GEN-LAST:event_lstOverviewValueChanged

    private void btnSelectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectColorActionPerformed
        // TODO add your handling code here:
        Color ausgewaehltefarbe = JColorChooser.showDialog(this, "Farbauswahl", btnSelectColor.getBackground());
        btnSelectColor.setBackground(ausgewaehltefarbe);
    }//GEN-LAST:event_btnSelectColorActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        GeometrischeFigur figur = (GeometrischeFigur) lstOverview.getSelectedValue();

        Linienart tmp = Linienart.VOLL;
        switch (cb_linienart.getSelectedItem().toString()) {
            case "VOLL":
                tmp = Linienart.VOLL;
                break;
            case "GEPUNKTET":
                tmp = Linienart.GEPUNKTET;
                break;
            case "GESTRICHELT":
                tmp = Linienart.GESTRICHELT;
                break;
        }

        if (figur != null) {
            figur.setFarbe(btnSelectColor.getBackground());
            if (figur instanceof Rechteck) {
                Rechteck rechteck = (Rechteck) figur;
                rechteck.setBreite(Double.valueOf(tfRectangleWidth.getText()));
                rechteck.setHoehe(Double.valueOf(tfRectangleLength.getText()));
                rechteck.setLinie(tmp);
            } else if (figur instanceof Kreis) {

                Kreis kreis = (Kreis) (figur);
                kreis.setRadius(Double.valueOf(tfCircleRadius.getText()));

                kreis.setLinie(tmp);
            } else if (figur instanceof Dreieck) {

                Dreieck dreieck = (Dreieck) figur;
                dreieck.setGrundlinie(Double.valueOf(tfTriangleBaseline.getText()));
                dreieck.setHoehe(Double.valueOf(tfTriangleHeight.getText()));
                dreieck.setLinie(tmp);
            }
            lstOverview.repaint(); //Listbox wird neu gezeichnet
            //lstOverview.setListData(listegeometrischerFiguren.getGeometrischeFigur()); //--> unnötig weil keine neuen Daten hinzugefügt werden, repaint() reicht
            updateQm();

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //rechteck.setLinie(cb_linienart.getSelectedItem());
        Linienart tmp = Linienart.VOLL;
        switch (cb_linienart.getSelectedItem().toString()) {
            case "VOLL":
                tmp = Linienart.VOLL;
                break;
            case "GEPUNKTET":
                tmp = Linienart.GEPUNKTET;
                break;
            case "GESTRICHELT":
                tmp = Linienart.GESTRICHELT;
                break;
        }

        switch (tbpnDetail.getSelectedIndex()) {
            case 0:
                Rechteck rechteck = new Rechteck();
                rechteck.setBreite(Double.valueOf(tfRectangleWidth.getText()));
                rechteck.setHoehe(Double.valueOf(tfRectangleLength.getText()));
                rechteck.setFarbe(btnSelectColor.getBackground());
                rechteck.setLinie(tmp);
                listegeometrischerFiguren.add(rechteck);
                lstOverview.setListData(listegeometrischerFiguren.getGeometrischeFigur()); //hier wichtig!
                break;
            case 1:
                Dreieck dreieck = new Dreieck();
                dreieck.setGrundlinie(Double.valueOf(tfTriangleBaseline.getText()));
                dreieck.setHoehe(Double.valueOf(tfTriangleHeight.getText()));
                dreieck.setFarbe(btnSelectColor.getBackground());
                dreieck.setLinie(tmp);
                listegeometrischerFiguren.add(dreieck);
                lstOverview.setListData(listegeometrischerFiguren.getGeometrischeFigur()); //hier wichtig!
                break;
            case 2:

                Kreis kreis = new Kreis();
                kreis.setRadius(Double.valueOf(tfCircleRadius.getText()));
                kreis.setFarbe(btnSelectColor.getBackground());
                kreis.setLinie(tmp);
                listegeometrischerFiguren.add(kreis);
                lstOverview.setListData(listegeometrischerFiguren.getGeometrischeFigur()); //hier wichtig!
                break;

        }
        updateQm();


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //GeometrischeFigur figur = (GeometrischeFigur) lstOverview.getSelectedValue();
        int index = lstOverview.getSelectedIndex();
        listegeometrischerFiguren.remove(index);
        updateListandQm();

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSelectColor;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cb_linienart;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lb_sumFlaecheninhalte;
    private javax.swing.JList lstOverview;
    private javax.swing.JPanel pnlCircle;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlDetail;
    private javax.swing.JPanel pnlOverview;
    private javax.swing.JPanel pnlRectangle;
    private javax.swing.JPanel pnlTriangle;
    private javax.swing.JScrollPane scrpnOverview;
    private javax.swing.JTabbedPane tbpnDetail;
    private javax.swing.JTextField tfCircleRadius;
    private javax.swing.JTextField tfRectangleLength;
    private javax.swing.JTextField tfRectangleWidth;
    private javax.swing.JTextField tfTriangleBaseline;
    private javax.swing.JTextField tfTriangleHeight;
    // End of variables declaration//GEN-END:variables
}
