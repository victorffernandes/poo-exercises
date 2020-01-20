package com.company;

import java.util.Scanner;
/* Lista 1 - Questao 2*/
public class Ponto3D {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira três coordenadas para o primeiro ponto: x y z");
        double[] pontoA = { teclado.nextDouble(), teclado.nextDouble() ,teclado.nextDouble() };

        System.out.println("Insira três coordenadas para o segundo ponto: x y z");
        double[] pontoB = { teclado.nextDouble(), teclado.nextDouble() ,teclado.nextDouble() };

        double distanciaAB = Math.sqrt( Math.pow(pontoA[0] - pontoB[0], 2) + Math.pow(pontoA[1] - pontoB[1], 2) + Math.pow(pontoA[2] - pontoB[2], 2) );

        System.out.println("A distância entre os pontos é de: "+ distanciaAB);
    }
}
