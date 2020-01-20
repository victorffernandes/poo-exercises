package com.company;

import java.util.Scanner;

/*Lista 1 - Questao 8*/
public class Fibonacci {
    static void fibonacci(int number){
        int anterior = 0, atual = 1;
        if(number == 0 ){
            System.out.print("0");
            return;
        }
        System.out.print("0 1 ");
        for(int i = 0; i < number - 1; i++){
            int temp = anterior;
            anterior = atual;
            atual = temp + atual;
            System.out.print(atual+" ");
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número para montar a sequência de fibonacci: ");

        int numero = teclado.nextInt();

        fibonacci(numero);
    }
}
