/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author lypef
 */
public class functions {
    
    ConexionBD db;
    
    public ReturnDate d = new ReturnDate();
    Properties p = new Properties();
    
    public static int Alert_Informacion = JOptionPane.INFORMATION_MESSAGE;
    public static int Alert_Warning = JOptionPane.WARNING_MESSAGE;
    public static int Alert_Error = JOptionPane.ERROR_MESSAGE;
    
    public static String Properties_server = "db_url";
    public static String Properties_Puerto = "db_puerto";
    public static String Properties_DbName = "bd_name";
    public static String Properties_Username = "db_username";
    public static String Properties_Password = "db_password";
    
    public final ArrayList Lista_Familia = new ArrayList();
    
    public void Alert (String Txt, int Code_Message)
    {
        JOptionPane.showMessageDialog(null,Txt, d.ReturnDateMay("nombre"), Code_Message);
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
    
    public void Familys_Get_ComboBoxText(JComboBox c) 
    {
        try {
            Lista_Familia.clear();
            c.removeAllItems();
            
            db = new ConexionBD();
            
            ResultSet rs = db.Consulta("SELECT * FROM `familys` ORDER BY nombre ASC");

            Lista_Familia.add("0");
            c.addItem("Todas las familias. Seleccione una familia");
                
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
    
    public void Inventario_Get (JTable t, String sql)
    {
        try {
                db = new Clases.ConexionBD();
                
                if (sql == null)
                {
                     sql = "select p.nombre as nombre, p.codigo as c_barra, p.vendidos, p.stock as existencias, (p.stock + p.vendidos) as total, p.p_costo as p_costo, p.precio as p_publico, f.nombre as familias from productos p, familys f WHERE p.family = f.id order by f.nombre asc";
                }
                
                ResultSet rs = db.Consulta(sql);
                DefaultTableModel DefaultTableModel = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
                };
                
                String ValoresTabla [] = {"PRODUCTO","C. BARRA","VENDIDOS","STOCK","TOTAL","P. COSTO","P. PUBLICO"};
                DefaultTableModel.setColumnIdentifiers(ValoresTabla);
                
                t.setModel(DefaultTableModel);
                
                String valores [] = new String [7];
                
                while (rs.next())
                {
                    valores [0] = rs.getString(1);
                    valores [1] = rs.getString(2);
                    valores [2] = rs.getString(3);
                    valores [3] = rs.getString(4);
                    valores [4] = rs.getString(5);
                    valores [5] = rs.getString(6);
                    valores [6] = rs.getString(7);
                    DefaultTableModel.addRow(valores);       
                }
                
                Jtable_Style(t);
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Alert(ex.getMessage(), Alert_Error);
            }
    }
    
    public String GenerateReport (JTable t, String title, int open)
    {
        String rs = null;
        Object[] options = { "PDF", "EXCEL", "NINGUNO" };
        
        int r = JOptionPane.showOptionDialog(null, 
        "Seleccione el tipo de formato a generar.", 
        "Generar reporte?", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        options, 
        options[0]);
        
        if (r == 0)
        {
            rs = GenerateReporte_pdf(t, title, open);
        }
        else if (r == 1)
        {
            rs = GenerateReporte_xls(t, open);
        }
        return rs;
    }
    
    private String GenerateReporte_pdf (JTable t, String title, int open)
    {
        Document documento = new Document(PageSize.LETTER.rotate(),10,10,10,10);  
        FileOutputStream ficheroPdf;
        File ruta = null;
        com.itextpdf.text.Image imagen = null;
        try {
            imagen = com.itextpdf.text.Image.getInstance(d.Config_Get(d.ruta_logo));
            
            ruta = new File (d.Config_Get(d.ruta_save) + "report.pdf");
            
            ficheroPdf = new FileOutputStream(ruta);
            PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
        } catch (DocumentException | IOException ex) {
            Alert("Verifique ruta de guardado", Alert_Error);
        }
        
        
        try{
            documento.open();
            
            title += "";
            
            Paragraph Title = new Paragraph(title.toUpperCase());
            Title.setAlignment(1);
            documento.add(Title);
            imagen.setAlignment(Element.ALIGN_CENTER);
            imagen.scaleToFit(200, 100);
            
            String membrete = d.ReturnDateMay("nombre") + "\n";
            membrete += "DIRECCION: " + d.ReturnDateMay("direccion") + "\n";
            membrete += "RFC: " + d.ReturnDateMay("rfc")+"\n";
            membrete += "TELEFONO: " + d.ReturnDateMay("telefono") + "\n";
            membrete += "FECHA Y HORA DE GENERACION: " + GetFechaAndHourActual()+ "\n";
            
            /////////
            PdfPTable HeaderDatos = new PdfPTable(2);
            HeaderDatos.setWidthPercentage(100);
            
            documento.add(new Paragraph("\n"));
            
            PdfPCell cell = new PdfPCell(new Phrase(membrete));
            cell.setBorder(0);
            HeaderDatos.addCell(cell);
            cell = new PdfPCell(imagen);
            cell.setBorder(0);
            cell.setHorizontalAlignment(1);
            HeaderDatos.addCell(cell);
        
            documento.add(HeaderDatos);
            documento.add(new Paragraph("\n"));
            /////////
            
            PdfPTable tabla = new PdfPTable(t.getColumnCount());
            
            tabla.setWidthPercentage(100);
            
            for (int i = 0; i < t.getColumnCount(); i++)
            {
                Paragraph header = new Paragraph(t.getColumnName(i));
                header.setAlignment(1);
                tabla.addCell(header);
            }
            
            for (int i = 0; i < t.getRowCount(); i++)
            {
                for (int a = 0; a < t.getColumnCount(); a++)
                {
                    
                    Paragraph campo = new Paragraph(String.valueOf(t.getValueAt(i, a)));
                    campo.setAlignment(1);
                    tabla.addCell(campo);
                }
            }
            
            documento.add(tabla);
            documento.add(new Paragraph(" "));
            
            Paragraph footer = new Paragraph("www.cyberchoapas.com");
            footer.setAlignment(1);
            documento.add(footer);
            
            documento.close();
            if (open > 0)
            {
                Desktop.getDesktop().open(ruta);
            }
        }catch(IOException | DocumentException ex){
            Alert(ex.getMessage(), Alert_Error);
        }
        return ruta.getAbsolutePath();
    }
    
    private String GenerateReporte_xls (JTable t, int open)
    {
        String rutaArchivo = "";
        try {
            
            rutaArchivo = d.Config_Get(d.ruta_save) + "report.xls";
            
            File archivoXLS = new File(rutaArchivo);
            
            if(archivoXLS.exists()) archivoXLS.delete();
                archivoXLS.createNewFile();
            
            Workbook libro = new HSSFWorkbook();
            FileOutputStream archivo = new FileOutputStream(archivoXLS);

            Sheet hoja = libro.createSheet("Contenido");

            for(int f=0;f <t.getRowCount() + 1; f++)
            {
                Row fila = hoja.createRow(f);
                for(int c=0;c<t.getColumnCount();c++)
                {
                
                    Cell celda = fila.createCell(c);
                    
                    if(f==0){
                        celda.setCellValue(String.valueOf(t.getColumnName(c)));
                    }else{
                        celda.setCellValue(String.valueOf(t.getValueAt(f-1, c)));
                    }
                    hoja.autoSizeColumn(c);
                }
            }

            libro.write(archivo);
            archivo.close();
            if (open > 0)
            {
                Desktop.getDesktop().open(archivoXLS);
            }
        } catch (IOException ex) {
            Alert(ex.getMessage(),Alert_Error);
        }
        return rutaArchivo;
    }
    
    public String GetFechaAndHourActual ()
    {
        java.util.Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        return formato.format(fecha);
    }
    
    public String GetFechaActual ()
    {
        java.util.Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        return formato.format(fecha);
    }
    
    public String GenerateReportResumen (JTable t, String title, int open, String pagos, String Familias)
    {
        String rs = null;
        Object[] options = { "PDF", "EXCEL", "NINGUNO" };
        
        int r = JOptionPane.showOptionDialog(null, 
        "Seleccione el tipo de formato a generar.", 
        "Generar reporte?", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        options, 
        options[0]);
        
        if (r == 0)
        {
            rs = GenerateReporte_pdf_Resumen(t, title, open,pagos, Familias);
        }
        else if (r == 1)
        {
            rs = GenerateReporte_xls(t, open);
        }
        return rs;
    }
    
    public String GenerateReporte_pdf_Resumen (JTable t, String title, int open, String pagos, String familias)
    {
        Document documento = new Document(PageSize.LETTER.rotate(),10,10,10,10);  
        FileOutputStream ficheroPdf;
        File ruta = null;
        com.itextpdf.text.Image imagen = null;
        try {
            imagen = com.itextpdf.text.Image.getInstance(d.Config_Get(d.ruta_logo));
            
            ruta = new File (d.Config_Get(d.ruta_save) + "report.pdf");
            
            ficheroPdf = new FileOutputStream(ruta);
            PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
        } catch (DocumentException | IOException ex) {
            Alert("Verifique ruta de guardado", Alert_Error);
        }
        
        
        try{
            documento.open();
            
            title += "";
            
            Paragraph Title = new Paragraph(title.toUpperCase());
            Title.setAlignment(1);
            documento.add(Title);
            imagen.setAlignment(Element.ALIGN_CENTER);
            imagen.scaleToFit(200, 100);
            
            String membrete = d.ReturnDateMay("nombre") + "\n";
            membrete += "DIRECCION: " + d.ReturnDateMay("direccion") + "\n";
            membrete += "RFC: " + d.ReturnDateMay("rfc")+"\n";
            membrete += "TELEFONO: " + d.ReturnDateMay("telefono") + "\n";
            membrete += "FECHA Y HORA DE GENERACION: " + GetFechaAndHourActual()+ "\n";
            
            /////////
            PdfPTable HeaderDatos = new PdfPTable(2);
            HeaderDatos.setWidthPercentage(100);
            
            documento.add(new Paragraph("\n"));
            
            PdfPCell cell = new PdfPCell(new Phrase(membrete));
            cell.setBorder(0);
            HeaderDatos.addCell(cell);
            cell = new PdfPCell(imagen);
            cell.setBorder(0);
            cell.setHorizontalAlignment(1);
            HeaderDatos.addCell(cell);
        
            documento.add(HeaderDatos);
            documento.add(new Paragraph("\n"));
            /////////
            
            PdfPTable tabla = new PdfPTable(t.getColumnCount());
            
            tabla.setWidthPercentage(100);
            
            for (int i = 0; i < t.getColumnCount(); i++)
            {
                Paragraph header = new Paragraph(t.getColumnName(i));
                header.setAlignment(1);
                tabla.addCell(header);
            }
            
            for (int i = 0; i < t.getRowCount(); i++)
            {
                for (int a = 0; a < t.getColumnCount(); a++)
                {
                    
                    Paragraph campo = new Paragraph(String.valueOf(t.getValueAt(i, a)));
                    campo.setAlignment(1);
                    tabla.addCell(campo);
                }
            }
            
            documento.add(tabla);
            
            // Informacion footer
            PdfPTable FooterDatos = new PdfPTable(2);
            FooterDatos.setWidthPercentage(100);
            
            cell = new PdfPCell(new Phrase(pagos));
            cell.setBorder(0);
            FooterDatos.addCell(cell);
            
            cell = new PdfPCell(new Phrase(familias));
            cell.setBorder(0);
            FooterDatos.addCell(cell);
        
            documento.add(FooterDatos);
            //
            
            Paragraph footer = new Paragraph("www.cyberchoapas.com");
            footer.setAlignment(1);
            documento.add(footer);
            
            documento.close();
            if (open > 0)
            {
                Desktop.getDesktop().open(ruta);
            }
        }catch(IOException | DocumentException ex){
            Alert(ex.getMessage(), Alert_Error);
        }
        return ruta.getAbsolutePath();
    }
    
    public static String First_Upercase (String str) 
    {
        if (str == null || str.isEmpty()) 
        {
            return str;
        } 
        else {
            //La primera letra en mayuscula y las demas en minuscula.
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }
    
    public String GetRutaImagenJdataChooser ()
    {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        chooser.setFileFilter(filtroImagen);
        chooser.showOpenDialog(null);
        return String.valueOf(chooser.getSelectedFile().getAbsoluteFile()).replace("\\", "/");
    }
    
    public String GetRutaFolderJdataChooser ()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showSaveDialog(null);
        
        return String.valueOf(fileChooser.getSelectedFile()).replace("\\", "/") + "/";
    }
    
    
    public String PropertiesGET (String Value)
    {
        String r = "";
        try 
        {
            p.load(getClass().getResourceAsStream("/Clases/config.properties"));
            r = p.getProperty(Value);
        }
        catch (IOException ex) 
        {
            Alert(ex.getMessage(), Alert_Error);
        }
        return r;
    }
    
    public void LogsTable (JTable t, String sql)
    {
        try {
            DefaultTableModel DefaultTableModel = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };
            String ValoresTabla [] = {"ID","PRODUCTO","C. BARRA","PIEZAS","P.U","TOTAL","VENDEDOR","FAMILIA","T. PAGO","FECHA"};
            DefaultTableModel.setColumnIdentifiers(ValoresTabla);
            t.setModel(DefaultTableModel);
            t.getColumnModel().getColumn(0).setPreferredWidth(1);
            t.getColumnModel().getColumn(1).setPreferredWidth(250);
            Jtable_Style(t);
        
        
            DefaultTableModel tabla = (DefaultTableModel) t.getModel();

            String valores[] = new String[10];

            db = new Clases.ConexionBD();

            ResultSet rs = db.Consulta(sql);

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
            Alert(ex.getMessage(), Alert_Error);
        }   
    }
    
    public boolean logs_update_cut_x (String user)
    {
        boolean r = false;
        
        try 
        {
            db = new ConexionBD ();
            if (db.ejecutar("UPDATE `logs` SET `cut_z` = '1' WHERE vendedor = '"+user+"' ") > 0)
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
    
    public boolean logs_update_cut_z_global ()
    {
        boolean r = false;
        
        try 
        {
            db = new ConexionBD ();
            if (db.ejecutar("UPDATE `logs` SET `cut_z_global` = '1'") > 0)
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
