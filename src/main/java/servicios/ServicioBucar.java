package servicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.Usuario;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import recursos.OperacionesBuscar;

@Path("buscar")
public class ServicioBucar {

    OperacionesBuscar operacion = new OperacionesBuscar();

    @GET
    @Path("usuariouuid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarUsuarioid(@QueryParam("usuario_uuid") String usuario_uuid) {

        Usuario acceso = operacion.BuscarUsuarioId(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }
}
