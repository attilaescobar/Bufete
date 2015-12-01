/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Datos;
import Clases.ListaPropietario;
import Clases.NodoPropietario;
import javax.swing.JOptionPane;

public class frmPropietario extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private boolean nuevo = false;
    private int usuAct = 0;
    private ListaPropietario miLista;

    public frmPropietario() {
        initComponents();
    }

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Propietario");

        lblDocumento.setText("Documento");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblTelefono.setText("Telèfono");

        lblCelular.setText("Celular");

        lblEmail.setText("Email");

        btnCrear.setText("Nuevo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.setEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTabla);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("* Campos obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellido))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCelular))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocumento)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        //Habilita botones
        btnConsultar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);

        //Habilita campos
        txtDocumento.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);

        //Limpiar campos
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtEmail.setText("");

        //Activamos el flag de registro nuevo
        nuevo = true;

        //foco al campo documento
        txtDocumento.requestFocusInWindow();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
//        String documento = JOptionPane.showInputDialog("Ingrese còdigo de usuario");
//        if (documento.equals("")) {
//            return;
//        }
//        int pos = misDatos.posicionUsuario(documento);
//        if (pos == -1) {
//            JOptionPane.showMessageDialog(rootPane, "Usuario no existe");
//            return;
//        }
//        usuAct = pos;
        
          int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese còdigo de propietario")); 
            if (documento == 0) {
            return;
        }
        
        NodoPropietario cargar ;
        cargar = miLista.Buscar(documento);
        
        txtNombre.setText(cargar.getNombre());
        txtApellido.setText(cargar.getApellido());
        txtTelefono.setText(cargar.getTelefono());
        txtCelular.setText(cargar.getCelular());
        txtEmail.setText(cargar.getEmail());   
            
        
//        mostrarRegistro();

        btnCrear.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(true);

        //Deshabilita campos
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //Validaciones
        if (txtDocumento.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un documento");
            lblDocumento.requestFocusInWindow();
            return;
        }
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un nombre");
            lblNombre.requestFocusInWindow();
            return;
        }
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un apellido");
            lblApellido.requestFocusInWindow();
            return;
        }

//        int pos = misDatos.posicionUsuario(txtDocumento.getText());
//        if (nuevo) {
//            if (pos != -1) {
//                JOptionPane.showMessageDialog(rootPane, "Propietario ya existe");
//                txtDocumento.requestFocusInWindow();
//                return;
//            }
//
//        } else {
//            if (pos == -1) {
//                JOptionPane.showMessageDialog(rootPane, "Propietario no existe");
//                txtDocumento.requestFocusInWindow();
//                return;
//            }
//
//        }
        String msg;
        NodoPropietario miPropietario;
        miPropietario = new NodoPropietario(Integer.parseInt(txtDocumento.getText()), txtNombre.getText(),
                txtApellido.getText(), txtTelefono.getText(), txtCelular.getText(),
                txtEmail.getText());

        miLista = new ListaPropietario();

        boolean res;
        if (nuevo) {
            msg = miLista.InsertarOrdenado(miPropietario);

        } else {
            miLista.Modificar(Integer.parseInt(txtDocumento.getText()), txtNombre.getText(),
                    txtApellido.getText(), txtTelefono.getText(),
                    txtCelular.getText(), txtEmail.getText());
            msg = "Propietario modificado";
        }
        JOptionPane.showMessageDialog(rootPane, msg);

        btnCrear.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        //Limpiar campos
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtEmail.setText("");

        //Deshabilita campos
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);

//        llenarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        int rta = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de borrar el registro");
        if (rta != 0) {
            return;
        }
        String msg;
        msg = misDatos.borrarUsuario(usuAct);
        JOptionPane.showMessageDialog(rootPane, msg);
        usuAct = 0;
//        mostrarRegistro();

        btnCrear.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        //Limpiar campos
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtEmail.setText("");

        //Deshabilita campos
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);

//        llenarTabla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        btnConsultar.setEnabled(false);
        btnCrear.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);

        //Habilita campos
        txtDocumento.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);

        //Activamos el flag de registro nuevo
        nuevo = false;

        //foco al campo documento
        txtNombre.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnCrear.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        //Limpiar campos
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtEmail.setText("");

        //Habilita campos
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
