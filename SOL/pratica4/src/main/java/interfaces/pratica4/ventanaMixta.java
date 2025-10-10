/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.pratica4;

/**
 *
 * @author dam2-pc11
 */
public class ventanaMixta extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ventanaMixta.class.getName());

    public ventanaMixta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp1 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGrp2 = new javax.swing.ButtonGroup();
        panelArriba = new javax.swing.JPanel();
        cbx = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoTextoCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTextoContrasenia = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc1 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JCheckBox();
        opc6 = new javax.swing.JCheckBox();
        opc5 = new javax.swing.JCheckBox();
        campoTexto = new javax.swing.JTextField();
        slider = new javax.swing.JSlider();
        btnRedondo = new javax.swing.JButton();
        btnIcono = new javax.swing.JButton();
        spnr = new javax.swing.JSpinner();
        panelAbajo = new javax.swing.JPanel();
        cbxB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        campoTextoCorreoB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTextoContraseniaB = new javax.swing.JPasswordField();
        btnAceptarB = new javax.swing.JButton();
        opc2b = new javax.swing.JRadioButton();
        opc3b = new javax.swing.JRadioButton();
        opc1b = new javax.swing.JRadioButton();
        opc4b = new javax.swing.JCheckBox();
        opc6b = new javax.swing.JCheckBox();
        opc5b = new javax.swing.JCheckBox();
        campoTextob = new javax.swing.JTextField();
        sliderB = new javax.swing.JSlider();
        btnRedondoB = new javax.swing.JButton();
        spnrB = new javax.swing.JSpinner();
        btnIconoB = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxActionPerformed(evt);
            }
        });

        jLabel1.setText("Correo");

        campoTextoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoCorreoKeyTyped(evt);
            }
        });

        jLabel2.setText("Contraseña");

        campoTextoContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTextoContraseniaKeyReleased(evt);
            }
        });

        btnAceptar.setText("Aceptar");

        btnGrp1.add(opc2);
        opc2.setText("Opcion 2");
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        btnGrp1.add(opc3);
        opc3.setText("Opcion 3");
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        btnGrp1.add(opc1);
        opc1.setText("Opcion 1");
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc4.setText("Opcion 4");
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        opc6.setText("Opcion 6");
        opc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc6ActionPerformed(evt);
            }
        });

        opc5.setText("Opcion 5");
        opc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc5ActionPerformed(evt);
            }
        });

        campoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTextoKeyReleased(evt);
            }
        });

        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        btnRedondo.setText("Redondo");

        btnIcono.setText("?");

        spnr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc1)
                    .addComponent(opc3)
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addComponent(opc2)
                        .addGap(130, 130, 130)
                        .addComponent(spnr, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(738, Short.MAX_VALUE))
            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelArribaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelArribaLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(opc4)
                                .addComponent(opc5)
                                .addComponent(opc6))
                            .addGap(40, 40, 40)
                            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelArribaLayout.createSequentialGroup()
                                    .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelArribaLayout.createSequentialGroup()
                                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnRedondo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(panelArribaLayout.createSequentialGroup()
                            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(39, 39, 39)
                            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoTextoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opc1)
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(opc2))
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(spnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opc3)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelArribaLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opc4)
                            .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(opc5)
                    .addGap(8, 8, 8)
                    .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opc6)
                        .addComponent(cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btnAceptar)
                        .addComponent(btnRedondo)
                        .addComponent(btnIcono))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTextoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        panelAbajo.setEnabled(false);

        cbxB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxB.setEnabled(false);

        jLabel3.setText("Correo");
        jLabel3.setEnabled(false);

        campoTextoCorreoB.setEnabled(false);

        jLabel4.setText("Contraseña");
        jLabel4.setEnabled(false);

        campoTextoContraseniaB.setEnabled(false);

        btnAceptarB.setText("Aceptar");
        btnAceptarB.setEnabled(false);

        btnGrp2.add(opc2b);
        opc2b.setText("Opcion 2");
        opc2b.setEnabled(false);

        btnGrp2.add(opc3b);
        opc3b.setText("Opcion 3");
        opc3b.setEnabled(false);

        btnGrp2.add(opc1b);
        opc1b.setText("Opcion 1");
        opc1b.setEnabled(false);

        opc4b.setText("Opcion 4");
        opc4b.setEnabled(false);

        opc6b.setText("Opcion 6");
        opc6b.setEnabled(false);

        opc5b.setText("Opcion 5");
        opc5b.setEnabled(false);

        campoTextob.setEnabled(false);

        sliderB.setEnabled(false);

        btnRedondoB.setText("Redondo");
        btnRedondoB.setEnabled(false);

        spnrB.setEnabled(false);

        btnIconoB.setText("?");
        btnIconoB.setEnabled(false);

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAbajoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAbajoLayout.createSequentialGroup()
                            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(opc1b)
                                .addComponent(opc3b)
                                .addComponent(opc2b))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(opc4b)
                                .addComponent(opc5b)
                                .addComponent(opc6b))
                            .addGap(40, 40, 40)
                            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spnrB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelAbajoLayout.createSequentialGroup()
                                    .addComponent(campoTextob, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(btnAceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRedondoB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnIconoB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelAbajoLayout.createSequentialGroup()
                            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(39, 39, 39)
                            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoTextoCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoTextoContraseniaB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAbajoLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opc1b)
                        .addComponent(opc4b)
                        .addComponent(campoTextob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opc2b)
                            .addComponent(opc5b))
                        .addComponent(spnrB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opc3b)
                        .addComponent(opc6b)
                        .addComponent(cbxB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTextoCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(btnAceptarB)
                        .addComponent(btnRedondoB)
                        .addComponent(btnIconoB))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTextoContraseniaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed

        opc2b.setSelected(opc2.isSelected());
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed

        opc1b.setSelected(opc1.isSelected());
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        opc3b.setSelected(opc3.isSelected());
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        opc4b.setSelected(opc4.isSelected());
    }//GEN-LAST:event_opc4ActionPerformed

    private void opc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc5ActionPerformed
        opc5b.setSelected(opc5.isSelected());
    }//GEN-LAST:event_opc5ActionPerformed

    private void opc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc6ActionPerformed
        opc6b.setSelected(opc6.isSelected());
    }//GEN-LAST:event_opc6ActionPerformed

    private void cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxActionPerformed
        cbxB.setSelectedItem(cbx.getSelectedItem());
    }//GEN-LAST:event_cbxActionPerformed

    private void spnrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrStateChanged
        spnrB.setValue(spnr.getValue());
    }//GEN-LAST:event_spnrStateChanged

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        sliderB.setValue(slider.getValue());    }//GEN-LAST:event_sliderStateChanged

    private void campoTextoContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoContraseniaKeyReleased
        campoTextoContraseniaB.setText(campoTextoContrasenia.getText());    }//GEN-LAST:event_campoTextoContraseniaKeyReleased


    private void campoTextoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoCorreoKeyTyped
        campoTextoCorreoB.setText(campoTextoCorreo.getText());     }//GEN-LAST:event_campoTextoCorreoKeyTyped

    private void campoTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoKeyReleased
        String reverso = campoTexto.getText();
        reverso = new StringBuilder(reverso).reverse().toString();
        campoTextob.setText(reverso);    }//GEN-LAST:event_campoTextoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // Aplicar FlatLaf como Look & Feel moderno
            com.formdev.flatlaf.FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("No se pudo aplicar FlatLaf: " + ex);
        }
        java.awt.EventQueue.invokeLater(() -> new ventanaMixta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarB;
    private javax.swing.ButtonGroup btnGrp1;
    private javax.swing.ButtonGroup btnGrp2;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnIconoB;
    private javax.swing.JButton btnRedondo;
    private javax.swing.JButton btnRedondoB;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JPasswordField campoTextoContrasenia;
    private javax.swing.JPasswordField campoTextoContraseniaB;
    private javax.swing.JTextField campoTextoCorreo;
    private javax.swing.JTextField campoTextoCorreoB;
    private javax.swing.JTextField campoTextob;
    private javax.swing.JComboBox<String> cbx;
    private javax.swing.JComboBox<String> cbxB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc1b;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc2b;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc3b;
    private javax.swing.JCheckBox opc4;
    private javax.swing.JCheckBox opc4b;
    private javax.swing.JCheckBox opc5;
    private javax.swing.JCheckBox opc5b;
    private javax.swing.JCheckBox opc6;
    private javax.swing.JCheckBox opc6b;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JSlider slider;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSpinner spnr;
    private javax.swing.JSpinner spnrB;
    // End of variables declaration//GEN-END:variables

}
