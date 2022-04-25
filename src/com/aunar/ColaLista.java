package com.aunar;

public class ColaLista {
    protected NodoCola front;
    protected NodoCola end;

    public ColaLista() {
        front = null;
    }

    public void insert(int element) {
        NodoCola nodoCola;
        nodoCola = new NodoCola(element);
        if (colaVacia()) {
            front = nodoCola;
        } else {
            end.next = nodoCola;
        }
        end = nodoCola;
    }

    public int delete(){
        int aux;
        if (!colaVacia()) {
            aux = front.element;
            front = front.next;

        }else{
            aux = -1;
            return -1;

        }
        return aux;
    }

    public void borrarCola(){

        while (front != null) {
            front = front.next;
        }
    }

    private boolean colaVacia() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }
}
