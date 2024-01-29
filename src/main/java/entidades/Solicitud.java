package entidades;

public class Solicitud {
    private int solicitud_id;
    private String usuario_uuid;
    private String fecha_inicio;
    private String fecha_fin; 
    private String estatus; 

    public Solicitud(String usuario_uuid, String estatus) {
        this.usuario_uuid = usuario_uuid;
        this.estatus = estatus;
    }

    
    public Solicitud(String usuario_uuid, String fecha_inicio, String fecha_fin, String estatus) {
        this.usuario_uuid = usuario_uuid;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estatus = estatus;
    }

    public int getSolicitud_id() {
        return solicitud_id;
    }

    public void setSolicitud_id(int solicitud_id) {
        this.solicitud_id = solicitud_id;
    }

    public String getUsuario_uuid() {
        return usuario_uuid;
    }

    public void setUsuario_uuid(String usuario_uuid) {
        this.usuario_uuid = usuario_uuid;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
    
}
