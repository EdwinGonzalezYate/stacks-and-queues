package com.aunar;

public class NodoPila {
    int element;
    NodoPila next;

    NodoPila(int element) {
        this.element = element;
        next = null;
    }

    public NodoPila(int element, NodoPila next) {
        this.element = element;
        this.next = null;
    }

    @Override
    public String toString() {
        return "NodoPila{" +
                element +
                '}';
    }
}
