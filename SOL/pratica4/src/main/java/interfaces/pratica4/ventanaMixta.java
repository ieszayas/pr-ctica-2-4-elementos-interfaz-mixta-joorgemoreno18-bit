/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.pratica4;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;

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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
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
        spltA = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        splt = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
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
        spltB = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelEstado = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        chkCorreoValido = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        edit_borrarTodo = new javax.swing.JMenuItem();

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

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTextoCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoCorreoKeyTyped(evt);
            }
        });

        jLabel2.setText("Contraseña");

        campoTextoContrasenia.putClientProperty("JPasswordField.showRevealButton", true);
        campoTextoContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoContraseniaActionPerformed(evt);
            }
        });
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

        btnRedondo.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_ROUND_RECT);
        btnRedondo.setText("Redondo");

        btnIcono.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_HELP);
        btnIcono.setText("?");

        spnr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        spltA.setLeftComponent(jPanel3);

        jPanel5.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        spltA.setRightComponent(jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        splt.setLeftComponent(jPanel6);

        jPanel7.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        splt.setRightComponent(jPanel7);

        spltA.setRightComponent(splt);

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

        btnRedondoB.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_ROUND_RECT);
        btnRedondoB.setText("Redondo");
        btnRedondoB.setEnabled(false);
        btnRedondoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedondoBActionPerformed(evt);
            }
        });

        spnrB.setEnabled(false);

        btnIconoB.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_HELP);
        btnIconoB.setText("?");
        btnIconoB.setEnabled(false);

        spltB.setEnabled(false);

        jPanel9.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        spltB.setLeftComponent(jPanel9);

        jPanel10.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        spltB.setRightComponent(jPanel10);

        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(spltB, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(396, 396, 396))
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAbajoLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAbajoLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jCheckBox1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(spltB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jCheckBox1)
                .addContainerGap(44, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblEstado)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lblEstado)
                .addContainerGap())
        );

        chkCorreoValido.setEnabled(false);

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc1)
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc3)
                            .addGroup(panelArribaLayout.createSequentialGroup()
                                .addComponent(opc2)
                                .addGap(130, 130, 130)
                                .addComponent(spnr, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addComponent(spltA, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(414, Short.MAX_VALUE))
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
                            .addComponent(jLabel1)
                            .addGap(66, 66, 66)
                            .addComponent(campoTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(345, Short.MAX_VALUE)))
            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelArribaLayout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(chkCorreoValido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(666, Short.MAX_VALUE)))
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addComponent(spltA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTextoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(panelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addContainerGap(312, Short.MAX_VALUE)))
            .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelArribaLayout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(chkCorreoValido)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");

        edit_borrarTodo.setText("Borrar todo");
        edit_borrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_borrarTodoActionPerformed(evt);
            }
        });
        jMenu3.add(edit_borrarTodo);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void campoTextoContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoContraseniaKeyReleased
        campoTextoContraseniaB.setText(campoTextoContrasenia.getText());    }//GEN-LAST:event_campoTextoContraseniaKeyReleased


    private void campoTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoKeyReleased
        String reverso = campoTexto.getText();
        reverso = new StringBuilder(reverso).reverse().toString();
        campoTextob.setText(reverso);    }//GEN-LAST:event_campoTextoKeyReleased

    private void edit_borrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_borrarTodoActionPerformed
        borrarPanel(panelArriba);

    }//GEN-LAST:event_edit_borrarTodoActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        sliderB.setValue(slider.getValue());
//        spltA.setBounds(spltA.getX(), spltA.getY(),slider.getValue(), spltA.getHeight());
        splt.setDividerLocation(slider.getValue());
        spltB.setDividerLocation(slider.getValue());

    }//GEN-LAST:event_sliderStateChanged

    private void campoTextoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoCorreoKeyTyped

        campoTextoCorreoB.setText(campoTextoCorreo.getText());


    }//GEN-LAST:event_campoTextoCorreoKeyTyped

    private void campoTextoCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoCorreoKeyReleased

        String correo = campoTextoCorreo.getText().trim();

        // Expresión regular sencilla para correos válidos
        boolean valido = correo.matches("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$");
        
        if (valido) {
            campoTextoCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN, 2));
            chkCorreoValido.setSelected(true);
            jCheckBox1.setSelected(true);
            lblEstado.setText("Correo válido️");
        } else {
            campoTextoCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED, 2));
            chkCorreoValido.setSelected(false);
            jCheckBox1.setSelected(true);
            lblEstado.setText("Correo no válido");
        }


    }//GEN-LAST:event_campoTextoCorreoKeyReleased

    private void campoTextoContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoContraseniaActionPerformed

    private void btnRedondoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedondoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedondoBActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void borrarPanel(java.awt.Container panel) {
        for (java.awt.Component comp : panel.getComponents()) {
            if (comp instanceof javax.swing.JTextField text) {
                text.setText("");
                campoTextoCorreoB.setText("");
                campoTextob.setText("");
            }
            if (comp instanceof javax.swing.JPasswordField pass) {
                pass.setText("");
                campoTextoContraseniaB.setText("");
            }
            if (comp instanceof javax.swing.JComboBox combo) {
                combo.setSelectedIndex(0);
            }
            if (comp instanceof javax.swing.JSpinner spin) {
                spin.setValue(0);
            }
            if (comp instanceof javax.swing.JSlider slider) {
                slider.setValue(50);
            }
            if (comp instanceof javax.swing.JCheckBox check) {
                check.setSelected(false);
            }
            if (comp instanceof javax.swing.JRadioButton radio) {
                radio.setSelected(false);
            }
        }
    }

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
    private javax.swing.JCheckBox chkCorreoValido;
    private javax.swing.JMenuItem edit_borrarTodo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblEstado;
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
    private javax.swing.JPanel panelEstado;
    private javax.swing.JSlider slider;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSplitPane splt;
    private javax.swing.JSplitPane spltA;
    private javax.swing.JSplitPane spltB;
    private javax.swing.JSpinner spnr;
    private javax.swing.JSpinner spnrB;
    // End of variables declaration//GEN-END:variables

}
