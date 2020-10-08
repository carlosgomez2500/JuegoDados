package com.company;

public class Dado {
    private int valor;

    public Dado() {
    }

    public int getValor() {
        return this.valor;
    }

    public int tirarDado() {
        this.valor = (int)(Math.random() * 6.0D) + 1;
        return this.valor;
    }

    public int dados() { return this.valor; }
}
