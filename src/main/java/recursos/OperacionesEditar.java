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

    public boolean editarSolicitud(Solicitud solicitud) {
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

            String consulta = "UPDATE SOLICITUD "
                    + "SET "
                    + "estatus = ?, descripcion = ?"
                    + "WHERE "
                    + "usuario_uuid = ?";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, solicitud.getEstatus());
            sentencia.setString(2, solicitud.getDescripcion());
            sentencia.setString(3, solicitud.getUsuario_uuid());

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

    public boolean editarSolicitante(Solicitante solicitante) {
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

            String consulta = "UPDATE SOLICITANTE "
                    + "SET "
                    + "nombre = ?, apellido_paterno = ?, apellido_materno = ?, nombre_completo = ?, calle = ?, "
                    + "numero = ?, colonia = ?, poblacion = ?, municipio = ?, estado = ?, "
                    + "codigo_postal = ?, tel_casa = ?, tel_celular = ?"
                    + "WHERE "
                    + "usuario_uuid = ?";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, solicitante.getNombre());
            sentencia.setString(2, solicitante.getApellidoPaterno());
            sentencia.setString(3, solicitante.getApellidoMaterno());
            sentencia.setString(4, solicitante.getNombreCompleto());
            sentencia.setString(5, solicitante.getCalle());
            sentencia.setString(6, solicitante.getNumero());
            sentencia.setString(7, solicitante.getColonia());
            sentencia.setString(8, solicitante.getPoblacion());
            sentencia.setString(9, solicitante.getMunicipio());
            sentencia.setString(10, solicitante.getEstado());

            sentencia.setString(11, solicitante.getCodigoPostal());
            sentencia.setString(12, solicitante.getTelCasa());
            sentencia.setString(13, solicitante.getTelCelular());
            sentencia.setString(14, solicitante.getUsuarioUuid());

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

    public boolean editarInstitucionEducativa(InstitucionEducativa institucionEducativa) {
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

            String consulta = "UPDATE INSTITUCIONEDUCATIVA "
                    + "SET "
                    + "nivel_estudios = ?, grado_escolar = ?, nombre_institucion = ?, promedio_anterior = ?"
                    + "WHERE "
                    + "usuario_uuid = ?";

            sentencia = conn.prepareStatement(consulta);

            sentencia.setString(1, institucionEducativa.getNivelEstudios());
            sentencia.setString(2, institucionEducativa.getGradoEscolar());
            sentencia.setString(3, institucionEducativa.getNombreInstitucion());
            sentencia.setString(4, institucionEducativa.getPromedioAnterior());
            sentencia.setString(5, institucionEducativa.getUsuarioUuid());

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

    public boolean editarProgramaSocial(ProgramaSocial programaSocial) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE PROGRAMASOCIAL "
                    + "SET "
                    + "inscrito_programas_sociales = ?, programas_sociales_especifica = ?, cuenta_con_beca = ?, tipo_beca = ?, instituto_otorga = ?, "
                    + "cantidad_recibida = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, programaSocial.getInscritoProgramasSociales());
            statement.setString(2, programaSocial.getProgramasSocialesEspecifica());
            statement.setString(3, programaSocial.getCuentaConBeca());
            statement.setString(4, programaSocial.getTipoBeca());
            statement.setString(5, programaSocial.getInstitutoOtorga());
            statement.setString(6, programaSocial.getCantidadRecibida());
            statement.setString(7, programaSocial.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarDependenciaVivienda(DependenciaVivienda dependenciaVivienda) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE DEPENDENCIAVIVIENDA "
                    + "SET "
                    + "depende_economicamente = ?, parentesco_tutores = ?, vive_con = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, dependenciaVivienda.getDependeEconomicamente());
            statement.setString(2, dependenciaVivienda.getParentescoTutores());
            statement.setString(3, dependenciaVivienda.getViveCon());
            statement.setString(4, dependenciaVivienda.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarTrabajoSolicitante(TrabajoSolicitante trabajoSolicitante) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE TRABAJOSOLICITANTE "
                    + "SET "
                    + "trabaja_actualmente = ?, empresa = ?, cargo_puesto = ?, tiempo_laborando = ?, telefono_empresa = ?, "
                    + "domicilio_empresa = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, trabajoSolicitante.getTrabajaActualmente());
            statement.setString(2, trabajoSolicitante.getEmpresa());
            statement.setString(3, trabajoSolicitante.getCargoPuesto());
            statement.setString(4, trabajoSolicitante.getTiempoLaborando());
            statement.setString(5, trabajoSolicitante.getTelefonoEmpresa());

            statement.setString(6, trabajoSolicitante.getDomicilioEmpresa());
            statement.setString(7, trabajoSolicitante.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarDatosPadres(DatoPadres datosPadres) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE DATOPADRES "
                    + "SET "
                    + "viven_padres = ?, edad_padre = ?, edad_madre = ?, estado_civil_padres = ?, viven_juntos = ?, "
                    + "escolaridad_padre = ?, escolaridad_madre = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, datosPadres.getVivenPadres());
            statement.setString(2, datosPadres.getEdadPadre());
            statement.setString(3, datosPadres.getEdadMadre());
            statement.setString(4, datosPadres.getEstadoCivilPadres());
            statement.setString(5, datosPadres.getVivenJuntos());

            statement.setString(6, datosPadres.getEscolaridadPadre());
            statement.setString(7, datosPadres.getEscolaridadMadre());
            statement.setString(8, datosPadres.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarOcupacionFamiliar(OcupacionFamiliar ocupacionFamiliar) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE OCUPACIONFAMILIAR "
                    + "SET "
                    + "tipo_familiar = ?, nombre = ?, lugar_trabajo = ?, cargo_puesto = ?, tiempo_laborando = ?, "
                    + "telefono_empresa = ?, domicilio_empresa = ?, edad = ?, escolaridad = ?, parentesco = ?, "
                    + "ingreso_mensual = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, ocupacionFamiliar.getTipoFamiliar());
            statement.setString(2, ocupacionFamiliar.getNombre());
            statement.setString(3, ocupacionFamiliar.getLugarTrabajo());
            statement.setString(4, ocupacionFamiliar.getCargoPuesto());
            statement.setString(5, ocupacionFamiliar.getTiempoLaborando());

            statement.setString(6, ocupacionFamiliar.getTelefonoEmpresa());
            statement.setString(7, ocupacionFamiliar.getDomicilioEmpresa());
            statement.setString(8, ocupacionFamiliar.getEdad());
            statement.setString(9, ocupacionFamiliar.getEscolaridad());
            statement.setString(10, ocupacionFamiliar.getParentesco());

            statement.setString(11, ocupacionFamiliar.getIngresoMensual());
            statement.setString(12, ocupacionFamiliar.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarSituacionFamiliar(SituacionFamiliar situacionFamiliar) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE SITUACIONFAMILIAR "
                    + "SET "
                    + "cantidad_hermanos = ?, viven_domicilio = ?, cantidad_domicilio = ?, personas_dependen_econ = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, situacionFamiliar.getCantidadHermanos());
            statement.setString(2, situacionFamiliar.getVivenDomicilio());
            statement.setString(3, situacionFamiliar.getCantidadDomicilio());
            statement.setString(4, situacionFamiliar.getPersonasDependenEcon());

            statement.setString(5, situacionFamiliar.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarHabitanteCasa(HabitanteCasa habitanteCasa) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE HABITANTECASA "
                    + "SET "
                    + "nombre_completo = ?, edad = ?, parentesco = ?, ocupacion = ?, estudio_maximo = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, habitanteCasa.getNombreCompleto());
            statement.setString(2, habitanteCasa.getEdad());
            statement.setString(3, habitanteCasa.getParentesco());
            statement.setString(4, habitanteCasa.getOcupacion());
            statement.setString(5, habitanteCasa.getEstudioMaximo());

            statement.setString(6, habitanteCasa.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarEstudioFamiliar(EstudioFamiliar estudioFamiliar) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE ESTUDIOFAMILIAR "
                    + "SET "
                    + "nombre_completo = ?, nivel_estudios = ?, ocupacion = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, estudioFamiliar.getNombreCompleto());
            statement.setString(2, estudioFamiliar.getNivelEstudios());
            statement.setString(3, estudioFamiliar.getOcupacion());
            statement.setString(4, estudioFamiliar.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarIngresoFamiliar(IngresoFamiliar ingresoFamiliar) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE INGRESOFAMILIAR "
                    + "SET "
                    + "regimen_seguridad_social = ?, personas_trabajando = ?, personas_aportan_gasto = ?, ingreso_propio = ?, ingreso_padre_tutor = ?, "
                    + "ingreso_conyuge = ?, ingreso_madre = ?, ingreso_hermanos = ?, otros_ingresos = ?, total_ingresos = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, ingresoFamiliar.getRegimenSeguridadSocial());
            statement.setString(2, ingresoFamiliar.getPersonasTrabajando());
            statement.setString(3, ingresoFamiliar.getPersonasAportanGasto());
            statement.setString(4, ingresoFamiliar.getIngresoPropio());
            statement.setString(5, ingresoFamiliar.getIngresoPadreTutor());

            statement.setString(6, ingresoFamiliar.getIngresoConyuge());
            statement.setString(7, ingresoFamiliar.getIngresoMadre());
            statement.setString(8, ingresoFamiliar.getIngresoHermanos());
            statement.setString(9, ingresoFamiliar.getOtrosIngresos());
            statement.setString(10, ingresoFamiliar.getTotalIngresos());

            statement.setString(11, ingresoFamiliar.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarGastoFamiliar(GastoFamiliar gastoFamiliar) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE GASTOFAMILIAR "
                    + "SET "
                    + "regimen_seguridad_social = ?, alimentos = ?, renta_predial = ?, despensa = ?, luz = ?, "
                    + "productos_limpieza = ?, agua = ?, transporte = ?, telefono = ?, servicio_domestico = ?, "
                    + "telefono_celular = ?, seguros = ?, cable = ?, pago_credito = ?, internet = ?, "
                    + "pagos_tarjetas_credito = ?, gas = ?, hipoteca = ?, ropa_calzado = ?, gastos_medicos = ?, "
                    + "gastos_personales = ?, colegiatura_solicitante = ?, vacaciones = ?, colegiatura_otros_miembros = ?, diversiones_entretenimiento = ?, "
                    + "libros_materiales = ?, otros_gastos = ?, total_gastos = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, gastoFamiliar.getRegimenSeguridadSocial());
            statement.setString(2, gastoFamiliar.getAlimentos());
            statement.setString(3, gastoFamiliar.getRentaPredial());
            statement.setString(4, gastoFamiliar.getDespensa());
            statement.setString(5, gastoFamiliar.getLuz());

            statement.setString(6, gastoFamiliar.getProductosLimpieza());
            statement.setString(7, gastoFamiliar.getAgua());
            statement.setString(8, gastoFamiliar.getTransporte());
            statement.setString(9, gastoFamiliar.getTelefono());
            statement.setString(10, gastoFamiliar.getServicioDomestico());

            statement.setString(11, gastoFamiliar.getTelefonoCelular());
            statement.setString(12, gastoFamiliar.getSeguros());
            statement.setString(13, gastoFamiliar.getCable());
            statement.setString(14, gastoFamiliar.getPagoCredito());
            statement.setString(15, gastoFamiliar.getInternet());

            statement.setString(16, gastoFamiliar.getPagosTarjetasCredito());
            statement.setString(17, gastoFamiliar.getGas());
            statement.setString(18, gastoFamiliar.getHipoteca());
            statement.setString(19, gastoFamiliar.getRopaCalzado());
            statement.setString(20, gastoFamiliar.getGastosMedicos());

            statement.setString(21, gastoFamiliar.getGastosPersonales());
            statement.setString(22, gastoFamiliar.getColegiaturaSolicitante());
            statement.setString(23, gastoFamiliar.getVacaciones());
            statement.setString(24, gastoFamiliar.getColegiaturaOtrosMiembros());
            statement.setString(25, gastoFamiliar.getDiversionesEntretenimiento());

            statement.setString(26, gastoFamiliar.getLibrosMateriales());
            statement.setString(27, gastoFamiliar.getOtrosGastos());
            statement.setString(28, gastoFamiliar.getTotalGastos());
            statement.setString(29, gastoFamiliar.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarGastosForaneo(GastosForaneo gastosForaneo) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE GASTOSFORANEO "
                    + "SET "
                    + "colegiatura = ?, vivienda = ?, libro = ?, gastos_personales = ?, comida = ?, "
                    + "ropa = ?, transportacion_local = ?, lavanderia = ?, transportacion_foranea = ?, gasto_total = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, gastosForaneo.getColegiatura());
            statement.setString(2, gastosForaneo.getVivienda());
            statement.setString(3, gastosForaneo.getLibro());
            statement.setString(4, gastosForaneo.getGastosPersonales());
            statement.setString(5, gastosForaneo.getComida());

            statement.setString(6, gastosForaneo.getRopa());
            statement.setString(7, gastosForaneo.getTransportacionLocal());
            statement.setString(8, gastosForaneo.getLavanderia());
            statement.setString(9, gastosForaneo.getTransportacionForanea());
            statement.setString(10, gastosForaneo.getGastoTotal());

            statement.setString(11, gastosForaneo.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarInformacionVivienda(InformacionVivienda informacionVivienda) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE INFORMACIONVIVIENDA "
                    + "SET "
                    + "clase_socioeconomica = ?, tipo_vivienda = ?, numero_habitaciones = ?, servicios = ?, material_casa = ?, "
                    + "zona_vivienda = ?, pertenece_comunidad = ?, comunidad_indg = ?, sufre_discapacidad = ?, discapacidad = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, informacionVivienda.getClaseSocioeconomica());
            statement.setString(2, informacionVivienda.getTipoVivienda());
            statement.setString(3, informacionVivienda.getNumeroHabitaciones());
            statement.setString(4, informacionVivienda.getServicios());
            statement.setString(5, informacionVivienda.getMaterialCasa());

            statement.setString(6, informacionVivienda.getZonaVivienda());
            statement.setString(7, informacionVivienda.getPerteneceComunidad());
            statement.setString(8, informacionVivienda.getComunidadIndg());
            statement.setString(9, informacionVivienda.getSufreDiscapacidad());
            statement.setString(10, informacionVivienda.getDiscapacidad());

            statement.setString(11, informacionVivienda.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarBienesAparatos(BienesAparatos bienesAparatos) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE BIENESAPARATOS "
                    + "SET "
                    + "aparato = ?, estatus = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, bienesAparatos.getAparato());
            statement.setString(2, bienesAparatos.getEstatus());
            statement.setString(3, bienesAparatos.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarVehiculos(Vehiculos vehiculos) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE VEHICULOS "
                    + "SET "
                    + "marca = ?, modelo = ?, valor_comercial = ?, adeuda = ?, plazo_mensual = ?, "
                    + "pago_mensual = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, vehiculos.getMarca());
            statement.setString(2, vehiculos.getModelo());
            statement.setString(3, vehiculos.getValorComercial());
            statement.setString(4, vehiculos.getAdeuda());
            statement.setString(5, vehiculos.getPlazoMensual());

            statement.setString(6, vehiculos.getPagoMensual());
            statement.setString(7, vehiculos.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarObjetivoApoyo(ObjetivoApoyo objetivoApoyo) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE OBJETIVOAPOYO "
                    + "SET "
                    + "objetivo_apoyo = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, objetivoApoyo.getObjetivoApoyo());
            statement.setString(2, objetivoApoyo.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

    public boolean editarDocumentacion(Documentacion documentacion) {
        Connection conn = null;
        PreparedStatement statement = null;
        boolean result = false;
        int rowsUpdated = 0;

        try {
            try {
                conn = conexion.conectarBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OperacionesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "UPDATE DOCUMENTACION "
                    + "SET "
                    + "documento = ?, descripcion = ? "
                    + "WHERE "
                    + "usuario_uuid = ?";

            statement = conn.prepareStatement(query);

            statement.setString(1, documentacion.getDocumento());
            statement.setString(2, documentacion.getDescripcion());
            statement.setString(3, documentacion.getUsuarioUuid());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            conexion.excepcion(conn);
        } finally {
            conexion.cerrar(conn); // Close the database connection
        }
        return result;
    }

}
