/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import Clases.ConexionBD;
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
public class AddFeatures extends javax.swing.JInternalFrame {
    int compara;
    String TipoUser,Turno;
    int id = 1;
    /**
     * Creates new form AddStaff
     */
    public AddFeatures() {
        initComponents();
        setTitle("Agregar caracteristicas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BotonDarDeAlta = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 147, -1));

        jLabel1.setText("Tipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        BotonDarDeAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        BotonDarDeAlta.setText("Guardar");
        BotonDarDeAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonDarDeAlta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDarDeAltaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDarDeAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 136, 112, -1));

        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clean.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 136, 112, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDarDeAltaActionPerformed
            Tipo.setText(Tipo.getText().toUpperCase());

            try {
                Clases.ConexionBD BD = new Clases.ConexionBD();
      
                //if (ComparaTipo() == true)
                //{
                String AllTrue = "INSERT INTO `tipodecalzado`(`tipodecalzado`) VALUES ('"+Tipo.getText()+"')";
                BD.ejecutar(AllTrue);
                Limpiar ();
                JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Correcto");
                dispose();
                 //   }else
                //{
                //       JOptionPane.showInputDialog(this, "El tipo de articulo ya existe");
                //}
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_BotonDarDeAltaActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Limpiar ();
    }//GEN-LAST:event_BotonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDarDeAlta;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JTextField Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    private void Limpiar () 
    {
    Tipo.setText("");
   
    }
   
    private boolean ComparaTipo ()
    {
        String BuscoColor = "";
        try {
            String ComparaColor = "select * from tipodecalzado where tipodecalzado ='"+Tipo.getText()+"';";
            Clases.ConexionBD BD = new Clases.ConexionBD();
            ResultSet TipoResult = BD.Consulta(ComparaColor);
            while (TipoResult.next())
            {
                BuscoColor = TipoResult.getString(1);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AddFeatures.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BuscoColor.equalsIgnoreCase(Tipo.getText()))
        {
        return false;
        }else
        {
        return true;
        }
    }
}
