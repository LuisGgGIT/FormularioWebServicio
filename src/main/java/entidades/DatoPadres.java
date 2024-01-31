package entidades;

import org.json.JSONObject;

public class DatoPadres {

    private int datoPadreId;
    private String usuarioUuid;
    private String vivenPadres;
    private String edadPadre;
    private String edadMadre;
    private String estadoCivilPadres;
    private String vivenJuntos;
    private String escolaridadPadre;
    private String escolaridadMadre;

    public DatoPadres() {
        // Constructor vacío
    }

    public DatoPadres(String usuarioUuid, String vivenPadres, String edadPadre, String edadMadre,
            String estadoCivilPadres, String vivenJuntos, String escolaridadPadre,
            String escolaridadMadre) {
        this.usuarioUuid = usuarioUuid;
        this.vivenPadres = vivenPadres;
        this.edadPadre = edadPadre;
        this.edadMadre = edadMadre;
        this.estadoCivilPadres = estadoCivilPadres;
        this.vivenJuntos = vivenJuntos;
        this.escolaridadPadre = escolaridadPadre;
        this.escolaridadMadre = escolaridadMadre;
    }

    public DatoPadres(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.vivenPadres = jsonObject.optString("viven_padres", "");
        this.edadPadre = jsonObject.optString("edad_padre", "");
        this.edadMadre = jsonObject.optString("edad_madre", "");
        this.estadoCivilPadres = jsonObject.optString("estado_civil_padres", "");
        this.vivenJuntos = jsonObject.optString("viven_juntos", "");
        this.escolaridadPadre = jsonObject.optString("escolaridad_padre", "");
        this.escolaridadMadre = jsonObject.optString("escolaridad_madre", "");
    }

    // Getters y setters
    public int getDatoPadreId() {
        return datoPadreId;
    }

    public void setDatoPadreId(int datoPadreId) {
        this.datoPadreId = datoPadreId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getVivenPadres() {
        return vivenPadres;
    }

    public void setVivenPadres(String vivenPadres) {
        this.vivenPadres = vivenPadres;
    }

    public String getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(String edadPadre) {
        this.edadPadre = edadPadre;
    }

    public String getEdadMadre() {
        return edadMadre;
    }

    public void setEdadMadre(String edadMadre) {
        this.edadMadre = edadMadre;
    }

    public String getEstadoCivilPadres() {
        return estadoCivilPadres;
    }

    public void setEstadoCivilPadres(String estadoCivilPadres) {
        this.estadoCivilPadres = estadoCivilPadres;
    }

    public String getVivenJuntos() {
        return vivenJuntos;
    }

    public void setVivenJuntos(String vivenJuntos) {
        this.vivenJuntos = vivenJuntos;
    }

    public String getEscolaridadPadre() {
        return escolaridadPadre;
    }

    public void setEscolaridadPadre(String escolaridadPadre) {
        this.escolaridadPadre = escolaridadPadre;
    }

    public String getEscolaridadMadre() {
        return escolaridadMadre;
    }

    public void setEscolaridadMadre(String escolaridadMadre) {
        this.escolaridadMadre = escolaridadMadre;
    }

}
