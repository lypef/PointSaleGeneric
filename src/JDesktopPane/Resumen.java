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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lypef
 */
public class Resumen extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reports
     */
    Clases.ReturnDate datos = new Clases.ReturnDate();
    
    public Resumen() {
        initComponents();
        DateStart.hide();
        setTitle("RESUMEN -" + datos.ReturnDateMay("nombre"));
        Modelo();
        Date hoy = new Date();
        DateFinaly.setDate(hoy);
        BtnSearchAction();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DateFinaly = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        BtnRecaudado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateStart = new com.toedter.calendar.JDateChooser();
        CBoxRangeDate = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabla.setFont(Tabla.getFont());
        jScrollPane1.setViewportView(Tabla);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit-Exit.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        BtnRecaudado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        BtnRecaudado.setForeground(new java.awt.Color(19, 24, 234));
        BtnRecaudado.setText("00000000.0000");
        BtnRecaudado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecaudadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 54, 232));
        jLabel1.setText("TOTAL RECAUDADO");

        CBoxRangeDate.setText("Rango de fechas");
        CBoxRangeDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBoxRangeDateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBoxRangeDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateFinaly, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRecaudado)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateFinaly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(DateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CBoxRangeDate)
                        .addGap(23, 23, 23)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BtnSearchAction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose ();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        if (JOptionPane.showInternalConfirmDialog(Desktop.Escritorio,"Desea imprimir el contenido ?","¿QUESTION?", 0) == 0)
        {
           Print();
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void BtnRecaudadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecaudadoActionPerformed
        TotalRecaudado();
    }//GEN-LAST:event_BtnRecaudadoActionPerformed

    private void CBoxRangeDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBoxRangeDateMouseClicked
        if (CBoxRangeDate.isSelected() == true)
        {
            DateStart.setVisible(true);
        }else
        {
            DateStart.setVisible(false);
        }
    }//GEN-LAST:event_CBoxRangeDateMouseClicked

    private void ShowDate(String fecha)
    {
        
        try {
            DefaultTableModel tabla = (DefaultTableModel) Tabla.getModel();
            
            String valores[] = new String[7];
            
            Clases.ConexionBD coneccion = new Clases.ConexionBD();
            
            String sql = "select * from logs";
            ResultSet rs = coneccion.Consulta(sql);
            
            while(rs.next())
            {
                System.out.print(rs.getString(7));
                if (rs.getString(7).equals(fecha))
                {
                    valores[0] = rs.getString(1);
                    valores[1] = rs.getString(2);
                    valores[2] = rs.getString(3);
                    valores[3] = rs.getString(4);
                    valores[4] = rs.getString(5);
                    valores[5] = rs.getString(6);
                    valores[6] = rs.getString(7);
                    
                    tabla.addRow(valores);
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ShowDateRange(Date FechaInicio, Date FechaFinaly) throws ParseException
    {
        
        try {
            DefaultTableModel tabla = (DefaultTableModel) Tabla.getModel();
            
            String valores[] = new String[7];
            
            Clases.ConexionBD coneccion = new Clases.ConexionBD();
            
            String sql = "select * from logs";
            ResultSet rs = coneccion.Consulta(sql);
            
            while(rs.next())
            {
                if (rs.getDate(7).before(FechaFinaly) && rs.getDate(7).after(FechaInicio) || rs.getDate(7).equals(FechaInicio) || rs.getDate(7).equals(FechaFinaly))
                {
                    valores[0] = rs.getString(1);
                    valores[1] = rs.getString(2);
                    valores[2] = rs.getString(3);
                    valores[3] = rs.getString(4);
                    valores[4] = rs.getString(5);
                    valores[5] = rs.getString(6);
                    valores[6] = rs.getString(7);
                    
                    tabla.addRow(valores);
                }
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRecaudado;
    private javax.swing.JCheckBox CBoxRangeDate;
    private com.toedter.calendar.JDateChooser DateFinaly;
    private com.toedter.calendar.JDateChooser DateStart;
    private javax.swing.JButton Imprimir;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Modelo() {
        DefaultTableModel DefaultTableModel = new DefaultTableModel(){
                    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
                };
    String ValoresTabla [] = {"Id","Producto","Codigo de barra","Precio c/u","Piezas","hora","fecha"};
                DefaultTableModel.setColumnIdentifiers(ValoresTabla);
                Tabla.setModel(DefaultTableModel);
                Tabla.getColumnModel().getColumn(0).setPreferredWidth(1);
                Tabla.getColumnModel().getColumn(1).setPreferredWidth(250);
    }
    
    private void Print() 
    {
        try {
            MessageFormat Header = new MessageFormat("Listado de venta");
            MessageFormat Footer = new MessageFormat("El saldo total de la fecha indicada, es $ " + BtnRecaudado.getText());
            Tabla.print(JTable.PrintMode.FIT_WIDTH, Header, Footer, false, null, isFocusable(), null);
        } catch (PrinterException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeadlessException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Hecho");
    }
    private void clean()
    {
        DefaultTableModel table = (DefaultTableModel) Tabla.getModel();
        int a = Tabla.getRowCount() -1;
        
        while(a >= 0)
        {
            table.removeRow(a);
            a--;
        }
        
    }

    private void TotalRecaudado() 
    {
        BtnRecaudado.setText("0.0");
        
        for (int i = 0 ; i < Tabla.getRowCount(); i++)
        {
           Double tmp = Double.parseDouble((String) Tabla.getValueAt(i, 3)) * Double.parseDouble((String) Tabla.getValueAt(i, 4)); 
           BtnRecaudado.setText(String.valueOf(Double.parseDouble(BtnRecaudado.getText()) + tmp));
        }
    }

    private void BtnSearchAction() {
        if (CBoxRangeDate.isSelected() == false)
        {
            clean();
            Date fecha = DateFinaly.getDate();

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            ShowDate(formato.format(fecha));

            TotalRecaudado();
        }else
        {
            try {
                clean();
                Date FechaStart = DateStart.getDate();
                Date FechaFinaly = DateFinaly.getDate();
                
                System.out.print(FechaStart);
                System.out.print(FechaFinaly);
                
                ShowDateRange(FechaStart, FechaFinaly);
                
                TotalRecaudado();
            } catch (ParseException ex) {
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
