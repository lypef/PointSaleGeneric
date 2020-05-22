/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import Clases.functions;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    functions f = new functions ();
    boolean next = false;    
    String footer = "", footer_familias = "";
    
    public Resumen() {
        initComponents();
        DateStart.hide();
        setTitle("RESUMEN - " + f.d.ReturnDateMay(f.d.Empresa_nombre));
        Modelo();
        Date hoy = new Date();
        DateFinaly.setDate(hoy);
        DateStart.setDate(hoy);
        f.Familys_Get_ComboBoxText(Combo);
        BtnSearchAction();
        next = true;
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
        Combo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        DateFinaly.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateFinalyPropertyChange(evt);
            }
        });

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

        DateStart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateStartPropertyChange(evt);
            }
        });

        CBoxRangeDate.setText("Rango de fechas");
        CBoxRangeDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBoxRangeDateItemStateChanged(evt);
            }
        });
        CBoxRangeDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBoxRangeDateMouseClicked(evt);
            }
        });

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBoxRangeDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateFinaly, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateFinaly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(DateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CBoxRangeDate)
                        .addGap(15, 15, 15)))
                .addGap(5, 5, 5)
                .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(13, Short.MAX_VALUE))
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
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        java.util.Date fecha = DateStart.getDate();
        String fecha_ini = formato.format(fecha);
        
        java.util.Date fecha0 = DateFinaly.getDate();
        String fecha_fin = formato.format(fecha0);
        
        
        String title = "";
        if (Combo.getSelectedIndex() > 0)
        {
            if (CBoxRangeDate.isSelected())
            {
                title = "Resumen de venta, Familia: " + Combo.getSelectedItem() + ", Fecha de: " + fecha_ini+ " a " + fecha_fin;
            }else
            {
                title = "Resumen de venta, Familia: " + Combo.getSelectedItem() + ", Fecha: " + fecha_fin;
            }
        }else
        {
            if (CBoxRangeDate.isSelected())
            {
                title = "Resumen de venta. Fecha de: " + fecha_ini + " a la fecha " + fecha_fin;
            }else
            {
                title = "Resumen de venta, Fecha: " + fecha_fin;
            }
        }
        f.GenerateReportResumen(Tabla,title,1, footer, footer_familias);
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

    private void ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboItemStateChanged
        if (next)
        {
            BtnSearchAction();
        }
    }//GEN-LAST:event_ComboItemStateChanged

    private void DateStartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateStartPropertyChange
        if (next)
        {
            BtnSearchAction();
        }
    }//GEN-LAST:event_DateStartPropertyChange

    private void DateFinalyPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateFinalyPropertyChange
        if (next)
        {
            BtnSearchAction();
        }
    }//GEN-LAST:event_DateFinalyPropertyChange

    private void CBoxRangeDateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBoxRangeDateItemStateChanged
        if (next)
        {
            BtnSearchAction();
        }
    }//GEN-LAST:event_CBoxRangeDateItemStateChanged

    private void ShowDate(String fecha)
    {
        String fecha_fin = fecha + " 23:59:59";
                
        fecha += " 00:00:00";
        
        try {
            DefaultTableModel tabla = (DefaultTableModel) Tabla.getModel();
            
            String valores[] = new String[10];
            
            Clases.ConexionBD coneccion = new Clases.ConexionBD();
            
            String sql = "";
            if (Combo.getSelectedIndex() <= 0)
            {
                sql = "SELECT v.id, v.producto, v.codigo, v.piezas, v.precio as p_u, (v.precio * v.piezas) as p_total, u.Nombre, f.nombre as familia , v.t_pago, v.fecha FROM logs v, usuarios u, familys f, productos p where v.vendedor = u.Usuario and v.codigo = p.codigo and p.family = f.id and v.fecha >= '"+fecha+"' and v.fecha <= '"+fecha_fin+"' order by f.nombre asc ";                
            }else
            {
                sql = "SELECT v.id, v.producto, v.codigo, v.piezas, v.precio as p_u, (v.precio * v.piezas) as p_total, u.Nombre, f.nombre as familia , v.t_pago, v.fecha FROM logs v, usuarios u, familys f, productos p where v.vendedor = u.Usuario and v.codigo = p.codigo and p.family = f.id and v.fecha >= '"+fecha+"' and v.fecha <= '"+fecha_fin+"' and f.id = "+f.Lista_Familia.get(Combo.getSelectedIndex())+" order by f.nombre asc ";
            }
            
            
            ResultSet rs = coneccion.Consulta(sql);
            
            while(rs.next())
            {
                valores[0] = rs.getString(1);
                valores[1] = rs.getString(2);
                valores[2] = rs.getString(3);
                valores[3] = rs.getString(4);
                valores[4] = rs.getString(5);
                valores[5] = rs.getString(6);
                valores[6] = rs.getString(7);
                valores[7] = rs.getString(8);
                valores[8] = rs.getString(9);
                valores[9] = rs.getString(10);

                tabla.addRow(valores);
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ShowDateRange(Date FechaInicio, Date FechaFinaly) throws ParseException
    {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        java.util.Date fecha = FechaInicio;
        String fecha_ini = formato.format(fecha) + " 00:00:00";
        
        java.util.Date fecha0 = FechaFinaly;
        String fecha_fin = formato.format(fecha0) + " 23:59:59";
        
        try {
            DefaultTableModel tabla = (DefaultTableModel) Tabla.getModel();
            
            String valores[] = new String[10];
            
            Clases.ConexionBD coneccion = new Clases.ConexionBD();
            
            String sql = "";
            if (Combo.getSelectedIndex() <= 0)
            {
                sql = "SELECT v.id, v.producto, v.codigo, v.piezas, v.precio as p_u, (v.precio * v.piezas) as p_total, u.Nombre, f.nombre as familia , v.t_pago, v.fecha FROM logs v, usuarios u, familys f, productos p where v.vendedor = u.Usuario and v.codigo = p.codigo and p.family = f.id and v.fecha >= '"+fecha_ini+"' and v.fecha <= '"+fecha_fin+"' order by f.nombre asc ";                
            }else
            {
                sql = "SELECT v.id, v.producto, v.codigo, v.piezas, v.precio as p_u, (v.precio * v.piezas) as p_total, u.Nombre, f.nombre as familia , v.t_pago, v.fecha FROM logs v, usuarios u, familys f, productos p where v.vendedor = u.Usuario and v.codigo = p.codigo and p.family = f.id and v.fecha >= '"+fecha_ini+"' and v.fecha <= '"+fecha_fin+"' and f.id = "+f.Lista_Familia.get(Combo.getSelectedIndex())+" order by f.nombre asc ";
            }
            
            
            ResultSet rs = coneccion.Consulta(sql);
            
            while(rs.next())
            {
                valores[0] = rs.getString(1);
                valores[1] = rs.getString(2);
                valores[2] = rs.getString(3);
                valores[3] = rs.getString(4);
                valores[4] = rs.getString(5);
                valores[5] = rs.getString(6);
                valores[6] = rs.getString(7);
                valores[7] = rs.getString(8);
                valores[8] = rs.getString(9);
                valores[9] = rs.getString(10);

                tabla.addRow(valores);
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRecaudado;
    private javax.swing.JCheckBox CBoxRangeDate;
    private javax.swing.JComboBox<String> Combo;
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
                    @Override
                    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
                };
        String ValoresTabla [] = {"ID","PRODUCTO","C. BARRA","PIEZAS","P.U","TOTAL","VENDEDOR","FAMILIA","T. PAGO","FECHA"};
                DefaultTableModel.setColumnIdentifiers(ValoresTabla);
                Tabla.setModel(DefaultTableModel);
                Tabla.getColumnModel().getColumn(0).setPreferredWidth(1);
                Tabla.getColumnModel().getColumn(1).setPreferredWidth(250);
        f.Jtable_Style(Tabla);
    }
    
    private void Print() 
    {
        try {
            MessageFormat Header = new MessageFormat("Listado de venta");
            MessageFormat Footer = new MessageFormat("El saldo total de la fecha indicada, es $ " + BtnRecaudado.getText());
            Tabla.print(JTable.PrintMode.FIT_WIDTH, Header, Footer, false, null, isFocusable(), null);
        } catch (PrinterException | HeadlessException ex) {
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
        footer = "";
        footer_familias = "\n";
        
        ArrayList lista = new ArrayList();
        
        BtnRecaudado.setText("0.0");
        Double total = 0.0;
        
        int efectivo = 0;
        Double efeDouble = 0.0;
        
        int tarjeta = 0;
        Double tarDouble = 0.0;
        
        int cheque = 0;
        Double cheDouble = 0.0;
        
        int vale = 0;
        Double valDouble = 0.0;
        
        int otro = 0;
        Double otrDouble = 0.0;
        
        for (int i = 0 ; i < Tabla.getRowCount(); i++)
        {
            boolean exist = false;
            
            String Familia = (String) Tabla.getValueAt(i, 7);
            
            for (Object item: lista) 
            {
                if (item.equals(Familia))
                {
                    exist = true;
                    break;
                }
            }
            
            if (!exist)
            {
                lista.add(Familia);
            }
        }
        
        
        for (int i = 0 ; i < Tabla.getRowCount(); i++)
        {
           Double tmp = Double.parseDouble((String) Tabla.getValueAt(i, 5)); 
           total += tmp;
           BtnRecaudado.setText(String.valueOf(Double.parseDouble(BtnRecaudado.getText()) + tmp));
           
           
           // Metodos de pago
           if (String.valueOf(Tabla.getValueAt(i, 8)).equalsIgnoreCase("efectivo"))
           {
               efectivo ++;
               efeDouble += Double.parseDouble((String) Tabla.getValueAt(i, 5));
           }
           
           if (String.valueOf(Tabla.getValueAt(i, 8)).equalsIgnoreCase("tarjeta"))
           {
               tarjeta ++;
               tarDouble += Double.parseDouble((String) Tabla.getValueAt(i, 5));
           }
           
           if (String.valueOf(Tabla.getValueAt(i, 8)).equalsIgnoreCase("cheque"))
           {
               cheque ++;
               cheDouble += Double.parseDouble((String) Tabla.getValueAt(i, 5));
           }
           
           if (String.valueOf(Tabla.getValueAt(i, 8)).equalsIgnoreCase("vale"))
           {
               vale ++;
               valDouble += Double.parseDouble((String) Tabla.getValueAt(i, 5));
           }
           
           if (String.valueOf(Tabla.getValueAt(i, 8)).equalsIgnoreCase("otro"))
           {
               otro ++;
               otrDouble += Double.parseDouble((String) Tabla.getValueAt(i, 5));
           }
        }
        
        if (efectivo > 0)
        {
            footer += "(" + efectivo + ") Efectivo: $ " + efeDouble;
        }
        
        if (tarjeta > 0)
        {
            footer += "\n(" + tarjeta + ") Tarjeta: $ " + tarDouble;
        }
        
        if (cheque > 0)
        {
            footer += "\n(" + cheque + ") Cheque: $ " + cheDouble;
        }
        
        if (vale > 0)
        {
            footer += "\n(" + vale + ") Vale: $ " + valDouble;
        }
        
        if (otro > 0)
        {
            footer += "\n(" + otro + ") Otro: $ " + otrDouble;
        }
        
        
        footer += "\n\nTotal recaudado: $ " + total;
        
        // Familias
        double totalfamily = 0.0;
        
        for (Object item: lista) 
        {
            int cont = 0;
            Double tmp = 0.0;
            
            for (int i = 0 ; i < Tabla.getRowCount(); i++)
            {
                if (Tabla.getValueAt(i, 7).equals(item))
                {
                    cont ++;
                    
                    double r = Double.parseDouble((String) Tabla.getValueAt(i, 5));
                    
                    tmp += r; 
                    totalfamily += r;
                }
            }
            footer_familias += "("+cont + ") " + f.First_Upercase(item.toString()) + " $ " +tmp + "\n";
        }
        footer_familias += "\nTotal recaudado $ " + totalfamily;
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
                
                ShowDateRange(FechaStart, FechaFinaly);
                
                TotalRecaudado();
            } catch (ParseException ex) {
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
