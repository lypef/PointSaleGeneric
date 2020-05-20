/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
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
            Alert(ex.getMessage(), Alert_Error);
        }   
    }
    
    public void Familys_Get_ComboBox(JComboBox c) 
    {
        try {
            Lista_Familia.clear();
            c.removeAllItems();
            
            db = new ConexionBD();
            
            ResultSet rs = db.Consulta("SELECT * FROM `familys` ORDER BY nombre ASC");

            
            while (rs.next())
            {
                Lista_Familia.add(rs.getString(1));
                c.addItem(rs.getString(2));
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Alert(ex.getMessage(), Alert_Error);
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
    
    public void Family_Edit_Get (JTextField TxtNombre, JTextArea TxtDescripcion, int id)
    {
        try {
            db = new Clases.ConexionBD();
            
            ResultSet rs = db.Consulta("SELECT * FROM familys where id = "+id+" ; ");
            
            if (rs.next())
            {
                TxtNombre.setText(rs.getString(2));
                TxtDescripcion.setText(rs.getString(3));
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Alert(ex.getMessage(), Alert_Error);
        }
    }
    
    public boolean Family_update (JTextField TxtNombre, JTextArea TxtDescripcion, Integer id)
    {
        boolean r = false;
        
        try 
        {
            db = new ConexionBD ();
            if (db.ejecutar("UPDATE `familys` SET `nombre` = '"+TxtNombre.getText()+"', `descripcion` = '"+TxtDescripcion.getText()+"' WHERE id = "+id+";") > 0)
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
    
    public void Store_Get (JTable t, String sql0)
    {
        try {
            db = new Clases.ConexionBD();
            DefaultTableModel DefaultTableModel = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };
            
            String ValoresTabla [] = {"Id","Producto","Familia","C. Barra","P. Publico","P. Costo","Stock"};
            DefaultTableModel.setColumnIdentifiers(ValoresTabla);
            t.setModel(DefaultTableModel);
            t.getColumnModel().getColumn(0).setPreferredWidth(1);
            t.getColumnModel().getColumn(1).setPreferredWidth(450);
            t.getTableHeader().setReorderingAllowed(false);
            
            String sql = "select p.id, p.nombre, f.nombre, p.codigo, p.precio, p.stock, p.vendidos, p.p_costo from productos p, familys f WHERE p.family = f.id";
            
            if (!sql0.isEmpty()) 
            {
                sql = sql0;
            }
            
            ResultSet rs = db.Consulta(sql);
            
            String valores [] = new String [7];
            
            while (rs.next()){
                valores [0] = rs.getString(1);
                valores [1] = rs.getString(2);
                valores [2] = rs.getString(3);
                valores [3] = rs.getString(4);
                valores [4] = rs.getString(5);
                valores [5] = rs.getString(8);
                valores [6] = rs.getString(6);
                DefaultTableModel.addRow(valores);
            }
            Jtable_Style(t);
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Alert(ex.getMessage(), Alert_Error);
        }
    }
}