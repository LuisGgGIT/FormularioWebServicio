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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
import recursos.Herramientas;
import recursos.OperacionesRegistrar;

@Path("registar")
public class ServicioRegistrar {

    OperacionesRegistrar operacion = new OperacionesRegistrar();
    Herramientas herramienta = new Herramientas();

    /*Rutas de pruebas*/
    private static final String RUTAHTTP = "http://127.0.0.1:8887/";
    private static final String RUTA = "C:\\Users\\usuario\\Desktop\\TarjetaJovenPDF\\";

    /*Rutas de servidor*/
    //private static final String RUTAHTTP = "http://localhost:80/TarjetaJovenPDF/";
    //private static final String RUTA = "/opt/tomcat/imagenes/";
    @POST
    @Path("usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarUsuario(String Jsonrequest) {
        JSONObject jsonrequest = new JSONObject(Jsonrequest);
        JSONObject jsonresponse = new JSONObject();
        boolean response = false;
        Usuario beanrequest = new Usuario(jsonrequest);
        response = operacion.registrarUsuario(beanrequest);
        jsonresponse.put("validador", response);
        return jsonresponse.toString();
    }

    @POST
    @Path("solicitud")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarSolicitud(String Jsonrequest) {
        JSONObject jsonrequest = new JSONObject(Jsonrequest);
        JSONObject jsonresponse = new JSONObject();
        boolean response = false;
        Solicitud beanrequest = new Solicitud(jsonrequest);

        response = operacion.registrarSolicitud(beanrequest);
        jsonresponse.put("validador", response);
        return jsonresponse.toString();
    }

    @POST
    @Path("solicitante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarSolicitante(String Jsonrequest) {
        JSONObject jsonRequest = new JSONObject(Jsonrequest);
        JSONObject jsonresponse = new JSONObject();
        boolean response = false;
        Solicitante beanrequest = new Solicitante(jsonRequest);

        response = operacion.registrarSolicitante(beanrequest);
        jsonresponse.put("validador", response);
        return jsonresponse.toString();
    }

    @POST
    @Path("institucioneducativa")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarInstitucionEducativa(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        InstitucionEducativa institucion = new InstitucionEducativa(request);
        response = operacion.registrarInstitucionEducativa(institucion);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("programasocial")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarProgramaSocial(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        ProgramaSocial programa = new ProgramaSocial(request);
        response = operacion.registrarProgramaSocial(programa);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("dependenciavivienda")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarDependenciaVivienda(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        DependenciaVivienda dependenciaVivienda = new DependenciaVivienda(request);
        response = operacion.registrarDependenciaVivienda(dependenciaVivienda);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("trabajosolicitante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarTrabajoSoliciante(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        TrabajoSolicitante trabajoSoliciante = new TrabajoSolicitante(request);
        response = operacion.registrarTrabajoSolicitante(trabajoSoliciante);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("datospadres")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarDatosPadres(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        DatoPadres datosPadres = new DatoPadres(request);
        response = operacion.registrarDatosPadres(datosPadres);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("ocupacionfamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarOcupacionFamiliar(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        OcupacionFamiliar ocupacionFamiliar = new OcupacionFamiliar(request);
        response = operacion.registrarOcupacionFamiliar(ocupacionFamiliar);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("situacionfamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarSituacionFamiliar(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        SituacionFamiliar situacionFamiliar = new SituacionFamiliar(request);
        response = operacion.registrarSituacionFamiliar(situacionFamiliar);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("habitantecasa")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarHabitanteCasa(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        HabitanteCasa habitanteCasa = new HabitanteCasa(request);
        response = operacion.registrarHabitanteCasa(habitanteCasa);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("estudiofamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarEstudioFamiliar(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        EstudioFamiliar estudioFamiliar = new EstudioFamiliar(request);
        response = operacion.registrarEstudioFamiliar(estudioFamiliar);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("ingresofamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarIngresoFamiliar(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        IngresoFamiliar ingresoFamiliar = new IngresoFamiliar(request);
        response = operacion.registrarIngresoFamiliar(ingresoFamiliar);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("gastofamiliar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarGastoFamiliar(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        GastoFamiliar gastoFamiliar = new GastoFamiliar(request);
        response = operacion.registrarGastoFamiliar(gastoFamiliar);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("gastosforaneo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarGastosForaneo(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        GastosForaneo gastosForaneo = new GastosForaneo(request);
        response = operacion.registrarGastosForaneo(gastosForaneo);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("informacionvivienda")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarInformacionVivienda(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        InformacionVivienda informacionVivienda = new InformacionVivienda(request);
        response = operacion.registrarInformacionVivienda(informacionVivienda);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("BienesAparatos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarBienesAparatos(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        BienesAparatos bienesAparatos = new BienesAparatos(request);
        response = operacion.registrarBienesAparatos(bienesAparatos);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("Vehiculos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarVehiculos(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        Vehiculos vehiculos = new Vehiculos(request);
        response = operacion.registrarVehiculo(vehiculos);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }

    @POST
    @Path("ObjetivoApoyo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarObjetivoApoyo(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        JSONObject jsonResponse = new JSONObject();
        boolean response = false;
        ObjetivoApoyo objetivoApoyo = new ObjetivoApoyo(request);
        response = operacion.registrarObjetivoApoyo(objetivoApoyo);
        jsonResponse.put("validador", response);
        return jsonResponse.toString();
    }
/*
    @POST
    @Path("documentacion")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String uploadFile(
            @FormDataParam("uuid") String uuid,
            @FormDataParam("documento") String documento,
            @FormDataParam("descripcion") String descripcion,
            @FormDataParam("filepdf") InputStream uploadedInputStreampdf,
            @FormDataParam("filepdf") FormDataContentDisposition fileDetailpdf) throws ClassNotFoundException {

        JSONObject jsonResponse = new JSONObject();
        File directorio = new File(RUTA);
        boolean response = false;

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("Directorio ya existe ");

        }

        //se agrega la variable RUTA para refeenciar la ubicacion donde se alojara el archivo pdf.         
        String uploadedFileLocationpdf = RUTA + fileDetailpdf.getFileName();
        String serverpdf = RUTAHTTP + fileDetailpdf.getFileName();

        org.json.simple.JSONObject json = new org.json.simple.JSONObject();
        Documentacion documentacion = new Documentacion();
        documentacion.setUsuarioUuid(uuid);
        documentacion.setDocumento(documento);
        documentacion.setDescripcion(descripcion);
        response = operacion.registrarDocumentacion(documentacion);

        if (response) {
            writeFilePDF(uploadedInputStreampdf, uploadedFileLocationpdf);
            //writeFilePDF(uploadedInputStreampdf, serverpdf);
        }

        jsonResponse.put("validador", response);
        return json.toJSONString();

    }

    private void writeFilePDF(InputStream uploadedInputStream,
            String uploadedFileLocation) {
        try {
            OutputStream out = new FileOutputStream(new File(
                    uploadedFileLocation));
            int read = 0;
            byte[] bytes = new byte[1024];

            out = new FileOutputStream(new File(uploadedFileLocation));
            while ((read = uploadedInputStream.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
