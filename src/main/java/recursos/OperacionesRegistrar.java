/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import configuracion.Conexion;
import entidades.BienesAparatos;
import entidades.DatoPadres;
import entidades.DependenciaVivienda;
import entidades.Documentacion;
import entidades.EstudioFamiliar;
import entidades.GastoFamiliar;
import entidades.GastosForaneo;
import entidades.HabitanteCasa;
import entidades.InformacionVivienda;
import entidades.IngresoFamiliar;
import entidades.InstitucionEducativa;
import entidades.ObjetivoApoyo;
import entidades.OcupacionFamiliar;
import entidades.ProgramaSocial;
import entidades.SituacionFamiliar;
import entidades.Solicitante;
import entidades.Solicitud;
import entidades.TrabajoSolicitante;
import entidades.Usuario;
import entidades.Vehiculos;
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

    public boolean registrarEstudioFamiliar(EstudioFamiliar estudioFamiliar) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO ESTUDIOFAMILIAR "
                    + "(usuario_uuid,       nombre_completo,          nivel_estudios,             ocupacion"
                    + ")"
                    + "VALUES "
                    + "(?,?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, estudioFamiliar.getUsuarioUuid());
            sentencia.setString(2, estudioFamiliar.getNombreCompleto());
            sentencia.setString(3, estudioFamiliar.getNivelEstudios());
            sentencia.setString(4, estudioFamiliar.getOcupacion());

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

    public boolean registrarIngresoFamiliar(IngresoFamiliar ingresoFamiliar) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO INGRESOFAMILIAR "
                    + "(usuario_uuid,       regimen_seguridad_social,   personas_trabajando,    personas_aportan_gasto, ingreso_propio,"
                    + "ingreso_padre_tutor, ingreso_conyuge,            ingreso_madre,          ingreso_hermanos,       otros_ingresos,"
                    + "total_ingresos"
                    + ")"
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + " ?,?,?,?,?,"
                    + "?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, ingresoFamiliar.getUsuarioUuid());
            sentencia.setString(2, ingresoFamiliar.getRegimenSeguridadSocial());
            sentencia.setString(3, ingresoFamiliar.getPersonasTrabajando());
            sentencia.setString(4, ingresoFamiliar.getPersonasAportanGasto());
            sentencia.setString(5, ingresoFamiliar.getIngresoPropio());

            sentencia.setString(6, ingresoFamiliar.getIngresoPadreTutor());
            sentencia.setString(7, ingresoFamiliar.getIngresoConyuge());
            sentencia.setString(8, ingresoFamiliar.getIngresoMadre());
            sentencia.setString(9, ingresoFamiliar.getIngresoHermanos());
            sentencia.setString(10, ingresoFamiliar.getOtrosIngresos());

            sentencia.setString(11, ingresoFamiliar.getTotalIngresos());

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

    public boolean registrarGastoFamiliar(GastoFamiliar gastoFamiliar) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO GASTOFAMILIAR "
                    + "(usuario_uuid,       regimen_seguridad_social,   alimentos,                renta_predial,    despensa,"
                    + "luz,                 productos_limpieza,         agua,                     transporte,       telefono,"
                    + "servicio_domestico,  telefono_celular,           seguros,                  cable,            pago_credito,"
                    + "internet,            pagos_tarjetas_credito,     gas,                      hipoteca,         ropa_calzado,"
                    + "gastos_medicos,      gastos_personales,          colegiatura_solicitante,  vacaciones,       colegiatura_otros_miembros,"
                    + "diversiones_entretenimiento,  libros_materiales, otros_gastos,             total_gastos"
                    + ")"
                    + "VALUES "
                    + "(?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?"
                    + ")";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, gastoFamiliar.getUsuarioUuid());
            sentencia.setString(2, gastoFamiliar.getRegimenSeguridadSocial());
            sentencia.setString(3, gastoFamiliar.getAlimentos());
            sentencia.setString(4, gastoFamiliar.getRentaPredial());
            sentencia.setString(5, gastoFamiliar.getDespensa());

            sentencia.setString(6, gastoFamiliar.getLuz());
            sentencia.setString(7, gastoFamiliar.getProductosLimpieza());
            sentencia.setString(8, gastoFamiliar.getAgua());
            sentencia.setString(9, gastoFamiliar.getTransporte());
            sentencia.setString(10, gastoFamiliar.getTelefono());

            sentencia.setString(11, gastoFamiliar.getServicioDomestico());
            sentencia.setString(12, gastoFamiliar.getTelefonoCelular());
            sentencia.setString(13, gastoFamiliar.getSeguros());
            sentencia.setString(14, gastoFamiliar.getCable());
            sentencia.setString(15, gastoFamiliar.getPagoCredito());

            sentencia.setString(16, gastoFamiliar.getInternet());
            sentencia.setString(17, gastoFamiliar.getPagosTarjetasCredito());
            sentencia.setString(18, gastoFamiliar.getGas());
            sentencia.setString(19, gastoFamiliar.getHipoteca());
            sentencia.setString(20, gastoFamiliar.getRopaCalzado());

            sentencia.setString(21, gastoFamiliar.getGastosMedicos());
            sentencia.setString(22, gastoFamiliar.getGastosPersonales());
            sentencia.setString(23, gastoFamiliar.getColegiaturaSolicitante());
            sentencia.setString(24, gastoFamiliar.getVacaciones());
            sentencia.setString(25, gastoFamiliar.getColegiaturaOtrosMiembros());

            sentencia.setString(26, gastoFamiliar.getDiversionesEntretenimiento());
            sentencia.setString(27, gastoFamiliar.getLibrosMateriales());
            sentencia.setString(28, gastoFamiliar.getOtrosGastos());
            sentencia.setString(29, gastoFamiliar.getTotalGastos());

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

    public boolean registrarGastosForaneo(GastosForaneo gastosForaneo) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            String consulta = "INSERT INTO GASTOSFORANEO "
                    + "(usuario_uuid,   colegiatura,    vivienda,               libro,      gastos_personales,"
                    + "comida,          ropa,           transportacion_local,   lavanderia, transportacion_foranea,"
                    + "gasto_total)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, gastosForaneo.getUsuarioUuid());
            sentencia.setString(2, gastosForaneo.getColegiatura());
            sentencia.setString(3, gastosForaneo.getVivienda());
            sentencia.setString(4, gastosForaneo.getLibro());
            sentencia.setString(5, gastosForaneo.getGastosPersonales());

            sentencia.setString(6, gastosForaneo.getComida());
            sentencia.setString(7, gastosForaneo.getRopa());
            sentencia.setString(8, gastosForaneo.getTransportacionLocal());
            sentencia.setString(9, gastosForaneo.getLavanderia());
            sentencia.setString(10, gastosForaneo.getTransportacionForanea());

            sentencia.setString(11, gastosForaneo.getGastoTotal());

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

    public boolean registrarInformacionVivienda(InformacionVivienda informacionVivienda) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO INFORMACIONVIVIENDA "
                    + "(usuario_uuid, clase_socioeconomica, tipo_vivienda,          numero_habitaciones, servicios, "
                    + "material_casa, zona_vivienda,        pertenece_comunidad,    comunidad_indg,     sufre_discapacidad,"
                    + "discapacidad) "
                    + "VALUES"
                    + " (?, ?, ?, ?, ?,"
                    + "  ?, ?, ?, ?, ?,"
                    + "  ?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, informacionVivienda.getUsuarioUuid());
            sentencia.setString(2, informacionVivienda.getClaseSocioeconomica());
            sentencia.setString(3, informacionVivienda.getTipoVivienda());
            sentencia.setString(4, informacionVivienda.getNumeroHabitaciones());
            sentencia.setString(5, informacionVivienda.getServicios());

            sentencia.setString(6, informacionVivienda.getMaterialCasa());
            sentencia.setString(7, informacionVivienda.getZonaVivienda());
            sentencia.setString(8, informacionVivienda.getPerteneceComunidad());
            sentencia.setString(9, informacionVivienda.getComunidadIndg());
            sentencia.setString(10, informacionVivienda.getSufreDiscapacidad());

            sentencia.setString(11, informacionVivienda.getDiscapacidad());

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn);
        }
        return resultado;
    }

    public boolean registrarBienesAparatos(BienesAparatos bienesAparatos) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO BIENESAPARATOS "
                    + "(usuario_uuid, aparato, estatus) "
                    + "VALUES"
                    + " (?, ?, ?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, bienesAparatos.getUsuarioUuid());
            sentencia.setString(2, bienesAparatos.getAparato());
            sentencia.setString(3, bienesAparatos.getEstatus());

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Cerrar la conexión con la base de datos
        }
        return resultado;
    }

    public boolean registrarVehiculo(Vehiculos vehiculo) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO VEHICULOS "
                    + "(usuario_uuid, marca, modelo, valor_comercial, adeuda,"
                    + " plazo_mensual, pago_mensual) "
                    + "VALUES"
                    + " (?, ?, ?, ?, ?,"
                    + " ?, ?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, vehiculo.getUsuarioUuid());
            sentencia.setString(2, vehiculo.getMarca());
            sentencia.setString(3, vehiculo.getModelo());
            sentencia.setString(4, vehiculo.getValorComercial());
            sentencia.setString(5, vehiculo.getAdeuda());
            sentencia.setString(6, vehiculo.getPlazoMensual());
            sentencia.setString(7, vehiculo.getPagoMensual());

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Cerrar la conexión con la base de datos
        }
        return resultado;
    }

    public boolean registrarObjetivoApoyo(ObjetivoApoyo objetivoApoyo) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO OBJETIVOAPOYO "
                    + "(usuario_uuid, objetivo_apoyo) "
                    + "VALUES"
                    + " (?, ?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, objetivoApoyo.getUsuarioUuid());
            sentencia.setString(2, objetivoApoyo.getObjetivoApoyo());

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Cerrar la conexión con la base de datos
        }
        return resultado;
    }

    public boolean registrarDocumentacion(Documentacion documentacion) {
        Connection conn = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String consulta = "INSERT INTO DOCUMENTACION "
                    + "(usuario_uuid, documento, descripcion) "
                    + "VALUES"
                    + " (?, ?, ?)";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, documentacion.getUsuarioUuid());
            sentencia.setString(2, documentacion.getDocumento());
            sentencia.setString(3, documentacion.getDescripcion());

            sentencia.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn);
        }
        return resultado;
    }

}
