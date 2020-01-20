package com.company;

import java.util.Scanner;

/* Lista 1 - Questao 6*/
public class Digitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int divisao = numero;
        int digitos = 0;
        do{
            digitos++;
            divisao = numero / (digitos * 10);
        }
        while(divisao != 0);
        System.out.print("Número de dígitos: "+ digitos);
    }
}
