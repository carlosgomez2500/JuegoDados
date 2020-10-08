package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;



    public static int menu() {
        System.out.println("1. Tirar dados");
        System.out.println("2. Finalizar");
        System.out.println("Elige: ");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int tiradas = 0;
        int ganadas = 0;
        Juego juego = new Juego();

            for (int opcion = menu() ; opcion != 2; opcion = menu()) {
                ++tiradas;
                boolean jugar = juego.jugarDado();
                System.out.println(juego.toString());
                if (jugar) {
                    System.out.println("Has ganado, enhorabuena!");
                    ++ganadas;
                }
            }
            System.out.println("En " + tiradas + " tiradas");
            System.out.println("Has ganado " + ganadas + " partidas");
        }
        static {
        scanner = new Scanner((System.in));
        }
    }


