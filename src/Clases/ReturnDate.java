/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import JDesktopPane.Desktop;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lypef
 */
public class ReturnDate {
    
    public static String ruta_save = "ruta_save";
    public static String ruta_logo = "ruta_logo";
    public static String Empresa_nombre = "nombre";
    
    public String ReturnDateMay (String campo)
    {
        String var = "";
        
        try {
           
            Clases.ConexionBD Coneccion = new Clases.ConexionBD();
            
            String sql = "select "+campo+" from config WHERE id = 1";
            
            ResultSet rs = Coneccion.Consulta(sql);
           
            
            while (rs.next())
            {
                var = rs.getString(1);
            }
            
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"UPS, Parece que no se ah encontrado una conexion con la base de datos.");
            System.exit(0);
        }
        return var.toUpperCase();
    }
    
    public String Config_Get (String campo)
    {
        String var = "";
        
        try {
           
            Clases.ConexionBD Coneccion = new Clases.ConexionBD();
            
            String sql = "select "+campo+" from config WHERE id = 1";
            
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
    
    
}
