package entidades;

import org.json.JSONObject;

public class OcupacionFamiliar {

    private int ocupacionFamiliarId;
    private String usuarioUuid;
    private String tipoFamiliar;
    private String nombre;
    private String lugarTrabajo;
    private String cargoPuesto;
    private String tiempoLaborando;
    private String telefonoEmpresa;
    private String domicilioEmpresa;
    private String edad;
    private String escolaridad;
    private String parentesco;
    private String ingresoMensual;

    public OcupacionFamiliar() {
        // Constructor vacío
    }

    public OcupacionFamiliar(String usuarioUuid, String tipoFamiliar, String nombre, String lugarTrabajo,
            String cargoPuesto, String tiempoLaborando, String telefonoEmpresa,
            String domicilioEmpresa, String edad, String escolaridad, String parentesco,
            String ingresoMensual) {
        this.usuarioUuid = usuarioUuid;
        this.tipoFamiliar = tipoFamiliar;
        this.nombre = nombre;
        this.lugarTrabajo = lugarTrabajo;
        this.cargoPuesto = cargoPuesto;
        this.tiempoLaborando = tiempoLaborando;
        this.telefonoEmpresa = telefonoEmpresa;
        this.domicilioEmpresa = domicilioEmpresa;
        this.edad = edad;
        this.escolaridad = escolaridad;
        this.parentesco = parentesco;
        this.ingresoMensual = ingresoMensual;
    }

    public OcupacionFamiliar(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.tipoFamiliar = jsonObject.optString("tipo_familiar", "");
        this.nombre = jsonObject.optString("nombre", "");
        this.lugarTrabajo = jsonObject.optString("lugar_trabajo", "");
        this.cargoPuesto = jsonObject.optString("cargo_puesto", "");
        this.tiempoLaborando = jsonObject.optString("tiempo_laborando", "");
        this.telefonoEmpresa = jsonObject.optString("telefono_empresa", "");
        this.domicilioEmpresa = jsonObject.optString("domicilio_empresa", "");
        this.edad = jsonObject.optString("edad", "");
        this.escolaridad = jsonObject.optString("escolaridad", "");
        this.parentesco = jsonObject.optString("parentesco", "");
        this.ingresoMensual = jsonObject.optString("ingreso_mensual", "");
    }

    // Getters y setters
    public int getOcupacionFamiliarId() {
        return ocupacionFamiliarId;
    }

    public void setOcupacionFamiliarId(int ocupacionFamiliarId) {
        this.ocupacionFamiliarId = ocupacionFamiliarId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getTipoFamiliar() {
        return tipoFamiliar;
    }

    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getCargoPuesto() {
        return cargoPuesto;
    }

    public void setCargoPuesto(String cargoPuesto) {
        this.cargoPuesto = cargoPuesto;
    }

    public String getTiempoLaborando() {
        return tiempoLaborando;
    }

    public void setTiempoLaborando(String tiempoLaborando) {
        this.tiempoLaborando = tiempoLaborando;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDomicilioEmpresa() {
        return domicilioEmpresa;
    }

    public void setDomicilioEmpresa(String domicilioEmpresa) {
        this.domicilioEmpresa = domicilioEmpresa;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(String ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

}
