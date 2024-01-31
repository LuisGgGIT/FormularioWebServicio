package entidades;

import org.json.JSONObject;

public class TrabajoSolicitante {

    private int trabajoSolicitanteId;
    private String usuarioUuid;
    private String trabajaActualmente;
    private String empresa;
    private String cargoPuesto;
    private String tiempoLaborando;
    private String telefonoEmpresa;
    private String domicilioEmpresa;

    public TrabajoSolicitante() {
        // Constructor vacío
    }

    public TrabajoSolicitante(String usuarioUuid, String trabajaActualmente, String empresa,
            String cargoPuesto, String tiempoLaborando, String telefonoEmpresa,
            String domicilioEmpresa) {
        this.usuarioUuid = usuarioUuid;
        this.trabajaActualmente = trabajaActualmente;
        this.empresa = empresa;
        this.cargoPuesto = cargoPuesto;
        this.tiempoLaborando = tiempoLaborando;
        this.telefonoEmpresa = telefonoEmpresa;
        this.domicilioEmpresa = domicilioEmpresa;
    }

    public TrabajoSolicitante(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.trabajaActualmente = jsonObject.optString("trabaja_actualmente", "");
        this.empresa = jsonObject.optString("empresa", "");
        this.cargoPuesto = jsonObject.optString("cargo_puesto", "");
        this.tiempoLaborando = jsonObject.optString("tiempo_laborando", "");
        this.telefonoEmpresa = jsonObject.optString("telefono_empresa", "");
        this.domicilioEmpresa = jsonObject.optString("domicilio_empresa", "");
    }

    // Getters y setters
    public int getTrabajoSolicitanteId() {
        return trabajoSolicitanteId;
    }

    public void setTrabajoSolicitanteId(int trabajoSolicitanteId) {
        this.trabajoSolicitanteId = trabajoSolicitanteId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getTrabajaActualmente() {
        return trabajaActualmente;
    }

    public void setTrabajaActualmente(String trabajaActualmente) {
        this.trabajaActualmente = trabajaActualmente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargoPuesto() {
        return cargoPuesto;
    }

    public void setCargoPuesto(String cargoPuesto) {
        this.cargoPuesto = cargoPuesto;
    }

    public String getTiempoLaborando() {
        return tiempoLaborando;
    }

    public void setTiempoLaborando(String tiempoLaborando) {
        this.tiempoLaborando = tiempoLaborando;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDomicilioEmpresa() {
        return domicilioEmpresa;
    }

    public void setDomicilioEmpresa(String domicilioEmpresa) {
        this.domicilioEmpresa = domicilioEmpresa;
    }

}
