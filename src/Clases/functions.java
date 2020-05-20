/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import JDesktopPane.Sales;
import java.awt.Font;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lypef
 */
public class functions {
    
    ConexionBD db;
    ReturnDate datos = new ReturnDate();
    
    public static int Alert_Informacion = JOptionPane.INFORMATION_MESSAGE;
    public static int Alert_Warning = JOptionPane.WARNING_MESSAGE;
    public static int Alert_Error = JOptionPane.ERROR_MESSAGE;
    
    public final ArrayList Lista_Familia = new ArrayList();
    
    public void Alert (String Txt, int Code_Message)
    {
        JOptionPane.showMessageDialog(null,Txt, datos.ReturnDateMay("nombre"), Code_Message);
    }
    
    public void Jtable_Style(JTable t) 
    {
        //Ancho de celda
        t.setRowHeight(25);

        //Tipo de letra

        //Encabezados en negritas
        t.getTableHeader().setFont(new Font("Arial", 1, 16)); 

        // Body font
        t.setFont(new java.awt.Font("Arial", 0, 14));

        t.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        t.getTableHeader().setReorderingAllowed(false);
        t.getTableHeader().setResizingAllowed(false);

        //Centrar header
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) t.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);

        //Centrar celdas
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < t.getColumnCount(); i++)
        {
            t.getColumnModel().getColumn(i).setCellRenderer(modelocentrar); 
        }

        //No permitir editar celdas
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
    }
    
    public void Familys_Get(JTable Tabla ) 
    {
        try {
            Lista_Familia.clear();
            
            db = new ConexionBD();
            
            ResultSet rs = db.Consulta("SELECT * FROM `familys` ORDER BY nombre ASC");
            DefaultTableModel DefaultTableModel = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };

            String ValoresTabla [] = {"FAMILIA","DESCRIPCION"};
            DefaultTableModel.setColumnIdentifiers(ValoresTabla);
            Tabla.setModel(DefaultTableModel);
            
            Tabla.getColumnModel().getColumn(0);
            Tabla.getColumnModel().getColumn(1);
            

            String valores [] = new String [2];
            
            while (rs.next())
            {
                Lista_Familia.add(rs.getString(1));
                valores [0] = rs.getString(2);
                valores [1] = rs.getString(3);
                DefaultTableModel.addRow(valores);
            }
            
            Jtable_Style(Tabla);
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean Family_Add (JTextField TxtNombre, JTextArea TxtDescripcion)
    {
        boolean r = false;
        
        try 
        {
            db = new ConexionBD ();
            if (db.ejecutar("INSERT INTO `familys` (`nombre`, `descripcion`) VALUES ('"+TxtNombre.getText()+"', '"+TxtDescripcion.getText()+"');") > 0)
            {
                TxtNombre.setText("");
                TxtDescripcion.setText("");
                r = true;
            }
        } 
        catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) 
        {
            Alert(ex.getMessage(),Alert_Error);
        }
                
        return r;
    }
    
    public boolean Family_Delete (Integer id)
    {
        boolean r = false;
        
        try 
        {
            db = new ConexionBD ();
            if (db.ejecutar("DELETE FROM `familys` WHERE `familys`.`id` = "+id+" ") > 0)
            {
                r = true;
            }
        } 
        catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) 
        {
            Alert(ex.getMessage(),Alert_Error);
        }
                
        return r;
    }
}
