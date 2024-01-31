package entidades;

import org.json.JSONObject;

public class InstitucionEducativa {
    private int institucionEducativaId;
    private String usuarioUuid;
    private String nivelEstudios;
    private String gradoEscolar;
    private String nombreInstitucion;
    private String promedioAnterior;

    public InstitucionEducativa() {
        // Constructor vacío
    }

    public InstitucionEducativa(String usuarioUuid, String nivelEstudios, String gradoEscolar, String nombreInstitucion, String promedioAnterior) {
        this.usuarioUuid = usuarioUuid;
        this.nivelEstudios = nivelEstudios;
        this.gradoEscolar = gradoEscolar;
        this.nombreInstitucion = nombreInstitucion;
        this.promedioAnterior = promedioAnterior;
    }

    public InstitucionEducativa(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.nivelEstudios = jsonObject.optString("nivel_estudios", "");
        this.gradoEscolar = jsonObject.optString("grado_escolar", "");
        this.nombreInstitucion = jsonObject.optString("nombre_institucion", "");
        this.promedioAnterior = jsonObject.optString("promedio_anterior", "");
    }

     
    // Getters y setters
    public int getInstitucionEducativaId() {
        return institucionEducativaId;
    }

    public void setInstitucionEducativaId(int institucionEducativaId) {
        this.institucionEducativaId = institucionEducativaId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public String getGradoEscolar() {
        return gradoEscolar;
    }

    public void setGradoEscolar(String gradoEscolar) {
        this.gradoEscolar = gradoEscolar;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getPromedioAnterior() {
        return promedioAnterior;
    }

    public void setPromedioAnterior(String promedioAnterior) {
        this.promedioAnterior = promedioAnterior;
    }
}
