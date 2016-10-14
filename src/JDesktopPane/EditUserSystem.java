/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDesktopPane;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lypef
 */
public class EditUserSystem extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddUserSystem
     */
    String Level, useredit;
    
    public EditUserSystem(String LevelTmp, String usertmp) {
        Level = LevelTmp;
        useredit = usertmp;
        initComponents();
        LoadTxt();
        LoadComboBoxLevel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        TxtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BotonDarDeAlta1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ComboBoxLevel = new javax.swing.JComboBox();
        TxtConfirmPassword = new javax.swing.JPasswordField();
        TxtPasswors = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        SecundLAstname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        BotonLimpiar1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        TxtTel = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtFirstLastname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        BotonCancelar1 = new javax.swing.JButton();
        TxtMail = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        jLabel10.setText("USUARIO");

        jLabel9.setText("CONTRASEÑA");

        jLabel17.setText("SEGUNDO APELLIDO");

        BotonDarDeAlta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        BotonDarDeAlta1.setText("Actualizar");
        BotonDarDeAlta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonDarDeAlta1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonDarDeAlta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDarDeAlta1ActionPerformed(evt);
            }
        });

        jLabel14.setText("NOMBRE");

        ComboBoxLevel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboBoxLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxLevelActionPerformed(evt);
            }
        });

        jLabel18.setText("DIRECCION");

        jLabel13.setText("NIVEL");

        BotonLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clean.png"))); // NOI18N
        BotonLimpiar1.setText("Limpiar");
        BotonLimpiar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLimpiar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiar1ActionPerformed(evt);
            }
        });

        jLabel16.setText("TELEFONO");

        jLabel15.setText("PRIMER APELLIDO");

        jLabel20.setText("CONF. CONTRASEÑA");

        BotonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel.png"))); // NOI18N
        BotonCancelar1.setText("Cancelar");
        BotonCancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelar1ActionPerformed(evt);
            }
        });

        jLabel21.setText("E-MAIL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(TxtTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SecundLAstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFirstLastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPasswors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel21)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BotonLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(BotonDarDeAlta1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(BotonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPasswors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFirstLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecundLAstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonLimpiar1)
                    .addComponent(BotonDarDeAlta1)
                    .addComponent(BotonCancelar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDarDeAlta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDarDeAlta1ActionPerformed
        if (TxtPasswors.getText().equals(TxtConfirmPassword.getText()))
        {
            AddValuesUser();
            Clean();
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Las contraseñas no coinciden");
        }
        
    }//GEN-LAST:event_BotonDarDeAlta1ActionPerformed

    private void ComboBoxLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxLevelActionPerformed

    private void BotonLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiar1ActionPerformed
        Clean();
    }//GEN-LAST:event_BotonLimpiar1ActionPerformed

    private void BotonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar1;
    private javax.swing.JButton BotonDarDeAlta1;
    private javax.swing.JButton BotonLimpiar1;
    private javax.swing.JComboBox ComboBoxLevel;
    private javax.swing.JTextField SecundLAstname;
    private javax.swing.JPasswordField TxtConfirmPassword;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtFirstLastname;
    private javax.swing.JTextField TxtMail;
    private javax.swing.JTextField TxtName;
    private javax.swing.JPasswordField TxtPasswors;
    private javax.swing.JTextField TxtTel;
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void LoadComboBoxLevel()
    {
        ComboBoxLevel.removeAllItems();
        if (Level.equalsIgnoreCase("root"))
        {
            if (ReturnDateUserSystem("Nivel").equalsIgnoreCase("administrador"))
            {
                ComboBoxLevel.addItem("ADMINISTRADOR");
                ComboBoxLevel.addItem("VENDEDOR");
                ComboBoxLevel.addItem("ROOT");
            }
            else if (ReturnDateUserSystem("Nivel").equalsIgnoreCase("vendedor"))
            {
                ComboBoxLevel.addItem("VENDEDOR");
                ComboBoxLevel.addItem("ROOT");
                ComboBoxLevel.addItem("ADMINISTRADOR");
            }
            else if (ReturnDateUserSystem("Nivel").equalsIgnoreCase("root"))
            {
                ComboBoxLevel.addItem("ROOT");
                ComboBoxLevel.addItem("ADMINISTRADOR");
                ComboBoxLevel.addItem("VENDEDOR");
            }
        }
        else if (Level.equalsIgnoreCase("administrador"))
        {
            if (ReturnDateUserSystem("Nivel").equalsIgnoreCase("administrador"))
            {
                ComboBoxLevel.addItem("ADMINISTRADOR");
                ComboBoxLevel.addItem("VENDEDOR");
                ComboBoxLevel.addItem("ROOT");
            }
            else if (ReturnDateUserSystem("Nivel").equalsIgnoreCase("vendedor"))
            {
                ComboBoxLevel.addItem("VENDEDOR");
                ComboBoxLevel.addItem("ROOT");
                ComboBoxLevel.addItem("ADMINISTRADOR");
            }
        }
        
    }
    private void Clean() {
        TxtUsername.setText("");
        TxtPasswors.setText("");
        TxtConfirmPassword.setText("");
        TxtName.setText("");
        TxtFirstLastname.setText("");
        SecundLAstname.setText("");
        TxtDireccion.setText("");
        TxtTel.setText("");
        TxtMail.setText("");
        LoadComboBoxLevel();
    }
    private void AddValuesUser() 
    {
        try {
           
            Clases.ConexionBD coneccion = new Clases.ConexionBD();
            String insert = "update usuarios set usuario = '"+ TxtUsername.getText() +"', contraseña = '"+ TxtPasswors.getText() +"', nombre = '"+ TxtName.getText() +"', PrimerApellido = '"+ TxtFirstLastname.getText() +"', SegundoApellido = '"+ SecundLAstname.getText() +"', Direccion = '"+ TxtDireccion.getText() +"', Telefono = '"+ TxtTel.getText() +"', CorreoElectronico = '"+ TxtTel.getText() +"', Nivel = '"+ ComboBoxLevel.getSelectedItem() +"' where Usuario = '"+ useredit +"' ";
            coneccion.ejecutar(insert);
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Hecho");
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,ex);
        }
    }
    private String ReturnDateUserSystem (String campo)
    {
        String var = "";
        
        try {
           
            Clases.ConexionBD Coneccion = new Clases.ConexionBD();
            
            String sql = "select "+ campo +" from usuarios WHERE Usuario = '"+ useredit +"' ";
            
            ResultSet rs = Coneccion.Consulta(sql);
           
            
            while (rs.next())
            {
                var = rs.getString(1);
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"UPS, Parece que no se ah encontrado una conexion con la base de datos.");
            System.exit(0);
        }
        return var;
    }  

    private void LoadTxt() {
        TxtUsername.setText(ReturnDateUserSystem("usuario"));
        TxtPasswors.setText(ReturnDateUserSystem("contraseña"));
        TxtConfirmPassword.setText(ReturnDateUserSystem("contraseña"));
        TxtName.setText(ReturnDateUserSystem("nombre"));
        TxtFirstLastname.setText(ReturnDateUserSystem("PrimerApellido"));
        SecundLAstname.setText(ReturnDateUserSystem("SegundoApellido"));
        TxtDireccion.setText(ReturnDateUserSystem("direccion"));
        TxtTel.setText(ReturnDateUserSystem("telefono"));
        TxtMail.setText(ReturnDateUserSystem("correoelectronico"));
        
    }
}
