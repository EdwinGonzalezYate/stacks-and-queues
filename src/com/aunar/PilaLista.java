package com.aunar;

public class PilaLista {

    private NodoPila up;


    public PilaLista() {
        up = null;
    }


    public boolean pilaVacia() {
        return up == null;
    }

    public void insert(int elemento) {
        NodoPila nodoPila = new NodoPila(elemento);
        nodoPila.next = up;
        up = nodoPila;
    }

    public int delete() {
        if (pilaVacia()) {
            return -1;
        }
        int aux = up.element;
        up = up.next;
        return aux;
    }

    public void limpiarPila() {
        NodoPila temp;
        while (!pilaVacia()) {
            temp = up;
            up = up.next;
            temp.next = null;
        }
    }

    @Override
    public String toString() {
        return  up.toString();
    }
}
