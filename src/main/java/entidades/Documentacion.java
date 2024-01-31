package entidades;

import org.json.JSONObject;

public class Documentacion {

    private int documentacionId;
    private String usuarioUuid;
    private String documento;
    private String descripcion;

    public Documentacion() {
        // Constructor vacío
    }

    public Documentacion(String usuarioUuid, String documento, String descripcion) {
        this.usuarioUuid = usuarioUuid;
        this.documento = documento;
        this.descripcion = descripcion;
    }

    public Documentacion(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.documento = jsonObject.optString("documento", "");
        this.descripcion = jsonObject.optString("descripcion", "");
    }

    // Getters y setters

    public int getDocumentacionId() {
        return documentacionId;
    }

    public void setDocumentacionId(int documentacionId) {
        this.documentacionId = documentacionId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
