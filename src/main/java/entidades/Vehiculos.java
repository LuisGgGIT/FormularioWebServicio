package entidades;

import org.json.JSONObject;

public class Vehiculos {

    private int vehiculosId;
    private String usuarioUuid;
    private String marca;
    private String modelo;
    private String valorComercial;
    private String adeuda;
    private String plazoMensual;
    private String pagoMensual;

    public Vehiculos() {
        // Constructor vacío
    }

    public Vehiculos(String usuarioUuid, String marca, String modelo, String valorComercial,
            String adeuda, String plazoMensual, String pagoMensual) {
        this.usuarioUuid = usuarioUuid;
        this.marca = marca;
        this.modelo = modelo;
        this.valorComercial = valorComercial;
        this.adeuda = adeuda;
        this.plazoMensual = plazoMensual;
        this.pagoMensual = pagoMensual;
    }

    public Vehiculos(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.marca = jsonObject.optString("marca", "");
        this.modelo = jsonObject.optString("modelo", "");
        this.valorComercial = jsonObject.optString("valor_comercial", "");
        this.adeuda = jsonObject.optString("adeuda", "");
        this.plazoMensual = jsonObject.optString("plazo_mensual", "");
        this.pagoMensual = jsonObject.optString("pago_mensual", "");
    }

    // Getters y setters
    public int getVehiculosId() {
        return vehiculosId;
    }

    public void setVehiculosId(int vehiculosId) {
        this.vehiculosId = vehiculosId;
    }

    public String getUsuarioUuid() {
        return usuarioUuid;
    }

    public void setUsuarioUuid(String usuarioUuid) {
        this.usuarioUuid = usuarioUuid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(String valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getAdeuda() {
        return adeuda;
    }

    public void setAdeuda(String adeuda) {
        this.adeuda = adeuda;
    }

    public String getPlazoMensual() {
        return plazoMensual;
    }

    public void setPlazoMensual(String plazoMensual) {
        this.plazoMensual = plazoMensual;
    }

    public String getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(String pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

}
