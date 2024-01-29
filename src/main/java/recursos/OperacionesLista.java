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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesLista {

    Conexion conexion = new Conexion();
    Herramientas herramientas = new Herramientas();

    public List<Usuario> listaUsuario() {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<Usuario> listaUsuario = new ArrayList<>();
        try {
            try {
                conn = conexion.conectarBD(); //Establecer la conexion
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesLista.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String consulta = "SELECT * FROM USUARIO ORDER BY usuario_id ASC";
            sentencia = conn.prepareStatement(consulta);
            rs = sentencia.executeQuery();
            
            while (rs.next()) {
                listaUsuario.add(herramientas.rellenarUsuario(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return listaUsuario;
    }

}
