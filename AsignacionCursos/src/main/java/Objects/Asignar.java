package Objects;

/**
 *
 * @author Jeffrey
 */
public class Asignar {

    private int codigo;
    private int carnet;
    private Horario codHorario;
    private int zona;
    private int examenFinal;

    public Asignar(int codigo, int carnet, Horario codHorario, int zona, int examenFinal) {
        this.codigo = codigo;
        this.carnet = carnet;
        this.codHorario = codHorario;
        this.zona = zona;
        this.examenFinal = examenFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public Horario getCodHorario() {
        return codHorario;
    }

    public void setCodHorario(Horario codHorario) {
        this.codHorario = codHorario;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(int examenFinal) {
        this.examenFinal = examenFinal;
    }

}
