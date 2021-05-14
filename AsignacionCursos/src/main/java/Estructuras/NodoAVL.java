package Estructuras;

import Objects.Catedratico;

/**
 *
 * @author Jeffrey
 */
public class NodoAVL {

    private Catedratico catedratico;
    NodoAVL left;
    NodoAVL right;
    private int height;

    public NodoAVL(Catedratico catedratico, NodoAVL left, NodoAVL right, int height) {
        this.catedratico = catedratico;
        this.left = null;
        this.right = null;
        this.height = 1;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public NodoAVL getLeft() {
        return left;
    }

    public void setLeft(NodoAVL left) {
        this.left = left;
    }

    public NodoAVL getRight() {
        return right;
    }

    public void setRight(NodoAVL right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
