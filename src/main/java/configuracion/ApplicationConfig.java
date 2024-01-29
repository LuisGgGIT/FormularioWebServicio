package configuracion;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("solicitud")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(servicios.ServicioBucar.class);
        resources.add(servicios.ServicioEditar.class);
        resources.add(servicios.ServicioEliminar.class);
        resources.add(servicios.ServicioLista.class);
        resources.add(servicios.ServicioRegistrar.class);
        resources.add(servicios.ServicioTest.class);
    }
    
}
