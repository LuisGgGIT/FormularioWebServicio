package entidades;

import java.util.List;

public class InfoFamilia {

    private DatoPadres datoPadres;
    private List<OcupacionFamiliar> ocupacionesFamiliares;
    private SituacionFamiliar situacionFamiliar;
    private List<HabitanteCasa> habitanteCasa;
    private List<EstudioFamiliar> estudioFamiliar;

    private IngresoFamiliar ingresoFamiliar;
    private GastoFamiliar gastoFamiliar;

    public InfoFamilia() {
    }

    public DatoPadres getDatoPadres() {
        return datoPadres;
    }

    public void setDatoPadres(DatoPadres datoPadres) {
        this.datoPadres = datoPadres;
    }

    public List<OcupacionFamiliar> getOcupacionesFamiliares() {
        return ocupacionesFamiliares;
    }

    public void setOcupacionesFamiliares(List<OcupacionFamiliar> ocupacionesFamiliares) {
        this.ocupacionesFamiliares = ocupacionesFamiliares;
    }

    public SituacionFamiliar getSituacionFamiliar() {
        return situacionFamiliar;
    }

    public void setSituacionFamiliar(SituacionFamiliar situacionFamiliar) {
        this.situacionFamiliar = situacionFamiliar;
    }

    public List<HabitanteCasa> getHabitanteCasa() {
        return habitanteCasa;
    }

    public void setHabitanteCasa(List<HabitanteCasa> habitanteCasa) {
        this.habitanteCasa = habitanteCasa;
    }

    public List<EstudioFamiliar> getEstudioFamiliar() {
        return estudioFamiliar;
    }

    public void setEstudioFamiliar(List<EstudioFamiliar> estudioFamiliar) {
        this.estudioFamiliar = estudioFamiliar;
    }

    public IngresoFamiliar getIngresoFamiliar() {
        return ingresoFamiliar;
    }

    public void setIngresoFamiliar(IngresoFamiliar ingresoFamiliar) {
        this.ingresoFamiliar = ingresoFamiliar;
    }

    public GastoFamiliar getGastoFamiliar() {
        return gastoFamiliar;
    }

    public void setGastoFamiliar(GastoFamiliar gastoFamiliar) {
        this.gastoFamiliar = gastoFamiliar;
    }
}
