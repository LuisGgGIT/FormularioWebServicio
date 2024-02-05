package recursos;

import entidades.BienesAparatos;
import entidades.DatoPadres;
import entidades.DependenciaVivienda;
import entidades.EstudioFamiliar;
import entidades.GastoFamiliar;
import entidades.GastosForaneo;
import entidades.HabitanteCasa;
import entidades.InfoFamilia;
import entidades.InfoPersonal;
import entidades.InfoVivienda;
import entidades.InformacionVivienda;
import entidades.IngresoFamiliar;
import entidades.InstitucionEducativa;
import entidades.MunicipiosCat;
import entidades.ObjetivoApoyo;
import entidades.OcupacionFamiliar;
import entidades.ProgramaSocial;
import entidades.SituacionFamiliar;
import entidades.Solicitante;
import entidades.Solicitud;
import entidades.TrabajoSolicitante;
import entidades.Usuario;
import entidades.Vehiculos;
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

    public Solicitud rellenarSolicitud(ResultSet rs) {

        Solicitud solicitud = new Solicitud();

        try {

            solicitud.setSolicitud_id(rs.getInt("solicitud_id"));
            solicitud.setUsuario_uuid(rs.getString("usuario_uuid"));
            solicitud.setFecha_inicio(rs.getString("fecha_inicio"));
            solicitud.setFecha_fin(rs.getString("fecha_fin"));
            solicitud.setEstatus(rs.getString("estatus"));

            solicitud.setDescripcion(rs.getString("descripcion"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return solicitud;
    }

    public Solicitante rellenarSolicitante(ResultSet rs) {

        Solicitante infoPersonal = new Solicitante();

        try {
            infoPersonal.setSolicitante_id(rs.getInt("solicitante_id"));
            infoPersonal.setNombre(rs.getString("nombre"));
            infoPersonal.setApellidoPaterno(rs.getString("apellido_paterno"));
            infoPersonal.setApellidoMaterno(rs.getString("apellido_materno"));
            infoPersonal.setNombreCompleto(rs.getString("nombre_completo"));

            infoPersonal.setCalle(rs.getString("calle"));
            infoPersonal.setNumero(rs.getString("numero"));
            infoPersonal.setColonia(rs.getString("colonia"));
            infoPersonal.setPoblacion(rs.getString("poblacion"));
            infoPersonal.setMunicipio(rs.getString("municipio"));

            infoPersonal.setEstado(rs.getString("estado"));
            infoPersonal.setCodigoPostal(rs.getString("codigo_postal"));
            infoPersonal.setTelCasa(rs.getString("tel_casa"));
            infoPersonal.setTelCelular(rs.getString("tel_celular"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return infoPersonal;
    }

    public InstitucionEducativa rellenarInstitucionEducativa(ResultSet rs) {

        InstitucionEducativa infoPersonal = new InstitucionEducativa();

        try {

            infoPersonal.setInstitucionEducativaId(rs.getInt("institucioneducativa_id"));
            infoPersonal.setNivelEstudios(rs.getString("nivel_estudios"));
            infoPersonal.setGradoEscolar(rs.getString("grado_escolar"));
            infoPersonal.setNombreInstitucion(rs.getString("nombre_institucion"));
            infoPersonal.setPromedioAnterior(rs.getString("promedio_anterior"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return infoPersonal;
    }

    public ProgramaSocial rellenarProgramaSocial(ResultSet rs) {

        ProgramaSocial infoPersonal = new ProgramaSocial();

        try {

            infoPersonal.setProgramaSocialId(rs.getInt("programasocial_id"));

            infoPersonal.setInscritoProgramasSociales(rs.getString("inscrito_programas_sociales"));
            infoPersonal.setProgramasSocialesEspecifica(rs.getString("programas_sociales_especifica"));
            infoPersonal.setCuentaConBeca(rs.getString("cuenta_con_beca"));
            infoPersonal.setTipoBeca(rs.getString("tipo_beca"));
            infoPersonal.setInstitutoOtorga(rs.getString("instituto_otorga"));

            infoPersonal.setCantidadRecibida(rs.getString("cantidad_recibida"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return infoPersonal;
    }

    public DependenciaVivienda rellenarDependenciaVivienda(ResultSet rs) {

        DependenciaVivienda infoPersonal = new DependenciaVivienda();

        try {

            infoPersonal.setDependenciaViviendaId(rs.getInt("dependenciavivienda_id"));
            infoPersonal.setDependeEconomicamente(rs.getString("depende_economicamente"));
            infoPersonal.setParentescoTutores(rs.getString("parentesco_tutores"));
            infoPersonal.setViveCon(rs.getString("vive_con"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return infoPersonal;
    }

    public TrabajoSolicitante rellenarTrabajoSolicitante(ResultSet rs) {

        TrabajoSolicitante infoPersonal = new TrabajoSolicitante();

        try {

            infoPersonal.setTrabajoSolicitanteId(rs.getInt("trabajosolicitante_id"));
            infoPersonal.setTrabajaActualmente(rs.getString("trabaja_actualmente"));
            infoPersonal.setEmpresa(rs.getString("empresa"));
            infoPersonal.setCargoPuesto(rs.getString("cargo_puesto"));
            infoPersonal.setTiempoLaborando(rs.getString("tiempo_laborando"));

            infoPersonal.setTelefonoEmpresa(rs.getString("telefono_empresa"));
            infoPersonal.setDomicilioEmpresa(rs.getString("domicilio_empresa"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return infoPersonal;
    }

    public GastosForaneo rellenarGastosForaneo(ResultSet rs) {

        GastosForaneo infoPersonal = new GastosForaneo();

        try {

            infoPersonal.setGastosForaneoId(rs.getInt("gastosforaneo_id"));
            infoPersonal.setColegiatura(rs.getString("colegiatura"));
            infoPersonal.setVivienda(rs.getString("vivienda"));

            infoPersonal.setLibro(rs.getString("libro"));
            infoPersonal.setGastosPersonales(rs.getString("gastos_personales"));
            infoPersonal.setComida(rs.getString("comida"));
            infoPersonal.setRopa(rs.getString("ropa"));
            infoPersonal.setTransportacionLocal(rs.getString("transportacion_local"));

            infoPersonal.setLavanderia(rs.getString("lavanderia"));
            infoPersonal.setTransportacionForanea(rs.getString("transportacion_foranea"));
            infoPersonal.setGastoTotal(rs.getString("gasto_total"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return infoPersonal;
    }

    public DatoPadres rellenarDatoPadres(ResultSet rs) {

        DatoPadres datoPadres = new DatoPadres();
        try {
            datoPadres.setDatoPadreId(rs.getInt("datopadre_id"));
            datoPadres.setUsuarioUuid(rs.getString("usuario_uuid"));
            datoPadres.setVivenPadres(rs.getString("viven_padres"));
            datoPadres.setEdadPadre(rs.getString("edad_padre"));
            datoPadres.setEdadMadre(rs.getString("edad_madre"));
            datoPadres.setEstadoCivilPadres(rs.getString("estado_civil_padres"));

            datoPadres.setVivenJuntos(rs.getString("viven_juntos"));
            datoPadres.setEscolaridadPadre(rs.getString("escolaridad_padre"));
            datoPadres.setEscolaridadMadre(rs.getString("escolaridad_madre"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return datoPadres;
    }

    public OcupacionFamiliar rellenarOcupacionFamiliar(ResultSet rs) {

        OcupacionFamiliar ocupacionFamiliar = new OcupacionFamiliar();
        try {
            ocupacionFamiliar.setOcupacionFamiliarId(rs.getInt("ocupacionfamiliar_id"));
            ocupacionFamiliar.setUsuarioUuid(rs.getString("usuario_uuid"));
            ocupacionFamiliar.setTipoFamiliar(rs.getString("tipo_familiar"));
            ocupacionFamiliar.setNombre(rs.getString("nombre"));
            ocupacionFamiliar.setLugarTrabajo(rs.getString("lugar_trabajo"));
            ocupacionFamiliar.setCargoPuesto(rs.getString("cargo_puesto"));
            ocupacionFamiliar.setTiempoLaborando(rs.getString("tiempo_laborando"));
            ocupacionFamiliar.setTelefonoEmpresa(rs.getString("telefono_empresa"));
            ocupacionFamiliar.setDomicilioEmpresa(rs.getString("domicilio_empresa"));
            ocupacionFamiliar.setEdad(rs.getString("edad"));
            ocupacionFamiliar.setEscolaridad(rs.getString("escolaridad"));
            ocupacionFamiliar.setParentesco(rs.getString("parentesco"));
            ocupacionFamiliar.setIngresoMensual(rs.getString("ingreso_mensual"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ocupacionFamiliar;
    }

    public SituacionFamiliar rellenarSituacionFamiliar(ResultSet rs) {

        SituacionFamiliar situacionFamiliar = new SituacionFamiliar();
        try {
            situacionFamiliar.setSituacionFamiliarId(rs.getInt("situacionfamiliar_id"));
            situacionFamiliar.setUsuarioUuid(rs.getString("usuario_uuid"));
            situacionFamiliar.setCantidadHermanos(rs.getString("cantidad_hermanos"));
            situacionFamiliar.setVivenDomicilio(rs.getString("viven_domicilio"));
            situacionFamiliar.setCantidadDomicilio(rs.getString("cantidad_domicilio"));
            situacionFamiliar.setPersonasDependenEcon(rs.getString("personas_dependen_econ"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return situacionFamiliar;
    }

    public HabitanteCasa rellenarHabitanteCasa(ResultSet rs) {

        HabitanteCasa habitanteCasa = new HabitanteCasa();
        try {
            habitanteCasa.setHabitanteCasaId(rs.getInt("habitantecasa_id"));
            habitanteCasa.setUsuarioUuid(rs.getString("usuario_uuid"));
            habitanteCasa.setNombreCompleto(rs.getString("nombre_completo"));
            habitanteCasa.setEdad(rs.getString("edad"));
            habitanteCasa.setParentesco(rs.getString("parentesco"));
            habitanteCasa.setOcupacion(rs.getString("ocupacion"));
            habitanteCasa.setEstudioMaximo(rs.getString("estudio_maximo"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return habitanteCasa;
    }
    
    public EstudioFamiliar rellenarEstudioFamiliar(ResultSet rs) {

        EstudioFamiliar estudioFamiliar = new EstudioFamiliar();
        try {
            estudioFamiliar.setEstudioFamiliarId(rs.getInt("habitantecasa_id"));
            estudioFamiliar.setUsuarioUuid(rs.getString("usuario_uuid"));
            estudioFamiliar.setNombreCompleto(rs.getString("nombre_completo")); 
            estudioFamiliar.setNivelEstudios(rs.getString("nivel_estudios")); 
            estudioFamiliar.setOcupacion(rs.getString("ocupacion")); 

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return estudioFamiliar;
    }
    
    public Vehiculos rellenarVehiculos(ResultSet rs) {

        Vehiculos vehiculos = new Vehiculos();
        try {
            vehiculos.setVehiculosId(rs.getInt("vehiculosid"));
            vehiculos.setUsuarioUuid(rs.getString("usuario_uuid"));
            vehiculos.setMarca(rs.getString("marca")); 
            vehiculos.setModelo(rs.getString("modelo")); 
            vehiculos.setValorComercial(rs.getString("valor_comercial")); 
            
            vehiculos.setAdeuda(rs.getString("adeuda")); 
            vehiculos.setPlazoMensual(rs.getString("plazo_mensual")); 
            vehiculos.setPagoMensual(rs.getString("pago_mensual")); 

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return vehiculos;
    }

    public IngresoFamiliar rellenarIngresoFamiliar(ResultSet rs) {

        IngresoFamiliar ingresoFamiliar = new IngresoFamiliar();
        try {
            ingresoFamiliar.setIngresoFamiliarId(rs.getInt("situacionfamiliar_id"));
            ingresoFamiliar.setUsuarioUuid(rs.getString("usuario_uuid"));
            ingresoFamiliar.setRegimenSeguridadSocial(rs.getString("regimen_seguridad_social"));
            ingresoFamiliar.setPersonasTrabajando(rs.getString("personas_trabajando"));
            ingresoFamiliar.setPersonasAportanGasto(rs.getString("personas_aportan_gasto"));
            ingresoFamiliar.setIngresoPropio(rs.getString("ingreso_propio"));

            ingresoFamiliar.setIngresoPadreTutor(rs.getString("ingreso_padre_tutor"));
            ingresoFamiliar.setIngresoConyuge(rs.getString("ingreso_conyuge"));
            ingresoFamiliar.setIngresoMadre(rs.getString("ingreso_madre"));
            ingresoFamiliar.setIngresoHermanos(rs.getString("ingreso_hermanos"));
            ingresoFamiliar.setOtrosIngresos(rs.getString("otros_ingresos"));

            ingresoFamiliar.setTotalIngresos(rs.getString("total_ingresos"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ingresoFamiliar;
    }

    public GastoFamiliar rellenarGastoFamiliar(ResultSet rs) {

        GastoFamiliar gastoFamiliar = new GastoFamiliar();
        try {
            gastoFamiliar.setGastoFamiliarId(rs.getInt("gastofamiliar_id"));
            gastoFamiliar.setUsuarioUuid(rs.getString("usuario_uuid"));
            gastoFamiliar.setRegimenSeguridadSocial(rs.getString("regimen_seguridad_social"));
            gastoFamiliar.setAlimentos(rs.getString("alimentos"));
            gastoFamiliar.setRentaPredial(rs.getString("renta_predial"));
            gastoFamiliar.setDespensa(rs.getString("despensa"));

            gastoFamiliar.setLuz(rs.getString("luz"));
            gastoFamiliar.setProductosLimpieza(rs.getString("productos_limpieza"));
            gastoFamiliar.setAgua(rs.getString("agua"));
            gastoFamiliar.setTransporte(rs.getString("transporte"));
            gastoFamiliar.setTelefono(rs.getString("telefono"));

            gastoFamiliar.setServicioDomestico(rs.getString("servicio_domestico"));
            gastoFamiliar.setTelefonoCelular(rs.getString("telefono_celular"));
            gastoFamiliar.setSeguros(rs.getString("seguros"));
            gastoFamiliar.setCable(rs.getString("cable"));
            gastoFamiliar.setPagoCredito(rs.getString("pago_credito"));

            gastoFamiliar.setInternet(rs.getString("internet"));
            gastoFamiliar.setPagosTarjetasCredito(rs.getString("pagos_tarjetas_credito"));
            gastoFamiliar.setGas(rs.getString("gas"));
            gastoFamiliar.setHipoteca(rs.getString("hipoteca"));
            gastoFamiliar.setRopaCalzado(rs.getString("ropa_calzado"));

            gastoFamiliar.setGastosMedicos(rs.getString("gastos_medicos"));
            gastoFamiliar.setGastosPersonales(rs.getString("gastos_personales"));
            gastoFamiliar.setColegiaturaSolicitante(rs.getString("colegiatura_solicitante"));
            gastoFamiliar.setVacaciones(rs.getString("vacaciones"));
            gastoFamiliar.setColegiaturaOtrosMiembros(rs.getString("colegiatura_otros_miembros"));

            gastoFamiliar.setDiversionesEntretenimiento(rs.getString("diversiones_entretenimiento"));
            gastoFamiliar.setLibrosMateriales(rs.getString("libros_materiales"));
            gastoFamiliar.setOtrosGastos(rs.getString("otros_gastos"));
            gastoFamiliar.setTotalGastos(rs.getString("total_gastos"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return gastoFamiliar;
    }

    public InformacionVivienda rellenarInformacionVivienda(ResultSet rs) {

        InformacionVivienda informacionVivienda = new InformacionVivienda();
        try {
            informacionVivienda.setInformacionViviendaId(rs.getInt("informacionvivienda_id"));
            informacionVivienda.setUsuarioUuid(rs.getString("usuario_uuid"));
            informacionVivienda.setClaseSocioeconomica(rs.getString("clase_socioeconomica"));
            informacionVivienda.setTipoVivienda(rs.getString("tipo_vivienda"));
            informacionVivienda.setNumeroHabitaciones(rs.getString("numero_habitaciones"));

            informacionVivienda.setServicios(rs.getString("servicios"));
            informacionVivienda.setMaterialCasa(rs.getString("material_casa"));
            informacionVivienda.setZonaVivienda(rs.getString("zona_vivienda"));
            informacionVivienda.setPerteneceComunidad(rs.getString("pertenece_comunidad"));
            informacionVivienda.setComunidadIndg(rs.getString("comunidad_indg"));

            informacionVivienda.setSufreDiscapacidad(rs.getString("sufre_discapacidad"));
            informacionVivienda.setDiscapacidad(rs.getString("discapacidad"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return informacionVivienda;
    }

    public BienesAparatos rellenarBienesAparatos(ResultSet rs) {

        BienesAparatos bienesAparatos = new BienesAparatos();
        try {
            bienesAparatos.setBienesAparatosId(rs.getInt("bienesaparatos_id"));
            bienesAparatos.setUsuarioUuid(rs.getString("usuario_uuid"));
            bienesAparatos.setAparato(rs.getString("aparato"));
            bienesAparatos.setEstatus(rs.getString("estatus"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return bienesAparatos;
    }

    // -----------------------------
    public InfoPersonal rellenarInfoPersonal(ResultSet rs) {
        InfoPersonal infoPersonal = new InfoPersonal();
        infoPersonal.setSolicitante(rellenarSolicitante(rs));
        infoPersonal.setInstitucionEducativa(rellenarInstitucionEducativa(rs));
        infoPersonal.setProgramaSocial(rellenarProgramaSocial(rs));
        infoPersonal.setDependenciaVivienda(rellenarDependenciaVivienda(rs));
        infoPersonal.setTrabajoSolicitante(rellenarTrabajoSolicitante(rs));
        infoPersonal.setGastosForaneo(rellenarGastosForaneo(rs));
        return infoPersonal;
    }

    public InfoFamilia rellenarInfoFamilia(ResultSet rs) {

        InfoFamilia infoFamilia = new InfoFamilia();
        infoFamilia.setDatoPadres(rellenarDatoPadres(rs));
        infoFamilia.setSituacionFamiliar(rellenarSituacionFamiliar(rs));
        infoFamilia.setIngresoFamiliar(rellenarIngresoFamiliar(rs));

        return infoFamilia;
    }

    public InfoVivienda rellenarInfoVivienda(ResultSet rs) {

        InfoVivienda infoVivienda = new InfoVivienda();
        infoVivienda.setInformacionVivienda(rellenarInformacionVivienda(rs));
        infoVivienda.setBienesAparatos(rellenarBienesAparatos(rs));

        return infoVivienda;
    }

    public ObjetivoApoyo rellenarObjetivoApoyo(ResultSet rs) {

        ObjetivoApoyo objetivoApoyo = new ObjetivoApoyo();

        try {

            objetivoApoyo.setObjetivoApoyoId(rs.getInt("Objetivoapoyo_id"));
            objetivoApoyo.setUsuarioUuid(rs.getString("usuario_uuid"));
            objetivoApoyo.setObjetivoApoyo(rs.getString("objetivo_apoyo"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return objetivoApoyo;
    }
    
    public MunicipiosCat rellenarMunicipios(ResultSet rs) {

        MunicipiosCat municipiosCat = new MunicipiosCat();

        try {
            municipiosCat.setMunicipio_id(rs.getInt("municipio_id"));
            municipiosCat.setMunicipio(rs.getString("municipio"));
            municipiosCat.setRegion(rs.getString("region")); 

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return municipiosCat;
    }

}
