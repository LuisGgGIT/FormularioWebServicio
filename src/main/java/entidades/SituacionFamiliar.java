package entidades;

import org.json.JSONObject;

public class SituacionFamiliar {

    private int situacionFamiliarId;
    private String usuarioUuid;
    private String cantidadHermanos;
    private String vivenDomicilio;
    private String cantidadDomicilio;
    private String personasDependenEcon;

    public SituacionFamiliar() {
        // Constructor vacío
    }

    public SituacionFamiliar(String usuarioUuid, String cantidadHermanos, String vivenDomicilio,
            String cantidadDomicilio, String personasDependenEcon) {
        this.usuarioUuid = usuarioUuid;
        this.cantidadHermanos = cantidadHermanos;
        this.vivenDomicilio = vivenDomicilio;
        this.cantidadDomicilio = cantidadDomicilio;
        this.personasDependenEcon = personasDependenEcon;
    }

    public SituacionFamiliar(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.cantidadHermanos = jsonObject.optString("cantidad_hermanos", "");
        this.vivenDomicilio = jsonObject.optString("viven_domicilio", "");
        this.cantidadDomicilio = jsonObject.optString("cantidad_domicilio", "");
        this.personasDependenEcon = jsonObject.optString("personas_dependen_econ", "");
    }

    // Getters y setters
    public int getSituacionFamiliarId() {
        return situacionFamiliarId;
    }

    public void setSituacionFamiliarId(int situacionFamiliarId) {
        this.situacionFamiliarId = situacionFamiliarId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getCantidadHermanos() {
        return cantidadHermanos;
    }

    public void setCantidadHermanos(String cantidadHermanos) {
        this.cantidadHermanos = cantidadHermanos;
    }

    public String getVivenDomicilio() {
        return vivenDomicilio;
    }

    public void setVivenDomicilio(String vivenDomicilio) {
        this.vivenDomicilio = vivenDomicilio;
    }

    public String getCantidadDomicilio() {
        return cantidadDomicilio;
    }

    public void setCantidadDomicilio(String cantidadDomicilio) {
        this.cantidadDomicilio = cantidadDomicilio;
    }

    public String getPersonasDependenEcon() {
        return personasDependenEcon;
    }

    public void setPersonasDependenEcon(String personasDependenEcon) {
        this.personasDependenEcon = personasDependenEcon;
    }

}
