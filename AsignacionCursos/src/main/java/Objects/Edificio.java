package Objects;

import Estructuras.ListaSimple;

/**
 *
 * @author Jeffrey
 */
public class Edificio {

    private String nombre;
    public ListaSimple salones;

    public Edificio(String nombre) {
        this.nombre = nombre;
        this.salones = new ListaSimple();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
