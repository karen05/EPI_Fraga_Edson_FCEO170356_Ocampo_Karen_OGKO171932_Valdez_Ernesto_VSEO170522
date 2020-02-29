/*
*Fraga Chavez Edson jair
*Ocampo Giles Karen Lizeth
*Vazquez Ernesto
*7B Informática
*Recursa:POO
*Evidencia: EI
 */
package ei;
import Controlador.*;
import java.sql.SQLException;
/**
 *
 * @author Arqui
 */
public class EI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Conexion conn = new Conexion();
        try {
            conn.crearConexion();
        } catch (SQLException ex) {
            
            System.out.println("Error de conexión");
 
    }
    
}
}
