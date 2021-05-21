package btree;

import Classes.claseMain;
import Objects.Asignar;
import Objects.Catedratico;
import Objects.Curso;
import Objects.Edificio;
import Objects.Horario;
import Objects.Salon;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArbolB {

    private Nodo mRaiz = null;
    private int mK = 2;
    private int mAltura = 0;

    public String toDot() throws IOException {
        StringBuilder b = new StringBuilder();

        b.append("digraph g { \n node [shape=record];\n");
        b.append("graph [compound=true];\n");
        b.append(claseMain.listaEdificios.graficarListaCircularHorario());
        b.append(claseMain.listaCursos.graficarListaCircularHorario());
        b.append(claseMain.listaCatedraticos.crearGraficaHorario());
        b.append(mRaiz.toDot());
        ArrayList<Horario> horarios = claseMain.listaHorarios.getmRaiz().toArray();
        for (int i = 0; i < horarios.size(); i++) {
            Horario horario = horarios.get(i);
            Edificio edificio = horario.getEdificio();
            Salon salon = horario.getSalon();
            Curso curso = horario.getCurso();
            Catedratico cate = horario.getCatedratico();
            String edificiosYSalones = horario.getDotName() + ":" + horario.getCodigo() + "->" + edificio.getNombre() + "_" + salon.getNumero() + " [constraint=false]; \n";
            b.append(edificiosYSalones);
            String edificiosYHorarios = horario.getDotName() + ":" + horario.getCodigo() + "->" + "Curso_" + curso.getCodigo() + " [constraint=false]; \n";
            b.append(edificiosYHorarios);
            String catedraticos = horario.getDotName() + ":" + horario.getCodigo() + "->" + "\" " + cate.getId() + "\n" + cate.getNombre() + "\"" + " [constraint=false]; \n";
            b.append(catedraticos);

        }
        b.append("label=\"Horarios\"; \n");
        b.append("}");

        return b.toString();
    }

    public String toDotAsignaciones() throws IOException {
        StringBuilder b = new StringBuilder();

        b.append("digraph g { \n node [shape=record];\n");
        b.append("graph [compound=true];\n");
        b.append(claseMain.listaEdificios.graficarListaCircularHorario());
        b.append(claseMain.listaCursos.graficarListaCircularHorario());
        b.append(claseMain.listaCatedraticos.crearGraficaHorario());
        b.append(claseMain.listaAsignaciones.graficarListaCircularHorario());
        String items = claseMain.listaEstudiantes.toString();
        String[] datos = items.split(",");
        b.append(claseMain.listaEstudiantes.graficarTablaAsignacion(datos));
        b.append(mRaiz.toDot());
        ArrayList<Horario> horarios = claseMain.listaHorarios.getmRaiz().toArray();
        ArrayList<Asignar> asignaciones = claseMain.listaAsignaciones.mostrarAsignaciones();
        for (int i = 0; i < horarios.size(); i++) {
            Horario horario = horarios.get(i);
            Edificio edificio = horario.getEdificio();
            Salon salon = horario.getSalon();
            Curso curso = horario.getCurso();
            Catedratico cate = horario.getCatedratico();
            String edificiosYSalones = horario.getDotName() + ":" + horario.getCodigo() + "->" + edificio.getNombre() + "_" + salon.getNumero() + " [constraint=false]; \n";
            b.append(edificiosYSalones);
            String edificiosYHorarios = horario.getDotName() + ":" + horario.getCodigo() + "->" + "Curso_" + curso.getCodigo() + " [constraint=false]; \n";
            b.append(edificiosYHorarios);
            String catedraticos = horario.getDotName() + ":" + horario.getCodigo() + "->" + "\" " + cate.getId() + "\n" + cate.getNombre() + "\"" + " [constraint=false]; \n";
            b.append(catedraticos);
        }
        for (int i = 0; i < asignaciones.size(); i++) {
            Asignar asignacion = asignaciones.get(i);
            Horario horarioAsignacion = asignacion.getCodHorario();
            String horariosAsignados = "Asignacion_" + asignacion.getCodigo() + "->" + horarioAsignacion.getDotName() + ":" + horarioAsignacion.getCodigo() + " [constraint=false]; \n";
            b.append(horariosAsignados);
            String estudiantesAsignados = "Asignacion_" + asignacion.getCodigo() + "->" + "\"" + "["+asignacion.getCarnet()+"]" + "\""+ " [constraint=false]; \n";
            b.append(estudiantesAsignados);

        }

        b.append("label=\"Asignaciones\"; \n");
        b.append("}");

        return b.toString();
    }

    public ArbolB() {
    }

    public ArbolB(int k) {
        this.mK = k;
    }

    public ArbolB(Nodo pRaiz) {
        mK = pRaiz.getK();
        this.mRaiz = pRaiz;
        mAltura = 1;
    }

    public void insert(Ordenable key, Object obj) {
        if (this.mAltura == 0) {
            this.mRaiz = new Nodo(this.mK, key, obj);
            this.mAltura = 1;
            return;
        }

        Split splitted = insert(this.mRaiz, key, obj, 1);

        if (splitted == null) {
        } else {

            Nodo ptr = this.mRaiz;

            this.mRaiz
                    = new Nodo(this.mK, splitted.getLlave(), splitted.getDato());
            this.mRaiz.mPunteros[0] = ptr;
            this.mRaiz.mPunteros[1] = splitted.getPuntero();
            this.mAltura++;
        }
    }

    protected Split insert(Nodo node, Ordenable key, Object obj, int level) {

        Split splitted = null;
        Nodo ptr = null;

        int i = 0;
        while ((i < node.mB) && (key.mayorQue(node.mLlaves[i]))) {
            i++;
        }

        if ((i < node.mB) && key.igualA(node.mLlaves[i])) {
            node.mDatos[i] = obj;
            return null;
        }

        if (level < this.mAltura) {

            splitted = insert(node.mPunteros[i], key, obj, level + 1);

            if (splitted == null) {
                return null;
            } else {
                key = splitted.mLlave;
                obj = splitted.mDato;
                ptr = splitted.mPuntero;
            }
        }

        i = node.mB - 1;
        while ((i >= 0)
                && (node.mLlaves[i] == null || key.menorQue(node.mLlaves[i]))) {
            node.mLlaves[i + 1] = node.mLlaves[i];
            node.mDatos[i + 1] = node.mDatos[i];
            node.mPunteros[i + 2] = node.mPunteros[i + 1];
            i--;
        }

        node.mLlaves[i + 1] = key;
        node.mDatos[i + 1] = obj;
        if (splitted != null) {
            node.mPunteros[i + 2] = splitted.mPuntero;
        }
        node.mB++;

        if (node.mB > 2 * mK) {

            Nodo newnode = new Nodo(this.mK);
            newnode.mPunteros[this.mK] = node.mPunteros[node.mB];
            node.mPunteros[node.mB] = null;
            node.mB = this.mK + 1;
            for (i = 0; i < this.mK; i++) {
                newnode.mLlaves[i] = node.mLlaves[i + node.mB];
                node.mLlaves[i + node.mB] = null;
                newnode.mDatos[i] = node.mDatos[i + node.mB];
                node.mDatos[i + node.mB] = null;
                newnode.mPunteros[i] = node.mPunteros[i + node.mB];
                node.mPunteros[i + node.mB] = null;
            }
            node.mB--;

            splitted
                    = new Split(newnode, node.mLlaves[node.mB], node.mDatos[node.mB]);
            node.mLlaves[node.mB] = null;
            node.mDatos[node.mB] = null;
            newnode.mB = this.mK;
            node.mB = this.mK;

            return splitted;
        }

        return null;
    }

    public Object search(Ordenable key) {
        return search(key, mRaiz);
    }

    public Object search(Ordenable key, Nodo node) {

        if ((node == null) || (node.mB < 1)) {
            return null;
        }

        if (key.menorQue(node.mLlaves[0])) {
            return search(key, node.mPunteros[0]);
        }

        if (key.mayorQue(node.mLlaves[node.mB - 1])) {
            return search(key, node.mPunteros[node.mB]);
        }

        int i = 0;
        while ((i < node.mB - 1) && (key.mayorQue(node.mLlaves[i]))) {
            i++;
        }

        if (key.igualA(node.mLlaves[i])) {
            return node.mDatos[i];
        }

        return search(key, node.mPunteros[i]);

    }

    public Nodo searchNodo(Ordenable key) {
        return searchNodo(key, mRaiz);
    }

    public Nodo searchNodo(Ordenable key, Nodo node) {

        if ((node == null) || (node.mB < 1)) {
            System.err.println("error");
            return null;
        }

        if (key.menorQue(node.mLlaves[0])) {
            return searchNodo(key, node.mPunteros[0]);
        }

        if (key.mayorQue(node.mLlaves[node.mB - 1])) {
            return searchNodo(key, node.mPunteros[node.mB]);
        }

        int i = 0;
        while ((i < node.mB - 1) && (key.mayorQue(node.mLlaves[i]))) {
            i++;
        }

        if (key.igualA(node.mLlaves[i])) {
            return node;
        }

        return searchNodo(key, node.mPunteros[i]);

    }

    public int getAltura() {
        return mAltura;
    }

    public Nodo getmRaiz() {
        return mRaiz;
    }

    public void setmRaiz(Nodo mRaiz) {
        this.mRaiz = mRaiz;
    }

    public int getmK() {
        return mK;
    }

    public void setmK(int mK) {
        this.mK = mK;
    }

    public int getmAltura() {
        return mAltura;
    }

    public void setmAltura(int mAltura) {
        this.mAltura = mAltura;
    }

    public void graficarArbolB() throws IOException {
        File imagenSalida = new File("./listaHorarios.dot");
        if (!imagenSalida.exists()) {
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.guardarImagen(claseMain.listaHorarios.toDot(), imagenSalida.getAbsolutePath());
        String command = "dot -Tpng listaHorarios.dot -o listaHorariosImagen.png";
        Runtime.getRuntime().exec(command);

    }

    public void graficarArbolB2() throws IOException {
        File imagenSalida = new File("./listaAsignaciones.dot");
        if (!imagenSalida.exists()) {
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.guardarImagen(claseMain.listaHorarios.toDotAsignaciones(), imagenSalida.getAbsolutePath());
        String command = "dot -Tpng listaAsignaciones.dot -o listaAsignacionesImagen.png";
        Runtime.getRuntime().exec(command);

    }

}
