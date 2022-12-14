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
public class Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        this.setSize(910, 690);
        initComponents();
    }

    private static ListaCliente listaCliente = new ListaCliente();

    public  ListaCliente getListaCliente() {
        return this.listaCliente;
    }

    public  void setListaCliente(ListaCliente listaCliente) {
        this.listaCliente = listaCliente;
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
        nameText = new javax.swing.JLabel();
        typeName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        idText = new javax.swing.JLabel();
        typeId = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        birthText = new javax.swing.JLabel();
        typeBirth = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        emailText = new javax.swing.JLabel();
        typeEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lvText = new javax.swing.JLabel();
        lvOptions = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        textPanel = new javax.swing.JScrollPane();
        textClients = new javax.swing.JTextArea();
        typeSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 78, 106));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(802, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 960, 40));

        tittle.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        tittle.setText("Registro de Clientes");
        bg.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        nameText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nameText.setText("Nombre Completo:");
        bg.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        typeName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeName.setForeground(new java.awt.Color(153, 153, 153));
        typeName.setText("Ingrese el nombre completo del cliente");
        typeName.setBorder(null);
        typeName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeNameMousePressed(evt);
            }
        });
        typeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeNameActionPerformed(evt);
            }
        });
        bg.add(typeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 260, 10));

        idText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        idText.setText("N??mero de C??dula:");
        bg.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        typeId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeId.setForeground(new java.awt.Color(153, 153, 153));
        typeId.setText("Ingrese el ID card del cliente");
        typeId.setBorder(null);
        typeId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeIdMousePressed(evt);
            }
        });
        typeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeIdActionPerformed(evt);
            }
        });
        bg.add(typeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 260, 10));

        birthText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        birthText.setText("Fecha de Nacimiento:");
        bg.add(birthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        typeBirth.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeBirth.setForeground(new java.awt.Color(153, 153, 153));
        typeBirth.setText("Ingrese la fecha de nacimiento");
        typeBirth.setToolTipText("");
        typeBirth.setBorder(null);
        typeBirth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeBirthMousePressed(evt);
            }
        });
        typeBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeBirthActionPerformed(evt);
            }
        });
        bg.add(typeBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 250, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 260, 10));

        emailText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        emailText.setText("Correo Electr??nico:");
        bg.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        typeEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        typeEmail.setForeground(new java.awt.Color(153, 153, 153));
        typeEmail.setText("example@gmail.com");
        typeEmail.setBorder(null);
        typeEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeEmailMousePressed(evt);
            }
        });
        bg.add(typeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 270, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 250, 10));

        lvText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lvText.setText("Categor??a: ");
        bg.add(lvText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        lvOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRONZE", "PLATA", "ORO", "ZAFIRO" }));
        lvOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvOptionsActionPerformed(evt);
            }
        });
        bg.add(lvOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 260, -1));

        addBtn.setText("Agregar Nuevo Cliente");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        bg.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 270, 50));

        updateBtn.setText("Modificar Cliente");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        bg.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 270, 50));

        deleteBtn.setText("Eliminar Cliente");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        bg.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 270, 50));

        textClients.setEditable(false);
        textClients.setColumns(20);
        textClients.setRows(5);
        textPanel.setViewportView(textClients);

        bg.add(textPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 880, 230));

        typeSearch.setForeground(new java.awt.Color(153, 153, 153));
        typeSearch.setText("Busqueda por # de cedula");
        typeSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        typeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typeSearchMousePressed(evt);
            }
        });
        typeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeSearchActionPerformed(evt);
            }
        });
        bg.add(typeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 190, 40));

        searchBtn.setText("Buscar");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        bg.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeNameActionPerformed

    private void typeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeIdActionPerformed

    private void typeBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeBirthActionPerformed

    private void lvOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvOptionsActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        listaCliente.inserta(new Cliente(Integer.parseInt(typeId.getText()),
                typeName.getText(), typeBirth.getText(), typeEmail.getText(),
                String.valueOf(lvOptions.getSelectedItem())));

        typeName.setText("Ingrese el nombre completo del cliente");
        typeName.setForeground(Color.gray);

        typeId.setText("Ingrese el ID card del cliente");
        typeId.setForeground(Color.gray);

        typeBirth.setText("Ingrese la fecha de nacimiento");
        typeBirth.setForeground(Color.gray);

        typeEmail.setText("example@gmail.com");
        typeEmail.setForeground(Color.gray);

        textClients.setText(String.valueOf(listaCliente));
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        listaCliente.modifica(new Cliente(Integer.parseInt(typeId.getText()),
                typeName.getText(), typeBirth.getText(), typeEmail.getText(),
                String.valueOf(lvOptions.getSelectedItem())));

        textClients.setText(String.valueOf(listaCliente));

        typeName.setText("Ingrese el nombre completo del cliente");
        typeName.setForeground(Color.gray);

        typeId.setText("Ingrese el ID card del cliente");
        typeId.setForeground(Color.gray);

        typeBirth.setText("Ingrese la fecha de nacimiento");
        typeBirth.setForeground(Color.gray);

        typeEmail.setText("example@gmail.com");
        typeEmail.setForeground(Color.gray);

    }//GEN-LAST:event_updateBtnActionPerformed

    private void typeNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeNameMousePressed
        // TODO add your handling code here:
        if (typeName.getText().equals("Ingrese el nombre completo del cliente")) {
            typeName.setText("");
            typeName.setForeground(Color.black);
        }
        if (typeId.getText().isEmpty()) {
            typeId.setText("Ingrese el ID card del cliente");
            typeId.setForeground(Color.gray);
        }

        if (typeBirth.getText().isEmpty()) {
            typeBirth.setText("Ingrese la fecha de nacimiento");
            typeBirth.setForeground(Color.gray);
        }

        if (typeEmail.getText().isEmpty()) {
            typeEmail.setText("example@gmail.com");
            typeEmail.setForeground(Color.gray);
        }

        if (typeSearch.getText().isEmpty()) {
            typeSearch.setText("Busqueda por # de cedula");
            typeSearch.setForeground(Color.gray);

        }

    }//GEN-LAST:event_typeNameMousePressed

    private void typeIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeIdMousePressed
        // TODO add your handling code here:
        if (typeName.getText().isEmpty()) {
            typeName.setText("Ingrese el nombre completo del cliente");
            typeName.setForeground(Color.gray);
        }
        if (typeId.getText().equals("Ingrese el ID card del cliente")) {
            typeId.setText("");
            typeId.setForeground(Color.black);
        }

        if (typeBirth.getText().isEmpty()) {
            typeBirth.setText("Ingrese la fecha de nacimiento");
            typeBirth.setForeground(Color.gray);
        }

        if (typeEmail.getText().isEmpty()) {
            typeEmail.setText("example@gmail.com");
            typeEmail.setForeground(Color.gray);
        }

        if (typeSearch.getText().isEmpty()) {
            typeSearch.setText("Busqueda por # de cedula");
            typeSearch.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeIdMousePressed

    private void typeBirthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeBirthMousePressed
        // TODO add your handling code here:
        if (typeName.getText().isEmpty()) {
            typeName.setText("Ingrese el nombre completo del cliente");
            typeName.setForeground(Color.gray);
        }
        if (typeId.getText().isEmpty()) {
            typeId.setText("Ingrese el ID card del cliente");
            typeId.setForeground(Color.gray);
        }

        if (typeBirth.getText().equals("Ingrese la fecha de nacimiento")) {
            typeBirth.setText("");
            typeBirth.setForeground(Color.black);
        }

        if (typeEmail.getText().isEmpty()) {
            typeEmail.setText("example@gmail.com");
            typeEmail.setForeground(Color.gray);
        }

        if (typeSearch.getText().isEmpty()) {
            typeSearch.setText("Busqueda por # de cedula");
            typeSearch.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeBirthMousePressed

    private void typeEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeEmailMousePressed
        // TODO add your handling code here:
        if (typeName.getText().isEmpty()) {
            typeName.setText("Ingrese el nombre completo del cliente");
            typeName.setForeground(Color.gray);
        }
        if (typeId.getText().isEmpty()) {
            typeId.setText("Ingrese el ID card del cliente");
            typeId.setForeground(Color.gray);
        }

        if (typeBirth.getText().isEmpty()) {
            typeBirth.setText("Ingrese la fecha de nacimiento");
            typeBirth.setForeground(Color.gray);
        }

        if (typeEmail.getText().equals("example@gmail.com")) {
            typeEmail.setText("");
            typeEmail.setForeground(Color.black);
        }

        if (typeSearch.getText().isEmpty()) {
            typeSearch.setText("Busqueda por # de cedula");
            typeSearch.setForeground(Color.gray);

        }
    }//GEN-LAST:event_typeEmailMousePressed

    private void typeSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeSearchMousePressed
        // TODO add your handling code here:
        if (typeName.getText().isEmpty()) {
            typeName.setText("Ingrese el nombre completo del cliente");
            typeName.setForeground(Color.gray);
        }
        if (typeId.getText().isEmpty()) {
            typeId.setText("Ingrese el ID card del cliente");
            typeId.setForeground(Color.gray);
        }

        if (typeBirth.getText().isEmpty()) {
            typeBirth.setText("Ingrese la fecha de nacimiento");
            typeBirth.setForeground(Color.gray);
        }

        if (typeEmail.getText().isEmpty()) {
            typeEmail.setText("example@gmail.com");
            typeEmail.setForeground(Color.gray);
        }

        if (typeSearch.getText().equals("Busqueda por # de cedula")) {
            typeSearch.setText("");
            typeSearch.setForeground(Color.black);

        }
    }//GEN-LAST:event_typeSearchMousePressed

    private void typeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeSearchActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        Cliente buscado = listaCliente.buscar(Integer.parseInt(typeSearch.getText()));
        typeSearch.setText("Busqueda por # de cedula");

        typeName.setText(buscado.getNombre());
        typeName.setForeground(Color.black);

        typeBirth.setText(buscado.getNacimiento());
        typeBirth.setForeground(Color.black);

        typeEmail.setText(buscado.getEmail());
        typeEmail.setForeground(Color.black);

        typeId.setText(String.valueOf(buscado.getCedula()));
        typeId.setForeground(Color.black);

        lvOptions.setSelectedItem(buscado.getCategoria());

    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        listaCliente.elimina(Integer.parseInt(typeId.getText()));

        typeName.setText("Ingrese el nombre completo del cliente");
        typeName.setForeground(Color.gray);

        typeBirth.setText("Ingrese el ID card del cliente");
        typeBirth.setForeground(Color.gray);

        typeEmail.setText("Ingrese la fecha de nacimiento");
        typeEmail.setForeground(Color.gray);

        typeId.setText("example@gmail.com");
        typeId.setForeground(Color.gray);

        textClients.setText(String.valueOf(listaCliente));
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel birthText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel emailText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> lvOptions;
    private javax.swing.JLabel lvText;
    private javax.swing.JLabel nameText;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextArea textClients;
    private javax.swing.JScrollPane textPanel;
    private javax.swing.JLabel tittle;
    private javax.swing.JTextField typeBirth;
    private javax.swing.JTextField typeEmail;
    private javax.swing.JTextField typeId;
    private javax.swing.JTextField typeName;
    private javax.swing.JTextField typeSearch;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
