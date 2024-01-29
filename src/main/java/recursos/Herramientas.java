package recursos;

import entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Herramientas {

    public Usuario rellenarUsuario(ResultSet rs) {

        Usuario usuario = new Usuario();

        try {
            usuario.setUsuario_id(rs.getInt("usuario_id"));
            usuario.setUsuario_uuid(rs.getString("usuario_uuid"));
            usuario.setContrasenia(rs.getString("contrasenia"));
            usuario.setEmail(rs.getString("email"));
            usuario.setCurp(rs.getString("curp"));
            usuario.setEdad(rs.getString("edad"));
            usuario.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
            usuario.setFecha_registro(rs.getString("fecha_registro"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return usuario;
    }
}
