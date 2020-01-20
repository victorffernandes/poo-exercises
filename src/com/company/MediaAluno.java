package com.company;

import java.util.Scanner;

/*Lista 1 - Questão 15*/
public class MediaAluno {

    static float media(float p1, float p2){
        return (p1 + p2)/2;
    }

    static String status(float media){
        if(media >= 6){
            return "APROVADO";
        } else if(media >= 4){
            return "VS";
        } else {
            return "REPROVADO";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a nota da p1: ");
        float p1 = teclado.nextFloat();

        System.out.println("Insira a nota da p2: ");
        float p2 = teclado.nextFloat();

        float media = media(p1, p2);
        String status = status(media);
        System.out.println("Sua média é "+ media+". E seu status é "+ status+".");
    }
}
