/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import configuracion.Conexion;
import entidades.InfoFamilia;
import entidades.InfoPersonal;
import entidades.InfoVivienda;
import entidades.ObjetivoApoyo;
import entidades.Solicitud;
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

    public Usuario BuscarUsuarioEmailPas(Usuario usuario) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion

            String consulta = "SELECT * FROM "
                    + "USUARIO "
                    + "WHERE "
                    + "email = ? AND contrasenia = ? ";

            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario.getEmail());
            sentencia.setString(2, usuario.getContrasenia());
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

    public Solicitud BuscarSolicituduuid(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        Solicitud solicitud = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion

            String consulta = "SELECT * FROM "
                    + "SOLICITUD "
                    + "WHERE "
                    + "usuario_uuid = ? ";

            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs != null && rs.next()) {
                solicitud = herramientas.rellenarSolicitud(rs);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return solicitud;
    }

    public InfoPersonal BuscarInfoPersonaluuid(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        InfoPersonal infoPersonal = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion

            String consulta = "select  \n"
                    + "	SOL.solicitante_id,		SOL.nombre,    			SOL.apellido_paterno,	SOL.apellido_materno, 		SOL.nombre_completo,\n"
                    + "	SOL.calle, 				SOL.numero, 			SOL.colonia,			SOL.poblacion, 				SOL.municipio,\n"
                    + "	SOL.estado,				SOL.codigo_postal, 		SOL.tel_casa,			SOL.tel_celular,			IE.institucioneducativa_id,	\n"
                    + "	IE.nivel_estudios,		IE.grado_escolar,		IE.nombre_institucion,	IE.promedio_anterior,		PS.programasocial_id,\n"
                    + "	PS.inscrito_programas_sociales,		PS.programas_sociales_especifica,	PS.cuenta_con_beca,			PS.tipo_beca,			PS.instituto_otorga,\n"
                    + "	PS.cantidad_recibida,				DV.dependenciavivienda_id, 			DV.depende_economicamente,	DV.parentesco_tutores,	DV.vive_con,\n"
                    + "	TS.trabajosolicitante_id, 			TS.trabaja_actualmente,				TS.empresa,					TS.cargo_puesto,		TS.tiempo_laborando,\n"
                    + "	TS.telefono_empresa,	TS.domicilio_empresa,	GF.gastosforaneo_id,	GF.colegiatura,				GF.vivienda,\n"
                    + "	GF.libro,				GF.gastos_personales, 	GF.comida, 				GF.ropa,					GF.transportacion_local,\n"
                    + "	GF.lavanderia,			GF.transportacion_foranea,			GF.gasto_total,	SL.usuario_uuid\n"
                    + "from solicitud SL \n"
                    + " 	left  join SOLICITANTE SOL on SOL.usuario_uuid = SL.usuario_uuid\n"
                    + "	left  join INSTITUCIONEDUCATIVA IE  on SL.usuario_uuid = IE.usuario_uuid\n"
                    + "	left  join PROGRAMASOCIAL PS on SL.usuario_uuid = PS.usuario_uuid\n"
                    + "	left  join DEPENDENCIAVIVIENDA DV on SL.usuario_uuid = DV.usuario_uuid\n"
                    + "	left  join TRABAJOSOLICITANTE TS on SL.usuario_uuid = TS.usuario_uuid\n"
                    + "	left  join GASTOSFORANEO GF on SL.usuario_uuid = GF.usuario_uuid\n"
                    + "where SL.usuario_uuid  = ?";

            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs != null && rs.next()) {
                infoPersonal = herramientas.rellenarInfoPersonal(rs);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return infoPersonal;
    }

    public InfoFamilia BuscarInfoFamiliauuid(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        InfoFamilia infoFamilia = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion

            String consulta = "select  \n"
                    + "	DP.datopadre_id,		DP.viven_padres, 		DP.edad_padre,	 		DP.edad_madre, 				DP.estado_civil_padres,\n"
                    + "	DP.viven_juntos, 		DP.escolaridad_padre, 	DP.escolaridad_madre,	SF.situacionfamiliar_id,	SF.cantidad_hermanos,\n"
                    + "	SF.viven_domicilio,		SF.cantidad_domicilio,	SF.personas_dependen_econ, INF.ingresofamiliar_id,  INF.regimen_seguridad_social,\n"
                    + "	INF.personas_trabajando, INF.personas_aportan_gasto,	INF.ingreso_propio,	INF.ingreso_padre_tutor, INF.ingreso_conyuge,\n"
                    + "	INF.ingreso_madre,		INF.ingreso_hermanos,	INF.otros_ingresos,		INF.total_ingresos,			GAF.gastofamiliar_id,\n"
                    + "	GAF.regimen_seguridad_social,	GAF.alimentos,	GAF.renta_predial,		GAF.despensa,				GAF.luz,\n"
                    + "	GAF.productos_limpieza,	GAF.agua, GAF.transporte, GAF.telefono,			GAF.servicio_domestico,		GAF.telefono_celular,\n"
                    + "	GAF.seguros,			GAF.cable,				GAF.pago_credito,		GAF.internet,				GAF.pagos_tarjetas_credito,\n"
                    + "	GAF.gas,				GAF.hipoteca,			GAF.ropa_calzado,		GAF.gastos_medicos,			GAF.gastos_personales,\n"
                    + "	GAF.colegiatura_solicitante, GAF.vacaciones,	GAF.colegiatura_otros_miembros, GAF.diversiones_entretenimiento, GAF.libros_materiales,\n"
                    + "	GAF.otros_gastos,		GAF.total_gastos,		SOL.usuario_uuid\n"
                    + "from solicitud SOL  \n"
                    + "	left join datopadres DP on SOL.usuario_uuid = DP.usuario_uuid\n"
                    + "	left join situacionfamiliar SF on SOL.usuario_uuid = SF.usuario_uuid\n"
                    + "	left join ingresofamiliar INF on SOL.usuario_uuid = INF.usuario_uuid\n"
                    + "	left join gastofamiliar GAF on SOL.usuario_uuid = GAF.usuario_uuid\n"
                    + "where SOL.usuario_uuid  = ?";

            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs != null && rs.next()) {
                infoFamilia = herramientas.rellenarInfoFamilia(rs);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return infoFamilia;
    }

    public InfoVivienda BuscarInfoViviendauuid(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        InfoVivienda infoVivienda = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion

            String consulta = "select  \n"
                    + "	IV.informacionvivienda_id,	IV.clase_socioeconomica, 	IV.tipo_vivienda,		IV.numero_habitaciones,	IV.servicios,\n"
                    + "	IV.material_casa, 			IV.zona_vivienda, 			IV.pertenece_comunidad,	IV.comunidad_indg,		IV.sufre_discapacidad,\n"
                    + "	IV.discapacidad,			BA.bienesaparatos_id, 		BA.Aparato, 			BA.Estatus,				SOL.usuario_uuid\n"
                    + "from solicitud SOL  \n"
                    + "	left join informacionvivienda IV on SOL.usuario_uuid = IV.usuario_uuid\n"
                    + "	left join bienesaparatos BA on SOL.usuario_uuid = BA.usuario_uuid\n"
                    + "where SOL.usuario_uuid  = ? ";

            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs != null && rs.next()) {
                infoVivienda = herramientas.rellenarInfoVivienda(rs);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return infoVivienda;
    }

    public ObjetivoApoyo BuscarObjetivoApoyouuid(String usuario_uuid) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        ObjetivoApoyo objetivoApoyo = null;
        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesBuscar.class.getName()).log(Level.SEVERE, null, ex);
            } //Establecer la conexion

            String consulta = "SELECT * FROM "
                    + "OBJETIVOAPOYO "
                    + "WHERE "
                    + "usuario_uuid = ? ";

            sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, usuario_uuid);
            rs = sentencia.executeQuery();

            while (rs != null && rs.next()) {
                objetivoApoyo = herramientas.rellenarObjetivoApoyo(rs);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conexion.cerrar(conn); //Cerrar la conexion con la BD
        }
        return objetivoApoyo;
    }
}
