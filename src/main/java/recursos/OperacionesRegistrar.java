/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import configuracion.Conexion;
import entidades.DatoPadres;
import entidades.DependenciaVivienda;
import entidades.HabitanteCasa;
import entidades.InstitucionEducativa;
import entidades.OcupacionFamiliar;
import entidades.ProgramaSocial;
import entidades.SituacionFamiliar;
import entidades.Solicitante;
import entidades.Solicitud;
import entidades.TrabajoSolicitante;
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
import java.util.Map;
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

    public boolean registrarSolicitante(Solicitante solicitante) {
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

            String consulta = "INSERT INTO SOLICITANTE "
                    + "(usuario_uuid,   nombre,         apellido_paterno,   apellido_materno,   nombre_completo,"
                    + "calle,           numero,         colonia,            poblacion,          municipio,"
                    + "estado,          codigo_postal,  tel_casa,           tel_celular"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, solicitante.getUsuarioUuid());
            sentencia.setString(2, solicitante.getNombre());
            sentencia.setString(3, solicitante.getApellidoPaterno());
            sentencia.setString(4, solicitante.getApellidoMaterno());
            sentencia.setString(5, solicitante.getNombreCompleto());

            sentencia.setString(6, solicitante.getCalle());
            sentencia.setString(7, solicitante.getNumero());
            sentencia.setString(8, solicitante.getColonia());
            sentencia.setString(9, solicitante.getPoblacion());
            sentencia.setString(10, solicitante.getMunicipio());

            sentencia.setString(11, solicitante.getEstado());
            sentencia.setString(12, solicitante.getCodigoPostal());
            sentencia.setString(13, solicitante.getTelCasa());
            sentencia.setString(14, solicitante.getTelCelular());

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

    public boolean registrarInstitucionEducativa(InstitucionEducativa institucionEducativa) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO INSTITUCIONEDUCATIVA "
                    + "(usuario_uuid,   nivel_estudios,         grado_escolar,   nombre_institucion,   promedio_anterior"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, institucionEducativa.getUsuarioUuid());
            sentencia.setString(2, institucionEducativa.getNivelEstudios());
            sentencia.setString(3, institucionEducativa.getGradoEscolar());
            sentencia.setString(4, institucionEducativa.getNombreInstitucion());
            sentencia.setString(5, institucionEducativa.getPromedioAnterior());
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

    public boolean registrarProgramaSocial(ProgramaSocial programaSocial) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO PROGRAMASOCIAL "
                    + "(usuario_uuid,       inscrito_programas_sociales,         programas_sociales_especifica,   cuenta_con_beca,   tipo_beca,"
                    + "instituto_otorga,    cantidad_recibida"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, programaSocial.getUsuarioUuid());
            sentencia.setString(2, programaSocial.getInscritoProgramasSociales());
            sentencia.setString(3, programaSocial.getProgramasSocialesEspecifica());
            sentencia.setString(4, programaSocial.getCuentaConBeca());
            sentencia.setString(5, programaSocial.getTipoBeca());

            sentencia.setString(6, programaSocial.getInstitutoOtorga());
            sentencia.setString(7, programaSocial.getCantidadRecibida());

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

    public boolean registrarDependenciaVivienda(DependenciaVivienda dependenciaVivienda) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO DEPENDENCIAVIVIENDA "
                    + "(usuario_uuid,       depende_economicamente,         parentesco_tutores,   vive_con"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, dependenciaVivienda.getUsuarioUuid());
            sentencia.setString(2, dependenciaVivienda.getDependeEconomicamente());
            sentencia.setString(3, dependenciaVivienda.getParentescoTutores());
            sentencia.setString(4, dependenciaVivienda.getViveCon());

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

    public boolean registrarTrabajoSolicitante(TrabajoSolicitante trabajoSolicitante) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO TRABAJOSOLICITANTE "
                    + "(usuario_uuid,       trabaja_actualmente,         empresa,   cargo_puesto,   tiempo_laborando,"
                    + "telefono_empresa,    domicilio_empresa"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, trabajoSolicitante.getUsuarioUuid());
            sentencia.setString(2, trabajoSolicitante.getTrabajaActualmente());
            sentencia.setString(3, trabajoSolicitante.getEmpresa());
            sentencia.setString(4, trabajoSolicitante.getCargoPuesto());
            sentencia.setString(5, trabajoSolicitante.getTiempoLaborando());

            sentencia.setString(6, trabajoSolicitante.getTelefonoEmpresa());
            sentencia.setString(7, trabajoSolicitante.getDomicilioEmpresa());

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

    public boolean registrarDatosPadres(DatoPadres datoPadres) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO DATOPADRES "
                    + "(usuario_uuid,       viven_padres,         edad_padre,   edad_madre,   estado_civil_padres,"
                    + "viven_juntos,        escolaridad_padre,    escolaridad_madre"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, datoPadres.getUsuarioUuid());
            sentencia.setString(2, datoPadres.getVivenPadres());
            sentencia.setString(3, datoPadres.getEdadPadre());
            sentencia.setString(4, datoPadres.getEdadMadre());
            sentencia.setString(5, datoPadres.getEstadoCivilPadres());

            sentencia.setString(6, datoPadres.getVivenJuntos());
            sentencia.setString(7, datoPadres.getEscolaridadPadre());
            sentencia.setString(8, datoPadres.getEscolaridadMadre());

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

    public boolean registrarOcupacionFamiliar(OcupacionFamiliar ocupacionFamiliar) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO OCUPACIONFAMILIAR "
                    + "(usuario_uuid,       tipo_familiar,          nombre,             lugar_trabajo,  cargo_puesto,"
                    + "tiempo_laborando,    telefono_empresa,       domicilio_empresa,  edad,           escolaridad,"
                    + "parentesco,          ingreso_mensual"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, ocupacionFamiliar.getUsuarioUuid());
            sentencia.setString(2, ocupacionFamiliar.getTipoFamiliar());
            sentencia.setString(3, ocupacionFamiliar.getNombre());
            sentencia.setString(4, ocupacionFamiliar.getLugarTrabajo());
            sentencia.setString(5, ocupacionFamiliar.getCargoPuesto());

            sentencia.setString(6, ocupacionFamiliar.getTiempoLaborando());
            sentencia.setString(7, ocupacionFamiliar.getTelefonoEmpresa());
            sentencia.setString(8, ocupacionFamiliar.getDomicilioEmpresa());
            sentencia.setString(9, ocupacionFamiliar.getEdad());
            sentencia.setString(10, ocupacionFamiliar.getEscolaridad());

            sentencia.setString(11, ocupacionFamiliar.getParentesco());
            sentencia.setString(12, ocupacionFamiliar.getIngresoMensual());

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

    public boolean registrarSituacionFamiliar(SituacionFamiliar situacionFamiliar) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO SITUACIONFAMILIAR "
                    + "(usuario_uuid,       cantidad_hermanos,          viven_domicilio,             cantidad_domicilio,  personas_dependen_econ"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, situacionFamiliar.getUsuarioUuid());
            sentencia.setString(2, situacionFamiliar.getCantidadHermanos());
            sentencia.setString(3, situacionFamiliar.getVivenDomicilio());
            sentencia.setString(4, situacionFamiliar.getCantidadDomicilio());
            sentencia.setString(5, situacionFamiliar.getPersonasDependenEcon());

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

     public boolean registrarHabitanteCasa(HabitanteCasa habitanteCasa) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO HABITANTECASA "
                    + "(usuario_uuid,       nombre_completo,          edad,             parentesco,  ocupacion,"
                    + "estudio_maximo"
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, habitanteCasa.getUsuarioUuid());
            sentencia.setString(2, habitanteCasa.getNombreCompleto());
            sentencia.setString(3, habitanteCasa.getEdad());
            sentencia.setString(4, habitanteCasa.getParentesco());
            sentencia.setString(5, habitanteCasa.getOcupacion());
            
            sentencia.setString(6, habitanteCasa.getEstudioMaximo());

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
