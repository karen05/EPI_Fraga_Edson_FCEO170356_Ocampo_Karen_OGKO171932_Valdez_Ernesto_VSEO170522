/*
*Fraga Chavez Edson jair
*Ocampo Giles Karen Lizeth
*Vazquez Ernesto
*7B Informática
*Recursa:POO
*Evidencia: EI
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {      
    private final String HOST="jdbc:mysql://localhost:3306/";       //Definición de los atriburos para obtener la conexión
    private final String DB="Cine";
    private final String USER="root";       
    private final String PASSWORD="";       
    
    public Connection conexion = null;
    
    public Connection crearConexion() throws SQLException{      //Metodo para realizar la conexión con nuestra base de datos
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
  
            conexion = DriverManager.getConnection(HOST+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",USER,PASSWORD);
            if(conexion != null)
                System.out.println("Conexion exitosa!");
            else
                System.out.println("Ocurrio un error al conectarse con la base de datos");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }finally{
        return conexion;
        }
    }
}
