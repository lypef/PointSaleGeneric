/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author lypef_000
 */
public class EditStaff extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditStaff
     */
    String SelecncioNivel , SeleccionTurno;
    public EditStaff() {
        initComponents();
        setTitle("Editar personal");
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimerApellido = new javax.swing.JTextField();
        SegundoApellido = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        UsuarioBuscar = new javax.swing.JTextField();
        SeleccioneNivel = new javax.swing.JComboBox();
        ConfirmaContraseña = new javax.swing.JPasswordField();
        Iduser = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BotonLimpiar = new javax.swing.JButton();
        BotonDarDeAlta = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Seleccioneturno = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);

        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        jLabel12.setText("Confirme Contraseña");

        UsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioBuscarActionPerformed(evt);
            }
        });
        UsuarioBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuarioBuscarKeyPressed(evt);
            }
        });

        SeleccioneNivel.setEditable(true);
        SeleccioneNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione nivel", "Root", "Administrador", "Vendedor" }));
        SeleccioneNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccioneNivelActionPerformed(evt);
            }
        });

        Iduser.setForeground(new java.awt.Color(255, 0, 0));
        Iduser.setText("--");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("ID :");

        jLabel6.setText("Direccion");

        jLabel5.setText("Segundo apellido");

        jLabel4.setText("Primer apellido");

        jLabel3.setText("Nombre");

        jLabel2.setText("Contraseña");

        jLabel1.setText("Nombre de usuario");

        jLabel7.setText("Telefono");

        jLabel8.setText("E - mail");

        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clean.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonDarDeAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        BotonDarDeAlta.setText("Editar");
        BotonDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDarDeAltaActionPerformed(evt);
            }
        });

        BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel.png"))); // NOI18N
        BotonCancelar.setText("Salir");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        Seleccioneturno.setEditable(true);
        Seleccioneturno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione turno", "Matutino", "Vespertino" }));
        Seleccioneturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccioneturnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(BotonDarDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ConfirmaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Seleccioneturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SeleccioneNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Iduser))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccioneNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seleccioneturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Iduser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonDarDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void UsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioBuscarActionPerformed
        if (UsuarioBuscar.getText().equalsIgnoreCase("")){
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Ingrese nombre de usuario que desea editar");
        }else {
            try {
                String EncuentroUsuario = UsuarioBuscar.getText();
                String bdid = "";
                String bdusuario = "";
                String bdnombre = "";
                String bdprimerapellido = "";
                String bdsegundoapellido = "";
                String bddireccion = "";
                String bdturno = "";
                String bdtelefono = "";
                String bdemail = "";
                String bdnivel = "";
                String bdcontraseña = "";
                int EnteroNivel = 0 , EnteroTurno = 0;
                
                Clases.ConexionBD CBD = new Clases.ConexionBD ();
                
                String sql = "select * from vendedor where usuario ='"+EncuentroUsuario+"';";
                ResultSet Ingresa = CBD.Consulta(sql);

                while (Ingresa.next()){
                    bdid = Ingresa.getString(1);
                    bdusuario = Ingresa.getString(2);
                    bdcontraseña = Ingresa.getString(3);
                    bdnombre = Ingresa.getString(4);
                    bdprimerapellido = Ingresa.getString(5);
                    bdsegundoapellido = Ingresa.getString(6);
                    bddireccion = Ingresa.getString(7);
                    bdtelefono = Ingresa.getString(8);
                    bdturno = Ingresa.getString(9);
                    bdemail = Ingresa.getString(10);
                    bdnivel = Ingresa.getString(11);
                }
                if (bdnivel.equalsIgnoreCase("root"))
                {
                EnteroNivel = 1;
                }else
                {
                if (bdnivel.equalsIgnoreCase("administrador"))
                {
                EnteroNivel = 2;
                }else
                {
                if (bdnivel.equalsIgnoreCase("vendedor"))
                {
                EnteroNivel = 3;
                }
                }
                }
                
                if (bdturno.equalsIgnoreCase("matutino"))
                {
                EnteroTurno = 1;
                }else
                {
                if (bdturno.equalsIgnoreCase("vespertino"))
                {
                EnteroTurno = 2;
                }
                }
                if(EncuentroUsuario.equalsIgnoreCase(bdusuario))
                {
                        
                            usuario.setText(bdusuario);
                            Contraseña.setText(bdcontraseña);
                            ConfirmaContraseña.setText(bdcontraseña);
                            Nombre.setText(bdnombre);
                            PrimerApellido.setText(bdprimerapellido);
                            SegundoApellido.setText(bdsegundoapellido);
                            Direccion.setText(bddireccion);
                            Telefono.setText(bdtelefono);
                            Email.setText(bdemail);
                            Iduser.setText(bdid);
                            Seleccioneturno.setSelectedIndex(EnteroTurno);
                            SeleccioneNivel.setSelectedIndex(EnteroNivel);
                }else {
                    JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Este nombre de usuario no existe.");
                    dispose();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_UsuarioBuscarActionPerformed

    private void UsuarioBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioBuscarKeyPressed

    }//GEN-LAST:event_UsuarioBuscarKeyPressed

    private void SeleccioneNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccioneNivelActionPerformed
        JComboBox x = (JComboBox)evt.getSource();
        String root = "Root";
        String admin = "Administrador";
        String Vende = "Vendedor";
        String str  = (String)x.getSelectedItem();
        
         
        if (x.getSelectedItem().equals(root)){
            SelecncioNivel = root;

        }else {
            if (x.getSelectedItem().equals(admin)){
                SelecncioNivel = admin;
            }else
            {
            SelecncioNivel = Vende;
            }
        }
    }//GEN-LAST:event_SeleccioneNivelActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Limpiar ();
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDarDeAltaActionPerformed
        usuario.setText(usuario.getText().toUpperCase());
        Nombre.setText(Nombre.getText().toUpperCase());
        PrimerApellido.setText(PrimerApellido.getText().toUpperCase());
        SegundoApellido.setText(SegundoApellido.getText().toUpperCase());
        Direccion.setText(Direccion.getText().toUpperCase());
        Edit();
    }//GEN-LAST:event_BotonDarDeAltaActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void SeleccioneturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccioneturnoActionPerformed
        JComboBox x = (JComboBox)evt.getSource();
        String mat = "Matutino";
        String ves = "vespertino";
        String str  = (String)x.getSelectedItem();
        
         
        if (x.getSelectedItem().equals(mat)){
            SeleccionTurno = mat;

        }else {
            if (x.getSelectedItem().equals(ves)){
                SeleccionTurno = ves;
            }
        }
    }//GEN-LAST:event_SeleccioneturnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonDarDeAlta;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JPasswordField ConfirmaContraseña;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Iduser;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField PrimerApellido;
    private javax.swing.JTextField SegundoApellido;
    private javax.swing.JComboBox SeleccioneNivel;
    private javax.swing.JComboBox Seleccioneturno;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField UsuarioBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
// Funciones
    private void Limpiar () {
             usuario.setText("");
             Contraseña.setText("");
             ConfirmaContraseña.setText("");
             Nombre.setText("");
             PrimerApellido.setText("");
             SegundoApellido.setText("");
             Direccion.setText("");
             Telefono.setText("");
             Email.setText("");
             usuario.setText("");
             UsuarioBuscar.setText("");
             SeleccioneNivel.setSelectedIndex(0);
             Seleccioneturno.setSelectedIndex(0);
    }
private void Edit ()
{
           if (Contraseña.getText().equals(ConfirmaContraseña.getText())){
            try {            
                Clases.ConexionBD CBD = new Clases.ConexionBD ();
                String modificar = "update vendedor set usuario = '"+usuario.getText()+"',"+" contraseña = '"+Contraseña.getText()+"' , "+" nombre = '"+Nombre.getText()+"' , "+" apellidopaterno = '"+PrimerApellido.getText()+"' , "+" apellidomaterno = '"+SegundoApellido.getText()+"' , "+" direccion = '"+Direccion.getText()+"' , "+" telefono = '"+Telefono.getText()+"' , "+" turno = '"+SeleccionTurno+"' , "+" email = '"+Email.getText()+"', "+" nivel = '"+SelecncioNivel+"'  where Usuario = '"+usuario.getText()+"'";
                CBD.ejecutar(modificar);
                JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Correcto");
                Limpiar ();
                dispose ();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }else {
            JOptionPane.showMessageDialog(null, "Las contraseñan no coinciden");
        }
}
    public void AccesoAdministrador ()
    {
        usuario.setEnabled(false);
        Nombre.setEnabled(false);
        Contraseña.setEnabled(false);
        ConfirmaContraseña.setEnabled(false);
        PrimerApellido.setEnabled(false);
        SegundoApellido.setEnabled(false);
        Seleccioneturno.enableInputMethods(true);
        SeleccioneNivel.enableInputMethods(false);
    }
    public void LlenadoDeDatosRoot (String Usuario)
    {
                try {
                String EncuentroUsuario = Usuario;
                String bdid = "";
                String bdusuario = "";
                String bdnombre = "";
                String bdprimerapellido = "";
                String bdsegundoapellido = "";
                String bddireccion = "";
                String bdturno = "";
                String bdtelefono = "";
                String bdemail = "";
                String bdnivel = "";
                String bdcontraseña = "";
                int EnteroNivel = 0 , EnteroTurno = 0;
                
                Clases.ConexionBD CBD = new Clases.ConexionBD ();
                
                String sql = "select * from vendedor where usuario ='"+EncuentroUsuario+"';";
                ResultSet Ingresa = CBD.Consulta(sql);

                while (Ingresa.next()){
                    bdid = Ingresa.getString(1);
                    bdusuario = Ingresa.getString(2);
                    bdcontraseña = Ingresa.getString(3);
                    bdnombre = Ingresa.getString(4);
                    bdprimerapellido = Ingresa.getString(5);
                    bdsegundoapellido = Ingresa.getString(6);
                    bddireccion = Ingresa.getString(7);
                    bdtelefono = Ingresa.getString(8);
                    bdturno = Ingresa.getString(9);
                    bdemail = Ingresa.getString(10);
                    bdnivel = Ingresa.getString(11);
                }
                if (bdnivel.equalsIgnoreCase("root"))
                {
                EnteroNivel = 1;
                }else
                {
                if (bdnivel.equalsIgnoreCase("administrador"))
                {
                EnteroNivel = 2;
                }else
                {
                if (bdnivel.equalsIgnoreCase("vendedor"))
                {
                EnteroNivel = 3;
                }
                }
                }
                
                if (bdturno.equalsIgnoreCase("matutino"))
                {
                EnteroTurno = 1;
                }else
                {
                if (bdturno.equalsIgnoreCase("vespertino"))
                {
                EnteroTurno = 2;
                }
                }
                if(EncuentroUsuario.equalsIgnoreCase(bdusuario))
                {
                        
                            usuario.setText(bdusuario);
                            Contraseña.setText(bdcontraseña);
                            ConfirmaContraseña.setText(bdcontraseña);
                            Nombre.setText(bdnombre);
                            PrimerApellido.setText(bdprimerapellido);
                            SegundoApellido.setText(bdsegundoapellido);
                            Direccion.setText(bddireccion);
                            Telefono.setText(bdtelefono);
                            Email.setText(bdemail);
                            Iduser.setText(bdid);
                            UsuarioBuscar.setText(bdusuario);
                            Seleccioneturno.setSelectedIndex(EnteroTurno);
                            SeleccioneNivel.setSelectedIndex(EnteroNivel);
                }else {
                    JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Este nombre de usuario no existe.");
                    dispose();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void LlenadoDeDatosAdmin (String Usuario)
    {
                try {
                String EncuentroUsuario = Usuario;
                String bdid = "";
                String bdusuario = "";
                String bdnombre = "";
                String bdprimerapellido = "";
                String bdsegundoapellido = "";
                String bddireccion = "";
                String bdturno = "";
                String bdtelefono = "";
                String bdemail = "";
                String bdnivel = "";
                String bdcontraseña = "";
                int EnteroNivel = 0 , EnteroTurno = 0;
                
                Clases.ConexionBD CBD = new Clases.ConexionBD ();
                
                String sql = "select * from vendedor where usuario ='"+EncuentroUsuario+"';";
                ResultSet Ingresa = CBD.Consulta(sql);

                while (Ingresa.next()){
                    bdid = Ingresa.getString(1);
                    bdusuario = Ingresa.getString(2);
                    bdcontraseña = Ingresa.getString(3);
                    bdnombre = Ingresa.getString(4);
                    bdprimerapellido = Ingresa.getString(5);
                    bdsegundoapellido = Ingresa.getString(6);
                    bddireccion = Ingresa.getString(7);
                    bdtelefono = Ingresa.getString(8);
                    bdturno = Ingresa.getString(9);
                    bdemail = Ingresa.getString(10);
                    bdnivel = Ingresa.getString(11);
                }
                if (bdnivel.equalsIgnoreCase("root"))
                {
                EnteroNivel = 1;
                }else
                {
                if (bdnivel.equalsIgnoreCase("administrador"))
                {
                EnteroNivel = 2;
                }else
                {
                if (bdnivel.equalsIgnoreCase("vendedor"))
                {
                EnteroNivel = 3;
                }
                }
                }
                
                if (bdturno.equalsIgnoreCase("matutino"))
                {
                EnteroTurno = 1;
                }else
                {
                if (bdturno.equalsIgnoreCase("vespertino"))
                {
                EnteroTurno = 2;
                }
                }
                if(EncuentroUsuario.equalsIgnoreCase(bdusuario))
                {
                        
                            usuario.setText(bdusuario);
                            Contraseña.setText(bdcontraseña);
                            ConfirmaContraseña.setText(bdcontraseña);
                            Nombre.setText(bdnombre);
                            PrimerApellido.setText(bdprimerapellido);
                            SegundoApellido.setText(bdsegundoapellido);
                            Direccion.setText(bddireccion);
                            Telefono.setText(bdtelefono);
                            Email.setText(bdemail);
                            Iduser.setText(bdid);
                            UsuarioBuscar.setText(bdusuario);
                            Seleccioneturno.setSelectedIndex(EnteroTurno);
                            SeleccioneNivel.setSelectedIndex(EnteroNivel);
                            //Bloquear
                            usuario.setEnabled(false);
                            Contraseña.setEnabled(false);
                            ConfirmaContraseña.setEnabled(false);
                            Nombre.setEnabled(false);
                            PrimerApellido.setEnabled(false);
                            SegundoApellido.setEnabled(false);
                            Iduser.setEnabled(false);
                            Seleccioneturno.setEnabled(true);
                            SeleccioneNivel.setEnabled(false);
                }else {
                    JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Este nombre de usuario no existe.");
                    dispose();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(EditStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
