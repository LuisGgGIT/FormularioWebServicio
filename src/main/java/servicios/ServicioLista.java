package servicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.Usuario;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import recursos.Herramientas;
import recursos.OperacionesLista;

@Path("lista")
public class ServicioLista {

    OperacionesLista operacion = new OperacionesLista();
    Herramientas herramienta = new Herramientas();

    @GET
    @Path("usuario")
    @Produces(MediaType.APPLICATION_JSON)
    public String lista_Usuario() {
        
        List<Usuario> listaUsuario = operacion.listaUsuario();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(listaUsuario);
    }

}
