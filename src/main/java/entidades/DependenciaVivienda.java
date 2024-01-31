package entidades;

import org.json.JSONObject;

public class DependenciaVivienda {

    private int dependenciaViviendaId;
    private String usuarioUuid;
    private String dependeEconomicamente;
    private String parentescoTutores;
    private String viveCon;

    public DependenciaVivienda() {
        // Constructor vacío
    }

    public DependenciaVivienda(String usuarioUuid, String dependeEconomicamente, String parentescoTutores, String viveCon) {
        this.usuarioUuid = usuarioUuid;
        this.dependeEconomicamente = dependeEconomicamente;
        this.parentescoTutores = parentescoTutores;
        this.viveCon = viveCon;
    }

    public DependenciaVivienda(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.dependeEconomicamente = jsonObject.optString("depende_economicamente", "");
        this.parentescoTutores = jsonObject.optString("parentesco_tutores", "");
        this.viveCon = jsonObject.optString("vive_con", "");
    }

    // Getters y setters

    public int getDependenciaViviendaId() {
        return dependenciaViviendaId;
    }

    public void setDependenciaViviendaId(int dependenciaViviendaId) {
        this.dependenciaViviendaId = dependenciaViviendaId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getDependeEconomicamente() {
        return dependeEconomicamente;
    }

    public void setDependeEconomicamente(String dependeEconomicamente) {
        this.dependeEconomicamente = dependeEconomicamente;
    }

    public String getParentescoTutores() {
        return parentescoTutores;
    }

    public void setParentescoTutores(String parentescoTutores) {
        this.parentescoTutores = parentescoTutores;
    }

    public String getViveCon() {
        return viveCon;
    }

    public void setViveCon(String viveCon) {
        this.viveCon = viveCon;
    }
   


}
