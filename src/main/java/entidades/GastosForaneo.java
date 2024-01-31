package entidades;

import org.json.JSONObject;

public class GastosForaneo {

    private int gastosForaneoId;
    private String usuarioUuid;
    private String colegiatura;
    private String vivienda;
    private String libro;
    private String gastosPersonales;
    private String comida;
    private String ropa;
    private String transportacionLocal;
    private String lavanderia;
    private String transportacionForanea;
    private String gastoTotal;

    public GastosForaneo() {
        // Constructor vacío
    }

    public GastosForaneo(String usuarioUuid, String colegiatura, String vivienda, String libro,
            String gastosPersonales, String comida, String ropa, String transportacionLocal,
            String lavanderia, String transportacionForanea, String gastoTotal) {
        this.usuarioUuid = usuarioUuid;
        this.colegiatura = colegiatura;
        this.vivienda = vivienda;
        this.libro = libro;
        this.gastosPersonales = gastosPersonales;
        this.comida = comida;
        this.ropa = ropa;
        this.transportacionLocal = transportacionLocal;
        this.lavanderia = lavanderia;
        this.transportacionForanea = transportacionForanea;
        this.gastoTotal = gastoTotal;
    }

    public GastosForaneo(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.colegiatura = jsonObject.optString("colegiatura", "");
        this.vivienda = jsonObject.optString("vivienda", "");
        this.libro = jsonObject.optString("libro", "");
        this.gastosPersonales = jsonObject.optString("gastos_personales", "");
        this.comida = jsonObject.optString("comida", "");
        this.ropa = jsonObject.optString("ropa", "");
        this.transportacionLocal = jsonObject.optString("transportacion_local", "");
        this.lavanderia = jsonObject.optString("lavanderia", "");
        this.transportacionForanea = jsonObject.optString("transportacion_foranea", "");
        this.gastoTotal = jsonObject.optString("gasto_total", "");
    }

    // Getters y setters
    public int getGastosForaneoId() {
        return gastosForaneoId;
    }

    public void setGastosForaneoId(int gastosForaneoId) {
        this.gastosForaneoId = gastosForaneoId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(String colegiatura) {
        this.colegiatura = colegiatura;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getGastosPersonales() {
        return gastosPersonales;
    }

    public void setGastosPersonales(String gastosPersonales) {
        this.gastosPersonales = gastosPersonales;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getRopa() {
        return ropa;
    }

    public void setRopa(String ropa) {
        this.ropa = ropa;
    }

    public String getTransportacionLocal() {
        return transportacionLocal;
    }

    public void setTransportacionLocal(String transportacionLocal) {
        this.transportacionLocal = transportacionLocal;
    }

    public String getLavanderia() {
        return lavanderia;
    }

    public void setLavanderia(String lavanderia) {
        this.lavanderia = lavanderia;
    }

    public String getTransportacionForanea() {
        return transportacionForanea;
    }

    public void setTransportacionForanea(String transportacionForanea) {
        this.transportacionForanea = transportacionForanea;
    }

    public String getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(String gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

}
