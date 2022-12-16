/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author gblan
 */
public class CarAsign extends javax.swing.JInternalFrame {

    /**
     * Creates new form CarAsign
     */
    public CarAsign() {
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
        extrasText = new javax.swing.JLabel();
        typeDay = new javax.swing.JTextField();
        minPassText = new javax.swing.JLabel();
        asignarText = new javax.swing.JLabel();
        typeExtras = new javax.swing.JTextField();
        typeMinPass = new javax.swing.JTextField();
        marcaText = new javax.swing.JLabel();
        typeMarca = new javax.swing.JTextField();
        modelText = new javax.swing.JLabel();
        typeModel = new javax.swing.JTextField();
        yearText = new javax.swing.JLabel();
        typeYear = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        asignarAreaText = new javax.swing.JTextArea();
        attendBtn = new javax.swing.JButton();
        asignBtn = new javax.swing.JButton();
        totalAmount = new javax.swing.JLabel();
        typeAsignar = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        dayText = new javax.swing.JLabel();
        subtotalText = new javax.swing.JLabel();
        impuestoText = new javax.swing.JLabel();
        totalText = new javax.swing.JLabel();
        subtotalAmount = new javax.swing.JLabel();
        impuestosAmount = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 78, 106));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asignación de Vehiculos");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        tittle.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        tittle.setText("Asignar Vehiculo");
        bg.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        extrasText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        extrasText.setText("Extras:");
        bg.add(extrasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        typeDay.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeDay.setForeground(new java.awt.Color(153, 153, 153));
        typeDay.setText("14");
        typeDay.setBorder(null);
        typeDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDayActionPerformed(evt);
            }
        });
        bg.add(typeDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 240, -1));

        minPassText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        minPassText.setText("Minimo de Pasajeros: ");
        bg.add(minPassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        asignarText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        asignarText.setText("Vehiculo a Asignar:");
        bg.add(asignarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        typeExtras.setForeground(new java.awt.Color(153, 153, 153));
        typeExtras.setText("Camara, asientos de cuero, sensores");
        typeExtras.setBorder(null);
        bg.add(typeExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 240, -1));

        typeMinPass.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeMinPass.setForeground(new java.awt.Color(153, 153, 153));
        typeMinPass.setText("5");
        typeMinPass.setBorder(null);
        bg.add(typeMinPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, -1));

        marcaText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        marcaText.setText("Marca: ");
        bg.add(marcaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        typeMarca.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeMarca.setForeground(new java.awt.Color(153, 153, 153));
        typeMarca.setText("Hyundai");
        typeMarca.setBorder(null);
        bg.add(typeMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 240, -1));

        modelText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        modelText.setText("Modelo:");
        bg.add(modelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        typeModel.setForeground(new java.awt.Color(153, 153, 153));
        typeModel.setText("Accent");
        typeModel.setBorder(null);
        bg.add(typeModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 240, -1));

        yearText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        yearText.setText("Año:");
        bg.add(yearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        typeYear.setForeground(new java.awt.Color(153, 153, 153));
        typeYear.setText("2017");
        typeYear.setBorder(null);
        bg.add(typeYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 240, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 240, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 240, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 240, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 240, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 240, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 240, 10));

        asignarAreaText.setColumns(20);
        asignarAreaText.setRows(5);
        jScrollPane1.setViewportView(asignarAreaText);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 890, 220));

        attendBtn.setText("Atender");
        attendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendBtnActionPerformed(evt);
            }
        });
        bg.add(attendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, 30));

        asignBtn.setText("Asignar");
        asignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignBtnActionPerformed(evt);
            }
        });
        bg.add(asignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 30));

        totalAmount.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        totalAmount.setText("0.00");
        bg.add(totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        typeAsignar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeAsignar.setForeground(new java.awt.Color(153, 153, 153));
        typeAsignar.setText("409425");
        typeAsignar.setBorder(null);
        typeAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAsignarActionPerformed(evt);
            }
        });
        bg.add(typeAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 240, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 240, 10));

        dayText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        dayText.setText("Cantidad de días: ");
        bg.add(dayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        subtotalText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        subtotalText.setText("SubTotal: ");
        bg.add(subtotalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        impuestoText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        impuestoText.setText("Impuestos:");
        bg.add(impuestoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        totalText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        totalText.setText("Total:");
        bg.add(totalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        subtotalAmount.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        subtotalAmount.setText("0.00");
        bg.add(subtotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        impuestosAmount.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        impuestosAmount.setText("0.00");
        bg.add(impuestosAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

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

    private void typeDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDayActionPerformed

    private void attendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendBtnActionPerformed

    private void typeAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeAsignarActionPerformed

    private void asignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignBtn;
    private javax.swing.JTextArea asignarAreaText;
    private javax.swing.JLabel asignarText;
    private javax.swing.JButton attendBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel dayText;
    private javax.swing.JLabel extrasText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel impuestoText;
    private javax.swing.JLabel impuestosAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel marcaText;
    private javax.swing.JLabel minPassText;
    private javax.swing.JLabel modelText;
    private javax.swing.JLabel subtotalAmount;
    private javax.swing.JLabel subtotalText;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JLabel totalText;
    private javax.swing.JTextField typeAsignar;
    private javax.swing.JTextField typeDay;
    private javax.swing.JTextField typeExtras;
    private javax.swing.JTextField typeMarca;
    private javax.swing.JTextField typeMinPass;
    private javax.swing.JTextField typeModel;
    private javax.swing.JTextField typeYear;
    private javax.swing.JLabel yearText;
    // End of variables declaration//GEN-END:variables
}
