package entidades;

import org.json.JSONObject;

public class GastoFamiliar {

    private int gastoFamiliarId;
    private String usuarioUuid;
    private String regimenSeguridadSocial;
    private String alimentos;
    private String rentaPredial;
    
    private String despensa;
    private String luz;
    private String productosLimpieza;
    private String agua;
    private String transporte;
    
    private String telefono;
    private String servicioDomestico;
    private String telefonoCelular;
    private String seguros;
    private String cable;
    
    private String pagoCredito;
    private String internet;
    private String pagosTarjetasCredito;
    private String gas;
    private String hipoteca;
    
    private String ropaCalzado;
    private String gastosMedicos;
    private String gastosPersonales;
    private String colegiaturaSolicitante;
    private String vacaciones;
    
    private String colegiaturaOtrosMiembros;
    private String diversionesEntretenimiento;
    private String librosMateriales;
    private String otrosGastos;
    private String totalGastos;

    public GastoFamiliar() {
        // Constructor vacío
    }

    public GastoFamiliar(String usuarioUuid, String regimenSeguridadSocial, String alimentos, String rentaPredial,
            String despensa, String luz, String productosLimpieza, String agua, String transporte,
            String telefono, String servicioDomestico, String telefonoCelular, String seguros,
            String cable, String pagoCredito, String internet, String pagosTarjetasCredito,
            String gas, String hipoteca, String ropaCalzado, String gastosMedicos,
            String gastosPersonales, String colegiaturaSolicitante, String vacaciones,
            String colegiaturaOtrosMiembros, String diversionesEntretenimiento,
            String librosMateriales, String otrosGastos, String totalGastos) {
        this.usuarioUuid = usuarioUuid;
        this.regimenSeguridadSocial = regimenSeguridadSocial;
        this.alimentos = alimentos;
        this.rentaPredial = rentaPredial;
        this.despensa = despensa;
        this.luz = luz;
        this.productosLimpieza = productosLimpieza;
        this.agua = agua;
        this.transporte = transporte;
        this.telefono = telefono;
        this.servicioDomestico = servicioDomestico;
        this.telefonoCelular = telefonoCelular;
        this.seguros = seguros;
        this.cable = cable;
        this.pagoCredito = pagoCredito;
        this.internet = internet;
        this.pagosTarjetasCredito = pagosTarjetasCredito;
        this.gas = gas;
        this.hipoteca = hipoteca;
        this.ropaCalzado = ropaCalzado;
        this.gastosMedicos = gastosMedicos;
        this.gastosPersonales = gastosPersonales;
        this.colegiaturaSolicitante = colegiaturaSolicitante;
        this.vacaciones = vacaciones;
        this.colegiaturaOtrosMiembros = colegiaturaOtrosMiembros;
        this.diversionesEntretenimiento = diversionesEntretenimiento;
        this.librosMateriales = librosMateriales;
        this.otrosGastos = otrosGastos;
        this.totalGastos = totalGastos;
    }

    public GastoFamiliar(JSONObject jsonObject) {
        this.usuarioUuid = jsonObject.getString("usuario_uuid");
        this.regimenSeguridadSocial = jsonObject.optString("regimen_seguridad_social", "");
        this.alimentos = jsonObject.optString("alimentos", "");
        this.rentaPredial = jsonObject.optString("renta_predial", "");
        this.despensa = jsonObject.optString("despensa", "");
        this.luz = jsonObject.optString("luz", "");
        this.productosLimpieza = jsonObject.optString("productos_limpieza", "");
        this.agua = jsonObject.optString("agua", "");
        this.transporte = jsonObject.optString("transporte", "");
        this.telefono = jsonObject.optString("telefono", "");
        this.servicioDomestico = jsonObject.optString("servicio_domestico", "");
        this.telefonoCelular = jsonObject.optString("telefono_celular", "");
        this.seguros = jsonObject.optString("seguros", "");
        this.cable = jsonObject.optString("cable", "");
        this.pagoCredito = jsonObject.optString("pago_credito", "");
        this.internet = jsonObject.optString("internet", "");
        this.pagosTarjetasCredito = jsonObject.optString("pagos_tarjetas_credito", "");
        this.gas = jsonObject.optString("gas", "");
        this.hipoteca = jsonObject.optString("hipoteca", "");
        this.ropaCalzado = jsonObject.optString("ropa_calzado", "");
        this.gastosMedicos = jsonObject.optString("gastos_medicos", "");
        this.gastosPersonales = jsonObject.optString("gastos_personales", "");
        this.colegiaturaSolicitante = jsonObject.optString("colegiatura_solicitante", "");
        this.vacaciones = jsonObject.optString("vacaciones", "");
        this.colegiaturaOtrosMiembros = jsonObject.optString("colegiatura_otros_miembros", "");
        this.diversionesEntretenimiento = jsonObject.optString("diversiones_entretenimiento", "");
        this.librosMateriales = jsonObject.optString("libros_materiales", "");
        this.otrosGastos = jsonObject.optString("otros_gastos", "");
        this.totalGastos = jsonObject.optString("total_gastos", "");
    }

    // Getters y setters
    public int getGastoFamiliarId() {
        return gastoFamiliarId;
    }

    public void setGastoFamiliarId(int gastoFamiliarId) {
        this.gastoFamiliarId = gastoFamiliarId;
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

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public String getRentaPredial() {
        return rentaPredial;
    }

    public void setRentaPredial(String rentaPredial) {
        this.rentaPredial = rentaPredial;
    }

    public String getDespensa() {
        return despensa;
    }

    public void setDespensa(String despensa) {
        this.despensa = despensa;
    }

    public String getLuz() {
        return luz;
    }

    public void setLuz(String luz) {
        this.luz = luz;
    }

    public String getProductosLimpieza() {
        return productosLimpieza;
    }

    public void setProductosLimpieza(String productosLimpieza) {
        this.productosLimpieza = productosLimpieza;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getServicioDomestico() {
        return servicioDomestico;
    }

    public void setServicioDomestico(String servicioDomestico) {
        this.servicioDomestico = servicioDomestico;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getSeguros() {
        return seguros;
    }

    public void setSeguros(String seguros) {
        this.seguros = seguros;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getPagoCredito() {
        return pagoCredito;
    }

    public void setPagoCredito(String pagoCredito) {
        this.pagoCredito = pagoCredito;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getPagosTarjetasCredito() {
        return pagosTarjetasCredito;
    }

    public void setPagosTarjetasCredito(String pagosTarjetasCredito) {
        this.pagosTarjetasCredito = pagosTarjetasCredito;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getHipoteca() {
        return hipoteca;
    }

    public void setHipoteca(String hipoteca) {
        this.hipoteca = hipoteca;
    }

    public String getRopaCalzado() {
        return ropaCalzado;
    }

    public void setRopaCalzado(String ropaCalzado) {
        this.ropaCalzado = ropaCalzado;
    }

    public String getGastosMedicos() {
        return gastosMedicos;
    }

    public void setGastosMedicos(String gastosMedicos) {
        this.gastosMedicos = gastosMedicos;
    }

    public String getGastosPersonales() {
        return gastosPersonales;
    }

    public void setGastosPersonales(String gastosPersonales) {
        this.gastosPersonales = gastosPersonales;
    }

    public String getColegiaturaSolicitante() {
        return colegiaturaSolicitante;
    }

    public void setColegiaturaSolicitante(String colegiaturaSolicitante) {
        this.colegiaturaSolicitante = colegiaturaSolicitante;
    }

    public String getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(String vacaciones) {
        this.vacaciones = vacaciones;
    }

    public String getColegiaturaOtrosMiembros() {
        return colegiaturaOtrosMiembros;
    }

    public void setColegiaturaOtrosMiembros(String colegiaturaOtrosMiembros) {
        this.colegiaturaOtrosMiembros = colegiaturaOtrosMiembros;
    }

    public String getDiversionesEntretenimiento() {
        return diversionesEntretenimiento;
    }

    public void setDiversionesEntretenimiento(String diversionesEntretenimiento) {
        this.diversionesEntretenimiento = diversionesEntretenimiento;
    }

    public String getLibrosMateriales() {
        return librosMateriales;
    }

    public void setLibrosMateriales(String librosMateriales) {
        this.librosMateriales = librosMateriales;
    }

    public String getOtrosGastos() {
        return otrosGastos;
    }

    public void setOtrosGastos(String otrosGastos) {
        this.otrosGastos = otrosGastos;
    }

    public String getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(String totalGastos) {
        this.totalGastos = totalGastos;
    }

}
