/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;

/**
 *
 * @author Lypef
 */
    
    public class ConexionBD {
        
        functions f = new functions();
        
        private Connection con;
        private Statement  sentSQL;
        private ResultSet rst;
        

    public ConexionBD () throws ClassNotFoundException,SQLException,InstantiationException,IllegalAccessException
    {
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        conectar();
    }

    public void conectar() throws SQLException
    {
        String URL_bd ="jdbc:mysql://"+ f.PropertiesGET(f.Properties_server) +":"+ f.PropertiesGET(f.Properties_Puerto) +"/"+ f.PropertiesGET(f.Properties_DbName);
        String usuario = f.PropertiesGET(f.Properties_Username);
        String contraseña = f.PropertiesGET(f.Properties_Password);

        con=DriverManager.getConnection(URL_bd,usuario,contraseña);
        
        sentSQL=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public ResultSet ConectarBD(String usuario, String pass) throws SQLException{

        rst=sentSQL.executeQuery("select * from usuario where usuario='root' AND password='root';");
        
       return rst;
    }

  
    public int ejecutar(String sql) throws SQLException
    {
        return sentSQL.executeUpdate(sql);
    }
     
    public ResultSet Consulta(String sql) throws SQLException{
         
        rst=sentSQL.executeQuery(sql);
        return rst;
    }
}