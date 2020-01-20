package com.company;

import java.util.Scanner;
/*Lista 1 - Questão 16*/
public class Tempo {
    static int lerDados(Scanner teclado){
        System.out.println("Insira o tempo desejado em segundos: ");
        return teclado.nextInt();
    }

    static void escreverDados(float segundos, float minutos, float horas){
        System.out.println("Segundos: "+ segundos);
        System.out.println("Minutos: "+ minutos);
        System.out.println("Horas: "+ horas);
    }

    static float segundos(int segundos){
        return segundos/1f;
    }

    static float minutos(int segundos){
        return segundos / 60f;
    }

    static float horas(int segundos){
        return segundos / (60f * 60f);
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int seg = lerDados(teclado);

        escreverDados(segundos(seg), minutos(seg), horas(seg));
    }
}
