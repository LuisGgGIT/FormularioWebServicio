package servicios;

import entidades.Usuario;
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
    
}
