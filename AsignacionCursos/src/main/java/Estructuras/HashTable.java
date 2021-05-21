/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Classes.claseMain;
import Objects.Estudiante;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class HashTable<T> {

    private int CAPACITY;
    private float LF;
    private int MAX_SIZE;
    private List<T>[] arr;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public HashTable() {
        CAPACITY = 37;
        LF = 0.55f;
        MAX_SIZE = (int) (LF * CAPACITY);
        arr = new List[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            arr[i] = new List<>();
        }
    }

    @SuppressWarnings("unchecked")
    public HashTable(int initialCapacity) {

        assert (initialCapacity > 0);

        CAPACITY = getNearestPowerTwo(initialCapacity);
        MAX_SIZE = (int) (LF * CAPACITY);

        arr = new List[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            arr[i] = new List<>();
        }
    }

    @SuppressWarnings("unchecked")
    public HashTable(int initialCapacity, int loadFactor) {
        assert (initialCapacity > 0);
        assert (loadFactor > 0 && loadFactor <= 1);

        CAPACITY = getNearestPowerTwo(initialCapacity);
        LF = loadFactor;
        MAX_SIZE = (int) (LF * CAPACITY);

        arr = new List[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            arr[i] = new List<>();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T item) {
        if (item instanceof Estudiante) {

            if (get(((Estudiante) item).getCarnet()) != null) {
                return false;
            }

        }

        if (contains(item)) {
            int intentos = 1;
            boolean encontro = false;
            while (containsColision(item, intentos)) {
                intentos++;
            }
            addItemColision(item, intentos);
            size++; // increase size
            if (size == MAX_SIZE) {
                resize(); // resize
                return true;
            }
        } else {
            addItem(item); // add item into array
            size++; // increase size
            if (size == MAX_SIZE) {
                resize(); // resize
                return true;
            }
        }

        return true;

    }

    private void addItem(T item) {
        if (item instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) item;
            int index = hashing(estudiante.getCarnet()); // rehash
            arr[index].add(item);
        }

    }

    private void addItemColision(T item, int i) {
        if (item instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) item;
            int index = hashingColision(estudiante.getCarnet(), i); // rehash
            arr[index].add(item);
        }

    }

    public boolean contains(T item) {
        if (item instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) item;
            int index = hashing(estudiante.getCarnet());
            List<T> list = arr[index];
            try {
                if (((Estudiante) list.getHead().val) != null) {
                    return true;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean containsColision(T item, int i) {
        if (item instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) item;
            int index = hashingColision(estudiante.getCarnet(), i);
            List<T> list = arr[index];
            try {
                if (((Estudiante) list.getHead().val) != null) {
                    return true;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean remove(int carnet) {

        int index = hashing(carnet);
        List<T> list;
        int contador = 0;

        while (contador <= size()) {
            list = arr[index];
            if (list.getHead() != null) {
                if (((Estudiante) list.getHead().val).getCarnet() == carnet) {
                    list.removeHead();
                    size--;
                    return true;
                }
            }
            index = hashingColision(carnet, contador);
            contador++;
        }
        return false;
    }

    public Estudiante get(int carnet) {

        int index = hashing(carnet);
        List<T> list;
        int contador = 0;
        while (contador <= size()) {
            list = arr[index];
            if (list.getHead() != null) {
                if (((Estudiante) list.getHead().val).getCarnet() == carnet) {
                    return (Estudiante) list.getHead().val;
                }
            }
            index = hashingColision(carnet, contador);
            contador++;
        }
        return null;
    }

    private int getNearestPowerTwo(int capacity) {
        int shifts = 0;
        while (capacity > 0) {
            capacity = capacity >> 1;
            ++shifts;
        }
        return 1 << ++shifts;
    }

    @SuppressWarnings("unchecked")
    private boolean resize() {
        int temp = CAPACITY;
        CAPACITY = CAPACITY << 1;
        MAX_SIZE = (int) (LF * CAPACITY);
        List<T>[] arrCopy = arr;
        arr = new List[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            arr[i] = new List<>();
        }
        for (int i = 0; i < temp; i++) {
            Iterator<T> it = arrCopy[i].iterator();
            while (it.hasNext()) {
                addItem(it.next());
            }
        }
        return true;
    }

    // following hash() method in HashMap.class (Java JDK 1.8)
    public int hashing(int item) {
        return item % CAPACITY;
    }

    // following hash() method in HashMap.class (Java JDK 1.8)
    public int hashingColision(int item, int i) {

        return ((item % 7) + 1) * i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < CAPACITY; i++) {
            sb.append(arr[i].toString() + (i == CAPACITY - 1 ? "" : ", "));
        }
        return sb.toString();
    }

    private class List<T> {

        public Node<T> head, tail;
        public int size;

        public List() {
            head = tail = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void removeHead() {
            head = tail = null;
        }

        public void add(T val) {
            if (head == null) {
                head = tail = new Node<>(val);
            } else {
                tail.next = new Node<>(val);
                tail = tail.next;
            }
            ++size;
        }

        public Node<T> getHead() {
            return head;
        }

        public void setHead(Node<T> head) {
            this.head = head;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void remove(T val) {
            Node<T> current = head, prev = new Node<>(val);
            prev.next = current;
            while (current != null) {
                if (val.equals(current.val)) {
                    prev.next = current.next;
                    --size;
                    return;
                }
            }
            throw new NoSuchElementException();
        }

        public String toString() {
            Node<T> current = head;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            while (current != null) {
                sb.append(((Estudiante) current.val).getCarnet() + ",");
                current = current.next;
            }
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("]");
            return sb.toString();
        }

        public Iterator<T> iterator() {
            return new ListIterator<>();
        }

        private class ListIterator<T> implements Iterator<T> {

            Node<T> next;

            public ListIterator() {
                next = (Node<T>) head;
            }

            public boolean hasNext() {
                return next != null;
            }

            public T next() {
                if (next == null) {
                    throw new NoSuchElementException();
                }
                T val = next.val;
                next = next.next;
                return val;
            }
            // incorrect and needs to be corrected!

            @Override
            public void remove() {
                if (next != null) {
                    T val = next.val;
                    next = next.next;
                }

            }
        }

        private class Node<T> {

            public T val;
            public Node<T> next;

            public Node(T val) {
                this.val = val;
                this.next = null;
            }

        }
    }

    public static void graficarTabla(String[] datos) throws IOException {
        String texto = "";
        String punteros = "";
        texto += "struct1 [label=\"";
        for (int i = 0; i < datos.length; i++) {
            if (i + 1 == datos.length) {
                texto += "<" + i + "> " + i;
            } else {
                texto += "<" + i + "> " + i + "|";
            }
            if (datos[i].equalsIgnoreCase("[]") || datos[i].equalsIgnoreCase(" []")) {

            } else {
                punteros += "struct1:" + i + "->" + "\"" + datos[i] + "\";\n";
            }
        }
        texto += "\"];\n";

        String salida = "digraph G {\n rankdir=\"LR\";\n"
                + "node [shape=record];";
        salida += texto;
        salida += punteros;
        salida += "label = \" Tabla Hash de estudiantes \";\n";
        salida += "}\n";

        File imagenSalida = new File("./listaEstudiantes.dot");
        if (!imagenSalida.exists()) {
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.guardarImagen(salida, imagenSalida.getAbsolutePath());
        String command = "dot -Tpng listaEstudiantes.dot -o listaEstudiantesImagen.png";
        Runtime.getRuntime().exec(command);
    }

    public String graficarTablaAsignacion(String[] datos) throws IOException {
        String texto = "";
        String punteros = "";
        texto += "struct1 [label=\"";
        for (int i = 0; i < datos.length; i++) {
            if (i + 1 == datos.length) {
                texto += "<" + i + "> " + i;
            } else {
                texto += "<" + i + "> " + i + "|";
            }
            if (datos[i].equalsIgnoreCase("[]") || datos[i].equalsIgnoreCase(" []")) {

            } else {
                punteros += "struct1:" + i + "->" + "\"" + datos[i].replace(" ", "") + "\";\n";
            }
        }
        texto += "\"];\n";

        String salida = "subgraph cluster_ListaEstudiante { \n rankdir=\"LR\";\n"
                + "node [shape=record]; label=\"Estudiantes\"; \n";
        salida += texto;
        salida += punteros;
        salida += "}\n";
        return salida;
    }
}
