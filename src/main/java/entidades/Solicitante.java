package entidades;

import org.json.JSONObject;

public class Solicitante {

    private int solicitante_id;
    private String usuarioUuid;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombreCompleto;
    private String calle;
    private String numero;
    private String colonia;
    private String poblacion;
    private String municipio;
    private String estado;
    private String codigoPostal;
    private String telCasa;
    private String telCelular;

    public Solicitante() {
    }

    public Solicitante(String usuarioUuid, String nombre, String apellidoPaterno, String apellidoMaterno, String nombreCompleto, String calle, String numero, String colonia, String poblacion, String municipio, String estado, String codigoPostal, String telCasa, String telCelular) {
        this.usuarioUuid = usuarioUuid;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombreCompleto = nombreCompleto;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.poblacion = poblacion;
        this.municipio = municipio;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.telCasa = telCasa;
        this.telCelular = telCelular;
    }

    public Solicitante(JSONObject jsonRequest) {
        this.usuarioUuid = (String) jsonRequest.get("usuario_uuid");
        this.nombre = (String) jsonRequest.get("nombre");
        this.apellidoPaterno = (String) jsonRequest.get("apellido_paterno");
        this.apellidoMaterno = (String) jsonRequest.get("apellido_materno");
        this.nombreCompleto = (String) jsonRequest.get("nombre_completo");
        this.calle = (String) jsonRequest.get("calle");
        this.numero = (String) jsonRequest.get("numero");
        this.colonia = (String) jsonRequest.get("colonia");
        this.poblacion = (String) jsonRequest.get("poblacion");
        this.municipio = (String) jsonRequest.get("municipio");
        this.estado = (String) jsonRequest.get("estado");
        this.codigoPostal = (String) jsonRequest.get("codigo_postal");
        this.telCasa = (String) jsonRequest.get("tel_casa");
        this.telCelular = (String) jsonRequest.get("tel_celular");
    }

    public int getSolicitante_id() {
        return solicitante_id;
    }

    public void setSolicitante_id(int solicitante_id) {
        this.solicitante_id = solicitante_id;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

}
