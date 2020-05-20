/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import Clases.functions;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lypef_000
 */
public class EditStore extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditStaff
     */
    String Level , SeleccionTurno;
    
    functions f = new functions();
    
    public EditStore(String Id ,String producto , String family , String Codigobarra , String precio , String stock, String level, String precio_costo) 
    {
        initComponents();
        setTitle("Edicion de articulos");
        IdStore.setText(Id);
        Producto.setText(producto);
        CodigoBarra.setText(Codigobarra);
        TxtPrecio.setText(precio);
        TxtStock.setText(stock);
        
        if (level.equalsIgnoreCase("administrador"))
        {
            TxtPrecio.enable(false);
            TxtStock.enable(false);
            CodigoBarra.enable(false);
        }
        Level = level;
        TxtPrecioCosto.setText(precio_costo);
        f.Familys_Get_ComboBox(jComboBox1);
        
        //descipcion
        for (int index = 0; index < jComboBox1.getItemCount(); index++) {
            if (jComboBox1.getItemAt(index).equalsIgnoreCase(family)) 
            {
                jComboBox1.setSelectedIndex(index);
            }
      }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtStock = new javax.swing.JTextField();
        CodigoBarra = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        IdStore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BotonDarDeAlta = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        Producto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtPrecioCosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        IdStore.setForeground(new java.awt.Color(0, 2, 255));
        IdStore.setText("1");

        jLabel5.setText("Codigo de barra");

        jLabel4.setText("Stock");

        jLabel3.setText("P. Publico");

        jLabel1.setText("Producto");

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

        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 2, 255));
        jLabel8.setText("Numero de producto:");

        jLabel6.setText("P. Costo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Familia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BotonDarDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(CodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(TxtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(IdStore, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtStock))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(CodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TxtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(TxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(IdStore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonDarDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDarDeAltaActionPerformed
        Producto.setText(Producto.getText().toUpperCase());
        TxtPrecio.setText(TxtPrecio.getText().replace(" ", ""));
        TxtPrecio.setText(TxtPrecio.getText().replace(",","."));
        TxtStock.setText(TxtStock.getText().replace(" ",""));
        
        try {            
                Clases.ConexionBD CBD = new Clases.ConexionBD ();
                
                String modificar = "update productos set nombre = '"+Producto.getText()+"'  "
                        + " , "+" codigo = '"+CodigoBarra.getText()+"' , "+" p_costo = '"+TxtPrecioCosto.getText()+"' , "+" precio = '"+TxtPrecio.getText()+"' , "+" stock = '"+TxtStock.getText()+"', "+" family = '"+f.Lista_Familia.get(jComboBox1.getSelectedIndex())+"' where id = '"+Integer.parseInt(IdStore.getText())+"'";
                CBD.ejecutar(modificar);
                JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Correcto");
                dispose ();
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Error, no se actualizo el producto");
            }
    }//GEN-LAST:event_BotonDarDeAltaActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonDarDeAlta;
    private javax.swing.JTextField CodigoBarra;
    private javax.swing.JLabel IdStore;
    private javax.swing.JTextField Producto;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtPrecioCosto;
    private javax.swing.JTextField TxtStock;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
// Funciones

    void FuncionEditarRoot(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
