package entidades;

import org.json.JSONObject;

public class EstudioFamiliar {
    private int estudioFamiliarId;
    private String usuarioUuid;
    private String nombreCompleto;
    private String nivelEstudios;
    private String ocupacion;

    public EstudioFamiliar() {
        // Constructor vacío
    }

    public EstudioFamiliar(String usuarioUuid, String nombreCompleto, String nivelEstudios, String ocupacion) {
        this.usuarioUuid = usuarioUuid;
        this.nombreCompleto = nombreCompleto;
        this.nivelEstudios = nivelEstudios;
        this.ocupacion = ocupacion;
    }

    public EstudioFamiliar(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.nombreCompleto = jsonObject.optString("nombre_completo", "");
        this.nivelEstudios = jsonObject.optString("nivel_estudios", "");
        this.ocupacion = jsonObject.optString("ocupacion", "");
    }

    // Getters y setters

    public int getEstudioFamiliarId() {
        return estudioFamiliarId;
    }

    public void setEstudioFamiliarId(int estudioFamiliarId) {
        this.estudioFamiliarId = estudioFamiliarId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
}

