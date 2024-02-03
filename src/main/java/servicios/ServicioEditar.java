package servicios;

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
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import recursos.Herramientas;
import recursos.OperacionesEditar;

@Path("editar")
public class ServicioEditar {

    OperacionesEditar operacion = new OperacionesEditar();
    Herramientas herramienta = new Herramientas();

    @POST
    @Path("usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarUsuario(String usuariosJsonrequest) {
        org.json.JSONObject jsonrequest = new org.json.JSONObject(usuariosJsonrequest);
        org.json.JSONObject jsonresponse = new org.json.JSONObject();
        boolean editarUsuario = false;

        String usuario_uuid = (String) jsonrequest.get("usuario_uuid");
        String contrasenia = (String) jsonrequest.get("contrasenia");
        String email = (String) jsonrequest.get("email");
        String curp = (String) jsonrequest.get("curp");
        String edad = (String) jsonrequest.get("edad");
        String fecha_nacimiento = (String) jsonrequest.get("fecha_nacimiento");

        Usuario usuariorequest = new Usuario(usuario_uuid, contrasenia, email, curp, edad, fecha_nacimiento);

        editarUsuario = operacion.editarUsuario(usuariorequest);
        jsonresponse.put("validador", editarUsuario);
        return jsonresponse.toString();
    }

    @POST
    @Path("solicitud")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarSolicitud(String solicitudesJsonrequest) {
        org.json.JSONObject jsonrequest = new org.json.JSONObject(solicitudesJsonrequest);
        org.json.JSONObject jsonresponse = new org.json.JSONObject();
        boolean editarSolicitud = false;

        Solicitud solicitudrequest = new Solicitud(jsonrequest);

        editarSolicitud = operacion.editarSolicitud(solicitudrequest);
        jsonresponse.put("validador", editarSolicitud);
        return jsonresponse.toString();
    }

    @POST
    @Path("solicitante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarSolicitante(String solicitanteJsonrequest) {
        org.json.JSONObject jsonrequest = new org.json.JSONObject(solicitanteJsonrequest);
        org.json.JSONObject jsonresponse = new org.json.JSONObject();
        boolean editarSolicitante = false;

        Solicitante solicitanterequest = new Solicitante(jsonrequest);

        editarSolicitante = operacion.editarSolicitante(solicitanterequest);
        jsonresponse.put("validador", editarSolicitante);
        return jsonresponse.toString();
    }

    @POST
    @Path("institucioneducativa")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarInstitucionEducativa(String institucionEducativaJsonrequest) {
        org.json.JSONObject jsonrequest = new org.json.JSONObject(institucionEducativaJsonrequest);
        org.json.JSONObject jsonresponse = new org.json.JSONObject();
        boolean editarInstitucionEducativa = false;

        InstitucionEducativa institucioneducativarequest = new InstitucionEducativa(jsonrequest);

        editarInstitucionEducativa = operacion.editarInstitucionEducativa(institucioneducativarequest);
        jsonresponse.put("validador", editarInstitucionEducativa);
        return jsonresponse.toString();
    }

    @POST
    @Path("programasocial")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarProgramaSocial(String programaSocialJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(programaSocialJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarProgramaSocial = false;

        ProgramaSocial programaSocialRequest = new ProgramaSocial(jsonRequest);

        editarProgramaSocial = operacion.editarProgramaSocial(programaSocialRequest);
        jsonResponse.put("validador", editarProgramaSocial);
        return jsonResponse.toString();
    }

    @POST
    @Path("dependenciavivienda")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarDependenciaVivienda(String dependenciaViviendaJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(dependenciaViviendaJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarDependenciaVivienda = false;

        DependenciaVivienda dependenciaViviendaRequest = new DependenciaVivienda(jsonRequest);

        editarDependenciaVivienda = operacion.editarDependenciaVivienda(dependenciaViviendaRequest);
        jsonResponse.put("validador", editarDependenciaVivienda);
        return jsonResponse.toString();
    }

    @POST
    @Path("trabajosolicitante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarTrabajoSolicitante(String trabajoSolicitanteJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(trabajoSolicitanteJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarTrabajoSolicitante = false;

        TrabajoSolicitante trabajoSolicitanteRequest = new TrabajoSolicitante(jsonRequest);

        editarTrabajoSolicitante = operacion.editarTrabajoSolicitante(trabajoSolicitanteRequest);
        jsonResponse.put("validador", editarTrabajoSolicitante);
        return jsonResponse.toString();
    }

    @POST
    @Path("datospadres")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarDatosPadres(String datosPadresJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(datosPadresJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarDatosPadres = false;

        DatoPadres datosPadresRequest = new DatoPadres(jsonRequest);

        editarDatosPadres = operacion.editarDatosPadres(datosPadresRequest);
        jsonResponse.put("validador", editarDatosPadres);
        return jsonResponse.toString();
    }

    @POST
    @Path("ocupacionfamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarOcupacionFamiliar(String ocupacionFamiliarJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(ocupacionFamiliarJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarOcupacionFamiliar = false;

        OcupacionFamiliar ocupacionFamiliarRequest = new OcupacionFamiliar(jsonRequest);

        editarOcupacionFamiliar = operacion.editarOcupacionFamiliar(ocupacionFamiliarRequest);
        jsonResponse.put("validador", editarOcupacionFamiliar);
        return jsonResponse.toString();
    }

    @POST
    @Path("situacionfamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarSituacionFamiliar(String situacionFamiliarJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(situacionFamiliarJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarSituacionFamiliar = false;

        SituacionFamiliar situacionFamiliarRequest = new SituacionFamiliar(jsonRequest);

        editarSituacionFamiliar = operacion.editarSituacionFamiliar(situacionFamiliarRequest);
        jsonResponse.put("validador", editarSituacionFamiliar);
        return jsonResponse.toString();
    }

    @POST
    @Path("habitantecasa")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarHabitanteCasa(String habitanteCasaJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(habitanteCasaJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarHabitanteCasa = false;

        HabitanteCasa habitanteCasaRequest = new HabitanteCasa(jsonRequest);

        editarHabitanteCasa = operacion.editarHabitanteCasa(habitanteCasaRequest);
        jsonResponse.put("validador", editarHabitanteCasa);
        return jsonResponse.toString();
    }

    @POST
    @Path("estudiofamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarEstudioFamiliar(String estudioFamiliarJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(estudioFamiliarJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarEstudioFamiliar = false;

        EstudioFamiliar estudioFamiliarRequest = new EstudioFamiliar(jsonRequest);

        editarEstudioFamiliar = operacion.editarEstudioFamiliar(estudioFamiliarRequest);
        jsonResponse.put("validador", editarEstudioFamiliar);
        return jsonResponse.toString();
    }

    @POST
    @Path("ingresofamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarIngresoFamiliar(String ingresoFamiliarJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(ingresoFamiliarJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarIngresoFamiliar = false;

        IngresoFamiliar ingresoFamiliarRequest = new IngresoFamiliar(jsonRequest);

        editarIngresoFamiliar = operacion.editarIngresoFamiliar(ingresoFamiliarRequest);
        jsonResponse.put("validador", editarIngresoFamiliar);
        return jsonResponse.toString();
    }

    @POST
    @Path("gastofamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarGastoFamiliar(String gastoFamiliarJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(gastoFamiliarJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarGastoFamiliar = false;

        GastoFamiliar gastoFamiliarRequest = new GastoFamiliar(jsonRequest);

        editarGastoFamiliar = operacion.editarGastoFamiliar(gastoFamiliarRequest);
        jsonResponse.put("validador", editarGastoFamiliar);
        return jsonResponse.toString();
    }

    @POST
    @Path("gastosforaneo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarGastosForaneo(String gastosForaneoJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(gastosForaneoJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarGastosForaneo = false;

        GastosForaneo gastosForaneoRequest = new GastosForaneo(jsonRequest);

        editarGastosForaneo = operacion.editarGastosForaneo(gastosForaneoRequest);
        jsonResponse.put("validador", editarGastosForaneo);
        return jsonResponse.toString();
    }

    @POST
    @Path("informacionvivienda")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarInformacionVivienda(String informacionViviendaJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(informacionViviendaJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarInformacionVivienda = false;

        InformacionVivienda informacionViviendaRequest = new InformacionVivienda(jsonRequest);

        editarInformacionVivienda = operacion.editarInformacionVivienda(informacionViviendaRequest);
        jsonResponse.put("validador", editarInformacionVivienda);
        return jsonResponse.toString();
    }

    @POST
    @Path("bienesaparatos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarBienesAparatos(String bienesAparatosJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(bienesAparatosJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarBienesAparatos = false;

        BienesAparatos bienesAparatosRequest = new BienesAparatos(jsonRequest);

        editarBienesAparatos = operacion.editarBienesAparatos(bienesAparatosRequest);
        jsonResponse.put("validador", editarBienesAparatos);
        return jsonResponse.toString();
    }

    @POST
    @Path("vehiculos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarVehiculos(String vehiculosJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(vehiculosJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarVehiculos = false;

        Vehiculos vehiculosRequest = new Vehiculos(jsonRequest);

        editarVehiculos = operacion.editarVehiculos(vehiculosRequest);
        jsonResponse.put("validador", editarVehiculos);
        return jsonResponse.toString();
    }

    @POST
    @Path("objetivoapoyo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarObjetivoApoyo(String objetivoApoyoJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(objetivoApoyoJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarObjetivoApoyo = false;

        ObjetivoApoyo objetivoApoyoRequest = new ObjetivoApoyo(jsonRequest);

        editarObjetivoApoyo = operacion.editarObjetivoApoyo(objetivoApoyoRequest);
        jsonResponse.put("validador", editarObjetivoApoyo);
        return jsonResponse.toString();
    }

    @POST
    @Path("documentacion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editarDocumentacion(String documentacionJsonRequest) {
        org.json.JSONObject jsonRequest = new org.json.JSONObject(documentacionJsonRequest);
        org.json.JSONObject jsonResponse = new org.json.JSONObject();
        boolean editarDocumentacion = false;

        Documentacion documentacionRequest = new Documentacion(jsonRequest);

        editarDocumentacion = operacion.editarDocumentacion(documentacionRequest);
        jsonResponse.put("validador", editarDocumentacion);
        return jsonResponse.toString();
    }

}
