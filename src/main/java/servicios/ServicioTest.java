
package servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;

@Path("servicioTest")
public class ServicioTest {

    @GET
    @Path("test1")
    @Produces(MediaType.APPLICATION_JSON)
    public String TestServicio( ) {
        
        JSONObject json = new JSONObject();
        json.put("Test","Exito!");
        
        return json.toJSONString();
    }
    
}
