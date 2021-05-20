package Objects;

/**
 *
 * @author Jeffrey
 */
public class Horario {

    private int codigo;
    private String periodo;
    private String dia;
    private Curso curso;
    private Salon salon;
    private Edificio edificio;
    private Catedratico catedratico;
    
    private String dotName;
    private int cursoCD;
    private int salonCD;
    private String edificioCD;
    private int catedraticoCD;

    public Horario(int codigo, String periodo, String dia, Curso curso, Salon salon, Edificio edificio, Catedratico catedratico) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.dia = dia;
        this.curso = curso;
        this.salon = salon;
        this.edificio = edificio;
        this.catedratico = catedratico;
    }
    
    public Horario(int codigo, String periodo, String dia, int cursoCD, int salonCD, String edificioCD, int catedraticoCD) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.dia = dia;
        this.cursoCD = cursoCD;
        this.salonCD = salonCD;
        this.edificioCD = edificioCD;
        this.catedraticoCD = catedraticoCD;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public int getCursoCD() {
        return cursoCD;
    }

    public void setCursoCD(int cursoCD) {
        this.cursoCD = cursoCD;
    }

    public int getSalonCD() {
        return salonCD;
    }

    public void setSalonCD(int salonCD) {
        this.salonCD = salonCD;
    }

    public String getEdificioCD() {
        return edificioCD;
    }

    public void setEdificioCD(String edificioCD) {
        this.edificioCD = edificioCD;
    }

    public int getCatedraticoCD() {
        return catedraticoCD;
    }

    public void setCatedraticoCD(int catedraticoCD) {
        this.catedraticoCD = catedraticoCD;
    }

    public String getDotName() {
        return dotName;
    }

    public void setDotName(String dotName) {
        this.dotName = dotName;
    }
    
    

}
