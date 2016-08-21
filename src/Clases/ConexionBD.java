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
    private Connection con;
    private Statement  sentSQL;
    private ResultSet rst;
    
    
public ConexionBD () throws ClassNotFoundException,SQLException,InstantiationException,IllegalAccessException{
        //cargar el controlador jdbc
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        conectar(); //conectar con la fuente de datos
    }

public void conectar() throws SQLException{
        //datos necesarios para la conexion
    String URL_bd ="jdbc:mysql://localhost:3306/PointSaleGeneric";
    String usuario="root";
    String contraseña="root";
    
    //conexion con la bd
    con=DriverManager.getConnection(URL_bd,usuario,contraseña);
    // se crea una Statement para asi poder usar sentencias sql
    sentSQL=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    
    
    }

    public ResultSet ConectarBD(String usuario, String pass) throws SQLException{

        rst=sentSQL.executeQuery("select * from usuario where usuario='root' AND password='root';");
        
       return rst;
    }

  
    // metodo para ejecutar sentencia sql
     public String ejecutar(String sql) throws SQLException
		  {
                      //executeUpdate nos sirve para hacer UPDATE, INSERT y ese tipo de sentencias que modifican la base de datos
                      // no se necesita devolver algo
                       sentSQL.executeUpdate(sql);
                       
		  return "";
		  }
     
     //metodo para ejecutar consultas de sentencias sql en la base de datos
     public ResultSet Consulta(String sql) throws SQLException{
         
         //executeQuery nos sirve solamente para hacer consultas de la base de datos, solo acepta sentencias como SELECT
         // se necesita forzosamente devolver algo, guardar en una variable el resultado de la consulta
        rst=sentSQL.executeQuery(sql);
        
       return rst;
    }
}