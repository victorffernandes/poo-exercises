package com.company;

import java.util.Scanner;

/* Lista 1 - Questao 3*/
public class Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();

        distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2f); // o problema era a divisão inteira 1/2, trocado para divisão mista 1/2f
        System.out.println("A distância é: " + distancia);
    }
}