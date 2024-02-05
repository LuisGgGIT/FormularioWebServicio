package servicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.InfoFamilia;
import entidades.InfoPersonal;
import entidades.InfoVivienda;
import entidades.ObjetivoApoyo;
import entidades.Solicitud;
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
    @Path("solicitud")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarSolicituduuid(@QueryParam("usuario_uuid") String usuario_uuid) {

        Solicitud acceso = operacion.BuscarSolicituduuid(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }

    @GET
    @Path("infopersonal")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarInfoPersonaluuid(@QueryParam("usuario_uuid") String usuario_uuid) {

        InfoPersonal acceso = operacion.BuscarInfoPersonaluuid(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }

    @GET
    @Path("infofamilia")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarInfoFamiliauuid(@QueryParam("usuario_uuid") String usuario_uuid) {

        InfoFamilia acceso = operacion.BuscarInfoFamiliauuid(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }

    @GET
    @Path("infovivienda")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarInfoViviendauuid(@QueryParam("usuario_uuid") String usuario_uuid) {

        InfoVivienda acceso = operacion.BuscarInfoViviendauuid(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }

    @GET
    @Path("objetivoapoyo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarObjetivoApoyouuid(@QueryParam("usuario_uuid") String usuario_uuid) {

        ObjetivoApoyo acceso = operacion.BuscarObjetivoApoyouuid(usuario_uuid);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        return Response.ok(gson.toJson(acceso)).build();
    }
}
