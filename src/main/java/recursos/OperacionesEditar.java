/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import configuracion.Conexion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesEditar {

    Conexion conexion = new Conexion();
    Herramientas herramientas = new Herramientas();
    private Date fechaSQL;

    public boolean editarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;
        int filasActualizadas = 0;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "UPDATE USUARIO "
                    + "SET "
                    + "contrasenia = ?,    email = ?,  curp = ?,   edad = ?,    fecha_nacimiento = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, usuario.getContrasenia());
            sentencia.setString(2, usuario.getEmail());
            sentencia.setString(3, usuario.getCurp());
            sentencia.setString(4, usuario.getEdad());
            sentencia.setString(5, usuario.getFecha_nacimiento());
            sentencia.setString(6, usuario.getUsuario_uuid());
           
            filasActualizadas = sentencia.executeUpdate();
            if (filasActualizadas > 0) {
                resultado = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return resultado;
    }

}
