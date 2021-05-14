package Estructuras;

import Objects.Catedratico;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ArbolAVLCatedraticos {

    private NodoAVL raiz;
    public int size, seCreo = 1;
    private String graficaArbolUsuarios = "";

    public ArbolAVLCatedraticos() {
        this.raiz = null;
        size = 0;
    }

    public void eliminar(int id) {
        NodoAVL nuevoUser = buscar(id);
        if (nuevoUser != null) {
            if (raiz == null) {
                raiz = null;
            } else {
                raiz = eliminarAVL(raiz, nuevoUser);
            }
            size--;
            JOptionPane.showMessageDialog(null, "Se elimino el catedratico");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el catedratico para eliminar");
        }

    }

    private NodoAVL eliminarAVL(NodoAVL nodo, NodoAVL nodoUser) {
        if (nodo == null) {
            return nodo;
        }
        if (nodo.getCatedratico().getId() < raiz.getCatedratico().getId()) {
            nodo.setLeft(eliminarAVL(nodo.left, nodoUser));
        } else if (nodo.getCatedratico().getId() > raiz.getCatedratico().getId()) {
            nodo.setRight(eliminarAVL(nodo.right, nodoUser));
        } else {

            if ((nodo.left == null) || (nodo.right == null)) {
                //Hijos
                NodoAVL aux = null;
                if (aux == nodo.getLeft()) {
                    aux = nodo.getRight();
                } else {
                    aux = nodo.getLeft();
                }
                //No hijos
                if (aux == null) {
                    nodo = null;
                } else {
                    nodo = aux;
                }
            } else {
                NodoAVL aux = getNodoMayor(nodo.left);
                nodo.getCatedratico().setId(aux.getCatedratico().getId());
                nodo.setLeft(eliminarAVL(nodo.left, aux));
            }
        }
        if (nodo == null) {
            return nodo;
        }
        //Actualiza la altura
        try {
            nodo.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.right.getHeight()) + 1);
            int altura = nodo.getHeight();
            if ((altura > 1) && (nodo.left.getHeight() >= 0)) {
                return rotacionDerecha(nodo);
            }
            if ((altura < -1) && (nodo.right.getHeight() <= 0)) {
                return rotacionIzquierda(nodo);
            }
            if ((altura > 1) && (nodo.left.getHeight() < 0)) {
                nodo.setLeft(rotacionIzquierda(nodo.left));
                return rotacionDerecha(nodo);
            }
            if ((altura < -1) && (nodo.right.getHeight() > 0)) {
                nodo.setRight(rotacionDerecha(nodo.right));
                return rotacionIzquierda(nodo);
            }
        } catch (Exception e) {
        }

        return nodo;
    }

    private NodoAVL getNodoMayor(NodoAVL nodo) {
        NodoAVL nodoActual = nodo;
        while (nodo.getRight() != null) {
            nodoActual = nodoActual.getRight();
        }
        return nodoActual;
    }

    public NodoAVL buscar(int id) {
        return buscar(id, this.raiz);
    }

    private NodoAVL buscar(int id, NodoAVL raiz) {
        if (raiz == null) {
            return null;
        }
        if (id == raiz.getCatedratico().getId()) {
            return raiz;
        }
        if (id > raiz.getCatedratico().getId()) {
            return buscar(id, raiz.getRight());
        }
        if (id < raiz.getCatedratico().getId()) {
            return buscar(id, raiz.getLeft());
        }
        return null;
    }

    public NodoAVL editar(int id, Catedratico nuevo) {
        NodoAVL nuevoUser = buscar(id);
        if (nuevoUser != null) {
            return editar(nuevoUser.getCatedratico(), this.raiz, nuevo);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el usuario para editar");
            return null;
        }
    }

    private NodoAVL editar(Catedratico catedratico, NodoAVL raiz, Catedratico nuevo) {
        if (raiz == null) {
            return null;
        }
        if (catedratico.getId() == raiz.getCatedratico().getId()) {
            raiz.setCatedratico(nuevo);
            JOptionPane.showMessageDialog(null, "Se edito el catedratico correctamente");
            return raiz;
        }
        if (catedratico.getId() > raiz.getCatedratico().getId()) {
            return editar(catedratico, raiz.getRight(), nuevo);
        }
        if (catedratico.getId() < raiz.getCatedratico().getId()) {
            return editar(catedratico, raiz.getRight(), nuevo);
        }
        return null;
    }

    public int obtenerAltura(NodoAVL nodo) {
        if (nodo == null) {
            return -1;
        }
        return nodo.getHeight();
    }

    public NodoAVL rotacionIzquierda(NodoAVL nodo) {
        NodoAVL aux = nodo.getLeft();
        nodo.setLeft(aux.getRight());
        aux.setRight(nodo);
        nodo.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        aux.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        return aux;

    }

    public NodoAVL rotacionDerecha(NodoAVL nodo) {
        NodoAVL aux = nodo.getRight();
        nodo.setRight(aux.getLeft());
        aux.setLeft(nodo);
        nodo.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        aux.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        return aux;

    }

    public NodoAVL rotacionDobleIzquierda(NodoAVL nodo) {
        NodoAVL aux;
        nodo.setLeft(rotacionDerecha(nodo.getLeft()));
        aux = rotacionIzquierda(nodo);
        return aux;
    }

    public NodoAVL rotacionDobleDerecha(NodoAVL nodo) {
        NodoAVL aux;
        nodo.setRight(rotacionIzquierda(nodo.getRight()));
        aux = rotacionDerecha(nodo);
        return aux;
    }

    private NodoAVL insertarAVL(NodoAVL nodo, NodoAVL nodoAux) {
        NodoAVL nodoPadre = nodoAux;
        seCreo = 1;

        if (nodo.getCatedratico().getId() < nodoAux.getCatedratico().getId()) {

            if (nodoAux.getLeft() == null) {
                nodoAux.setLeft(nodo);
            } else {
                nodoAux.setLeft(insertarAVL(nodo, nodoAux.getLeft()));
                if (obtenerAltura(nodoAux.getLeft()) - obtenerAltura(nodoAux.getRight()) == 2) {
                    if (nodo.getCatedratico().getId() < (nodoAux.getLeft().getCatedratico().getId())) {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    } else {
                        nodoPadre = rotacionDerecha(nodoAux);
                    }
                }
            }
        } else if (nodo.getCatedratico().getId() > nodoAux.getCatedratico().getId()) {
            if (nodoAux.getRight() == null) {
                nodoAux.setRight(nodo);
            } else {
                nodoAux.setRight(insertarAVL(nodo, nodoAux.getRight()));
                if (obtenerAltura(nodoAux.getRight()) - obtenerAltura(nodoAux.getLeft()) == 2) {
                    if (nodo.getCatedratico().getId() > (nodoAux.getRight().getCatedratico().getId())) {
                        nodoPadre = rotacionDerecha(nodoAux);
                    } else {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El catedratico ya existe, ingrese otro");
            seCreo = 0;
        }
        if (nodoAux.getLeft() == null && nodoAux.getRight() != null) {
            nodoAux.setHeight(nodoAux.getRight().getHeight() + 1);
        } else if (nodoAux.getRight() == null && nodoAux.getLeft() != null) {
            nodoAux.setHeight(nodoAux.getLeft().getHeight() + 1);
        } else {
            nodoAux.setHeight(Math.max(obtenerAltura(nodoAux.getLeft()), obtenerAltura(nodoAux.getRight())) + 1);
        }
        return nodoPadre;
    }

    public void insertar(Catedratico catedratico) {
        NodoAVL nuevoUser = new NodoAVL(catedratico, null, null, 1);
        if (raiz == null) {
            raiz = nuevoUser;
        } else {
            raiz = insertarAVL(nuevoUser, raiz);
        }
        size++;
        if (seCreo == 1) {
            JOptionPane.showMessageDialog(null, "El catedratico se creo exitosamente");
        }
    }

    private NodoAVL insertarAVL2(NodoAVL nodo, NodoAVL nodoAux) {
        NodoAVL nodoPadre = nodoAux;
        seCreo = 1;

        if (nodo.getCatedratico().getId() < nodoAux.getCatedratico().getId()) {

            if (nodoAux.getLeft() == null) {
                nodoAux.setLeft(nodo);
            } else {
                nodoAux.setLeft(insertarAVL(nodo, nodoAux.getLeft()));
                if (obtenerAltura(nodoAux.getLeft()) - obtenerAltura(nodoAux.getRight()) == 2) {
                    if (nodo.getCatedratico().getId() < (nodoAux.getLeft().getCatedratico().getId())) {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    } else {
                        nodoPadre = rotacionDerecha(nodoAux);
                    }
                }
            }
        } else if (nodo.getCatedratico().getId() > nodoAux.getCatedratico().getId()) {
            if (nodoAux.getRight() == null) {
                nodoAux.setRight(nodo);
            } else {
                nodoAux.setRight(insertarAVL(nodo, nodoAux.getRight()));
                if (obtenerAltura(nodoAux.getRight()) - obtenerAltura(nodoAux.getLeft()) == 2) {
                    if (nodo.getCatedratico().getId() > (nodoAux.getRight().getCatedratico().getId())) {
                        nodoPadre = rotacionDerecha(nodoAux);
                    } else {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El catedratico ya existe, ingrese otro");
            seCreo = 0;
        }
        if (nodoAux.getLeft() == null && nodoAux.getRight() != null) {
            nodoAux.setHeight(nodoAux.getRight().getHeight() + 1);
        } else if (nodoAux.getRight() == null && nodoAux.getLeft() != null) {
            nodoAux.setHeight(nodoAux.getLeft().getHeight() + 1);
        } else {
            nodoAux.setHeight(Math.max(obtenerAltura(nodoAux.getLeft()), obtenerAltura(nodoAux.getRight())) + 1);
        }
        return nodoPadre;
    }

    public void insertar2(Catedratico catedratico) {
        NodoAVL nuevoUser = new NodoAVL(catedratico, null, null, 1);
        if (raiz == null) {
            raiz = nuevoUser;
        } else {
            raiz = insertarAVL(nuevoUser, raiz);
        }
        size++;
    }

    private void inOrden(NodoAVL nodo) {
        if (null == nodo) {
            return;
        }
        inOrden(nodo.getLeft());
        System.out.println("{ ID: " + nodo.getCatedratico().getId() + " }\n");
        inOrden(nodo.getRight());
    }

    private void preOrden(NodoAVL nodo) {
        if (null == nodo) {
            return;
        }
        System.out.println("{ ID: " + nodo.getCatedratico().getId() + " }\n");
        preOrden(nodo.getLeft());
        preOrden(nodo.getRight());
    }

    private void postOrden(NodoAVL nodo) {
        if (null == nodo) {
            return;
        }
        postOrden(nodo.getLeft());
        postOrden(nodo.getRight());
        System.out.println("{ ID: " + nodo.getCatedratico().getId() + " }\n");
    }

    public void inOrden() {
        inOrden(this.raiz);
    }

    public void preOrden() {
        preOrden(this.raiz);
    }

    public void postOrden() {
        postOrden(this.raiz);
    }

}
