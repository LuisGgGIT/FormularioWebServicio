package entidades;

import org.json.JSONObject;

public class HabitanteCasa {

    private int habitanteCasaId;
    private String usuarioUuid;
    private String nombreCompleto;
    private String edad;
    private String parentesco;
    private String ocupacion;
    private String estudioMaximo;

    public HabitanteCasa() {
        // Constructor vacío
    }

    public HabitanteCasa(String usuarioUuid, String nombreCompleto, String edad, String parentesco,
            String ocupacion, String estudioMaximo) {
        this.usuarioUuid = usuarioUuid;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.parentesco = parentesco;
        this.ocupacion = ocupacion;
        this.estudioMaximo = estudioMaximo;
    }

    public HabitanteCasa(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.nombreCompleto = jsonObject.optString("nombre_completo", "");
        this.edad = jsonObject.optString("edad", "");
        this.parentesco = jsonObject.optString("parentesco", "");
        this.ocupacion = jsonObject.optString("ocupacion", "");
        this.estudioMaximo = jsonObject.optString("estudio_maximo", "");
    }

    // Getters y setters
    public int getHabitanteCasaId() {
        return habitanteCasaId;
    }

    public void setHabitanteCasaId(int habitanteCasaId) {
        this.habitanteCasaId = habitanteCasaId;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstudioMaximo() {
        return estudioMaximo;
    }

    public void setEstudioMaximo(String estudioMaximo) {
        this.estudioMaximo = estudioMaximo;
    }

}
