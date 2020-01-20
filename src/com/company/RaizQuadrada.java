package com.company;

import java.util.Scanner;

/*Lista 1 - Exercicio 11*/
public class RaizQuadrada {

    static double aproximacaoRaiz(int numA, int numB, int number, int tries){ // 7 8 50
        double half, a = numA, b = numB;
        for(int i = 0; i < tries; i++){
            half = ((a*a - b*b) / 2) + b*b;

            if(number > half){
                b = (a - b) / 2 + b;
            } else if(number < half){
                a = (a - b) / 2 + b;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número para calcular a raiz quadrada: ");
        int number = teclado.nextInt();

        System.out.println("Insira o número de vezes para apurar o resultado: ");
        int tries = teclado.nextInt();

        int proximaRaizExata = 1;

        while(proximaRaizExata * proximaRaizExata < number){
            proximaRaizExata++;
        }

        double raizAproximada = aproximacaoRaiz( proximaRaizExata,proximaRaizExata - 1, number, tries);

        System.out.println("A raiz quadrada aproximada é: "+ raizAproximada);
    }
}
