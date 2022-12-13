/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author gblan
 */
public class Vehiculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vehiculos
     */
    public Vehiculos() {
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

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        placaText = new javax.swing.JLabel();
        typePlaca = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        marcaText = new javax.swing.JLabel();
        typeMarca = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        modelText = new javax.swing.JLabel();
        typeModel = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        yearText = new javax.swing.JLabel();
        typeYear = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        colorText = new javax.swing.JLabel();
        typeColor = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        ccText = new javax.swing.JLabel();
        typeCC = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        gasText = new javax.swing.JLabel();
        espaciosText = new javax.swing.JLabel();
        typeEspacios = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        dayCostText = new javax.swing.JLabel();
        typeDayCost = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        extrasText = new javax.swing.JLabel();
        typeExtras = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        statusText = new javax.swing.JLabel();
        gasCombo = new javax.swing.JComboBox<>();
        statusCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JTextArea();
        deleteBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(910, 690));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 78, 106));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehiculos");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(903, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        tittle.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        tittle.setText("Registro de Vehiculos");
        bg.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        placaText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        placaText.setText("Placa:");
        bg.add(placaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        typePlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typePlaca.setForeground(new java.awt.Color(153, 153, 153));
        typePlaca.setText("409425");
        typePlaca.setBorder(null);
        typePlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typePlacaActionPerformed(evt);
            }
        });
        bg.add(typePlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 240, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 260, 10));

        marcaText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        marcaText.setText("Marca:");
        bg.add(marcaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        typeMarca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeMarca.setForeground(new java.awt.Color(153, 153, 153));
        typeMarca.setText("Hyundai");
        typeMarca.setBorder(null);
        typeMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeMarcaActionPerformed(evt);
            }
        });
        bg.add(typeMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 10));

        modelText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modelText.setText("Modelo:");
        bg.add(modelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        typeModel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeModel.setForeground(new java.awt.Color(153, 153, 153));
        typeModel.setText("Accent");
        typeModel.setBorder(null);
        typeModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeModelActionPerformed(evt);
            }
        });
        bg.add(typeModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 240, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 260, 10));

        yearText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        yearText.setText("Año:");
        bg.add(yearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        typeYear.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeYear.setForeground(new java.awt.Color(153, 153, 153));
        typeYear.setText("2023");
        typeYear.setBorder(null);
        typeYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeYearActionPerformed(evt);
            }
        });
        bg.add(typeYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 10));

        colorText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        colorText.setText("Color:");
        bg.add(colorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        typeColor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeColor.setForeground(new java.awt.Color(153, 153, 153));
        typeColor.setText("Blanco");
        typeColor.setBorder(null);
        typeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeColorActionPerformed(evt);
            }
        });
        bg.add(typeColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 240, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 260, 10));

        ccText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ccText.setText("Cilindrada: ");
        bg.add(ccText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        typeCC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeCC.setForeground(new java.awt.Color(153, 153, 153));
        typeCC.setText("250cc");
        typeCC.setBorder(null);
        typeCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeCCActionPerformed(evt);
            }
        });
        bg.add(typeCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 240, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 260, 10));

        gasText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        gasText.setText("Combustible:");
        bg.add(gasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 20));

        espaciosText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        espaciosText.setText("Pasajeros:");
        bg.add(espaciosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));

        typeEspacios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeEspacios.setForeground(new java.awt.Color(153, 153, 153));
        typeEspacios.setText("5");
        typeEspacios.setBorder(null);
        typeEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeEspaciosActionPerformed(evt);
            }
        });
        bg.add(typeEspacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 240, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 260, 10));

        dayCostText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        dayCostText.setText("Costo/Día:");
        bg.add(dayCostText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 20));

        typeDayCost.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeDayCost.setForeground(new java.awt.Color(153, 153, 153));
        typeDayCost.setText("30");
        typeDayCost.setBorder(null);
        typeDayCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDayCostActionPerformed(evt);
            }
        });
        bg.add(typeDayCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 240, -1));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 260, 10));

        extrasText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        extrasText.setText("Extras:");
        bg.add(extrasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));

        typeExtras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeExtras.setForeground(new java.awt.Color(153, 153, 153));
        typeExtras.setText("Camara, sensores, barra");
        typeExtras.setBorder(null);
        typeExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeExtrasActionPerformed(evt);
            }
        });
        bg.add(typeExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 240, -1));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 260, 10));

        statusText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        statusText.setText("Estado: ");
        bg.add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 20));

        gasCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Super", "Diesel" }));
        bg.add(gasCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 260, -1));

        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible" }));
        bg.add(statusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 260, -1));

        panel.setColumns(20);
        panel.setRows(5);
        jScrollPane1.setViewportView(panel);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 900, 260));

        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        bg.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 240, 40));

        newBtn.setText("Nuevo");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });
        bg.add(newBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 240, 40));

        updateBtn.setText("Actualizar");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        bg.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typePlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typePlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typePlacaActionPerformed

    private void typeMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeMarcaActionPerformed

    private void typeModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeModelActionPerformed

    private void typeYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeYearActionPerformed

    private void typeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeColorActionPerformed

    private void typeCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeCCActionPerformed

    private void typeEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeEspaciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeEspaciosActionPerformed

    private void typeDayCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDayCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDayCostActionPerformed

    private void typeExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeExtrasActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel ccText;
    private javax.swing.JLabel colorText;
    private javax.swing.JLabel dayCostText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel espaciosText;
    private javax.swing.JLabel extrasText;
    private javax.swing.JComboBox<String> gasCombo;
    private javax.swing.JLabel gasText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel marcaText;
    private javax.swing.JLabel modelText;
    private javax.swing.JButton newBtn;
    private javax.swing.JTextArea panel;
    private javax.swing.JLabel placaText;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JLabel statusText;
    private javax.swing.JLabel tittle;
    private javax.swing.JTextField typeCC;
    private javax.swing.JTextField typeColor;
    private javax.swing.JTextField typeDayCost;
    private javax.swing.JTextField typeEspacios;
    private javax.swing.JTextField typeExtras;
    private javax.swing.JTextField typeMarca;
    private javax.swing.JTextField typeModel;
    private javax.swing.JTextField typePlaca;
    private javax.swing.JTextField typeYear;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel yearText;
    // End of variables declaration//GEN-END:variables
}
