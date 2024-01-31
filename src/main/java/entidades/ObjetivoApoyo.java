package entidades;

import org.json.JSONObject;

public class ObjetivoApoyo {

    private int objetivoApoyoId;
    private String usuarioUuid;
    private String objetivoApoyo;

    public ObjetivoApoyo() {
        // Constructor vacío
    }

    public ObjetivoApoyo(String usuarioUuid, String objetivoApoyo) {
        this.usuarioUuid = usuarioUuid;
        this.objetivoApoyo = objetivoApoyo;
    }

    public ObjetivoApoyo(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.objetivoApoyo = jsonObject.optString("objetivo_apoyo", "");
    }

    // Getters y setters
    public int getObjetivoApoyoId() {
        return objetivoApoyoId;
    }

    public void setObjetivoApoyoId(int objetivoApoyoId) {
        this.objetivoApoyoId = objetivoApoyoId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getObjetivoApoyo() {
        return objetivoApoyo;
    }

    public void setObjetivoApoyo(String objetivoApoyo) {
        this.objetivoApoyo = objetivoApoyo;
    }

}
