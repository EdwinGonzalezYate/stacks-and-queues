package com.aunar;

public class Main {
    public static void pila() {
        PilaLista pila = new PilaLista();
        pila.insert(1);
        pila.insert(2);
        pila.insert(3);
        pila.insert(4);
        pila.insert(5);
        pila.insert(6);
        pila.insert(7);

        print(pila.toString());

        pila.delete();

        pila.limpiarPila();

        try {
            print(pila.toString());
        } catch (Exception e) {
            System.out.println("Something its wrong");
        }

    }

    public static void cola() {
        ColaLista cola = new ColaLista();
        cola.insert(1);
        cola.insert(2);
        cola.insert(3);
        cola.insert(4);
        cola.insert(5);
        cola.insert(6);
        cola.insert(7);

        cola.delete();

        System.out.println(cola.toString());

    }

    public static void print(String number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        pila();
        cola();
    }
}
