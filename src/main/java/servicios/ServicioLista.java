package servicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.EstudioFamiliar;
import entidades.HabitanteCasa;
import entidades.MunicipiosCat;
import entidades.OcupacionFamiliar;
import entidades.Usuario;
import entidades.Vehiculos;
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

    @GET
    @Path("ocupacionfamiliar")
    @Produces(MediaType.APPLICATION_JSON)
    public String listaOcupacionFamiliar(@QueryParam("usuario_uuid") String usuario_uuid) {

        List<OcupacionFamiliar> lista = operacion.listaOcupacionFamiliar(usuario_uuid);
        Gson gson = new GsonBuilder().create();
        return gson.toJson(lista);
    }

    @GET
    @Path("habitantecasa")
    @Produces(MediaType.APPLICATION_JSON)
    public String listaHabitanteCasa(@QueryParam("usuario_uuid") String usuario_uuid) {

        List<HabitanteCasa> lista = operacion.listaHabitanteCasa(usuario_uuid);
        Gson gson = new GsonBuilder().create();
        return gson.toJson(lista);
    }

    @GET
    @Path("estudiofamiliar")
    @Produces(MediaType.APPLICATION_JSON)
    public String listaEstudioFamiliar(@QueryParam("usuario_uuid") String usuario_uuid) {

        List<EstudioFamiliar> lista = operacion.listaEstudioFamiliar(usuario_uuid);
        Gson gson = new GsonBuilder().create();
        return gson.toJson(lista);
    }

    @GET
    @Path("vehiculos")
    @Produces(MediaType.APPLICATION_JSON)
    public String listaVehiculos(@QueryParam("usuario_uuid") String usuario_uuid) {

        List<Vehiculos> lista = operacion.listaVehiculos(usuario_uuid);
        Gson gson = new GsonBuilder().create();
        return gson.toJson(lista);
    }

    @GET
    @Path("municipios")
    @Produces(MediaType.APPLICATION_JSON)
    public String listaMunicipios() {

        List<MunicipiosCat> lista = operacion.listaMunicipios();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(lista);
    }

}
