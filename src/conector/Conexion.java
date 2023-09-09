
package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexion {
    
    String bd= "";
    String url= "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password ="";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public Conexion (){  
    }

    public Conexion(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Connection conectar () {
        
        try{
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user, password);
             System.out.println("Se conecto a bd" +bd);
        } catch  (ClassNotFoundException |SQLException ex){
            System.out.println("No Se Conecto A BD" +bd);
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        return cx;

        }
    
    public void desconectar () {
        try {
            cx.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    }
          public static void main (String [] args ) {
         Conexion conexion =new Conexion();
         conexion.conectar();
        
     } 
    
    }
    
    
    
    
    
