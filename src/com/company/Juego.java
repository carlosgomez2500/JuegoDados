package com.company;

import java.util.Arrays;

public class Juego {
    Dado[] dado = new Dado[3];

    public Juego() {
        this.dado[0] = new Dado();
        this.dado[1] = new Dado();
        this.dado[2] = new Dado();
    }

    public boolean jugarDado() {
        int primero = dado[0].tirarDado();
        int segundo = dado[1].tirarDado();
        int tercero = dado[2].tirarDado();
        return primero == segundo && segundo == tercero;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "dado 1={" + dado[0].getValor() +
                "}dado 2={" + dado[1].getValor() +
                "}dado 3={" + dado[2].getValor() +
                "}";
    }
}