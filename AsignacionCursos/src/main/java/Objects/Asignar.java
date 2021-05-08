
package Objects;

/**
 *
 * @author Jeffrey
 */
public class Asignar {
    private int carnet;
    private int codCurso;
    private int zona;
    private int examenFinal;

    public Asignar(int carnet, int codCurso, int zona, int examenFinal) {
        this.carnet = carnet;
        this.codCurso = codCurso;
        this.zona = zona;
        this.examenFinal = examenFinal;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
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
