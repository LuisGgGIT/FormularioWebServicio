package entidades;

import org.json.JSONObject;

public class BienesAparatos {

    private int bienesAparatosId;
    private String usuarioUuid;
    private String aparato;
    private String estatus;

    public BienesAparatos() {
        // Constructor vacío
    }

    public BienesAparatos(String usuarioUuid, String aparato, String estatus) {
        this.usuarioUuid = usuarioUuid;
        this.aparato = aparato;
        this.estatus = estatus;
    }

    public BienesAparatos(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.aparato = jsonObject.optString("Aparato", "");
        this.estatus = jsonObject.optString("Estatus", "");
    }

    // Getters y setters
    public int getBienesAparatosId() {
        return bienesAparatosId;
    }

    public void setBienesAparatosId(int bienesAparatosId) {
        this.bienesAparatosId = bienesAparatosId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getAparato() {
        return aparato;
    }

    public void setAparato(String aparato) {
        this.aparato = aparato;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}
