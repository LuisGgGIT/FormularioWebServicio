package entidades;

import org.json.JSONObject;

public class ProgramaSocial {
    private int programaSocialId;
    private String usuarioUuid;
    private String inscritoProgramasSociales;
    private String programasSocialesEspecifica;
    private String cuentaConBeca;
    private String tipoBeca;
    private String institutoOtorga;
    private String cantidadRecibida;

    public ProgramaSocial() {
        // Constructor vacío
    }

    public ProgramaSocial(String usuarioUuid, String inscritoProgramasSociales, String programasSocialesEspecifica,
                          String cuentaConBeca, String tipoBeca, String institutoOtorga, String cantidadRecibida) {
        this.usuarioUuid = usuarioUuid;
        this.inscritoProgramasSociales = inscritoProgramasSociales;
        this.programasSocialesEspecifica = programasSocialesEspecifica;
        this.cuentaConBeca = cuentaConBeca;
        this.tipoBeca = tipoBeca;
        this.institutoOtorga = institutoOtorga;
        this.cantidadRecibida = cantidadRecibida;
    }

    public ProgramaSocial(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.inscritoProgramasSociales = jsonObject.optString("inscrito_programas_sociales", "");
        this.programasSocialesEspecifica = jsonObject.optString("programas_sociales_especifica", "");
        this.cuentaConBeca = jsonObject.optString("cuenta_con_beca", "");
        this.tipoBeca = jsonObject.optString("tipo_beca", "");
        this.institutoOtorga = jsonObject.optString("instituto_otorga", "");
        this.cantidadRecibida = jsonObject.optString("cantidad_recibida", "");
    }

    public int getProgramaSocialId() {
        return programaSocialId;
    }

    public void setProgramaSocialId(int programaSocialId) {
        this.programaSocialId = programaSocialId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getInscritoProgramasSociales() {
        return inscritoProgramasSociales;
    }

    public void setInscritoProgramasSociales(String inscritoProgramasSociales) {
        this.inscritoProgramasSociales = inscritoProgramasSociales;
    }

    public String getProgramasSocialesEspecifica() {
        return programasSocialesEspecifica;
    }

    public void setProgramasSocialesEspecifica(String programasSocialesEspecifica) {
        this.programasSocialesEspecifica = programasSocialesEspecifica;
    }

    public String getCuentaConBeca() {
        return cuentaConBeca;
    }

    public void setCuentaConBeca(String cuentaConBeca) {
        this.cuentaConBeca = cuentaConBeca;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }

    public String getInstitutoOtorga() {
        return institutoOtorga;
    }

    public void setInstitutoOtorga(String institutoOtorga) {
        this.institutoOtorga = institutoOtorga;
    }

    public String getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(String cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }


}
