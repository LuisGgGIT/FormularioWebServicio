package recursos;

import configuracion.Conexion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesEliminar {

    Conexion conexion = new Conexion();
    Herramientas herramientas = new Herramientas();
    private Date fechaSQL;

    public boolean eliminarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;
        try {
            
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEliminar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion
            
            String consulta = "DELETE FROM usuario "
                    + "WHERE "
                    + "usuario_uuid = ? ";
            
            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario.getUsuario_uuid());

            int filasActualizadas = sentencia.executeUpdate();
            if (filasActualizadas > 0) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar un usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return resultado;
    }

}
