package servicios;

import entidades.Solicitud;
import entidades.Usuario;
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

    @POST
    @Path("usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarUsuario(String usuariosJsonrequest) {
        JSONObject jsonrequest = new JSONObject(usuariosJsonrequest);
        JSONObject jsonresponse = new JSONObject();
        boolean registrarUsuario = false;
        
        String email = (String) jsonrequest.get("email");
        String contrasenia = (String) jsonrequest.get("contrasenia");
        String curp = (String) jsonrequest.get("curp");
        String edad = (String) jsonrequest.get("edad");
        String fecha_nacimiento = (String) jsonrequest.get("fecha_nacimiento");
        
        Usuario usuariorequest = new Usuario(email, contrasenia, curp, edad, fecha_nacimiento);
        
        registrarUsuario = operacion.registrarUsuario(usuariorequest);
        jsonresponse.put("validador", registrarUsuario);
        return jsonresponse.toString();
    }
    
    @POST
    @Path("solicitud")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrarSolicitud(String solicitudJsonrequest) {
        JSONObject jsonrequest = new JSONObject(solicitudJsonrequest);
        JSONObject jsonresponse = new JSONObject();
        boolean registrarsolicitud = false;
        
        String usuario_uuid = (String) jsonrequest.get("usuario_uuid");
        String estatus = (String) jsonrequest.get("estatus");
        
        Solicitud solicitudrequest = new Solicitud(usuario_uuid, estatus);
        
        registrarsolicitud = operacion.registrarSolicitud(solicitudrequest);
        jsonresponse.put("validador", registrarsolicitud);
        return jsonresponse.toString();
    }

}
