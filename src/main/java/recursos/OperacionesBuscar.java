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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesBuscar {

    Conexion conexion = new Conexion();
    Herramientas herramientas = new Herramientas();
    private Date fechaSQL;

    public Usuario BuscarUsuarioId(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion
            
            String consulta = "SELECT * FROM "
                    + "usuario "
                    + "WHERE "
                    + "usuario_uuid = ? ";
            
            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();
            
            while (rs != null && rs.next()) {
                usuario = herramientas.rellenarUsuario(rs);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return usuario;
    }

}
