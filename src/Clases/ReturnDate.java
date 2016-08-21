/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import JDesktopPane.Desktop;
import JDesktopPane.addproduct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lypef
 */
public class ReturnDate {
    
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
            Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Error");
        }
        return var.toUpperCase();
    }  
}
