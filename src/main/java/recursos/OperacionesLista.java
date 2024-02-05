/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import configuracion.Conexion;
import entidades.EstudioFamiliar;
import entidades.HabitanteCasa;
import entidades.MunicipiosCat;
import entidades.OcupacionFamiliar;
import entidades.Usuario;
import entidades.Vehiculos;
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

    public List<OcupacionFamiliar> listaOcupacionFamiliar(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<OcupacionFamiliar> listaOcupacionFamiliar = new ArrayList<>();
        try {
            try {
                conn = conexion.conectarBD(); //Establecer la conexion
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesLista.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "SELECT * FROM OCUPACIONFAMILIAR where usuario_uuid = ? ";
            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaOcupacionFamiliar.add(herramientas.rellenarOcupacionFamiliar(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return listaOcupacionFamiliar;
    }

    public List<HabitanteCasa> listaHabitanteCasa(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<HabitanteCasa> listaHabitanteCasa = new ArrayList<>();
        try {
            try {
                conn = conexion.conectarBD(); //Establecer la conexion
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesLista.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "SELECT * FROM HABITANTECASA where usuario_uuid = ? ";
            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaHabitanteCasa.add(herramientas.rellenarHabitanteCasa(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return listaHabitanteCasa;
    }

    public List<EstudioFamiliar> listaEstudioFamiliar(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<EstudioFamiliar> listaEstudioFamiliar = new ArrayList<>();
        try {
            try {
                conn = conexion.conectarBD(); //Establecer la conexion
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesLista.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "SELECT * FROM ESTUDIOFAMILIAR where usuario_uuid = ? ";
            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaEstudioFamiliar.add(herramientas.rellenarEstudioFamiliar(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return listaEstudioFamiliar;
    }
    
    public List<Vehiculos> listaVehiculos(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<Vehiculos> listaVehiculos = new ArrayList<>();
        try {
            try {
                conn = conexion.conectarBD(); //Establecer la conexion
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesLista.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "SELECT * FROM VEHICULOS where usuario_uuid = ? ";
            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaVehiculos.add(herramientas.rellenarVehiculos(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return listaVehiculos;
    }
    
    
     public List<MunicipiosCat> listaMunicipios() {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<MunicipiosCat> listaMunicipiosCat = new ArrayList<>();
        try {
            try {
                conn = conexion.conectarBD(); //Establecer la conexion
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesLista.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "SELECT * FROM MUNICIPIOSCAT ORDER BY municipio_id ASC";
            sentencia = conn.prepareStatement(consulta);
            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaMunicipiosCat.add(herramientas.rellenarMunicipios(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar usuario" + e.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return listaMunicipiosCat;
    }
    
}
