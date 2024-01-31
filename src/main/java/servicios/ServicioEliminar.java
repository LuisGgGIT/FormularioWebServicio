package servicios;

import entidades.Usuario;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import recursos.Herramientas;
import recursos.OperacionesEditar;
import recursos.OperacionesEliminar;

@Path("eliminar")
public class ServicioEliminar {

    OperacionesEliminar operacion = new OperacionesEliminar();
    Herramientas herramienta = new Herramientas();

    @POST
    @Path("usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String eliminarUsuario(String usuariosJsonrequest) {
        org.json.JSONObject jsonrequest = new org.json.JSONObject(usuariosJsonrequest);
        org.json.JSONObject jsonresponse = new org.json.JSONObject();
        boolean editarUsuario = false;

        String usuario_uuid = (String) jsonrequest.get("usuario_uuid");
        Usuario usuariorequest = new Usuario(usuario_uuid);

        editarUsuario = operacion.eliminarUsuario(usuariorequest);
        jsonresponse.put("validador", editarUsuario);
        return jsonresponse.toString();
    }

}
