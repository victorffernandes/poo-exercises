package com.company;

import java.util.Scanner;


/* Lista 1 - Questao 1*/
public class Raizes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o parâmetro A da equação no formato: Ax^2 + Bx^2 + C = 0");
        double a = teclado.nextDouble();

        System.out.println("Insira o parâmetro B da equação no formato: Ax^2 + Bx^2 + C = 0");
        double b = teclado.nextDouble();

        System.out.println("Insira o parâmetro C da equação no formato: Ax^2 + Bx^2 + C = 0");
        double c = teclado.nextDouble();

        double delta = b * b - 4 * a * c;
        double x1, x2;

        if(delta < 0 ){
            System.out.println("Não existem raízes reais para a equação solicitada.");
        } else {
            x1 = (-b + Math.sqrt(delta))/ 2 * a;

            x2 = (-b - Math.sqrt(delta))/ 2 * a;

            System.out.println("As raízes para equação são: x1 -> "+ x1 + " x2 -> " + x2);
        }

    }
}
