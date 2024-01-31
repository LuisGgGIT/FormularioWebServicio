package entidades;

import org.json.JSONObject;

public class IngresoFamiliar {

    private int ingresoFamiliarId;
    private String usuarioUuid;
    private String regimenSeguridadSocial;
    private String personasTrabajando;
    private String personasAportanGasto;
    private String ingresoPropio;
    private String ingresoPadreTutor;
    private String ingresoConyuge;
    private String ingresoMadre;
    private String ingresoHermanos;
    private String otrosIngresos;
    private String totalIngresos;

    public IngresoFamiliar() {
        // Constructor vacío
    }

    public IngresoFamiliar(String usuarioUuid, String regimenSeguridadSocial, String personasTrabajando,
            String personasAportanGasto, String ingresoPropio, String ingresoPadreTutor,
            String ingresoConyuge, String ingresoMadre, String ingresoHermanos,
            String otrosIngresos, String totalIngresos) {
        this.usuarioUuid = usuarioUuid;
        this.regimenSeguridadSocial = regimenSeguridadSocial;
        this.personasTrabajando = personasTrabajando;
        this.personasAportanGasto = personasAportanGasto;
        this.ingresoPropio = ingresoPropio;
        this.ingresoPadreTutor = ingresoPadreTutor;
        this.ingresoConyuge = ingresoConyuge;
        this.ingresoMadre = ingresoMadre;
        this.ingresoHermanos = ingresoHermanos;
        this.otrosIngresos = otrosIngresos;
        this.totalIngresos = totalIngresos;
    }

    public IngresoFamiliar(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.regimenSeguridadSocial = jsonObject.optString("regimen_seguridad_social", "");
        this.personasTrabajando = jsonObject.optString("personas_trabajando", "");
        this.personasAportanGasto = jsonObject.optString("personas_aportan_gasto", "");
        this.ingresoPropio = jsonObject.optString("ingreso_propio", "");
        this.ingresoPadreTutor = jsonObject.optString("ingreso_padre_tutor", "");
        this.ingresoConyuge = jsonObject.optString("ingreso_conyuge", "");
        this.ingresoMadre = jsonObject.optString("ingreso_madre", "");
        this.ingresoHermanos = jsonObject.optString("ingreso_hermanos", "");
        this.otrosIngresos = jsonObject.optString("otros_ingresos", "");
        this.totalIngresos = jsonObject.optString("total_ingresos", "");
    }

    public int getIngresoFamiliarId() {
        return ingresoFamiliarId;
    }

    public void setIngresoFamiliarId(int ingresoFamiliarId) {
        this.ingresoFamiliarId = ingresoFamiliarId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getRegimenSeguridadSocial() {
        return regimenSeguridadSocial;
    }

    public void setRegimenSeguridadSocial(String regimenSeguridadSocial) {
        this.regimenSeguridadSocial = regimenSeguridadSocial;
    }

    public String getPersonasTrabajando() {
        return personasTrabajando;
    }

    public void setPersonasTrabajando(String personasTrabajando) {
        this.personasTrabajando = personasTrabajando;
    }

    public String getPersonasAportanGasto() {
        return personasAportanGasto;
    }

    public void setPersonasAportanGasto(String personasAportanGasto) {
        this.personasAportanGasto = personasAportanGasto;
    }

    public String getIngresoPropio() {
        return ingresoPropio;
    }

    public void setIngresoPropio(String ingresoPropio) {
        this.ingresoPropio = ingresoPropio;
    }

    public String getIngresoPadreTutor() {
        return ingresoPadreTutor;
    }

    public void setIngresoPadreTutor(String ingresoPadreTutor) {
        this.ingresoPadreTutor = ingresoPadreTutor;
    }

    public String getIngresoConyuge() {
        return ingresoConyuge;
    }

    public void setIngresoConyuge(String ingresoConyuge) {
        this.ingresoConyuge = ingresoConyuge;
    }

    public String getIngresoMadre() {
        return ingresoMadre;
    }

    public void setIngresoMadre(String ingresoMadre) {
        this.ingresoMadre = ingresoMadre;
    }

    public String getIngresoHermanos() {
        return ingresoHermanos;
    }

    public void setIngresoHermanos(String ingresoHermanos) {
        this.ingresoHermanos = ingresoHermanos;
    }

    public String getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(String otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public String getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(String totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

}
