/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sun.net.www.MessageHeader;

/**
 *
 * @author lypef_000
 */
public class Supplies extends javax.swing.JInternalFrame {

    /**
     * Creates new form Supplies
     */
    Clases.ReturnDate datos = new Clases.ReturnDate();
    
    public Supplies() {
        initComponents();
        InicioTabla ();
        setTitle("PROVEDORES - " + datos.ReturnDateMay("nombre"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        Tabla.setFont(Tabla.getFont().deriveFont(Tabla.getFont().getSize()+2f));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit-Exit.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refresh.png"))); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit.png"))); // NOI18N
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        jButton6.setText("Imprimir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        jButton7.setText("Ver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddSupplies AddSupplies = new AddSupplies ();
        Desktop.Escritorio.add(AddSupplies);
        AddSupplies.setLocation(Desktop.Escritorio.getWidth() / 2 - AddSupplies.getWidth() / 2, Desktop.Escritorio.getHeight() / 2 - AddSupplies.getHeight() / 2);
        AddSupplies.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        InicioTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Calledit();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CallDelete ();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            MessageFormat Header = new MessageFormat("LISTADO DE PROVEEDORES");
            Tabla.print(JTable.PrintMode.FIT_WIDTH, Header, null, false, null, isSelected);
        } catch (PrinterException ex) {
            Logger.getLogger(Supplies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeadlessException ex) {
            Logger.getLogger(Supplies.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Hecho");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int select = Tabla.getSelectedRow();
        
        if (select != -1)
        {
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,
               "Empresa: " + Tabla.getValueAt(select,1) +
                       "\nDireccion: " + Tabla.getValueAt(select, 2) +
                       "\nEmail: " + Tabla.getValueAt(select, 3) +
                       "\nTelefono: " + Tabla.getValueAt(select, 4) +
                        "\nRfc: " + Tabla.getValueAt(select, 5)
                );
        }else
        {
            JOptionPane.showMessageDialog(Desktop.Escritorio,"No selecciono nigun provedor.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void InicioTabla ()
    {
try {
            Clases.ConexionBD ConexionBD = new Clases.ConexionBD();
            DefaultTableModel DefaultTableModel = new DefaultTableModel();
            
            String ValoresTabla [] = {"Id provedor","Empresa","Direccion","Email","Telefono","Rfc"};
            DefaultTableModel.setColumnIdentifiers(ValoresTabla);
            Tabla.setModel(DefaultTableModel);
            Tabla.getTableHeader().setReorderingAllowed(false);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(2);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(200);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(300);
            String sql = "select * from provedores";
            ResultSet rs = ConexionBD.Consulta(sql);
            
            String valores [] = new String [6];
            
            while (rs.next()){
            valores [0] = String.valueOf(rs.getInt(1));
            valores [1] = rs.getString(2); 
            valores [2] = rs.getString(3);
            valores [3] = rs.getString(4);
            valores [4] = rs.getString(5);
            valores [5] = rs.getString(6);
            DefaultTableModel.addRow(valores);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   

    private void Calledit() {
    int SeleccionEdit = Tabla.getSelectedRow();
    EditSupplies EditSupplies = new EditSupplies ();
    if (SeleccionEdit == -1)
    {
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Seleccione el provedor a editar");
    }else
    {
    Desktop.Escritorio.add(EditSupplies);
    EditSupplies.CapturaDatos((String) Tabla.getValueAt(SeleccionEdit, 0),(String) Tabla.getValueAt(SeleccionEdit, 1),
                              (String) Tabla.getValueAt(SeleccionEdit, 2),(String) Tabla.getValueAt(SeleccionEdit, 3), 
                              (String) Tabla.getValueAt(SeleccionEdit, 4),(String) Tabla.getValueAt(SeleccionEdit, 5));
    EditSupplies.toFront();
    EditSupplies.setLocation(Desktop.Escritorio.getWidth() / 2 - EditSupplies.getWidth() / 2,Desktop.Escritorio.getHeight() / 2 - EditSupplies.getHeight() / 2);
    EditSupplies.show();
    }
    }

    private void CallDelete() {
    int seleccion = Tabla.getSelectedRow();
    
    if (seleccion == -1)
    {
    JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Seleccione el provedor que desea eliminar");
    }else{
        if (JOptionPane.showInternalConfirmDialog(Desktop.Escritorio,"Esta seguro que desea eliminar el provedor numero : " + (String) Tabla.getValueAt(seleccion,0),"¿Esta seguro?", 0) == 0){
        try {
            Clases.ConexionBD coneccion = new Clases.ConexionBD();
            String sql = "delete from provedores where idprovedor = '"+Integer.parseInt((String) Tabla.getValueAt(seleccion,0))+"'";
            coneccion.ejecutar(sql);
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Proveedor eliminado correctamente.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Supplies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Supplies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Supplies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Supplies.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    }
}
