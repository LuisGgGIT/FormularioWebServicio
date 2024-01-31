package servicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.TrabajoSolicitante;
import entidades.Usuario;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
import recursos.OperacionesBuscar;

@Path("buscar")
public class ServicioBucar {

    OperacionesBuscar operacion = new OperacionesBuscar();

    @POST
    @Path("login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(String jsonRequest) {
        JSONObject request = new JSONObject(jsonRequest);
        Usuario acceso = new Usuario();

        Usuario usuario = new Usuario();
        usuario.setEmail((String) request.get("email"));
        usuario.setContrasenia((String) request.get("contrasenia"));

        acceso = operacion.BuscarUsuarioEmailPas(usuario);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }

    @GET
    @Path("usuariouuid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarUsuarioid(@QueryParam("usuario_uuid") String usuario_uuid) {

        Usuario acceso = operacion.BuscarUsuarioId(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }
}
