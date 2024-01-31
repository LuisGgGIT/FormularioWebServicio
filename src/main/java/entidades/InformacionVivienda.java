package entidades;

import org.json.JSONObject;

public class InformacionVivienda {

    private int informacionViviendaId;
    private String usuarioUuid;
    private String claseSocioeconomica;
    private String tipoVivienda;
    private String numeroHabitaciones;
    private String servicios;
    private String materialCasa;
    private String zonaVivienda;
    private String perteneceComunidad;
    private String comunidadIndg;
    private String sufreDiscapacidad;
    private String discapacidad;

    public InformacionVivienda() {
        // Constructor vacío
    }

    public InformacionVivienda(String usuarioUuid, String claseSocioeconomica, String tipoVivienda,
            String numeroHabitaciones, String servicios, String materialCasa,
            String zonaVivienda, String perteneceComunidad, String comunidadIndg,
            String sufreDiscapacidad, String discapacidad) {
        this.usuarioUuid = usuarioUuid;
        this.claseSocioeconomica = claseSocioeconomica;
        this.tipoVivienda = tipoVivienda;
        this.numeroHabitaciones = numeroHabitaciones;
        this.servicios = servicios;
        this.materialCasa = materialCasa;
        this.zonaVivienda = zonaVivienda;
        this.perteneceComunidad = perteneceComunidad;
        this.comunidadIndg = comunidadIndg;
        this.sufreDiscapacidad = sufreDiscapacidad;
        this.discapacidad = discapacidad;
    }

    public InformacionVivienda(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.claseSocioeconomica = jsonObject.optString("clase_socioeconomica", "");
        this.tipoVivienda = jsonObject.optString("tipo_vivienda", "");
        this.numeroHabitaciones = jsonObject.optString("numero_habitaciones", "");
        this.servicios = jsonObject.optString("servicios", "");
        this.materialCasa = jsonObject.optString("material_casa", "");
        this.zonaVivienda = jsonObject.optString("zona_vivienda", "");
        this.perteneceComunidad = jsonObject.optString("pertenece_comunidad", "");
        this.comunidadIndg = jsonObject.optString("comunidad_indg", "");
        this.sufreDiscapacidad = jsonObject.optString("sufre_discapacidad", "");
        this.discapacidad = jsonObject.optString("discapacidad", "");
    }

    // Getters y setters
    public int getInformacionViviendaId() {
        return informacionViviendaId;
    }

    public void setInformacionViviendaId(int informacionViviendaId) {
        this.informacionViviendaId = informacionViviendaId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getClaseSocioeconomica() {
        return claseSocioeconomica;
    }

    public void setClaseSocioeconomica(String claseSocioeconomica) {
        this.claseSocioeconomica = claseSocioeconomica;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public String getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(String numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getMaterialCasa() {
        return materialCasa;
    }

    public void setMaterialCasa(String materialCasa) {
        this.materialCasa = materialCasa;
    }

    public String getZonaVivienda() {
        return zonaVivienda;
    }

    public void setZonaVivienda(String zonaVivienda) {
        this.zonaVivienda = zonaVivienda;
    }

    public String getPerteneceComunidad() {
        return perteneceComunidad;
    }

    public void setPerteneceComunidad(String perteneceComunidad) {
        this.perteneceComunidad = perteneceComunidad;
    }

    public String getComunidadIndg() {
        return comunidadIndg;
    }

    public void setComunidadIndg(String comunidadIndg) {
        this.comunidadIndg = comunidadIndg;
    }

    public String getSufreDiscapacidad() {
        return sufreDiscapacidad;
    }

    public void setSufreDiscapacidad(String sufreDiscapacidad) {
        this.sufreDiscapacidad = sufreDiscapacidad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

}
