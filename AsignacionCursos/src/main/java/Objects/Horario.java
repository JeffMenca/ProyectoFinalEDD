package Objects;

/**
 *
 * @author Jeffrey
 */
public class Horario {

    private int codigo;
    private String periodo;
    private String dia;
    private int codCurso;
    private int codSalon;
    private int codEdificio;
    private int idCatedratico;

    public Horario(int codigo, String periodo, String dia, int codCurso, int codSalon, int codEdificio, int idCatedratico) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.dia = dia;
        this.codCurso = codCurso;
        this.codSalon = codSalon;
        this.codEdificio = codEdificio;
        this.idCatedratico = idCatedratico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getCodSalon() {
        return codSalon;
    }

    public void setCodSalon(int codSalon) {
        this.codSalon = codSalon;
    }

    public int getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(int codEdificio) {
        this.codEdificio = codEdificio;
    }

    public int getidCatedratico() {
        return idCatedratico;
    }

    public void setidCatedratico(int idCatedratico) {
        this.idCatedratico = idCatedratico;
    }

}
