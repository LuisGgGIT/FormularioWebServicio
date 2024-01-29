/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import configuracion.Conexion;
import entidades.Solicitud;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesRegistrar {

    Conexion conexion = new Conexion();
    Herramientas herramientas = new Herramientas();
    private Date fechaSQL;

    public boolean registrarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        UUID uuid = UUID.randomUUID();
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO USUARIO "
                    + "(usuario_uuid,       contrasenia,    email,  curp,   edad,"
                    + " fecha_nacimiento,   fecha_registro) "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + " ?,?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, uuid.toString());
            sentencia.setString(2, usuario.getContrasenia());
            sentencia.setString(3, usuario.getEmail());
            sentencia.setString(4, usuario.getCurp());
            sentencia.setString(5, usuario.getEdad());

            sentencia.setString(6, usuario.getFecha_nacimiento());
            sentencia.setString(7, dateFormat.format(cal.getTime()));

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return resultado;
    }

    public boolean registrarSolicitud(Solicitud solicitud) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO SOLICITUD "
                    + "(usuario_uuid,       fecha_inicio,    estatus,   fecha_registro) "
                    + "VALUES "
                    + "(?,?,?,?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, solicitud.getUsuario_uuid());
            sentencia.setString(2, dateFormat.format(cal.getTime()));
            sentencia.setString(3, solicitud.getEstatus());
            
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sentencia.setString(4, dateFormat.format(cal.getTime()));

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return resultado;
    }

}
