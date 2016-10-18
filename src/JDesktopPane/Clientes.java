/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import Clases.ConexionBD;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lypef_000
 */
public class Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form DeleteEmployee
     */
    String NivelDeUsuario;
    String UsuarioDeTrabajador;
    Boolean Veradmin = false,vervendedores = false,verroot = false,vermatutino = false,vervespertino = false;
    
    public Clientes () {
        initComponents();
        setTitle("Clientes");
        ModeloTabla ("select * from clientes");
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        TextModelo = new javax.swing.JTextField();
        ButonSearch = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setVisible(true);

        Tabla.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit-Exit.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        jButton4.setText("Agregar");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit.png"))); // NOI18N
        jButton5.setText("Editar");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refresh.png"))); // NOI18N
        jButton7.setText("Actualizar");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        jButton8.setText("Imprimir");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clean.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        TextModelo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextModelo.setText("// Nombre - descipcion");
        TextModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextModeloMouseClicked(evt);
            }
        });
        TextModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextModeloActionPerformed(evt);
            }
        });
        TextModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextModeloKeyPressed(evt);
            }
        });

        ButonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        ButonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButton8)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Editar ();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int x = Tabla.getSelectedRow();
        
        if (x == -1)
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Seleccione usuario que desea eliminar");
        }else
        {
            if (NivelDeUsuario.equalsIgnoreCase("root") || NivelDeUsuario.equalsIgnoreCase("administrador"))
            {
                if (JOptionPane.showInternalConfirmDialog(Desktop.Escritorio,"Esta seguro que desea eliminar el cliente [ " + (String) Tabla.getValueAt(x, 1) + " ]", "¿Esta seguro?" , 0) == 0)
                {
                    DeleteCliente(x);
                }
            }else{
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso denegado");
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddCliente AddCliente = new AddCliente();
        Desktop.Escritorio.add(AddCliente);
        AddCliente.toFront();
        AddCliente.setLocation((Desktop.Escritorio.getWidth() / 2) - AddCliente.getWidth() / 2, (Desktop.Escritorio.getHeight() / 2 ) - AddCliente.getHeight() / 2);
        AddCliente.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ModeloTabla ("select * from clientes");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            if (JOptionPane.showInternalConfirmDialog(Desktop.Escritorio,"Desea imprimir el contenido ?","¿QUESTION?", 0) == 0)
            {
                MessageFormat Header = new MessageFormat("LISTADO DE CLIENTES");
                Tabla.print(JTable.PrintMode.FIT_WIDTH, Header, null, false, null, true, null);
                JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Hecho");
            }
            
        } catch (PrinterException | HeadlessException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        if(evt.getClickCount() >= 2)
        {
            Editar();
        }
    }//GEN-LAST:event_TablaMousePressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        TextModelo.setText("// Nombre - descipcion");
        ModeloTabla ("select * from clientes");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void TextModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextModeloMouseClicked
        TextModelo.setText("");
    }//GEN-LAST:event_TextModeloMouseClicked

    private void TextModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextModeloActionPerformed

    private void TextModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextModeloKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            ButonSearch.doClick();
        }
    }//GEN-LAST:event_TextModeloKeyPressed

    private void ButonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonSearchActionPerformed
        if (!TextModelo.getText().equalsIgnoreCase("// Nombre - descipcion"))
        {
            ModeloTabla ("select * from clientes WHERE Nombre LIKE '%"+ TextModelo.getText() +"%' or ApellidoPaterno LIKE '%"+ TextModelo.getText() +"%' or ApellidoMaterno LIKE '%"+ TextModelo.getText() +"%' or rfc LIKE '%"+ TextModelo.getText() +"%' ");
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Ingrese valores para filtrar");

        }
    }//GEN-LAST:event_ButonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonSearch;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextModelo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void ModeloTabla (String sql){
        try {
             DefaultTableModel modelo = new DefaultTableModel()
            {
            public boolean isCellEditable (int rowIndex,int columnIndex){
            return false;
            }
            };
            String inserta [] = {"Id","Nombre","Apellido paterno","Apellido materno","RFC","Telefono","Direccion"};
            modelo.setColumnIdentifiers(inserta);
            Tabla.setModel(modelo);
            Tabla.getTableHeader().setReorderingAllowed(false);
            Clases.ConexionBD coneccion = new Clases.ConexionBD ();
            
            ResultSet rs = coneccion.Consulta(sql);
            String dato [] = new String [7];
            
            while (rs.next()){
                dato [0] = rs.getString(1);
                dato [1] = rs.getString(2); 
                dato [2] = rs.getString(3);
                dato [3] = rs.getString(4);
                dato [4] = rs.getString(5);
                dato [5] = rs.getString(6);
                dato [6] = rs.getString(7);
                modelo.addRow(dato);
            }
            
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 private void Editar ()
    {
        int x = Tabla.getSelectedRow();
        
        if (x == -1)
        {
        
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Seleccione el cliente que va a editar");
        
        }else
        {
            if (NivelDeUsuario.equalsIgnoreCase("administrador") || NivelDeUsuario.equalsIgnoreCase("root"))
            {
                EditCliente EditCliente = new EditCliente();
                Desktop.Escritorio.add(EditCliente);        
                EditCliente.SearchClientId(Integer.parseInt( (String) Tabla.getValueAt(x, 0) ));
                EditCliente.setLocation(Desktop.Escritorio.getWidth() / 2 - EditCliente.getWidth() / 2 , Desktop.Escritorio.getHeight() / 2 - EditCliente.getHeight() /2);
                EditCliente.show();
            }
        }
    }
 
    private void DeleteCliente (int x)
    {
        try {    
            String id = (String) Tabla.getValueAt(x, 0);
            
            ConexionBD coneccion = new ConexionBD ();
            
            String sql = "DELETE  FROM clientes WHERE id = '"+id+"';";
            coneccion.ejecutar(sql);
            DefaultTableModel table =  (DefaultTableModel) Tabla.getModel();
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Cliente eliminado correctamente.");
            table.fireTableChanged(null);
            ModeloTabla ("select * from clientes");
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Ups, algo salio mal.");
        }
         
        
    }
}
