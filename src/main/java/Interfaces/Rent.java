/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

import Rent_A_Car.*;
import java.awt.Color;

/**
 *
 * @author gblan
 */
public class Rent extends javax.swing.JInternalFrame {

    /**
     * Creates new form Rent
     */
    Clientes cl = new Clientes();
    private static ColaSolicitud soli = new ColaSolicitud();

    public ColaSolicitud getSoli() {
        return this.soli;
    }

    public void setSoli(ColaSolicitud soli) {
        this.soli = soli;
    }

    public Rent() {
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
        dayText = new javax.swing.JLabel();
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
        soliAreaText = new javax.swing.JTextArea();
        addBtn = new javax.swing.JButton();
        dayText1 = new javax.swing.JLabel();
        typeID = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 78, 106));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alquiler");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(791, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 40));

        tittle.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        tittle.setText("Solicitud de Alquiler");
        bg.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        extrasText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        extrasText.setText("Extras:");
        bg.add(extrasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        typeDay.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeDay.setForeground(new java.awt.Color(153, 153, 153));
        typeDay.setText("14");
        typeDay.setBorder(null);
        typeDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeDayMousePressed(evt);
            }
        });
        typeDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDayActionPerformed(evt);
            }
        });
        typeDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeDayKeyPressed(evt);
            }
        });
        bg.add(typeDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 240, -1));

        minPassText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        minPassText.setText("Minimo de Pasajeros: ");
        bg.add(minPassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        dayText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        dayText.setText("Cedula:");
        bg.add(dayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        typeExtras.setForeground(new java.awt.Color(153, 153, 153));
        typeExtras.setText("Camara, asientos de cuero, sensores");
        typeExtras.setBorder(null);
        typeExtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeExtrasMousePressed(evt);
            }
        });
        typeExtras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeExtrasKeyPressed(evt);
            }
        });
        bg.add(typeExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 240, -1));

        typeMinPass.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeMinPass.setForeground(new java.awt.Color(153, 153, 153));
        typeMinPass.setText("5");
        typeMinPass.setBorder(null);
        typeMinPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeMinPassMousePressed(evt);
            }
        });
        typeMinPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeMinPassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                typeMinPassKeyReleased(evt);
            }
        });
        bg.add(typeMinPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 240, -1));

        marcaText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        marcaText.setText("Marca: ");
        bg.add(marcaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        typeMarca.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeMarca.setForeground(new java.awt.Color(153, 153, 153));
        typeMarca.setText("Hyundai");
        typeMarca.setBorder(null);
        typeMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeMarcaMousePressed(evt);
            }
        });
        bg.add(typeMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 240, -1));

        modelText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        modelText.setText("Modelo:");
        bg.add(modelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        typeModel.setForeground(new java.awt.Color(153, 153, 153));
        typeModel.setText("Accent");
        typeModel.setBorder(null);
        typeModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeModelMousePressed(evt);
            }
        });
        typeModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeModelKeyPressed(evt);
            }
        });
        bg.add(typeModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 240, -1));

        yearText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        yearText.setText("Año:");
        bg.add(yearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        typeYear.setForeground(new java.awt.Color(153, 153, 153));
        typeYear.setText("2023");
        typeYear.setBorder(null);
        typeYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeYearMousePressed(evt);
            }
        });
        bg.add(typeYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 240, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 240, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 240, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 240, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 240, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 240, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 240, 10));

        soliAreaText.setEditable(false);
        soliAreaText.setColumns(20);
        soliAreaText.setRows(5);
        jScrollPane1.setViewportView(soliAreaText);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 890, 250));

        addBtn.setText("Agregar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        bg.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 140, 30));

        dayText1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        dayText1.setText("Cantidad de días: ");
        bg.add(dayText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        typeID.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        typeID.setForeground(new java.awt.Color(153, 153, 153));
        typeID.setText("108950700");
        typeID.setBorder(null);
        typeID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeIDMousePressed(evt);
            }
        });
        typeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeIDActionPerformed(evt);
            }
        });
        typeID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeIDKeyPressed(evt);
            }
        });
        bg.add(typeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 240, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 240, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_typeDayActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(typeID.getText());
        int dias = Integer.parseInt(typeDay.getText());
        int pass = Integer.parseInt(typeMinPass.getText());
        String marca = typeMarca.getText();
        String modelo = typeModel.getText();
        String year = typeYear.getText();
        String extras = typeExtras.getText();
        soli.encola(new Solicitud(id, dias,
                pass, marca, modelo, year, extras,
                "Registrada", cl.getListaCliente().buscarCategoria(id)));

        soliAreaText.setText(String.valueOf(soli));

        typeID.setText("108950700");
        typeID.setForeground(Color.gray);

        typeDay.setText("14");
        typeDay.setForeground(Color.gray);

        typeMinPass.setText("5");
        typeMinPass.setForeground(Color.gray);

        typeMarca.setText("Hyundai");
        typeMarca.setForeground(Color.gray);

        typeModel.setText("Accent");
        typeModel.setForeground(Color.gray);

        typeYear.setText("2023");
        typeYear.setForeground(Color.gray);

        typeExtras.setText("Camara, asientos de cuero, sensores");
        typeExtras.setForeground(Color.gray);

        if (dias > 30) {
            cl.getListaCliente().categoria(id);
        }


    }//GEN-LAST:event_addBtnActionPerformed

    private void typeDayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeDayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDayKeyPressed

    private void typeMinPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeMinPassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeMinPassKeyPressed

    private void typeMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMarcaMousePressed
        // TODO add your handling code here:
        if (typeID.getText().isEmpty()) {
            typeID.setText("108950700");
            typeID.setForeground(Color.black);
        }
        if (typeDay.getText().isEmpty()) {
            typeDay.setText("14");
            typeDay.setForeground(Color.gray);

        }

        if (typeMinPass.getText().isEmpty()) {
            typeMinPass.setText("5");
            typeMinPass.setForeground(Color.gray);

        }

        if (typeMarca.getText().equals("Hyundai")) {
            typeMarca.setText("");
            typeMarca.setForeground(Color.black);
        }

        if (typeModel.getText().isEmpty()) {
            typeModel.setText("Accent");
            typeModel.setForeground(Color.gray);
        }

        if (typeYear.getText().isEmpty()) {
            typeYear.setText("2023");
            typeYear.setForeground(Color.gray);

        }

        if (typeExtras.getText().isEmpty()) {
            typeExtras.setText("Camara, asientos de cuero, sensores");
            typeExtras.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeMarcaMousePressed

    private void typeModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeModelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeModelKeyPressed

    private void typeYearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeYearMousePressed
        // TODO add your handling code here:
        if (typeID.getText().isEmpty()) {
            typeID.setText("108950700");
            typeID.setForeground(Color.black);
        }
        if (typeDay.getText().isEmpty()) {
            typeDay.setText("14");
            typeDay.setForeground(Color.gray);

        }

        if (typeMinPass.getText().isEmpty()) {
            typeMinPass.setText("5");
            typeMinPass.setForeground(Color.gray);

        }

        if (typeMarca.getText().isEmpty()) {
            typeMarca.setText("Hyundai");
            typeMarca.setForeground(Color.gray);
        }

        if (typeModel.getText().isEmpty()) {
            typeModel.setText("Accent");
            typeModel.setForeground(Color.gray);
        }

        if (typeYear.getText().equals("2023")) {
            typeYear.setText("");
            typeYear.setForeground(Color.black);

        }

        if (typeExtras.getText().isEmpty()) {
            typeExtras.setText("Camara, asientos de cuero, sensores");
            typeExtras.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeYearMousePressed

    private void typeExtrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeExtrasKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_typeExtrasKeyPressed

    private void typeMinPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeMinPassKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_typeMinPassKeyReleased

    private void typeMinPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMinPassMousePressed
        // TODO add your handling code here:
        if (typeID.getText().isEmpty()) {
            typeID.setText("108950700");
            typeID.setForeground(Color.black);
        }

        if (typeDay.getText().isEmpty()) {
            typeDay.setText("14");
            typeDay.setForeground(Color.gray);

        }

        if (typeMinPass.getText().equals("5")) {
            typeMinPass.setText("");
            typeMinPass.setForeground(Color.black);

        }

        if (typeMarca.getText().isEmpty()) {
            typeMarca.setText("Hyundai");
            typeMarca.setForeground(Color.gray);
        }

        if (typeModel.getText().isEmpty()) {
            typeModel.setText("Accent");
            typeModel.setForeground(Color.gray);
        }

        if (typeYear.getText().isEmpty()) {
            typeYear.setText("2023");
            typeYear.setForeground(Color.gray);

        }

        if (typeExtras.getText().isEmpty()) {
            typeExtras.setText("Camara, asientos de cuero, sensores");
            typeExtras.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeMinPassMousePressed

    private void typeModelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeModelMousePressed
        // TODO add your handling code here:
        if (typeID.getText().isEmpty()) {
            typeID.setText("108950700");
            typeID.setForeground(Color.black);
        }

        if (typeDay.getText().isEmpty()) {
            typeDay.setText("14");
            typeDay.setForeground(Color.gray);

        }

        if (typeMinPass.getText().isEmpty()) {
            typeMinPass.setText("5");
            typeMinPass.setForeground(Color.gray);

        }

        if (typeMarca.getText().isEmpty()) {
            typeMarca.setText("Hyundai");
            typeMarca.setForeground(Color.gray);
        }

        if (typeModel.getText().equals("Accent")) {
            typeModel.setText("");
            typeModel.setForeground(Color.black);
        }

        if (typeYear.getText().isEmpty()) {
            typeYear.setText("2023");
            typeYear.setForeground(Color.gray);

        }

        if (typeExtras.getText().isEmpty()) {
            typeExtras.setText("Camara, asientos de cuero, sensores");
            typeExtras.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeModelMousePressed

    private void typeExtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeExtrasMousePressed
        // TODO add your handling code here:
        if (typeID.getText().isEmpty()) {
            typeID.setText("108950700");
            typeID.setForeground(Color.black);
        }

        if (typeDay.getText().isEmpty()) {
            typeDay.setText("14");
            typeDay.setForeground(Color.gray);

        }

        if (typeMinPass.getText().isEmpty()) {
            typeMinPass.setText("5");
            typeMinPass.setForeground(Color.gray);

        }

        if (typeMarca.getText().isEmpty()) {
            typeMarca.setText("Hyundai");
            typeMarca.setForeground(Color.gray);
        }

        if (typeModel.getText().isEmpty()) {
            typeModel.setText("Accent");
            typeModel.setForeground(Color.gray);
        }

        if (typeYear.getText().isEmpty()) {
            typeYear.setText("2023");
            typeYear.setForeground(Color.gray);

        }

        if (typeExtras.getText().equals("Camara, asientos de cuero, sensores")) {
            typeExtras.setText("");
            typeExtras.setForeground(Color.black);

        }
    }//GEN-LAST:event_typeExtrasMousePressed

    private void typeDayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeDayMousePressed
        // TODO add your handling code here:
        if (typeID.getText().isEmpty()) {
            typeID.setText("108950700");
            typeID.setForeground(Color.black);
        }

        if (typeDay.getText().equals("14")) {
            typeDay.setText("");
            typeDay.setForeground(Color.black);

        }

        if (typeMinPass.getText().isEmpty()) {
            typeMinPass.setText("5");
            typeMinPass.setForeground(Color.gray);

        }

        if (typeMarca.getText().isEmpty()) {
            typeMarca.setText("Hyundai");
            typeMarca.setForeground(Color.gray);
        }

        if (typeModel.getText().isEmpty()) {
            typeModel.setText("Accent");
            typeModel.setForeground(Color.gray);
        }

        if (typeYear.getText().isEmpty()) {
            typeYear.setText("2023");
            typeYear.setForeground(Color.gray);

        }

        if (typeExtras.getText().isEmpty()) {
            typeExtras.setText("Camara, asientos de cuero, sensores");
            typeExtras.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeDayMousePressed

    private void typeIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeIDMousePressed
        // TODO add your handling code here:
        if (typeID.getText().equals("108950700")) {
            typeID.setText("");
            typeID.setForeground(Color.black);
        }

        if (typeDay.getText().isEmpty()) {
            typeDay.setText("14");
            typeDay.setForeground(Color.gray);

        }

        if (typeMinPass.getText().isEmpty()) {
            typeMinPass.setText("5");
            typeMinPass.setForeground(Color.gray);

        }

        if (typeMarca.getText().isEmpty()) {
            typeMarca.setText("Hyundai");
            typeMarca.setForeground(Color.gray);
        }

        if (typeModel.getText().isEmpty()) {
            typeModel.setText("Accent");
            typeModel.setForeground(Color.gray);
        }

        if (typeYear.getText().isEmpty()) {
            typeYear.setText("2023");
            typeYear.setForeground(Color.gray);

        }

        if (typeExtras.getText().isEmpty()) {
            typeExtras.setText("Camara, asientos de cuero, sensores");
            typeExtras.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeIDMousePressed

    private void typeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeIDActionPerformed

    private void typeIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel dayText;
    private javax.swing.JLabel dayText1;
    private javax.swing.JLabel extrasText;
    private javax.swing.JPanel header;
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
    private javax.swing.JTextArea soliAreaText;
    private javax.swing.JLabel tittle;
    private javax.swing.JTextField typeDay;
    private javax.swing.JTextField typeExtras;
    private javax.swing.JTextField typeID;
    private javax.swing.JTextField typeMarca;
    private javax.swing.JTextField typeMinPass;
    private javax.swing.JTextField typeModel;
    private javax.swing.JTextField typeYear;
    private javax.swing.JLabel yearText;
    // End of variables declaration//GEN-END:variables
}
